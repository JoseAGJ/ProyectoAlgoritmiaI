package Mantenimiento;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import java.awt.Font;
import Static.VariablesP;
import Validaciones.Validacion;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import RSMaterialComponent.RSTextFieldMaterial;
import java.awt.SystemColor;
import javax.swing.border.MatteBorder;

import Alertas.Alerta1;
import principal.MaterialButton;
import java.awt.Cursor;

@SuppressWarnings("serial")
public class frmModificarPapel extends JInternalFrame implements ActionListener {
	private JLabel lblMarca;
	private JComboBox cboMarca;
	private JLabel lblDimensiones;
	private JLabel lblGramaje;
	private JLabel lblBlancura;
	private JLabel lblPrecio;
	private RSTextFieldMaterial txtDimension;
	private RSTextFieldMaterial txtGramaje;
	private RSTextFieldMaterial txtBlancura;
	private RSTextFieldMaterial txtPrecio;
	private MaterialButton btnCerrar;
	private MaterialButton btnGrabar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmModificarPapel frame = new frmModificarPapel();
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
	public frmModificarPapel() {
		getContentPane().setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		getContentPane().setBackground(Color.WHITE);
		setBorder(new LineBorder(new Color(192, 192, 192), 2, true));
		setClosable(true);
		setTitle("Modificar Papel");
		setBounds(100, 100, 665, 263);
		getContentPane().setLayout(null);
		{
			lblMarca = new JLabel("Marca");
			lblMarca.setFont(new Font("Tahoma", Font.PLAIN, 17));
			lblMarca.setBounds(27, 23, 115, 21);
			getContentPane().add(lblMarca);
		}
		{
			cboMarca = new JComboBox();
			cboMarca.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			cboMarca.addActionListener(this);
			cboMarca.setForeground(Color.WHITE);
			cboMarca.setFont(new Font("Tahoma", Font.PLAIN, 16));
			cboMarca.setBackground(SystemColor.activeCaption);
			cboMarca.setFocusable(false);
			cboMarca.setModel(new DefaultComboBoxModel(new VariablesP().marca)); // Agregado
			cboMarca.setBorder(new LineBorder(new Color(171, 173, 179)));
			cboMarca.setBounds(154, 23, 163, 23);
			getContentPane().add(cboMarca);
		}
		{
			lblDimensiones = new JLabel("Dimensiones");
			lblDimensiones.setFont(new Font("Tahoma", Font.PLAIN, 17));
			lblDimensiones.setBounds(27, 66, 117, 20);
			getContentPane().add(lblDimensiones);
		}
		{
			lblGramaje = new JLabel("Gramaje");
			lblGramaje.setFont(new Font("Tahoma", Font.PLAIN, 17));
			lblGramaje.setBounds(27, 102, 117, 21);
			getContentPane().add(lblGramaje);
		}
		{
			lblBlancura = new JLabel("Blancura");
			lblBlancura.setFont(new Font("Tahoma", Font.PLAIN, 17));
			lblBlancura.setBounds(27, 145, 115, 20);
			getContentPane().add(lblBlancura);
		}
		{
			lblPrecio = new JLabel("Precio (S/.)");
			lblPrecio.setFont(new Font("Tahoma", Font.PLAIN, 17));
			lblPrecio.setBounds(27, 185, 115, 22);
			getContentPane().add(lblPrecio);
		}
		{
			txtDimension = new RSTextFieldMaterial();
			txtDimension.setFont(new Font("Tahoma", Font.PLAIN, 16));
			txtDimension.setBorder(new MatteBorder(0, 0, 3, 0, (Color) new Color(192, 192, 192)));
			txtDimension.setSelectionColor(SystemColor.activeCaption);
			txtDimension.setPhColor(Color.DARK_GRAY);
			txtDimension.setColorMaterial(Color.DARK_GRAY);
			txtDimension.setForeground(Color.BLACK);
			txtDimension.setPlaceholder("");
			txtDimension.setBounds(154, 61, 163, 20);
			txtDimension.setText(" " + VariablesP.dimension[0]); // Agregado
			getContentPane().add(txtDimension);
		}
		{
			txtGramaje = new RSTextFieldMaterial();
			txtGramaje.setSelectionColor(SystemColor.activeCaption);
			txtGramaje.setPlaceholder("");
			txtGramaje.setPhColor(Color.DARK_GRAY);
			txtGramaje.setForeground(Color.BLACK);
			txtGramaje.setFont(new Font("Tahoma", Font.PLAIN, 16));
			txtGramaje.setColorMaterial(Color.DARK_GRAY);
			txtGramaje.setBorder(new MatteBorder(0, 0, 3, 0, (Color) new Color(192, 192, 192)));
			txtGramaje.setBounds(154, 102, 163, 20);
			txtGramaje.setText(" " + VariablesP.gramaje[0]); // Agregado
			getContentPane().add(txtGramaje);
		}
		{
			txtBlancura = new RSTextFieldMaterial();
			txtBlancura.setSelectionColor(SystemColor.activeCaption);
			txtBlancura.setPlaceholder("");
			txtBlancura.setPhColor(Color.DARK_GRAY);
			txtBlancura.setForeground(Color.BLACK);
			txtBlancura.setFont(new Font("Tahoma", Font.PLAIN, 16));
			txtBlancura.setColorMaterial(Color.DARK_GRAY);
			txtBlancura.setBorder(new MatteBorder(0, 0, 3, 0, (Color) new Color(192, 192, 192)));
			txtBlancura.setBounds(154, 140, 163, 20);
			txtBlancura.setText(" "+VariablesP.blancura[0]); // Agregado
			getContentPane().add(txtBlancura);
		}
		{
			txtPrecio = new RSTextFieldMaterial();
			txtPrecio.setSelectionColor(SystemColor.activeCaption);
			txtPrecio.setPlaceholder("");
			txtPrecio.setPhColor(Color.DARK_GRAY);
			txtPrecio.setForeground(Color.BLACK);
			txtPrecio.setFont(new Font("Tahoma", Font.PLAIN, 16));
			txtPrecio.setColorMaterial(Color.DARK_GRAY);
			txtPrecio.setBorder(new MatteBorder(0, 0, 3, 0, (Color) new Color(192, 192, 192)));
			txtPrecio.setBounds(154, 180, 163, 20);
			txtPrecio.setText(" " + VariablesP.precio[0]); // Agregado
			getContentPane().add(txtPrecio);
		}
		{
			btnCerrar = new MaterialButton();
			btnCerrar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			btnCerrar.setBackground(Color.DARK_GRAY);
			btnCerrar.setForeground(Color.WHITE);
			btnCerrar.setFocusable(false);
			btnCerrar.addActionListener(this);
			btnCerrar.setText("Cerrar");
			btnCerrar.setBounds(475, 66, 149, 46);
			getContentPane().add(btnCerrar);
		}
		{
			btnGrabar = new MaterialButton();
			btnGrabar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			btnGrabar.setBackground(Color.DARK_GRAY);
			btnGrabar.setForeground(Color.WHITE);
			btnGrabar.setFocusable(false);
			btnGrabar.addActionListener(this);
			btnGrabar.setText("Grabar");
			btnGrabar.setBounds(475, 23, 149, 46);
			getContentPane().add(btnGrabar);
		}

	}
	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == cboMarca) {
			do_cboMarca_actionPerformed(arg0);
		}
		if (arg0.getSource() == btnGrabar) {
			do_btnGrabar_actionPerformed(arg0);
		}
		if (arg0.getSource() == btnCerrar) {
			do_btnCerrar_actionPerformed(arg0);
		}
	}
	
	//-- Cerrar Ventana
	protected void do_btnCerrar_actionPerformed(ActionEvent arg0) {
		dispose();
	}
	
	
	//-- Graba la Informacion
	protected void do_btnGrabar_actionPerformed(ActionEvent arg0) {
		if(Validacion.isNumeric(txtGramaje.getText(),"GRAMAJE") == "OK" && Validacion.isNumeric(txtBlancura.getText(),"BLANCURA")=="OK" &&
				Validacion.isNumeric(txtPrecio.getText(),"PRECIO")=="OK" ){
			ModificaP(cboMarca.getSelectedIndex());
			new Alerta1().setVisible(true);
		}
	}
	
	public void ModificaP(int selecciona){
		switch(selecciona){
			case 0: case 1: case 2: case 3: case 4:
				ModificaG(selecciona);
				break;
		}
	}
	
	
	public void ModificaG(int selecciona){
		VariablesP.dimension[selecciona]=txtDimension.getText().trim();
		VariablesP.gramaje[selecciona]=Double.parseDouble(txtGramaje.getText().trim());
		VariablesP.blancura[selecciona]=Double.parseDouble(txtBlancura.getText().trim());
		VariablesP.precio[selecciona]=Double.parseDouble(txtPrecio.getText().trim());
	}
	
	
	
	//-- Muestra la informacion en los RSTextFieldMaterial
	protected void do_cboMarca_actionPerformed(ActionEvent arg0) {
		ConsultaGramaje(cboMarca.getSelectedIndex());
	}
	
	
	public void ConsultaGramaje(int selecciona){
		switch(selecciona){
			case 0: case 1: case 2: case 3: case 4:
				informacionGramaje(selecciona);
				break;
		}
	}
		
	public void informacionGramaje(int selecciona){
		txtDimension.setText(VariablesP.dimension[selecciona]);
		txtGramaje.setText(String.valueOf(VariablesP.gramaje[selecciona]));
		txtBlancura.setText(String.valueOf(VariablesP.blancura[selecciona]));
		txtPrecio.setText(String.valueOf(VariablesP.precio[selecciona]));
	}
	
}
