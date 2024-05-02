package TP4;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JRadioButton;

public class Ejercicio3 extends JFrame {

	private JPanel contentPane;

	public Ejercicio3() {
		setTitle("Seleccion multiple");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 454, 300);
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
		panelEspecialidad.setBounds(10, 86, 408, 89);
		contentPane.add(panelEspecialidad);
		panelEspecialidad.setLayout(null);
		
		JLabel lbEspecialidad = new JLabel("Elije una especialidad");
		lbEspecialidad.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lbEspecialidad.setBounds(24, 32, 130, 23);
		panelEspecialidad.add(lbEspecialidad);
	}
}
