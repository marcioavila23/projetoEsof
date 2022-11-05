package view;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import javax.swing.UIManager;
import javax.swing.border.TitledBorder;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;

public class TelaCadUsuarios extends JInternalFrame {
	private JTextField textEmail;
	private JTextField textSenha1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaCadUsuarios frame = new TelaCadUsuarios();
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
	public TelaCadUsuarios() {
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		
		JLabel lblTitulo = new JLabel("Cadastro de Usu\u00E1rios");
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitulo.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblTitulo.setBounds(10, 11, 414, 31);
		getContentPane().add(lblTitulo);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "Dados", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(10, 53, 312, 206);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblEmail = new JLabel("E-mail:");
		lblEmail.setBounds(25, 28, 46, 14);
		panel.add(lblEmail);
		
		textEmail = new JTextField();
		textEmail.setBounds(79, 25, 210, 20);
		panel.add(textEmail);
		textEmail.setColumns(10);
		
		JLabel lblSenha = new JLabel("Nome:");
		lblSenha.setBounds(25, 53, 46, 14);
		panel.add(lblSenha);
		
		textSenha1 = new JTextField();
		textSenha1.setColumns(10);
		textSenha1.setBounds(79, 50, 210, 20);
		panel.add(textSenha1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Estudante", "Coordenador", "Prof.Orientador"}));
		comboBox.setBounds(79, 101, 210, 22);
		panel.add(comboBox);
		
		JLabel lblNewLabel = new JLabel("Tipo");
		lblNewLabel.setBounds(25, 105, 46, 14);
		panel.add(lblNewLabel);
		
		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.setBounds(213, 161, 89, 23);
		panel.add(btnSalvar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(118, 161, 89, 23);
		panel.add(btnCancelar);
		
		JButton btnPesquisar = new JButton("Pesquisar");
		btnPesquisar.setBounds(332, 174, 89, 23);
		getContentPane().add(btnPesquisar);
		
		JButton btnIncluir = new JButton("Incluir");
		btnIncluir.setBounds(332, 72, 89, 23);
		getContentPane().add(btnIncluir);
		
		JButton btnAlterar = new JButton("Alterar");
		btnAlterar.setBounds(332, 106, 89, 23);
		getContentPane().add(btnAlterar);
		
		JButton btnExcluir = new JButton("Excluir");
		btnExcluir.setBounds(332, 140, 89, 23);
		getContentPane().add(btnExcluir);
		
		JButton btnFechar = new JButton("Fechar");
		btnFechar.setBounds(332, 208, 89, 23);
		getContentPane().add(btnFechar);

	}
}
