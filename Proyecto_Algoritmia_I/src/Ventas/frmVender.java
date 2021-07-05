package Ventas;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JComboBox;

import Static.VariablesP;
import Validaciones.Validacion;

import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;
import java.awt.Color;
import java.awt.Cursor;
import RSMaterialComponent.RSTextFieldMaterial;
import javax.swing.border.MatteBorder;

import Alertas.Alerta1;

import java.awt.SystemColor;
import principal.MaterialButton;

@SuppressWarnings("serial")
public class frmVender extends JInternalFrame implements ActionListener {
	private JLabel lblMarca;
	private JComboBox cboMarca;
	private JLabel lblCantidad;
	private JTextArea txtS;

	/*
	 *  Agregado
	 */
	public  int cantidad=0;
	public static int cantidadRV[]={0,0,0,0,0};
	public static int cantidadV[]={0,0,0,0,0};
	public static double importeAC[]={0,0,0,0,0};
	public static double importeTAC=0;
	public static int numCliente=0;
	private RSTextFieldMaterial txtCantidad;
	private MaterialButton btnCerrar;
	private MaterialButton mtrlbtnVender;
	
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmVender frame = new frmVender();
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
	@SuppressWarnings({ "static-access" })
	public frmVender() {
		setBorder(new MatteBorder(0, 3, 3, 3, (Color) Color.LIGHT_GRAY));
		getContentPane().setBackground(Color.WHITE);
		setClosable(true);
		setTitle("Venta de Resmas");
		setBounds(100, 100, 579, 533);
		getContentPane().setLayout(null);
		{
			lblMarca = new JLabel("Marca");
			lblMarca.setFont(new Font("Agency FB", Font.PLAIN, 19));
			lblMarca.setBounds(21, 30, 58, 20);
			getContentPane().add(lblMarca);
		}
		{
			cboMarca = new JComboBox();
			cboMarca.setFocusable(false);
			cboMarca.setOpaque(false);
			cboMarca.setForeground(Color.WHITE);
			cboMarca.setBackground(SystemColor.activeCaptionBorder);
			cboMarca.setBorder(null);
			cboMarca.setFont(new Font("Tahoma", Font.PLAIN, 16));
			cboMarca.setModel(new DefaultComboBoxModel(new VariablesP().marca)); // Agregado
			cboMarca.setBounds(103, 24, 155, 28);
			getContentPane().add(cboMarca);
		}
		{
			lblCantidad = new JLabel("Cantidad");
			lblCantidad.setFont(new Font("Agency FB", Font.PLAIN, 19));
			lblCantidad.setBounds(21, 62, 58, 20);
			getContentPane().add(lblCantidad);
		}
		{
			txtS = new JTextArea();
			txtS.setBackground(Color.WHITE);
			txtS.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
			txtS.setFocusable(false);
			txtS.setFont(new Font("Tahoma", Font.PLAIN, 16));
			txtS.setBorder(null);
			txtS.setBounds(21, 103, 519, 365);
			getContentPane().add(txtS);
		}
		{
			txtCantidad = new RSTextFieldMaterial();
			txtCantidad.setSelectionColor(SystemColor.activeCaption);
			txtCantidad.setPlaceholder("");
			txtCantidad.setPhColor(Color.DARK_GRAY);
			txtCantidad.setForeground(Color.BLACK);
			txtCantidad.setFont(new Font("Tahoma", Font.PLAIN, 16));
			txtCantidad.setColorMaterial(Color.DARK_GRAY);
			txtCantidad.setBorder(new MatteBorder(0, 0, 3, 0, (Color) new Color(192, 192, 192)));
			txtCantidad.setBounds(103, 61, 163, 20);
			getContentPane().add(txtCantidad);
		}
		{
			btnCerrar = new MaterialButton();
			btnCerrar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			btnCerrar.addActionListener(this);
			btnCerrar.setText("Cerrar");
			btnCerrar.setForeground(Color.WHITE);
			btnCerrar.setFocusable(false);
			btnCerrar.setBackground(Color.DARK_GRAY);
			btnCerrar.setBounds(409, 53, 127, 44);
			getContentPane().add(btnCerrar);
		}
		{
			mtrlbtnVender = new MaterialButton();
			mtrlbtnVender.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			mtrlbtnVender.addActionListener(this);
			mtrlbtnVender.setText("Vender");
			mtrlbtnVender.setForeground(Color.WHITE);
			mtrlbtnVender.setFocusable(false);
			mtrlbtnVender.setBackground(Color.DARK_GRAY);
			mtrlbtnVender.setBounds(409, 16, 127, 44);
			getContentPane().add(mtrlbtnVender);
		}

	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == mtrlbtnVender) {
			do_mtrlbtnVender_actionPerformed(e);
		}
		if (e.getSource() == btnCerrar) {
			do_btnCerrar_actionPerformed(e);
		}
	}
	
	protected void do_btnCerrar_actionPerformed(ActionEvent e) {
		dispose();
	}
	
	
	protected void do_mtrlbtnVender_actionPerformed(ActionEvent e) {
		if(Validacion.isNumeric(txtCantidad.getText(),"CANTIDAD")=="OK"){
			txtS.setText("");
			getCantidades();
			
			MostrarP(cboMarca.getSelectedIndex());
			
			guardarImporteTAC();
					
			mostrarAlerta();
		}
		
	}
		
	
	void MostrarP(int selecciona){
		double importeCB = VariablesP.Redondear(importeC(selecciona,cantidad));
		double importeDB = VariablesP.Redondear(importeD(selecciona,cantidad,importeCB));
		double importePB = VariablesP.Redondear(importeP(importeCB,importeDB));
		String ObsequioB= Obsequio(selecciona,cantidad);
		
		switch(selecciona){
			case 0: case 1: case 2: case 3: case 4:
				txtS.setText("");
				cantidadRV[selecciona]+=cantidad;
				cantidadV[selecciona]++;
				importeAC[selecciona]+=importePB;
				numCliente++;
				
				Imprimir("");
				Imprimir("\n");
				Imprimir("\tMarca       	 :   " + VariablesP.marca[selecciona]);
				Imprimir("\tPrecio        	 :   S./ " + VariablesP.precio[selecciona]);
				Imprimir("\tCantidad          :   " +  cantidad);
				Imprimir("\t----------------------------------------------------");
				Imprimir("\tImporte De Compra         :   " + importeCB);
				Imprimir("\tImporte De Descuento     :   " + importeDB);
				Imprimir("\t----------------------------------------------------");
				Imprimir("\tImporte de Pago              :  " + importePB);
				if(ObsequioB!=""){
					Imprimir("\t----------------------------------------------------");
					Imprimir("\tObsequio                        :    " + ObsequioB);
				}
				if(numCliente==VariablesP.numeroClienteSorpresa)
					Imprimir("\tPremio Sorpresa            :    " + VariablesP.premioSorpresa);
				
				break;
		}
	}
	
	//-- Guarda el Importe Total Acumulado
	void guardarImporteTAC() {
		importeTAC = VariablesP.Redondear(importeAC[0] + importeAC[1] + importeAC[2] + importeAC[3] + importeAC[4]);
	}
	
	
	void mostrarAlerta() {
		new Alerta1().setVisible(true);
		Alerta1.lblGraba1.setText("Venta Exitosa!");
		Alerta1.lblGraba1.setBounds(204, 28, 200, 82);
	    Alerta1.lblGraba2.setVisible(false);
	}		
		
	//-- Lee valor de Cantidades
	void getCantidades(){
		cantidad=Integer.parseInt(txtCantidad.getText());
	}
	
	//-- Calcula Importe de compra
	public double importeC(int selecciona,int cantidad){
		double importeC=0;
		switch(selecciona){
			case 0: case 1: case 2: case 3: case 4:
				importeC=cantidad * VariablesP.precio[selecciona];
		}
		return importeC;
	}

	//-- Calcula el Importe de descuento
	public double importeD(int selecciona,int cantidad,double importeC){
		if(cantidad>=1 && cantidad<=5)
			return  (VariablesP.porcenDesc[0] / 100 ) * importeC;
		else if(cantidad>=6 && cantidad<=10)
			return  (VariablesP.porcenDesc[1] / 100 ) * importeC;
		else if(cantidad>=11 && cantidad<=15)
			return  (VariablesP.porcenDesc[2] / 100 ) * importeC;
		else 
			return (VariablesP.porcenDesc[3] / 100 ) * importeC;
		
	}
	
	//-- Calcula el importe de pago
	public double importeP(double importec,double importeD){
		return  (importec-importeD);
	}

	
	//-- Otorga Obsequio
	public String Obsequio(int selecciona,int cantidad){
		String Obsequio="";
		switch(selecciona){
			case 0: case 1: case 2: case 3: case 4:
				if(cantidad>=VariablesP.cantidadObsequiable) 
					Obsequio=VariablesP.obsequio;
			break;
		}
		return  Obsequio;
	}
	
	
	public void Imprimir(String s){
		txtS.append(s + "\n");
	}
	
}
