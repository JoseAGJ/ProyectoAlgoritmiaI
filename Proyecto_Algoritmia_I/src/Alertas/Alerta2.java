package Alertas;

import java.awt.BorderLayout;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.util.Timer;
import java.util.TimerTask;
import java.awt.event.ActionEvent;
import com.sun.awt.*;

import java.awt.event.WindowListener;
import java.awt.event.WindowEvent;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.border.LineBorder;
import principal.MaterialButton;
import java.awt.Cursor;

@SuppressWarnings("serial")
public class Alerta2 extends JDialog implements ActionListener, WindowListener {

	//-- Agregado
	Timer timer = null;
	TimerTask task;
	int i = 32;
	
	private final JPanel contentPanel = new JPanel();
	private JPanel panel;
	private JLabel label;
	public static JLabel lblGraba1;
	public static JLabel lblGraba2;
	private MaterialButton mtrlbtnAceptar;
	private MaterialButton mtrlbtnCancelar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Alerta2 dialog = new Alerta2();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Alerta2() {
		
		setUndecorated(true);
		addWindowListener(this);
		AWTUtilities.setWindowOpaque(this, false);
		
		setBounds(100, 100, 475, 189);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		Ubicar(0); // Agregado
		
		{
			panel = new JPanel();
			panel.setBorder(new LineBorder(Color.LIGHT_GRAY, 4));
			panel.setFocusTraversalPolicyProvider(true);
			panel.setFocusCycleRoot(true);
			panel.setBackground(Color.WHITE);
			panel.setBounds(0, 0, 475, 189);
			contentPanel.add(panel);
			panel.setLayout(null);
			{
				label = new JLabel("");
				label.setIcon(new ImageIcon(Alerta2.class.getResource("/Imagenes/Advertencia_v.png")));
				label.setBounds(41, 29, 112, 107);
				panel.add(label);
			}
			{
				lblGraba1 = new JLabel("");
				lblGraba1.setFont(new Font("Agency FB", Font.BOLD, 38));
				lblGraba1.setBounds(149, 11, 255, 82);
				lblGraba1.setText("Seguro que Desea");
				panel.add(lblGraba1);
			}
			{
				lblGraba2 = new JLabel("Salir ?");
				lblGraba2.setFont(new Font("Agency FB", Font.BOLD, 38));
				lblGraba2.setBounds(223, 57, 102, 76);
				panel.add(lblGraba2);
			}
			{
				mtrlbtnAceptar = new MaterialButton();
				mtrlbtnAceptar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
				mtrlbtnAceptar.addActionListener(this);
				mtrlbtnAceptar.setFont(new Font("Dialog", Font.BOLD, 17));
				mtrlbtnAceptar.setForeground(Color.WHITE);
				mtrlbtnAceptar.setBackground(Color.DARK_GRAY);
				mtrlbtnAceptar.setText("Si");
				mtrlbtnAceptar.setBounds(189, 122, 97, 56);
				panel.add(mtrlbtnAceptar);
			}
			{
				mtrlbtnCancelar = new MaterialButton();
				mtrlbtnCancelar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
				mtrlbtnCancelar.addActionListener(this);
				mtrlbtnCancelar.setText("Cancelar");
				mtrlbtnCancelar.setForeground(Color.WHITE);
				mtrlbtnCancelar.setFont(new Font("Dialog", Font.BOLD, 17));
				mtrlbtnCancelar.setBackground(Color.DARK_GRAY);
				mtrlbtnCancelar.setBounds(307, 122, 134, 56);
				panel.add(mtrlbtnCancelar);
			}
		}
		

	}
	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == mtrlbtnCancelar) {
			do_mtrlbtnCancelar_actionPerformed(arg0);
		}
		if (arg0.getSource() == mtrlbtnAceptar) {
			do_mtrlbtnAceptar_actionPerformed(arg0);
		}
	}
	
	public void windowActivated(WindowEvent arg0) {
	}
	public void windowClosed(WindowEvent arg0) {
	}
	public void windowClosing(WindowEvent arg0) {
		setVisible(false);
		dispose();
	}
	public void windowDeactivated(WindowEvent arg0) {
	}
	public void windowDeiconified(WindowEvent arg0) {
	}
	public void windowIconified(WindowEvent arg0) {
	}
	public void windowOpened(WindowEvent arg0) {
		if (arg0.getSource() == this) {
			do_this_windowOpened(arg0);
		}
	}
	protected void do_this_windowOpened(WindowEvent arg0) {
		task = new TimerTask() {
			
			@Override
			public void run() {
				if(i==352){
					timer.cancel();
				}else{
					Ubicar(i);
					i+=32;
					Transparencia((float) i /352);
				}
				
			}
		};
		timer  = new Timer();
		timer.schedule(task, 0,2);
	}
	
	
	
	protected void do_mtrlbtnAceptar_actionPerformed(ActionEvent arg0) {
		System.exit(0);
	}
	
	
	protected void do_mtrlbtnCancelar_actionPerformed(ActionEvent arg0) {
		 task = new TimerTask() {
	            @Override
	            public void run() {
	                if (i == 0) {
	                    Cerrar();
	                } else {
	                    Ubicar(i);
	                    i -= 32;
	                    Transparencia((float) i / 352);
	                }
	            }
	        };
	        timer = new Timer();
	        timer.schedule(task, 0, 2);
	}
	
	
	
	private void Cerrar(){
		this.dispose();
		timer=null;
		task=null;
	}
	public void Transparencia(float trasp){
		com.sun.awt.AWTUtilities.setWindowOpacity(this, trasp);
	}
	
	public void Ubicar(int y){
		this.setLocation(100,y-210);

	}
	
}

