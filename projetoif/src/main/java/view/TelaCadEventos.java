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
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.EtchedBorder;
import javax.swing.JRadioButton;
import javax.swing.JSpinner;
import javax.swing.JToggleButton;
import javax.swing.JCheckBox;
import javax.swing.JTextArea;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaCadEventos extends JInternalFrame {
	private JTextField textField;
	private JTextField textField_2;
	private JTextField textField_5;
	private JTextField textField_1;
	private JTextField textField_6;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_7;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaCadEventos frame = new TelaCadEventos();
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
	public TelaCadEventos() {
		setBounds(100, 100, 522, 300);
		
		JLabel lblTitulo = new JLabel("Cadastro de Eventos");
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitulo.setFont(new Font("Times New Roman", Font.BOLD, 20));
		
		JPanel panel = new JPanel();
		panel.setToolTipText("");
		panel.setLayout(null);
		panel.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Dados do Evento", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		
		JLabel lblCodCliente = new JLabel("T\u00EDtulo:");
		lblCodCliente.setBounds(10, 25, 151, 14);
		panel.add(lblCodCliente);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(76, 22, 320, 20);
		panel.add(textField);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setToolTipText("");
		panel_1.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Datas", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		
		JButton btnCancelar_1 = new JButton("Cancelar");
		
		JButton btnCancelar_1_1 = new JButton("Salvar");
		
		JButton btnPesquisar = new JButton("Pesquisar");
		
		JButton btnIncluir = new JButton("Incluir");
		
		JButton btnAlterar = new JButton("Alterar");
		
		JButton btnExcluir = new JButton("Excluir");
		
		JButton btnFechar = new JButton("Fechar");
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(233)
							.addComponent(btnCancelar_1)
							.addGap(18)
							.addComponent(btnCancelar_1_1, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE))
						.addComponent(lblTitulo, GroupLayout.PREFERRED_SIZE, 414, GroupLayout.PREFERRED_SIZE)
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING, false)
								.addComponent(panel, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(panel_1, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 406, Short.MAX_VALUE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(btnPesquisar, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(btnFechar, GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE)
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(btnExcluir, GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)
									.addPreferredGap(ComponentPlacement.RELATED))
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(btnAlterar, GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)
									.addPreferredGap(ComponentPlacement.RELATED))
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(btnIncluir, GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)
									.addPreferredGap(ComponentPlacement.RELATED)))))
					.addGap(5))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(6)
					.addComponent(lblTitulo, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(panel, GroupLayout.PREFERRED_SIZE, 111, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 74, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(btnCancelar_1)
								.addComponent(btnCancelar_1_1))
							.addGap(10))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(19)
							.addComponent(btnIncluir)
							.addGap(11)
							.addComponent(btnAlterar)
							.addGap(11)
							.addComponent(btnExcluir)
							.addGap(11)
							.addComponent(btnPesquisar)
							.addGap(11)
							.addComponent(btnFechar)
							.addContainerGap())))
		);
		
		JLabel lblNome = new JLabel("Inicio inscri\u00E7\u00E3o:");
		lblNome.setBounds(10, 21, 84, 14);
		panel_1.add(lblNome);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(88, 18, 100, 20);
		panel_1.add(textField_2);
		
		JLabel lblAnoDeNascimento = new JLabel("Ano de nascimento:");
		lblAnoDeNascimento.setBounds(10, 99, 109, 14);
		panel_1.add(lblAnoDeNascimento);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(107, 96, 86, 20);
		panel_1.add(textField_5);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(203, 95, 91, 23);
		panel_1.add(btnCancelar);
		
		JButton btnConfirma = new JButton("Salvar");
		btnConfirma.setBounds(305, 95, 91, 23);
		panel_1.add(btnConfirma);
		
		JLabel lblFinalIncrio = new JLabel("Fim inscri\u00E7\u00E3o:");
		lblFinalIncrio.setBounds(10, 49, 84, 14);
		panel_1.add(lblFinalIncrio);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(88, 46, 100, 20);
		panel_1.add(textField_3);
		
		JLabel lblInicioEvento = new JLabel("Inicio evento:");
		lblInicioEvento.setBounds(218, 18, 84, 14);
		panel_1.add(lblInicioEvento);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(296, 15, 100, 20);
		panel_1.add(textField_4);
		
		JLabel lblInicioEvento_1 = new JLabel("Fim evento:");
		lblInicioEvento_1.setBounds(218, 49, 84, 14);
		panel_1.add(lblInicioEvento_1);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(296, 46, 100, 20);
		panel_1.add(textField_7);
		
			
		JLabel lblNomeDoCliente = new JLabel("Descri\u00E7\u00E3o:");
		lblNomeDoCliente.setBounds(10, 53, 88, 14);
		panel.add(lblNomeDoCliente);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(76, 50, 320, 20);
		panel.add(textField_1);
		
		JLabel lblNomeDoCliente_1 = new JLabel("Palestrante:");
		lblNomeDoCliente_1.setBounds(10, 81, 88, 14);
		panel.add(lblNomeDoCliente_1);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(76, 78, 127, 20);
		panel.add(textField_6);
		
		JLabel lblNvel = new JLabel("N\u00EDvel:");
		lblNvel.setBounds(212, 82, 46, 14);
		panel.add(lblNvel);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Fundamental", "M\u00E9dio", "Superior"}));
		comboBox.setBounds(246, 77, 150, 22);
		panel.add(comboBox);
		getContentPane().setLayout(groupLayout);

	}
}
