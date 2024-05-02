package TP4;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.ActionEvent;

public class Ejercicio3 extends JFrame {

	private JPanel contentPane;
	private JTextField txtHoras;

	public Ejercicio3() {
		setTitle("Seleccion multiple");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 454, 344);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panelSO = new JPanel();
		panelSO.setBorder(new LineBorder(new Color(0, 0, 0)));
		panelSO.setBounds(10, 13, 408, 64);
		contentPane.add(panelSO);
		panelSO.setLayout(null);
		
		JLabel lblSO = new JLabel("Elije un sistema operativo");
		lblSO.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblSO.setBounds(10, 19, 158, 22);
		panelSO.add(lblSO);
		
		ButtonGroup rdGrupo = new ButtonGroup();
		
		JRadioButton rdbtnWindows = new JRadioButton("Windows");
		rdbtnWindows.setBounds(173, 20, 81, 25);
		panelSO.add(rdbtnWindows);
		rdGrupo.add(rdbtnWindows);
		
		JRadioButton rdbtnMac = new JRadioButton("Mac");
		rdbtnMac.setBounds(261, 20, 65, 25);
		panelSO.add(rdbtnMac);
		rdGrupo.add(rdbtnMac);
		
		JRadioButton rdbtnLinux = new JRadioButton("Linux");
		rdbtnLinux.setBounds(322, 20, 81, 25);
		panelSO.add(rdbtnLinux);
		rdGrupo.add(rdbtnLinux);
		
		JPanel panelEspecialidad = new JPanel();
		panelEspecialidad.setBorder(new LineBorder(new Color(0, 0, 0)));
		panelEspecialidad.setBounds(10, 86, 408, 105);
		contentPane.add(panelEspecialidad);
		panelEspecialidad.setLayout(null);
		
		JLabel lbEspecialidad = new JLabel("Elije una especialidad");
		lbEspecialidad.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lbEspecialidad.setBounds(24, 32, 130, 23);
		panelEspecialidad.add(lbEspecialidad);
		
		JCheckBox chckbxProgramacion = new JCheckBox("Programacion");
		chckbxProgramacion.setBounds(191, 9, 113, 25);
		panelEspecialidad.add(chckbxProgramacion);
		
		JCheckBox chckbxAdministracion = new JCheckBox("Administracion");
		chckbxAdministracion.setBounds(191, 39, 113, 25);
		panelEspecialidad.add(chckbxAdministracion);
		
		JCheckBox chckbxDsn = new JCheckBox("Dise\u00F1o Grafico");
		chckbxDsn.setBounds(191, 69, 113, 25);
		panelEspecialidad.add(chckbxDsn);
		
		JLabel lblHoras = new JLabel("Cantidad de horas en el computador:");
		lblHoras.setBounds(10, 210, 232, 16);
		contentPane.add(lblHoras);
		
		txtHoras = new JTextField();
		txtHoras.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char c = e.getKeyChar();
				if((c<'0' || c>'9')&& (c!='.')) {
				e.consume();
				}
			}
		});
		txtHoras.setBounds(254, 207, 116, 22);
		contentPane.add(txtHoras);
		txtHoras.setColumns(10);
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				boolean campoIncompleto=false;
				if(txtHoras.getText().trim().isEmpty()) {
					txtHoras.setBackground(Color.red);
					txtHoras.setText("");
					campoIncompleto=true;}
				
				else {
				txtHoras.setBackground(Color.white);
				txtHoras.setText("");
				MensajeEjercicio3 mensaje = new MensajeEjercicio3();
				mensaje.setVisible(true);
				
			}
			}
		});
		btnAceptar.setBounds(291, 259, 97, 25);
		contentPane.add(btnAceptar);
	}
}
