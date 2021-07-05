package Principal;


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Alertas.Alerta2;
import Ayuda.frmAcercaTienda;
import Configurar.frmConfiguraCantORV;
import Configurar.frmConfiguraPremioS;
import Configurar.frmConfigurarDescuentos;
import Configurar.frmConfigurarObsequio;
import Mantenimiento.frmModificarPapel;
import Mantenimiento.frmConsultarPapel;
import Mantenimiento.frmListarPapel;
import Ventas.frmGeneraReporte;
import Ventas.frmVender;

import java.awt.Frame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JMenuItem;
import javax.swing.JDesktopPane;

import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.Insets;
import java.awt.Font;
import java.awt.Cursor;
import javax.swing.JLabel;

@SuppressWarnings("serial")
public class Menu extends JFrame implements ActionListener {

	private JPanel contentPane;
	public static JDesktopPane Escritorio;
	private JMenuItem mntmConsultarPapel;
	private JMenuItem mntmModificarPapel;
	private JMenuItem mntmListarPapeles;
	private JMenu mnVentas;
	private JMenuItem mntmVenderPapeles;
	private JMenuItem mntmGenerarReportes;
	private JMenu mnConfigurar;
	private JMenuItem mntmConfigurarDescuentos;
	private JMenuItem mntmConfigurarObsequio;
	private JMenuItem mntmConfigurarCantidadptima;
	private JMenuItem mntmConfigurarPremioSorpresa;
	private JMenu mnAcerca;
	private JMenuItem mntmAcercaDeTienda;
	private JMenuItem mntmSalir;
	private JLabel label;
	private JLabel lblNewLabel;
	private JLabel lblTienda;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu frame = new Menu();
					
					frame.setExtendedState(Frame.MAXIMIZED_BOTH);
					
					
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
	
	public Menu() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1935, 1054);
				
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBackground(Color.WHITE);
		setJMenuBar(menuBar);
		
		JMenu mnSalir = new JMenu(" Archivo  ");
		mnSalir.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		mnSalir.setFont(new Font("Agency FB", Font.BOLD, 22));
		mnSalir.setIcon(new ImageIcon(Menu.class.getResource("/Imagenes/carpeta.png")));
		mnSalir.setMargin(new Insets(5, 3, 2, 2));
		menuBar.add(mnSalir);
		
		mntmSalir = new JMenuItem("Salir");
		mntmSalir.addActionListener(this);
		mntmSalir.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		mntmSalir.setFont(new Font("Agency FB", Font.BOLD, 20));
		mntmSalir.setMargin(new Insets(2, 3, 2, 2));
		mntmSalir.setIcon(new ImageIcon(Menu.class.getResource("/Imagenes/cerrar-sesion.png")));
		mnSalir.add(mntmSalir);
		
		JMenu mnMantenimiento = new JMenu("  Mantenimiento");
		mnMantenimiento.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		mnMantenimiento.setMargin(new Insets(0, 18, 0, 0));
		mnMantenimiento.setFont(new Font("Agency FB", Font.BOLD, 22));
		mnMantenimiento.setIcon(new ImageIcon(Menu.class.getResource("/Imagenes/Mantenimiento.png")));
		menuBar.add(mnMantenimiento);
		
		mntmConsultarPapel = new JMenuItem("Consultar Papel");
		mntmConsultarPapel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		mntmConsultarPapel.setMargin(new Insets(3, 6, 4, 3));
		mntmConsultarPapel.setFont(new Font("Agency FB", Font.BOLD, 20));
		mntmConsultarPapel.setIcon(new ImageIcon(Menu.class.getResource("/Imagenes/consultante.png")));
		mntmConsultarPapel.addActionListener(this);
		mnMantenimiento.add(mntmConsultarPapel);
		{
			mntmModificarPapel = new JMenuItem("Modificar Papel");
			mntmModificarPapel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			mntmModificarPapel.setFont(new Font("Agency FB", Font.BOLD, 20));
			mntmModificarPapel.setIcon(new ImageIcon(Menu.class.getResource("/Imagenes/documento.png")));
			mntmModificarPapel.setMargin(new Insets(3, 6, 4, 3));
			mntmModificarPapel.addActionListener(this);
			mnMantenimiento.add(mntmModificarPapel);
		}
		
		mntmListarPapeles = new JMenuItem("Listar Papeles");
		mntmListarPapeles.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		mntmListarPapeles.setFont(new Font("Agency FB", Font.BOLD, 20));
		mntmListarPapeles.setIcon(new ImageIcon(Menu.class.getResource("/Imagenes/lista.png")));
		mntmListarPapeles.setMargin(new Insets(3, 6, 4, 3));
		mntmListarPapeles.addActionListener(this);
		mnMantenimiento.add(mntmListarPapeles);
		{
			mnVentas = new JMenu("Ventas");
			mnVentas.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			mnVentas.setIcon(new ImageIcon(Menu.class.getResource("/Imagenes/carrito-de-compras.png")));
			mnVentas.setMargin(new Insets(0, 18, 0, 10));
			mnVentas.setFont(new Font("Agency FB", Font.BOLD, 22));
			menuBar.add(mnVentas);
			{
				mntmVenderPapeles = new JMenuItem(" Vender");
				mntmVenderPapeles.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
				mntmVenderPapeles.setIcon(new ImageIcon(Menu.class.getResource("/Imagenes/Vender.png")));
				mntmVenderPapeles.setMargin(new Insets(3, 6, 4, 3));
				mntmVenderPapeles.setFont(new Font("Agency FB", Font.BOLD, 20));
				mntmVenderPapeles.addActionListener(this);
				mnVentas.add(mntmVenderPapeles);
			}
			{
				mntmGenerarReportes = new JMenuItem(" Generar reportes");
				mntmGenerarReportes.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
				mntmGenerarReportes.setIcon(new ImageIcon(Menu.class.getResource("/Imagenes/Reporte.png")));
				mntmGenerarReportes.setMargin(new Insets(3, 6, 4, 3));
				mntmGenerarReportes.setFont(new Font("Agency FB", Font.BOLD, 20));
				mntmGenerarReportes.addActionListener(this);
				mnVentas.add(mntmGenerarReportes);
			}
		}
		{
			mnConfigurar = new JMenu(" Configurar");
			mnConfigurar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			mnConfigurar.setIcon(new ImageIcon(Menu.class.getResource("/Imagenes/engranaje.png")));
			mnConfigurar.setMargin(new Insets(0, 25, 0, 0));
			mnConfigurar.setFont(new Font("Agency FB", Font.BOLD, 22));
			menuBar.add(mnConfigurar);
			{
				mntmConfigurarDescuentos = new JMenuItem("Configurar Descuentos");
				mntmConfigurarDescuentos.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
				mntmConfigurarDescuentos.setIcon(new ImageIcon(Menu.class.getResource("/Imagenes/descuento.png")));
				mntmConfigurarDescuentos.setMargin(new Insets(3, 6, 4, 3));
				mntmConfigurarDescuentos.setFont(new Font("Agency FB", Font.BOLD, 20));
				mntmConfigurarDescuentos.addActionListener(this);
				mnConfigurar.add(mntmConfigurarDescuentos);
			}
			
			mntmConfigurarObsequio = new JMenuItem("Configurar Obsequio");
			mntmConfigurarObsequio.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			mntmConfigurarObsequio.setIcon(new ImageIcon(Menu.class.getResource("/Imagenes/regalo.png")));
			mntmConfigurarObsequio.setMargin(new Insets(3, 6, 4, 3));
			mntmConfigurarObsequio.setFont(new Font("Agency FB", Font.BOLD, 20));
			mntmConfigurarObsequio.addActionListener(this);
			mnConfigurar.add(mntmConfigurarObsequio);
			
			mntmConfigurarCantidadptima = new JMenuItem("Configurar cantidad \u00F3ptima de resmas vendidas");
			mntmConfigurarCantidadptima.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			mntmConfigurarCantidadptima.setIcon(new ImageIcon(Menu.class.getResource("/Imagenes/HOJAS.png")));
			mntmConfigurarCantidadptima.setMargin(new Insets(3, 6, 4, 3));
			mntmConfigurarCantidadptima.setFont(new Font("Agency FB", Font.BOLD, 20));
			mntmConfigurarCantidadptima.addActionListener(this);
			mnConfigurar.add(mntmConfigurarCantidadptima);
			
			mntmConfigurarPremioSorpresa = new JMenuItem("Configurar premio sorpresa");
			mntmConfigurarPremioSorpresa.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			mntmConfigurarPremioSorpresa.setIcon(new ImageIcon(Menu.class.getResource("/Imagenes/Premio_S.png")));
			mntmConfigurarPremioSorpresa.setMargin(new Insets(3, 6, 4, 3));
			mntmConfigurarPremioSorpresa.setFont(new Font("Agency FB", Font.BOLD, 20));
			mntmConfigurarPremioSorpresa.addActionListener(this);
			mnConfigurar.add(mntmConfigurarPremioSorpresa);
		}
		
		mnAcerca = new JMenu("Acerca");
		mnAcerca.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		mnAcerca.setIcon(new ImageIcon(Menu.class.getResource("/Imagenes/pregunta.png")));
		mnAcerca.setMargin(new Insets(0, 23, 0, 0));
		mnAcerca.setFont(new Font("Agency FB", Font.BOLD, 22));
		menuBar.add(mnAcerca);
		
		mntmAcercaDeTienda = new JMenuItem("Acerca de tienda");
		mntmAcercaDeTienda.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		mntmAcercaDeTienda.setIcon(new ImageIcon(Menu.class.getResource("/Imagenes/Acerca.png")));
		mntmAcercaDeTienda.setMargin(new Insets(3, 6, 4, 3));
		mntmAcercaDeTienda.setFont(new Font("Agency FB", Font.BOLD, 20));
		mntmAcercaDeTienda.addActionListener(this);
		mnAcerca.add(mntmAcercaDeTienda);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
			
		Escritorio = new JDesktopPane();
		Escritorio.setBackground(Color.WHITE);
		Escritorio.setBounds(0, 0, getWidth(), getHeight());
		contentPane.add(Escritorio);			
		
		{
			label = new JLabel("");
			label.setIcon(new ImageIcon(Menu.class.getResource("/Imagenes/MENU_V.png")));
			label.setBounds(595, 140, 341, 680);
			Escritorio.add(label);
		}
		{
			lblNewLabel = new JLabel("New label");
			lblNewLabel.setIcon(new ImageIcon(Menu.class.getResource("/Imagenes/Menu_SP.png")));
			lblNewLabel.setBounds(1001, 365, 334, 465);
			Escritorio.add(lblNewLabel);
		}
		{
			lblTienda = new JLabel("Tienda 1.0");
			lblTienda.setFont(new Font("Agency FB", Font.PLAIN, 86));
			lblTienda.setBounds(795, 31, 272, 76);
			Escritorio.add(lblTienda);
		}		
	}
	

	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == mntmSalir) {
			do_mntmSalir_actionPerformed(arg0);
		}
		if (arg0.getSource() == mntmAcercaDeTienda) {
			do_mntmAcercaDeTienda_actionPerformed(arg0);
		}
		if (arg0.getSource() == mntmConfigurarPremioSorpresa) {
			do_mntmConfigurarPremioSorpresa_actionPerformed(arg0);
		}
		if (arg0.getSource() == mntmConfigurarCantidadptima) {
			do_mntmConfigurarCantidadptima_actionPerformed(arg0);
		}
		if (arg0.getSource() == mntmConfigurarObsequio) {
			do_mntmConfigurarObsequio_actionPerformed(arg0);
		}
		if (arg0.getSource() == mntmConfigurarDescuentos) {
			do_mntmConfigurarDescuentos_actionPerformed(arg0);
		}
		if (arg0.getSource() == mntmGenerarReportes) {
			do_mntmGenerarReportes_actionPerformed(arg0);
		}
		if (arg0.getSource() == mntmVenderPapeles) {
			do_mntmVenderPapeles_actionPerformed(arg0);
		}
		if (arg0.getSource() == mntmListarPapeles) {
			do_mntmListarPapeles_actionPerformed(arg0);
		}
		if (arg0.getSource() == mntmModificarPapel) {
			do_mntmModificarPapel_actionPerformed(arg0);
		}
		if (arg0.getSource() == mntmConsultarPapel) {
			do_mntmConsultarPapel_actionPerformed(arg0);
		}
	}
	
	
	//-- Salir
	protected void do_mntmSalir_actionPerformed(ActionEvent arg0) {
		new Alerta2().setVisible(true);
	}
	
	
	// Consultar Papel
	protected void do_mntmConsultarPapel_actionPerformed(ActionEvent arg0) {
		frmConsultarPapel cp = new frmConsultarPapel();
		CentrarJIF(cp);
	}
	
	//-- Modificar Papel
	protected void do_mntmModificarPapel_actionPerformed(ActionEvent arg0) {
		frmModificarPapel cp = new frmModificarPapel();
		CentrarJIF(cp);
	}	
		
	//-- Listar Papeles
	protected void do_mntmListarPapeles_actionPerformed(ActionEvent arg0) {
		frmListarPapel cp = new frmListarPapel();
		CentrarJIF(cp);
	}
	
	//-- Vender Papeles
	protected void do_mntmVenderPapeles_actionPerformed(ActionEvent arg0) {
		frmVender cp = new frmVender();
		CentrarJIF(cp);
	}
	
	//-- Generar Reportes
	protected void do_mntmGenerarReportes_actionPerformed(ActionEvent arg0) {
		frmGeneraReporte cp = new frmGeneraReporte();
		CentrarJIF(cp);		
	}
	
	//-- Configurar Descuentos
	protected void do_mntmConfigurarDescuentos_actionPerformed(ActionEvent arg0) {
		frmConfigurarDescuentos cp = new frmConfigurarDescuentos();
		CentrarJIF(cp);
	}
	
	//-- Configurar Obsequios
	protected void do_mntmConfigurarObsequio_actionPerformed(ActionEvent arg0) {
		frmConfigurarObsequio cp = new frmConfigurarObsequio();
		CentrarJIF(cp);
	}
	
	//-- Configurar cantidad optima de resmas vedidas
	protected void do_mntmConfigurarCantidadptima_actionPerformed(ActionEvent arg0) {
		frmConfiguraCantORV cp = new frmConfiguraCantORV();
		CentrarJIF(cp);
	}
	
	//-- Configurar Premio Sorpresa
	protected void do_mntmConfigurarPremioSorpresa_actionPerformed(ActionEvent arg0) {
		frmConfiguraPremioS cp = new frmConfiguraPremioS();
		CentrarJIF(cp);
	}
	
	//-- Acerca de Tienda
	protected void do_mntmAcercaDeTienda_actionPerformed(ActionEvent arg0) {
		frmAcercaTienda  cp = new frmAcercaTienda();
		CentrarJIF(cp);
	}
		
	//-- Centra los JinternalFrames
	public void CentrarJIF(JInternalFrame cp){	
		Escritorio.add(cp);
		cp.setLocation(((Escritorio.getWidth()/2) - cp.getWidth()/2),120);
		cp.setVisible(true);
	}

}
