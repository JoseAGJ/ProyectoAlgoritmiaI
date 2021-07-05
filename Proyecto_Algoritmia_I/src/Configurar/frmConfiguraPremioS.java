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
public class frmConfiguraPremioS extends JInternalFrame implements ActionListener {
	private JLabel lblNumeroDeCliente;
	private JLabel lblPremioSorpresa;
	private RSTextFieldMaterial txtnumClie;
	private RSTextFieldMaterial txtPremioS;
	private MaterialButton btnGrabar;
	private MaterialButton btnCerrar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmConfiguraPremioS frame = new frmConfiguraPremioS();
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
	public frmConfiguraPremioS() {
		setClosable(true);
		getContentPane().setBackground(Color.WHITE);
		setBorder(new LineBorder(Color.LIGHT_GRAY, 3));
		setTitle("Configurar premio sorpresa");
		setBounds(100, 100, 601, 153);
		getContentPane().setLayout(null);
		{
			lblNumeroDeCliente = new JLabel("Numero de Cliente");
			lblNumeroDeCliente.setFont(new Font("Tahoma", Font.PLAIN, 16));
			lblNumeroDeCliente.setBounds(25, 30, 146, 23);
			getContentPane().add(lblNumeroDeCliente);
		}
		{
			lblPremioSorpresa = new JLabel("Premio Sorpresa");
			lblPremioSorpresa.setFont(new Font("Tahoma", Font.PLAIN, 16));
			lblPremioSorpresa.setBounds(25, 65, 157, 23);
			getContentPane().add(lblPremioSorpresa);
		}
		{
			txtnumClie = new RSTextFieldMaterial();
			txtnumClie.setText(" 21.6 x 28.0 cm");
			txtnumClie.setSelectionColor(SystemColor.activeCaption);
			txtnumClie.setPlaceholder("");
			txtnumClie.setPhColor(Color.DARK_GRAY);
			txtnumClie.setForeground(Color.BLACK);
			txtnumClie.setFont(new Font("Tahoma", Font.PLAIN, 16));
			txtnumClie.setColorMaterial(Color.DARK_GRAY);
			txtnumClie.setBorder(new MatteBorder(0, 0, 3, 0, (Color) new Color(192, 192, 192)));
			txtnumClie.setBounds(203, 30, 163, 20);
			txtnumClie.setText("   "+String.valueOf(VariablesP.numeroClienteSorpresa)); // Agregado
			getContentPane().add(txtnumClie);
		}
		{
			txtPremioS = new RSTextFieldMaterial();
			txtPremioS.setText(" 21.6 x 28.0 cm");
			txtPremioS.setSelectionColor(SystemColor.activeCaption);
			txtPremioS.setPlaceholder("");
			txtPremioS.setPhColor(Color.DARK_GRAY);
			txtPremioS.setForeground(Color.BLACK);
			txtPremioS.setFont(new Font("Tahoma", Font.PLAIN, 16));
			txtPremioS.setColorMaterial(Color.DARK_GRAY);
			txtPremioS.setBorder(new MatteBorder(0, 0, 3, 0, (Color) new Color(192, 192, 192)));
			txtPremioS.setBounds(203, 66, 163, 20);
			txtPremioS.setText("   " + VariablesP.premioSorpresa);   // Agregado
			getContentPane().add(txtPremioS);
		}
		{
			btnGrabar = new MaterialButton();
			btnGrabar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			btnGrabar.addActionListener(this);
			btnGrabar.setText("Grabar");
			btnGrabar.setForeground(Color.WHITE);
			btnGrabar.setFocusable(false);
			btnGrabar.setBackground(Color.DARK_GRAY);
			btnGrabar.setBounds(439, 18, 127, 44);
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
			btnCerrar.setBounds(439, 55, 127, 44);
			getContentPane().add(btnCerrar);
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
		if(Validacion.isNumeric(txtnumClie.getText(), "NUMERO CLIENTE")=="OK" && Validacion.isLetra(txtPremioS.getText(), "PREMIO")=="OK")
		{
			VariablesP.numeroClienteSorpresa=Integer.parseInt(txtnumClie.getText().trim());
			VariablesP.premioSorpresa=txtPremioS.getText().trim();
			new Alerta1().setVisible(true);
		}
	}
	protected void do_btnCerrar_actionPerformed(ActionEvent e) {
		dispose();
	}
}
