package Mantenimiento;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JTextArea;

import Static.VariablesP;

import java.awt.Color;
import javax.swing.JScrollPane;
import java.awt.Component;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.border.LineBorder;
import principal.MaterialButton;
import java.awt.Cursor;

@SuppressWarnings("serial")
public class frmListarPapel extends JInternalFrame implements ActionListener {
	private JTextArea txtS;
	private JScrollPane scrollPane;
	private MaterialButton btnCerrar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmListarPapel frame = new frmListarPapel();
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
	public frmListarPapel() {
		setBorder(new LineBorder(Color.LIGHT_GRAY, 2));
		getContentPane().setBackground(Color.WHITE);
		setClosable(true);
		setTitle("Listar Papel");
		setBounds(100, 100, 656, 658);
		getContentPane().setLayout(null);
		{
			scrollPane = new JScrollPane();
			scrollPane.setOpaque(false);
			scrollPane.setAlignmentX(Component.RIGHT_ALIGNMENT);
			scrollPane.setWheelScrollingEnabled(false);
			scrollPane.setAutoscrolls(true);
			scrollPane.setBorder(null);
			scrollPane.setBounds(46, 11, 574, 556);
			getContentPane().add(scrollPane);
			{
				txtS = new JTextArea();
				txtS.setFont(new Font("Tahoma", Font.PLAIN, 16));
				scrollPane.setViewportView(txtS);
				txtS.setAutoscrolls(false);
				txtS.setBackground(Color.WHITE);
				txtS.setEditable(false);
			}
		}
		{
			btnCerrar = new MaterialButton();
			btnCerrar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			btnCerrar.addActionListener(this);
			btnCerrar.setText("Cerrar");
			btnCerrar.setForeground(Color.WHITE);
			btnCerrar.setFocusable(false);
			btnCerrar.setBackground(Color.DARK_GRAY);
			btnCerrar.setBounds(275, 578, 134, 50);
			getContentPane().add(btnCerrar);
		}

		
		Imprimir("\tLISTADO DE PAPELES"+"\n");
		Imprimir("");
		for( int i=0;i<=VariablesP.marca.length-1;i++){
			Imprimir("Marca             : " + VariablesP.marca[i]);
			Imprimir("Dimensiones    : " + VariablesP.dimension[i]);
			Imprimir("Gramaje          : " + VariablesP.gramaje[i]);
			Imprimir("Blancura         : " + VariablesP.blancura[i]);
			Imprimir("Precio             :  " + VariablesP.precio[i]);
			Imprimir("" + "\n");
		}
	}
	
	
	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == btnCerrar) {
			do_btnCerrar_actionPerformed(arg0);
		}
	}
	
	protected void do_btnCerrar_actionPerformed(ActionEvent arg0) {
		dispose();
	}
	
	public void Imprimir(String s){
		txtS.append(s + "\n");
	}
	


}
