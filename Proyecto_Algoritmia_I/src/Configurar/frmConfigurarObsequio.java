package Configurar;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.border.LineBorder;

import Static.VariablesP;
import Validaciones.Validacion;

import java.awt.Color;
import javax.swing.JLabel;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import RSMaterialComponent.RSTextFieldMaterial;
import javax.swing.border.MatteBorder;

import Alertas.Alerta1;

import java.awt.SystemColor;
import principal.MaterialButton;
import java.awt.Cursor;

@SuppressWarnings("serial")
public class frmConfigurarObsequio extends JInternalFrame implements ActionListener {
	private JLabel lblCantidadMinimaDe;
	private JLabel lblObsequio;
	private RSTextFieldMaterial txtCantidadMRA;
	private RSTextFieldMaterial txtObsequio;
	private MaterialButton btnGrabar;
	private MaterialButton btnCerrar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmConfigurarObsequio frame = new frmConfigurarObsequio();
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
	public frmConfigurarObsequio() {
		setClosable(true);
		getContentPane().setBackground(Color.WHITE);
		setTitle("Configurar Obsequio");
		setBorder(new LineBorder(Color.LIGHT_GRAY, 3));
		setBounds(100, 100, 690, 152);
		getContentPane().setLayout(null);
		{
			lblCantidadMinimaDe = new JLabel("Cantidad Minima de resmas Adquiridas");
			lblCantidadMinimaDe.setFont(new Font("Tahoma", Font.PLAIN, 16));
			lblCantidadMinimaDe.setBounds(33, 31, 302, 23);
			getContentPane().add(lblCantidadMinimaDe);
		}
		{
			lblObsequio = new JLabel("Obsequio");
			lblObsequio.setFont(new Font("Tahoma", Font.PLAIN, 16));
			lblObsequio.setBounds(33, 65, 66, 23);
			getContentPane().add(lblObsequio);
		}
		{
			txtCantidadMRA = new RSTextFieldMaterial();
			txtCantidadMRA.setText(" 21.6 x 28.0 cm");
			txtCantidadMRA.setSelectionColor(SystemColor.activeCaption);
			txtCantidadMRA.setPlaceholder("");
			txtCantidadMRA.setPhColor(Color.DARK_GRAY);
			txtCantidadMRA.setForeground(Color.BLACK);
			txtCantidadMRA.setFont(new Font("Tahoma", Font.PLAIN, 16));
			txtCantidadMRA.setColorMaterial(Color.DARK_GRAY);
			txtCantidadMRA.setBorder(new MatteBorder(0, 0, 3, 0, (Color) new Color(192, 192, 192)));
			txtCantidadMRA.setBounds(340, 31, 163, 20);
			txtCantidadMRA.setText("   " + VariablesP.cantidadObsequiable); // Agregado
			getContentPane().add(txtCantidadMRA);
		}
		{
			txtObsequio = new RSTextFieldMaterial();
			txtObsequio.setText(" 21.6 x 28.0 cm");
			txtObsequio.setSelectionColor(SystemColor.activeCaption);
			txtObsequio.setPlaceholder("");
			txtObsequio.setPhColor(Color.DARK_GRAY);
			txtObsequio.setForeground(Color.BLACK);
			txtObsequio.setFont(new Font("Tahoma", Font.PLAIN, 16));
			txtObsequio.setColorMaterial(Color.DARK_GRAY);
			txtObsequio.setBorder(new MatteBorder(0, 0, 3, 0, (Color) new Color(192, 192, 192)));
			txtObsequio.setBounds(340, 66, 163, 20);
			txtObsequio.setText("   "+ VariablesP.obsequio); // Agregado
			getContentPane().add(txtObsequio);
		}
		{
			btnGrabar = new MaterialButton();
			btnGrabar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			btnGrabar.addActionListener(this);
			btnGrabar.setText("Grabar");
			btnGrabar.setForeground(Color.WHITE);
			btnGrabar.setFocusable(false);
			btnGrabar.setBackground(Color.DARK_GRAY);
			btnGrabar.setBounds(547, 11, 127, 44);
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
			btnCerrar.setBounds(547, 48, 127, 44);
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
		
		if(Validacion.isLetra(txtObsequio.getText(),"OBSEQUIO")=="OK"){
			if(Validacion.isNumeric(txtCantidadMRA.getText(),"CANTIDAD")=="OK"){
				VariablesP.cantidadObsequiable=Integer.parseInt(txtCantidadMRA.getText().trim());
				VariablesP.obsequio=txtObsequio.getText().trim();
				new Alerta1().setVisible(true);
			}
		}

	}
	protected void do_btnCerrar_actionPerformed(ActionEvent arg0) {
		dispose();
	}
}
