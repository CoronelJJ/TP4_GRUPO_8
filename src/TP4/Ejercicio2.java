package TP4;

import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.*;
import java.awt.event.*;

public class Ejercicio2 extends JFrame {

	private JPanel contentPane;
	private JTextField txtNota1;
	private JTextField txtNota2;
	private JTextField txtNota3;
	private JTextField txtPromedio;
	private JTextField txtCondicion;
	private JComboBox<String>cbTps;
	
	private void confirmarSalida() {
        int opcion = JOptionPane.showConfirmDialog(this, "�Est�s seguro de que quieres salir?", "Confirmar Salida", JOptionPane.YES_NO_OPTION);
        if (opcion == JOptionPane.YES_OPTION) {
            dispose(); 
        }
    }

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
		txtNota1.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
					char c = e.getKeyChar();
					if((c<'0' || c>'9')&& (c!='.')) {
					e.consume();
				}
				
			}
		});
		txtNota1.setBounds(86, 27, 119, 20);
		panelNotas.add(txtNota1);
		txtNota1.setColumns(10);
		
		txtNota2 = new JTextField();
		txtNota2.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char c = e.getKeyChar();
				if((c<'0' || c>'9')&& (c!='.')) {
				e.consume();
				}
			}
		});
		txtNota2.setBounds(86, 52, 119, 20);
		panelNotas.add(txtNota2);
		txtNota2.setColumns(10);
		
		txtNota3 = new JTextField();
		txtNota3.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {	
				char c = e.getKeyChar();
				if((c<'0' || c>'9')&& (c!='.')) {
				e.consume();
				}	
			}
		});
		txtNota3.setBounds(86, 77, 119, 20);
		panelNotas.add(txtNota3);
		txtNota3.setColumns(10);
		
		cbTps = new JComboBox<>();
		cbTps.addItem("Aprobado");
		cbTps.addItem("Desaprobado");
		cbTps.setBounds(86, 110, 119, 22);
		panelNotas.add(cbTps);
		LlenarComboBox();
		
		JLabel lblTPS = new JLabel("TPS");
		lblTPS.setBounds(30, 113, 56, 16);
		panelNotas.add(lblTPS);
		
		JPanel panelPromedio = new JPanel();
		panelPromedio.setBorder(new TitledBorder(null, "Notas del estudiante", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panelPromedio.setBounds(28, 188, 294, 98);
		contentPane.add(panelPromedio);
		panelPromedio.setLayout(null);
		
		JLabel lblPromedio = new JLabel("Promedio:");
		lblPromedio.setBounds(10, 24, 63, 14);
		panelPromedio.add(lblPromedio);
		
		JLabel lblCondicion = new JLabel("Condicion:");
		lblCondicion.setBounds(10, 49, 63, 14);
		panelPromedio.add(lblCondicion);
		
		txtPromedio = new JTextField();
		txtPromedio.setEditable(false);
		lblPromedio.setLabelFor(txtPromedio);
		txtPromedio.setBounds(83, 21, 86, 20);
		panelPromedio.add(txtPromedio);
		txtPromedio.setColumns(10);
		
		txtCondicion = new JTextField();
		txtCondicion.setEditable(false);
		lblCondicion.setLabelFor(txtCondicion);
		txtCondicion.setBounds(83, 46, 86, 20);
		panelPromedio.add(txtCondicion);
		txtCondicion.setColumns(10);
		
		JButton btnCalcular = new JButton("CALCULAR");
		btnCalcular.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		Calcular();
        	}
        });
		btnCalcular.setBounds(370, 43, 110, 30);
		contentPane.add(btnCalcular);
		
		JButton btnNuevo = new JButton("NUEVO");
		btnNuevo.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		txtNota1.setText("");
        		txtNota2.setText("");
        		txtNota3.setText("");
        		txtCondicion.setText("");
        		txtPromedio.setText("");  
        		LlenarComboBox();
        	}
        });
		btnNuevo.setBounds(370, 84, 110, 30);
		contentPane.add(btnNuevo);
		
		JButton btnSalir = new JButton("SALIR");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				confirmarSalida();
				
			}
		});
		btnSalir.setBounds(370, 125, 110, 30);
		contentPane.add(btnSalir);
	}
	private void Calcular() {
		try {
    		double Nota1=Double.parseDouble(txtNota1.getText());
    		double Nota2=Double.parseDouble(txtNota2.getText());
			double Nota3= Double.parseDouble(txtNota3.getText());
			
			
			double notasAlumno[] = new double [3];
			notasAlumno[0] = Nota1;
			notasAlumno[1] = Nota2;
			notasAlumno[2] = Nota3;
			
			boolean numeroFueraDeRango = false;
			
			for (int i = 0; i < 3 ; i++) {
				if (notasAlumno[i] < 1.0 || notasAlumno[i] >10.0) {
					numeroFueraDeRango = true;
				}
			}
			
			if (numeroFueraDeRango) {
				JOptionPane.showMessageDialog(null, "Las notas deben ser del 1 al 10", "Error", JOptionPane.ERROR_MESSAGE);
			}
			else {
				if(!cbTps.getSelectedItem().equals("Condicion")) {
					if(cbTps.getSelectedItem().equals("Desaprobado")) {
	    			txtCondicion.setText("Libre");        			
		    		}
		    		else if(Nota1<6 || Nota2<6 || Nota3<6) {		
		    				txtCondicion.setText("Libre");	
					}
		    		else if(Nota1>=8 && Nota2>=8 && Nota3>=8) {
		    			txtCondicion.setText("Promocionado");	
					}
		    		else if((Nota1>=6 && Nota1<=8) && (Nota2>=6 && Nota2<=8) && (Nota3>=6 && Nota3<=8) && cbTps.getSelectedItem().equals("Aprobado")) {
		    			txtCondicion.setText("Regular");
		    		}
		    		else {
		    			txtCondicion.setText("Regular");
		    		}
		    		double Promedio =((Nota1+Nota2+Nota3)/3);
		    		String prom = String.format("%.2f", Promedio);
		    		txtPromedio.setText(prom);
		    		}
				}
			}
    		catch(NumberFormatException exc) {
    			  JOptionPane.showMessageDialog(null, "Ingresa valores v�lidos", "Error", JOptionPane.ERROR_MESSAGE);
    			  txtNota1.setText("");
    			  txtNota2.setText("");  
    			  txtNota3.setText("");
    		}
	}
	 private void LlenarComboBox() {
	        DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>();
	        model.addElement("Condicion");
	        model.addElement("Aprobado");
	        model.addElement("Desaprobado");
	        cbTps.setModel(model);
	        
	        cbTps.addActionListener(e -> {
	            if (cbTps.getSelectedIndex() != 0) {
	                model.removeElement("Condicion");
	            }
	        });
	    }
	
}
