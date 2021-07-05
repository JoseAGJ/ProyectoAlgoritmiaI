package Ventas;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JTextArea;

import Static.VariablesP;

import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JScrollPane;
import javax.swing.border.LineBorder;
import principal.MaterialButton;
import java.awt.Cursor;

@SuppressWarnings("serial")
public class frmGeneraReporte extends JInternalFrame implements ActionListener {
	private JLabel lblTipoDeReporte;
	private JComboBox cboReporte;
	private JTextArea txtS;
	private JScrollPane scrollPane;
	private MaterialButton btnCerrar;

	double precio85M=(0.85) * Maximo(VariablesP.precio); // Agregado
	int cuentaM[]={0,0}; // Agregado
	static double precios[]={};
	
	 
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmGeneraReporte frame = new frmGeneraReporte();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public frmGeneraReporte() {
		setBorder(new LineBorder(Color.LIGHT_GRAY, 3));
		getContentPane().setBackground(Color.WHITE);
		setTitle("Generaci\u00F3n de Reportes");
		setClosable(true);
		setBounds(100, 100, 736, 529);
		getContentPane().setLayout(null);
		{
			lblTipoDeReporte = new JLabel("Tipo de Reporte");
			lblTipoDeReporte.setFont(new Font("Agency FB", Font.PLAIN, 20));
			lblTipoDeReporte.setBounds(34, 26, 111, 22);
			getContentPane().add(lblTipoDeReporte);
		}
		{
			cboReporte = new JComboBox();
			cboReporte.setBorder(null);
			cboReporte.setFont(new Font("Tahoma", Font.PLAIN, 16));
			cboReporte.addActionListener(this);
			cboReporte.setModel(new DefaultComboBoxModel(new String[] {"Ventas Por Marca", "Proyectores Con Venta \u00D3ptima", "Marcas con precios mayores al 85% del precio m\u00E1ximo", "Marcas con precios menores al 85% del precio m\u00E1ximo", "Promedios, m\u00E1ximos y m\u00EDnimos"}));
			cboReporte.setBounds(143, 17, 418, 32);
			getContentPane().add(cboReporte);
		}
		{
			scrollPane = new JScrollPane();
			scrollPane.setBorder(null);
			scrollPane.setBounds(34, 66, 665, 422);
			getContentPane().add(scrollPane);
			{
				txtS = new JTextArea();
				txtS.setBackground(Color.WHITE);
				txtS.setEditable(false);
				txtS.setBorder(null);
				txtS.setFont(new Font("Tahoma", Font.PLAIN, 17));
				scrollPane.setViewportView(txtS);
			}
		}

		cboReporte.setSelectedIndex(0); // Agregado
		
		{
			btnCerrar = new MaterialButton();
			btnCerrar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			btnCerrar.addActionListener(this);
			btnCerrar.setText("Cerrar");
			btnCerrar.setForeground(Color.WHITE);
			btnCerrar.setFocusable(false);
			btnCerrar.setBackground(Color.DARK_GRAY);
			btnCerrar.setBounds(574, 11, 127, 44);
			getContentPane().add(btnCerrar);
		}
	}
	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == btnCerrar) {
			do_btnCerrar_actionPerformed(arg0);
		}
		if (arg0.getSource() == cboReporte) {
			do_cboReporte_actionPerformed(arg0);
		}
	}
	protected void do_cboReporte_actionPerformed(ActionEvent arg0) {
				
		switch (cboReporte.getSelectedIndex()) {
			case 0:
				txtS.setText("");
				Imprimir("\n\t\t\t VENTAS POR MARCA\n");
				
				boolean hayVentas = false;
				
				for(int i =0;i<VariablesP.marca.length;i++){
					if(frmVender.cantidadV[i]>0){
						Imprimir("Modelo                                                 :   " + VariablesP.marca[i]);
						Imprimir("Cantidad de Ventas                               :   " + frmVender.cantidadV[i] );
						Imprimir("Cantidad Total de Resmas Vendidas      :   " + frmVender.cantidadRV[i]);
						Imprimir("Importe Total Acumulado                       :   " + VariablesP.Redondear(frmVender.importeAC[i]));
						Imprimir("");
						
						hayVentas = true;
					}
				}
				
				if(frmVender.importeTAC>0){
					Imprimir("\n Importe Total Acumulado General     :  " + frmVender.importeTAC);
				}
				
				if(!hayVentas) {
					Imprimir("Noy hay ventas .....");
				}
				
				break;
			case 1 :
				txtS.setText("");
				Imprimir("\n\t\t MARCAS CON VENTA OPTIMA\n");
				
				boolean cantidadExiste=false;
				
				for(int i=0;i<VariablesP.marca.length;i++){					
					if(frmVender.cantidadRV[i]>=VariablesP.cantidadTotalOptima){
						Imprimir("Marca                                                 :  " + VariablesP.marca[i]);
						Imprimir("Cantidad total de resmas vendidas         :  " + frmVender.cantidadRV[i]);
						Imprimir("\n");	
						cantidadExiste=true;
					}
				}
				if(!cantidadExiste) {
					Imprimir("No Existe Marcas con venta Optima...");
				}
				break;
			case 2 :
				txtS.setText("");
				Imprimir("\n\t MARCAS CON PRECIOS MAYORES AL 85% DEL PRECIO MÁXIMO\n");
			
				for(int i=0;i<VariablesP.marca.length;i++){
					if(VariablesP.precio[i]>precio85M){
						Imprimir("" + VariablesP.marca[i]);
						cuentaM[0]++;
					}
				}
				
				Imprimir("\n 85% del Precio Máximo :    S/.  " + precio85M);
				Imprimir("Número de Marcas          :   " + cuentaM[0]);
				break;
			case 3:
				txtS.setText("");
				Imprimir("\n\t MARCAS CON PRECIOS MENORES AL 85% DEL PRECIO MÁXIMO\n");
				
				for(int i=0;i<VariablesP.marca.length;i++){
					if(VariablesP.precio[i]<precio85M){
						Imprimir("" + VariablesP.marca[i]);
						cuentaM[1]++;
					}
				}
				
				Imprimir("\n 85% del Precio Máximo :    S/.  " + precio85M);
				Imprimir("Número de Marcas          :   " + cuentaM[1]);
				break;
			case 4:
				txtS.setText("");
				Imprimir("\n\t\t PROMEDIOS, MÁXIMOS Y MÍNIMOS\n");
				Imprimir("Gramaje Promedio   :  " + Promedio(VariablesP.gramaje) + "   g/m²");
				Imprimir("Gramaje Minimo       :  " + Minimo(VariablesP.gramaje) + "   g/m²");
				Imprimir("Gramaje Máximo      :  " + Maximo(VariablesP.gramaje) + "   g/m²");
				
				Imprimir("");
		
				Imprimir("Blancura Promedio   :  " + Promedio(VariablesP.blancura));
				Imprimir("Blancura Minimo       :  " + Minimo(VariablesP.blancura));
				Imprimir("Blancura Máximo      :  " + Maximo(VariablesP.blancura));
				
				Imprimir("");

				Imprimir("Precio Promedio   :  " + Promedio(VariablesP.precio));
				Imprimir("Precio Minimo       :  " + Minimo(VariablesP.precio));
				Imprimir("Precio Máximo      :  " + Maximo(VariablesP.precio));
				break;
		}
	}
	
	 
	
	//-- Precios menor, mayor y promedio
	
	 public double Maximo(double dato[]){
		double maximo=dato[0];
		for(int i=0;i<dato.length;i++){
			if(maximo<dato[i])
				maximo=dato[i];
		}
		return maximo;
	}
	 
	 public double Minimo(double dato[]){
		double minimo=dato[0];
		for(int i=0;i<dato.length;i++){
			if(minimo>dato[i])
				minimo=dato[i];
		}
		return minimo;
	}
	 
	public double Promedio(double dato[]){
		double promedio=0;
		for(int i=0;i<dato.length;i++){
			promedio+=dato[i];
		}
		return promedio / dato.length;
	}
	 
	
	public void Imprimir(String s){
		txtS.append(s + "\n");
	}
	
	//-- Boton Cerrar
	protected void do_btnCerrar_actionPerformed(ActionEvent arg0) {
		dispose();
	}
}
