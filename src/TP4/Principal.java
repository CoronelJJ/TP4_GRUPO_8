package TP4;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Principal extends JFrame {
	
	private JPanel contentPane;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal frame = new Principal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	
	public Principal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("TP4");
		setBounds(100, 100, 419, 274);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblGrupo = new JLabel("GRUPO NRO 8:");
		lblGrupo.setVerticalAlignment(SwingConstants.BOTTOM);
		lblGrupo.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblGrupo.setBounds(52, 30, 140, 16);
		contentPane.add(lblGrupo);
		
		JButton btnEjercicio1 = new JButton("Ejercicio 1");
		btnEjercicio1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Ejercicio1 ejer1 = new Ejercicio1();
				 ejer1.setVisible(true);
			}
		});
		btnEjercicio1.setBounds(137, 59, 97, 25);
		contentPane.add(btnEjercicio1);
		
		JButton btnEjercicio2 = new JButton("Ejercicio 2");
		btnEjercicio2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				Ejercicio2 ejer2 = new Ejercicio2();
				ejer2.setVisible(true);
			}
		});
		btnEjercicio2.setBounds(137, 109, 97, 25);
		contentPane.add(btnEjercicio2);
		
		JButton btnEjercicio3 = new JButton("Ejercicio 3");
		btnEjercicio3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Ejercicio3 ejer3 = new Ejercicio3();
				 ejer3.setVisible(true);
			}
		});
		btnEjercicio3.setBounds(137, 160, 97, 25);
		contentPane.add(btnEjercicio3);
	}

	private static final long serialVersionUID = 1L;
}
