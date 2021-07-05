package Configurar;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import java.awt.Font;

import Static.VariablesP;
import Validaciones.Validacion;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.LineBorder;
import java.awt.Color;
import principal.MaterialButton;
import RSMaterialComponent.RSTextFieldMaterial;
import javax.swing.border.MatteBorder;

import Alertas.Alerta1;

import java.awt.SystemColor;
import java.awt.Cursor;

@SuppressWarnings("serial")
public class frmConfiguraCantORV extends JInternalFrame implements ActionListener {
	private JLabel lblNewLabel;
	private MaterialButton btnGrabar;
	private MaterialButton btnCerrar;
	private RSTextFieldMaterial txtCantRM;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmConfiguraCantORV frame = new frmConfiguraCantORV();
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
	public frmConfiguraCantORV() {
		setClosable(true);
		getContentPane().setBackground(Color.WHITE);
		setBorder(new LineBorder(Color.LIGHT_GRAY, 3));
		setTitle("Configurar cantidad \u00F3ptima de resmas vendidas");
		setBounds(100, 100, 685, 120);
		getContentPane().setLayout(null);
		{
			lblNewLabel = new JLabel("Cantidad \u00F3ptima de resmas vendidas");
			lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
			lblNewLabel.setBounds(26, 23, 276, 23);
			getContentPane().add(lblNewLabel);
		}
		{
			btnGrabar = new MaterialButton();
			btnGrabar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			btnGrabar.addActionListener(this);
			btnGrabar.setText("Grabar");
			btnGrabar.setForeground(Color.WHITE);
			btnGrabar.setFocusable(false);
			btnGrabar.setBackground(Color.DARK_GRAY);
			btnGrabar.setBounds(542, 5, 127, 44);
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
			btnCerrar.setBounds(542, 44, 127, 44);
			getContentPane().add(btnCerrar);
		}
		{
			txtCantRM = new RSTextFieldMaterial();
			txtCantRM.setText(" 21.6 x 28.0 cm");
			txtCantRM.setSelectionColor(SystemColor.activeCaption);
			txtCantRM.setPlaceholder("");
			txtCantRM.setPhColor(Color.DARK_GRAY);
			txtCantRM.setForeground(Color.BLACK);
			txtCantRM.setFont(new Font("Tahoma", Font.PLAIN, 16));
			txtCantRM.setColorMaterial(Color.DARK_GRAY);
			txtCantRM.setBorder(new MatteBorder(0, 0, 3, 0, (Color) new Color(192, 192, 192)));
			txtCantRM.setBounds(320, 23, 163, 20);
			txtCantRM.setText("   "+String.valueOf(VariablesP.cantidadTotalOptima)); // Agregado
			getContentPane().add(txtCantRM);
		}

	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnCerrar) {
			do_btnCerrar_actionPerformed(e);
		}
		if (e.getSource() == btnGrabar) {
			do_btnGrabar_actionPerformed(e);
		}
	}
	protected void do_btnGrabar_actionPerformed(ActionEvent e) {
		if(Validacion.isNumeric(txtCantRM.getText(),"CANTIDAD")=="OK"){
			VariablesP.cantidadObsequiable=Integer.parseInt(txtCantRM.getText().trim());
			new Alerta1().setVisible(true);
		}
	}
	protected void do_btnCerrar_actionPerformed(ActionEvent e) {
		dispose();
		
	}
}
