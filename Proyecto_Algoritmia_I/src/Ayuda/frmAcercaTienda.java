package Ayuda;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import java.awt.Color;
import javax.swing.border.LineBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;
import principal.MaterialButton;
import java.awt.Cursor;

@SuppressWarnings("serial")
public class frmAcercaTienda extends JInternalFrame implements ActionListener {
	private JLabel lblTienda;
	private JLabel label;
	private MaterialButton btnCerrar;
	private JLabel lblNuestroPrincipalPropsitoen;
	private JLabel lblEnEstaVida;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmAcercaTienda frame = new frmAcercaTienda();
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
	public frmAcercaTienda() {
		setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		setClosable(true);
		setBorder(new LineBorder(Color.LIGHT_GRAY, 4));
		getContentPane().setBackground(Color.WHITE);
		getContentPane().setLayout(null);
		{
			lblTienda = new JLabel("Tienda 1.0");
			lblTienda.setFont(new Font("Tahoma", Font.BOLD, 24));
			lblTienda.setBounds(151, 11, 135, 34);
			getContentPane().add(lblTienda);
		}
		{
			label = new JLabel("----------------------------------------------------------------");
			label.setFont(new Font("Tahoma", Font.BOLD, 15));
			label.setBounds(29, 56, 386, 14);
			getContentPane().add(label);
		}
		{
			btnCerrar = new MaterialButton();
			btnCerrar.setFont(new Font("Tahoma", Font.BOLD, 16));
			btnCerrar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			btnCerrar.addActionListener(this);
			btnCerrar.setText("Cerrar");
			btnCerrar.setForeground(Color.WHITE);
			btnCerrar.setFocusable(false);
			btnCerrar.setBackground(Color.DARK_GRAY);
			btnCerrar.setBounds(167, 367, 127, 44);
			getContentPane().add(btnCerrar);
		}
		{
			lblNuestroPrincipalPropsitoen = new JLabel("Autor");
			lblNuestroPrincipalPropsitoen.setFont(new Font("Tahoma", Font.BOLD, 20));
			lblNuestroPrincipalPropsitoen.setBounds(194, 91, 57, 44);
			getContentPane().add(lblNuestroPrincipalPropsitoen);
		}
		{
			lblEnEstaVida = new JLabel("Jos\u00E9 Alberto Gallardo Joaqu\u00EDn");
			lblEnEstaVida.setFont(new Font("Tahoma", Font.PLAIN, 21));
			lblEnEstaVida.setBounds(95, 177, 295, 24);
			getContentPane().add(lblEnEstaVida);
		}
		setTitle("Acerca de Tienda");
		setBounds(100, 100, 441, 523);

	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnCerrar) {
			do_btnCerrar_actionPerformed(e);
		}
	}
	protected void do_btnCerrar_actionPerformed(ActionEvent e) {
		dispose();
	}
}
