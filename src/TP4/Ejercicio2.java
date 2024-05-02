package TP4;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import javax.swing.UIManager;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Ejercicio2 extends JFrame {

	private JPanel contentPane;
	private JTextField txtNota1;
	private JTextField txtNota2;
	private JTextField txtNota3;
	private JTextField txtPromedio;
	private JTextField txtCondicion;

	public Ejercicio2() {
		setTitle("Promedio");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 550, 390);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panelNotas = new JPanel();
		panelNotas.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Notas del estudiante", TitledBorder.LEADING, TitledBorder.TOP, null, Color.BLACK));
		panelNotas.setBounds(28, 28, 294, 149);
		contentPane.add(panelNotas);
		panelNotas.setLayout(null);
		
		JLabel lblNota1 = new JLabel("Nota 1:");
		lblNota1.setBounds(30, 30, 46, 14);
		panelNotas.add(lblNota1);
		
		JLabel lblNota2 = new JLabel("Nota 2:");
		lblNota2.setBounds(30, 55, 46, 14);
		panelNotas.add(lblNota2);
		
		JLabel lblNota3 = new JLabel("Nota 3:");
		lblNota3.setBounds(30, 80, 46, 14);
		panelNotas.add(lblNota3);
		
		txtNota1 = new JTextField();
		txtNota1.setBounds(86, 27, 119, 20);
		panelNotas.add(txtNota1);
		txtNota1.setColumns(10);
		
		txtNota2 = new JTextField();
		txtNota2.setBounds(86, 52, 119, 20);
		panelNotas.add(txtNota2);
		txtNota2.setColumns(10);
		
		txtNota3 = new JTextField();
		txtNota3.setBounds(86, 77, 119, 20);
		panelNotas.add(txtNota3);
		txtNota3.setColumns(10);
		
		JPanel panelPromedio = new JPanel();
		panelPromedio.setBorder(new TitledBorder(null, "Notas del estudiante", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panelPromedio.setBounds(28, 188, 294, 98);
		contentPane.add(panelPromedio);
		panelPromedio.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Promedio:");
		lblNewLabel.setBounds(10, 24, 63, 14);
		panelPromedio.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Condicion:");
		lblNewLabel_1.setBounds(10, 49, 63, 14);
		panelPromedio.add(lblNewLabel_1);
		
		txtPromedio = new JTextField();
		lblNewLabel.setLabelFor(txtPromedio);
		txtPromedio.setBounds(83, 21, 86, 20);
		panelPromedio.add(txtPromedio);
		txtPromedio.setColumns(10);
		
		txtCondicion = new JTextField();
		lblNewLabel_1.setLabelFor(txtCondicion);
		txtCondicion.setBounds(83, 46, 86, 20);
		panelPromedio.add(txtCondicion);
		txtCondicion.setColumns(10);
	}
}
