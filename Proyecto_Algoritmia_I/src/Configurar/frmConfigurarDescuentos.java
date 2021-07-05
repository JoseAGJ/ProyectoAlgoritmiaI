package Configurar;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.border.LineBorder;

import Static.VariablesP;
import Validaciones.Validacion;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import RSMaterialComponent.RSTextFieldMaterial;
import javax.swing.border.MatteBorder;

import Alertas.Alerta1;

import java.awt.SystemColor;
import principal.MaterialButton;
import java.awt.Cursor;

@SuppressWarnings("serial")
public class frmConfigurarDescuentos extends JInternalFrame implements ActionListener {
	private JLabel lblA;
	private JLabel lblA_2;
	private JLabel lblA_1;
	private JLabel lblA_3;
	private JLabel lblA_4;
	private JLabel lblA_5;
	private JLabel lblA_6;
	private JLabel lblA_7;
	private RSTextFieldMaterial txtPorcentaje1;
	private RSTextFieldMaterial txtPorcentaje2;
	private RSTextFieldMaterial txtPorcentaje3;
	private RSTextFieldMaterial txtPorcentaje4;
	private MaterialButton btnGrabar;
	private MaterialButton btnCerrar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmConfigurarDescuentos frame = new frmConfigurarDescuentos();
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
	public frmConfigurarDescuentos() {
		setClosable(true);
		setBorder(new LineBorder(Color.LIGHT_GRAY, 3));
		getContentPane().setBackground(Color.WHITE);
		setTitle("Configurar Porcentajes Descuentos");
		setBounds(100, 100, 634, 221);
		getContentPane().setLayout(null);
		{
			lblA = new JLabel("1 a 5 Resmas");
			lblA.setFont(new Font("Tahoma", Font.PLAIN, 16));
			lblA.setBounds(33, 32, 127, 23);
			getContentPane().add(lblA);
		}
		{
			lblA_2 = new JLabel("6 a 10 Resmas");
			lblA_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
			lblA_2.setBounds(33, 66, 127, 23);
			getContentPane().add(lblA_2);
		}
		{
			lblA_1 = new JLabel("11 a 15 Resmas");
			lblA_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
			lblA_1.setBounds(33, 100, 137, 23);
			getContentPane().add(lblA_1);
		}
		{
			lblA_3 = new JLabel("M\u00E1s de Resmas");
			lblA_3.setFont(new Font("Tahoma", Font.PLAIN, 16));
			lblA_3.setBounds(33, 134, 127, 23);
			getContentPane().add(lblA_3);
		}
		{
			lblA_4 = new JLabel(" %");
			lblA_4.setFont(new Font("Tahoma", Font.PLAIN, 16));
			lblA_4.setBounds(355, 32, 33, 23);
			getContentPane().add(lblA_4);
		}
		{
			lblA_5 = new JLabel(" %");
			lblA_5.setFont(new Font("Tahoma", Font.PLAIN, 16));
			lblA_5.setBounds(355, 66, 33, 23);
			getContentPane().add(lblA_5);
		}
		{
			lblA_6 = new JLabel(" %");
			lblA_6.setFont(new Font("Tahoma", Font.PLAIN, 16));
			lblA_6.setBounds(355, 100, 33, 23);
			getContentPane().add(lblA_6);
		}
		{
			lblA_7 = new JLabel(" %");
			lblA_7.setFont(new Font("Tahoma", Font.PLAIN, 16));
			lblA_7.setBounds(355, 134, 33, 23);
			getContentPane().add(lblA_7);
		}
		{
			txtPorcentaje1 = new RSTextFieldMaterial();
			txtPorcentaje1.setText(" 21.6 x 28.0 cm");
			txtPorcentaje1.setSelectionColor(SystemColor.activeCaption);
			txtPorcentaje1.setPlaceholder("");
			txtPorcentaje1.setPhColor(Color.DARK_GRAY);
			txtPorcentaje1.setForeground(Color.BLACK);
			txtPorcentaje1.setFont(new Font("Tahoma", Font.PLAIN, 16));
			txtPorcentaje1.setColorMaterial(Color.DARK_GRAY);
			txtPorcentaje1.setBorder(new MatteBorder(0, 0, 3, 0, (Color) new Color(192, 192, 192)));
			txtPorcentaje1.setBounds(167, 34, 163, 20);
			txtPorcentaje1.setText("   "+String.valueOf(VariablesP.porcenDesc[0])); // Agregado
			getContentPane().add(txtPorcentaje1);
		}
		{
			txtPorcentaje2 = new RSTextFieldMaterial();
			txtPorcentaje2.setText(" 21.6 x 28.0 cm");
			txtPorcentaje2.setSelectionColor(SystemColor.activeCaption);
			txtPorcentaje2.setPlaceholder("");
			txtPorcentaje2.setPhColor(Color.DARK_GRAY);
			txtPorcentaje2.setForeground(Color.BLACK);
			txtPorcentaje2.setFont(new Font("Tahoma", Font.PLAIN, 16));
			txtPorcentaje2.setColorMaterial(Color.DARK_GRAY);
			txtPorcentaje2.setBorder(new MatteBorder(0, 0, 3, 0, (Color) new Color(192, 192, 192)));
			txtPorcentaje2.setBounds(167, 69, 163, 20);
			txtPorcentaje2.setText("   " +String.valueOf(VariablesP.porcenDesc[1])); // Agregado
			getContentPane().add(txtPorcentaje2);
		}
		{
			txtPorcentaje3 = new RSTextFieldMaterial();
			txtPorcentaje3.setText(" 21.6 x 28.0 cm");
			txtPorcentaje3.setSelectionColor(SystemColor.activeCaption);
			txtPorcentaje3.setPlaceholder("");
			txtPorcentaje3.setPhColor(Color.DARK_GRAY);
			txtPorcentaje3.setForeground(Color.BLACK);
			txtPorcentaje3.setFont(new Font("Tahoma", Font.PLAIN, 16));
			txtPorcentaje3.setColorMaterial(Color.DARK_GRAY);
			txtPorcentaje3.setBorder(new MatteBorder(0, 0, 3, 0, (Color) new Color(192, 192, 192)));
			txtPorcentaje3.setBounds(167, 103, 163, 20);
			txtPorcentaje3.setText("   "+String.valueOf(VariablesP.porcenDesc[2])); // Agregado
			getContentPane().add(txtPorcentaje3);
		}
		{
			txtPorcentaje4 = new RSTextFieldMaterial();
			txtPorcentaje4.setText(" 21.6 x 28.0 cm");
			txtPorcentaje4.setSelectionColor(SystemColor.activeCaption);
			txtPorcentaje4.setPlaceholder("");
			txtPorcentaje4.setPhColor(Color.DARK_GRAY);
			txtPorcentaje4.setForeground(Color.BLACK);
			txtPorcentaje4.setFont(new Font("Tahoma", Font.PLAIN, 16));
			txtPorcentaje4.setColorMaterial(Color.DARK_GRAY);
			txtPorcentaje4.setBorder(new MatteBorder(0, 0, 3, 0, (Color) new Color(192, 192, 192)));
			txtPorcentaje4.setBounds(167, 137, 163, 20);
			txtPorcentaje4.setText("   "+String.valueOf(VariablesP.porcenDesc[3])); // Agregado
			getContentPane().add(txtPorcentaje4);
		}
		{
			btnGrabar = new MaterialButton();
			btnGrabar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			btnGrabar.addActionListener(this);
			btnGrabar.setText("Grabar");
			btnGrabar.setForeground(Color.WHITE);
			btnGrabar.setFocusable(false);
			btnGrabar.setBackground(Color.DARK_GRAY);
			btnGrabar.setBounds(467, 32, 127, 44);
			getContentPane().add(btnGrabar);
		}
		{
			btnCerrar = new MaterialButton();
			btnCerrar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			btnCerrar.addActionListener(this);
			btnCerrar.setText("Cerrar");
			btnCerrar.setForeground(Color.WHITE);
			btnCerrar.setFocusable(false);
			btnCerrar.setBackground(Color.DARK_GRAY);
			btnCerrar.setBounds(467, 69, 127, 44);
			getContentPane().add(btnCerrar);
		}

	}

	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == btnCerrar) {
			do_btnCerrar_actionPerformed(arg0);
		}
		if (arg0.getSource() == btnGrabar) {
			do_btnGrabar_actionPerformed(arg0);
		}
	}
	protected void do_btnGrabar_actionPerformed(ActionEvent arg0) {
		if(Validacion.isNumeric(txtPorcentaje1.getText(),"PORCENTAJE 1")=="OK" && Validacion.isNumeric(txtPorcentaje2.getText(),"PORCENTAJE 2")=="OK"
				&& Validacion.isNumeric(txtPorcentaje3.getText(),"PORCENTAJE 3")=="OK" && Validacion.isNumeric(txtPorcentaje4.getText(),"PORCENTAJE 4")=="OK")
		{
			VariablesP.porcenDesc[0]=Double.parseDouble(txtPorcentaje1.getText().trim());
			VariablesP.porcenDesc[1]=Double.parseDouble(txtPorcentaje2.getText().trim());
			VariablesP.porcenDesc[2]=Double.parseDouble(txtPorcentaje3.getText().trim());
			VariablesP.porcenDesc[3]=Double.parseDouble(txtPorcentaje4.getText().trim());
			new Alerta1().setVisible(true);
		}
	}
	protected void do_btnCerrar_actionPerformed(ActionEvent arg0) {
		dispose();
	}
}
