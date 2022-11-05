package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JDesktopPane;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaPrincipal extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaPrincipal frame = new TelaPrincipal();
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
	public TelaPrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JDesktopPane desktop = new JDesktopPane();
		contentPane.add(desktop, BorderLayout.CENTER);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu MenuCadastros = new JMenu("Cadastros");
		menuBar.add(MenuCadastros);
		
		JMenuItem ItemMenuUsuarios = new JMenuItem("Usu\u00E1rios");
		ItemMenuUsuarios.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaCadUsuarios tela = new TelaCadUsuarios();
				tela.setVisible(true);
				desktop.add(tela);
			
			}
		
			
		
			
		});
		
		MenuCadastros.add(ItemMenuUsuarios);
		
		JMenuItem ItemMenuUsuarios_1 = new JMenuItem("Eventos");
		ItemMenuUsuarios_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaCadEventos tela = new TelaCadEventos();
				tela.setVisible(true);
				desktop.add(tela);
			
			}
		
			
		
			
		});
		
		
		
		MenuCadastros.add(ItemMenuUsuarios_1);
		
		JMenu MenuOperacoes = new JMenu("Consultas");
		menuBar.add(MenuOperacoes);
		
		JMenuItem ItemMenuUsuarios_1_1 = new JMenuItem("Eventos");
		ItemMenuUsuarios_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaConsEventos tela = new TelaConsEventos();
				tela.setVisible(true);
				desktop.add(tela);
			}
			
		});
		MenuOperacoes.add(ItemMenuUsuarios_1_1);
		
		JMenu MenuConsultas = new JMenu("Opera\u00E7\u00F5es");
		menuBar.add(MenuConsultas);
		
		JMenu MenuRelatorios = new JMenu("Relat\u00F3rios");
		menuBar.add(MenuRelatorios);
		
		JMenu MenuAjuda = new JMenu("Ajuda");
		menuBar.add(MenuAjuda);
		
		
		
	}
}
