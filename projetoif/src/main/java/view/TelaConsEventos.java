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

public class TelaConsEventos extends JInternalFrame {
	private JTextField textField_4;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaConsEventos frame = new TelaConsEventos();
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
	public TelaConsEventos() {
		setBounds(100, 100, 450, 300);
		
		JLabel lblTitulo = new JLabel("Consulta Eventos");
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitulo.setFont(new Font("Times New Roman", Font.BOLD, 20));
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setToolTipText("");
		panel_1.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Informa\u00E7\u00F5es", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setLayout(null);
		panel_1_1.setToolTipText("");
		panel_1_1.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Eventos", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		
		JButton btnConfirma_1 = new JButton("Salvar");
		btnConfirma_1.setBounds(305, 95, 91, 23);
		panel_1_1.add(btnConfirma_1);
		
		JButton btnInscrever = new JButton("Inscrever");
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(10)
							.addComponent(lblTitulo, GroupLayout.PREFERRED_SIZE, 414, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addContainerGap()
							.addComponent(panel_1_1, GroupLayout.PREFERRED_SIZE, 191, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
								.addComponent(panel_1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(btnInscrever, GroupLayout.PREFERRED_SIZE, 113, GroupLayout.PREFERRED_SIZE)
									.addGap(55)))))
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(11)
					.addComponent(lblTitulo, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(panel_1_1, GroupLayout.PREFERRED_SIZE, 211, GroupLayout.PREFERRED_SIZE)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 141, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(btnInscrever)))
					.addContainerGap())
		);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("T\u00EDtulo - Descri\u00E7\u00E3o");
		rdbtnNewRadioButton_2.setBounds(10, 72, 162, 23);
		panel_1_1.add(rdbtnNewRadioButton_2);
		
		JRadioButton rdbtnNewRadioButton_1_1 = new JRadioButton("T\u00EDtulo - Descri\u00E7\u00E3o");
		rdbtnNewRadioButton_1_1.setBounds(10, 98, 162, 23);
		panel_1_1.add(rdbtnNewRadioButton_1_1);
		
		JRadioButton rdbtnNewRadioButton_3 = new JRadioButton("T\u00EDtulo - Descri\u00E7\u00E3o");
		rdbtnNewRadioButton_3.setBounds(10, 124, 162, 23);
		panel_1_1.add(rdbtnNewRadioButton_3);
		
		JRadioButton rdbtnNewRadioButton_1_2 = new JRadioButton("T\u00EDtulo - Descri\u00E7\u00E3o");
		rdbtnNewRadioButton_1_2.setBounds(10, 150, 162, 23);
		panel_1_1.add(rdbtnNewRadioButton_1_2);
		
		JRadioButton rdbtnNewRadioButton_4 = new JRadioButton("T\u00EDtulo - Descri\u00E7\u00E3o");
		rdbtnNewRadioButton_4.setBounds(10, 176, 162, 23);
		panel_1_1.add(rdbtnNewRadioButton_4);
		
		JLabel lblNvel = new JLabel("N\u00EDvel Recomendado:");
		lblNvel.setBounds(9, 22, 103, 14);
		panel_1_1.add(lblNvel);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Fundamental", "M\u00E9dio", "Superior"}));
		comboBox_1.setBounds(10, 43, 101, 22);
		panel_1_1.add(comboBox_1);
		
		JLabel lblTipo = new JLabel("Tipo ");
		lblTipo.setBounds(292, 21, 31, 14);
		panel_1.add(lblTipo);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"C\u00E3o", "Gato", "Ave"}));
		comboBox.setBounds(323, 18, 73, 20);
		panel_1.add(comboBox);
		
		JLabel lblCor = new JLabel("Cor:");
		lblCor.setBounds(215, 63, 37, 14);
		panel_1.add(lblCor);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(251, 60, 145, 20);
		panel_1.add(textField_4);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(203, 95, 91, 23);
		panel_1.add(btnCancelar);
		
		JButton btnConfirma = new JButton("Salvar");
		btnConfirma.setBounds(305, 95, 91, 23);
		panel_1.add(btnConfirma);
		
		JLabel lblNome_1 = new JLabel("Inicio incri\u00E7\u00E3o:");
		lblNome_1.setBounds(10, 24, 84, 14);
		panel_1.add(lblNome_1);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(88, 21, 100, 20);
		panel_1.add(textField_1);
		
		JLabel lblFinalIncrio = new JLabel("Final incri\u00E7\u00E3o:");
		lblFinalIncrio.setBounds(10, 53, 84, 14);
		panel_1.add(lblFinalIncrio);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(88, 50, 100, 20);
		panel_1.add(textField_2);
		
		JLabel lblNome_1_1 = new JLabel("Inicio Evento:");
		lblNome_1_1.setBounds(10, 81, 84, 14);
		panel_1.add(lblNome_1_1);
		
		JLabel lblNome_2_1 = new JLabel("Final Evento:");
		lblNome_2_1.setBounds(10, 110, 84, 14);
		panel_1.add(lblNome_2_1);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(88, 107, 100, 20);
		panel_1.add(textField);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(88, 78, 100, 20);
		panel_1.add(textField_3);
		getContentPane().setLayout(groupLayout);

	}
}
