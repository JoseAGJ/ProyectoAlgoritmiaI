package Mantenimiento;

import java.awt.EventQueue;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import Static.VariablesP;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.LineBorder;
import java.awt.Color;
import principal.MaterialButton;
import java.awt.Cursor;
import javax.swing.border.MatteBorder;
import java.awt.SystemColor;

@SuppressWarnings("serial")
public class frmConsultarPapel extends JInternalFrame implements ActionListener {
	private JComboBox cboMarca;
	private JTextField txtDimension;
	private JLabel lblBrillo;
	private JTextField txtGramaje;
	private JLabel lblPreciousd;
	private JTextField txtBlancura;
	private JLabel lblPrecios;
	private JTextField txtPrecio;
	private MaterialButton mtrlbtnAceptar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmConsultarPapel frame = new frmConsultarPapel();
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
	public frmConsultarPapel() {
		getContentPane().setBackground(Color.WHITE);
		setBorder(new LineBorder(Color.LIGHT_GRAY, 2));
		setClosable(true);
		setTitle("Consultar Papel");
		setBounds(100, 100, 665, 263);
		getContentPane().setLayout(null);
		
		JLabel lblModelo = new JLabel("Marca");
		lblModelo.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblModelo.setBounds(27, 23, 46, 20);
		getContentPane().add(lblModelo);
		
		cboMarca = new JComboBox();
		cboMarca.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		cboMarca.setFont(new Font("Tahoma", Font.PLAIN, 16));
		cboMarca.setForeground(Color.WHITE);
		cboMarca.setBackground(SystemColor.activeCaption);
		cboMarca.setBorder(null);
		cboMarca.addActionListener(this);
		cboMarca.setModel(new DefaultComboBoxModel(new VariablesP().marca)); // Agregado
		cboMarca.setBounds(154, 23, 163, 23);
		getContentPane().add(cboMarca);
		
	
		
		JLabel lblResolucin = new JLabel("Dimensiones");
		lblResolucin.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblResolucin.setBounds(27, 66, 117, 17);
		getContentPane().add(lblResolucin);
		
		txtDimension = new JTextField();
		txtDimension.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtDimension.setBackground(Color.WHITE);
		txtDimension.setBorder(new MatteBorder(0, 0, 2, 0, (Color) Color.GRAY));
		txtDimension.setEditable(false);
		txtDimension.setBounds(154, 61, 163, 20);
		txtDimension.setText(VariablesP.dimension[0]); // Agregado
		getContentPane().add(txtDimension);
		txtDimension.setColumns(10);
		
		lblBrillo = new JLabel("Gramaje");
		lblBrillo.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblBrillo.setBounds(27, 102, 117, 23);
		getContentPane().add(lblBrillo);
		
		txtGramaje = new JTextField();
		txtGramaje.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtGramaje.setBackground(Color.WHITE);
		txtGramaje.setBorder(new MatteBorder(0, 0, 2, 0, (Color) Color.GRAY));
		txtGramaje.setEditable(false);
		txtGramaje.setText("HD 1080(1920 x 1080)");
		txtGramaje.setColumns(10);
		txtGramaje.setBounds(154, 102, 163, 20);
		txtGramaje.setText(String.valueOf(VariablesP.gramaje[0])); // Agregado
		getContentPane().add(txtGramaje);
		
		lblPreciousd = new JLabel("Blancura");
		lblPreciousd.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblPreciousd.setBounds(27, 145, 115, 17);
		getContentPane().add(lblPreciousd);
		
		txtBlancura = new JTextField();
		txtBlancura.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtBlancura.setBackground(Color.WHITE);
		txtBlancura.setBorder(new MatteBorder(0, 0, 2, 0, (Color) Color.GRAY));
		txtBlancura.setEditable(false);
		txtBlancura.setText("HD 1080(1920 x 1080)");
		txtBlancura.setColumns(10);
		txtBlancura.setBounds(154, 140, 163, 20);
		txtBlancura.setText(String.valueOf(VariablesP.blancura[0])); // Agregado
		getContentPane().add(txtBlancura);
		
		lblPrecios = new JLabel("Precio (S/.)");
		lblPrecios.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblPrecios.setBounds(27, 185, 115, 17);
		getContentPane().add(lblPrecios);
		
		txtPrecio = new JTextField();
		txtPrecio.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtPrecio.setBackground(Color.WHITE);
		txtPrecio.setBorder(new MatteBorder(0, 0, 2, 0, (Color) Color.GRAY));
		txtPrecio.setEditable(false);
		txtPrecio.setText("HD 1080(1920 x 1080)");
		txtPrecio.setColumns(10);
		txtPrecio.setBounds(154, 180, 163, 20);
		txtPrecio.setText(String.valueOf(VariablesP.precio[0])); // Agregado
		getContentPane().add(txtPrecio);
		{
			mtrlbtnAceptar = new MaterialButton();
			mtrlbtnAceptar.setForeground(Color.WHITE);
			mtrlbtnAceptar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			mtrlbtnAceptar.setBackground(Color.GRAY);
			mtrlbtnAceptar.addActionListener(this);
			mtrlbtnAceptar.setText("Cerrar");
			mtrlbtnAceptar.setBounds(475, 23, 149, 46);
			getContentPane().add(mtrlbtnAceptar);
		}

	}
	
	
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == mtrlbtnAceptar) {
			do_mtrlbtnAceptar_actionPerformed(e);
		}
		if (e.getSource() == cboMarca) {
			do_cboModelo_actionPerformed(e);
		}
	}
	
	
	// COMBO MODELO 
	protected void do_cboModelo_actionPerformed(ActionEvent e) {
		ConsultaGramaje(cboMarca.getSelectedIndex());
	}
	
	
	//-- Consulta la informacion por su indice
	public void ConsultaGramaje(int selecciona){
		switch(selecciona){
			case 0: case 1: case 2: case 3: case 4:
				informacionGramaje(selecciona);
				break;
		}
	}
	
	//-- Trae informacion
	public void informacionGramaje(int selecciona){
		txtDimension.setText(VariablesP.dimension[selecciona]);
		txtGramaje.setText(String.valueOf(VariablesP.gramaje[selecciona]));
		txtBlancura.setText(String.valueOf(VariablesP.blancura[selecciona]));
		txtPrecio.setText(String.valueOf(VariablesP.precio[selecciona]));
	}
	
	//-- Cerrar Ventana
	protected void do_mtrlbtnAceptar_actionPerformed(ActionEvent e) {
		dispose();
	}
}
