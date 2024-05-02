package TP4;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;

import java.awt.Color;

import javax.swing.SwingConstants;
import javax.swing.*;
import java.awt.event.*;


public class Ejercicio1 extends JFrame {
	private JPanel contentPane;
	private JTextField txtNombre;
	private JTextField txtApellido;
	private JLabel lblTelefono;
	private JTextField txtTelefono;
	private JLabel lblFechaNac;
	private JTextField txtFechaNac;
	private JButton btnMostrar;
	
	private void validarNumero(JTextField textField) {
		
		textField.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                char caracter = e.getKeyChar();
                if (!Character.isDigit(caracter) && caracter != '/') {
                    e.consume();
                }
            }
        });
    }
		
	
	
	
	
	public Ejercicio1() {
		setTitle("Contactos");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);//DISPOSE_ON_CLOSE Cierra solo esta ventana
		setBounds(100, 100, 446, 414);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(60, 40, 46, 14);
		contentPane.add(lblNombre);
		
		JLabel lblApellido = new JLabel("Apellido");
		lblApellido.setBounds(60, 79, 46, 14);
		contentPane.add(lblApellido);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(160, 37, 170, 20);
		contentPane.add(txtNombre);
		txtNombre.setColumns(10);
		
		txtApellido = new JTextField();
		txtApellido.setBounds(160, 76, 170, 20);
		contentPane.add(txtApellido);
		txtApellido.setColumns(10);
		
		lblTelefono = new JLabel("Telefono");
		lblTelefono.setBounds(60, 124, 76, 14);
		contentPane.add(lblTelefono);
		
		txtTelefono = new JTextField();
		txtTelefono.setColumns(10);
		txtTelefono.setBounds(160, 121, 170, 20);
		validarNumero(txtTelefono);
		contentPane.add(txtTelefono);
		
		lblFechaNac = new JLabel("Fecha Nac.");
		lblFechaNac.setBounds(60, 166, 76, 14);
		contentPane.add(lblFechaNac);
		
		txtFechaNac = new JTextField();
		txtFechaNac.setColumns(10);
		txtFechaNac.setBounds(160, 162, 170, 20);
		contentPane.add(txtFechaNac);
		
		JLabel lblMostrarDatos = new JLabel("Los datos ingresados fueron:");
		lblMostrarDatos.setVerticalAlignment(SwingConstants.TOP);
		lblMostrarDatos.setHorizontalAlignment(SwingConstants.LEFT);
		lblMostrarDatos.setBounds(60, 269, 349, 95);
		contentPane.add(lblMostrarDatos);
		
		btnMostrar = new JButton("Mostrar");
		btnMostrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				 JTextField[] campos = {txtNombre, txtApellido, txtTelefono, txtFechaNac};
				 boolean campoIncompleto=false;
				 String datos = "<html><body>Los datos ingresados fueron:<br>";
				 for (JTextField txt : campos) {
					 if(txt.getText().trim().isEmpty()) {
							txt.setBackground(Color.red);
							txt.setText("");
							campoIncompleto=true;
						}else {
							txt.setBackground(Color.white);
							datos += txt.getText().trim() + "<br>";
						}
				}
				if(!campoIncompleto) {
					datos += "</body></html>";
					lblMostrarDatos.setText(datos);
				for (JTextField txt : campos) {
					txt.setText("");
				}
				}
			}
		});
		btnMostrar.setBounds(225, 211, 105, 31);
		contentPane.add(btnMostrar);
		
		
		txtNombre.addFocusListener(new FocusListener() {

			@Override
			public void focusGained(FocusEvent arg0) {
				txtNombre.setBackground(Color.WHITE);
				
			}

			@Override
			public void focusLost(FocusEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			
		});
		
		txtApellido.addFocusListener(new FocusListener() {

			@Override
			public void focusGained(FocusEvent arg0) {
				txtApellido.setBackground(Color.WHITE);
				
			}

			@Override
			public void focusLost(FocusEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			
		});
		txtTelefono.addFocusListener(new FocusListener() {

			@Override
			public void focusGained(FocusEvent arg0) {
				txtTelefono.setBackground(Color.WHITE);
				
			}

			@Override
			public void focusLost(FocusEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			
		});
		
		txtFechaNac.addFocusListener(new FocusListener() {

			@Override
			public void focusGained(FocusEvent arg0) {
				txtFechaNac.setBackground(Color.WHITE);
				
			}

			@Override
			public void focusLost(FocusEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			
		});
		
	
	}
}
