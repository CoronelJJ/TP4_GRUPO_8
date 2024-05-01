package TP4;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;

public class Ejercicio3 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejercicio3 frame = new Ejercicio3();
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
	public Ejercicio3() {
		setTitle("Seleccion multiple");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panelSO = new JPanel();
		panelSO.setBorder(new LineBorder(new Color(0, 0, 0)));
		panelSO.setBounds(10, 11, 414, 64);
		contentPane.add(panelSO);
		
		JPanel panelEspecialidad = new JPanel();
		panelEspecialidad.setBorder(new LineBorder(new Color(0, 0, 0)));
		panelEspecialidad.setBounds(10, 86, 414, 89);
		contentPane.add(panelEspecialidad);
	}

}
