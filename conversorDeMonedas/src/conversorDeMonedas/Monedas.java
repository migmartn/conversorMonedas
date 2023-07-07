package conversorDeMonedas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.Cursor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;
import javax.swing.UIManager;
import java.awt.Color;

public class Monedas extends JFrame {

	private JPanel contentPane;
	private JTextField dato;
	private JTextField resultado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Monedas frame = new Monedas();
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
	public Monedas() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\migni\\Downloads\\a.hi-3916009637"));
		setTitle("Conversor Monedas\r\n");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JComboBox option = new JComboBox();
		option.setModel(new DefaultComboBoxModel(new String[] {"--Elige una opcion--", "Peso MX a Dolar", "Peso MX  a Euros",
				"Peso MX  a Libras Esterlinas", "Peso MX  a Yen Japonés", "Peso MX  a Won sul-coreano", "Dólar a Peso MX", 
				"Euros a Peso MX", "Libras Esterlinas a Peso MX", "Yen Japonés a Peso MX", "Won sul-coreano a Peso MX"}));
		option.setSelectedIndex(0);
		option.setBounds(21, 49, 197, 44);
		contentPane.add(option);
		
		JLabel lblNewLabel = new JLabel("Ingresa la \r\ncantidad ");
		lblNewLabel.setToolTipText("");
		lblNewLabel.setBounds(283, 18, 117, 32);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Cerrar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnNewButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton.setBounds(21, 115, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Convertir");
		btnNewButton_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton_1.setBorder(UIManager.getBorder("ComboBox.editorBorder"));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String opc;
				double numeroConvertir, numeroConvertido;
				/*"--Elige una opcion--", 
				 * "Peso MX a Dolar / 17.56
				 * Peso MX  a Euros / 19.3  
				 * "Peso MX  a Libras Esterlinas / 22 
				 * "Peso MX  a Yen Japonés / 0.12
				 *  "Peso MX  a Won sul-coreano / 75.78
				 *  
				 *  "Dólar a Peso MX", 
				 *  "Euros a Peso MX", 
				 *  "Libras Esterlinas a Peso MX", 
				 *  "Yen Japonés a Peso MX", 
				 *  "Won sul-coreano a Peso MX"
				   */
				
				opc = option.getSelectedItem().toString();
				System.out.println(opc);
				numeroConvertir = Double.parseDouble(dato.getText());
				if(opc.equalsIgnoreCase("Peso Mx a Dolar")) {
					numeroConvertido = numeroConvertir / 17.56;
					double numeroConvertidos = (double) Math.round(numeroConvertido *100d)/100;
					resultado.setText(String.valueOf(numeroConvertidos));
				}
				
				if(opc.equalsIgnoreCase("Peso MX  a Euros")) {
					numeroConvertido = numeroConvertir / 19.3;
					double numeroConvertidos = (double) Math.round(numeroConvertido *100d)/100;
					resultado.setText(String.valueOf(numeroConvertidos));
				}
				
				if(opc.equalsIgnoreCase("Peso MX  a Libras Esterlinas")) {
					numeroConvertido = numeroConvertir / 22;
					double numeroConvertidos = (double) Math.round(numeroConvertido *100d)/100;
					resultado.setText(String.valueOf(numeroConvertidos));
				}
				
				if(opc.equalsIgnoreCase("Peso MX  a Yen Japonés")) {
					numeroConvertido = numeroConvertir / 0.12;
					double numeroConvertidos = (double) Math.round(numeroConvertido *100d)/100;
					resultado.setText(String.valueOf(numeroConvertidos));
				}
				
				if(opc.equalsIgnoreCase("Peso MX  a Won sul-coreano")) {
					numeroConvertido = numeroConvertir / 0.013;
					double numeroConvertidos = (double) Math.round(numeroConvertido *100d)/100;
					resultado.setText(String.valueOf(numeroConvertidos));
				}
				

				if(opc.equalsIgnoreCase("Dólar a Peso MX")) {
					numeroConvertido = numeroConvertir * 17.56;
					double numeroConvertidos = (double) Math.round(numeroConvertido *100d)/100;
					resultado.setText(String.valueOf(numeroConvertidos));
				}
				
				if(opc.equalsIgnoreCase("Euros a Peso MX")) {
					numeroConvertido = numeroConvertir * 19.3;
					double numeroConvertidos = (double) Math.round(numeroConvertido *100d)/100;
					resultado.setText(String.valueOf(numeroConvertidos));
				}
				
				if(opc.equalsIgnoreCase("Libras Esterlinas a Peso MX")) {
					numeroConvertido = numeroConvertir * 22;
					double numeroConvertidos = (double) Math.round(numeroConvertido *100d)/100;
					resultado.setText(String.valueOf(numeroConvertidos));
				}
				
				if(opc.equalsIgnoreCase("Yen Japonés a Peso MX")) {
					numeroConvertido = numeroConvertir * 0.12;
					double numeroConvertidos = (double) Math.round(numeroConvertido *100d)/100;
					resultado.setText(String.valueOf(numeroConvertidos));
				}
				
				if(opc.equalsIgnoreCase("Won sul-coreano a Peso MX")) {
					numeroConvertido = numeroConvertir * 0.013;
					double numeroConvertidos = (double) Math.round(numeroConvertido *100d)/100;
					resultado.setText(String.valueOf(numeroConvertidos));
				}
			}
		});
		btnNewButton_1.setBounds(21, 183, 89, 23);
		contentPane.add(btnNewButton_1);
		
		dato = new JTextField();
		dato.setBounds(283, 55, 117, 32);
		contentPane.add(dato);
		dato.setColumns(10);
		
		JButton btnNewButton_2 = new JButton("Borrar");
		btnNewButton_2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton_2.setBorder(UIManager.getBorder("EditorPane.border"));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dato.setText("");
				resultado.setText("");
			}
		});
		btnNewButton_2.setBounds(21, 149, 89, 23);
		contentPane.add(btnNewButton_2);
		
		resultado = new JTextField();
		resultado.setBackground(new Color(255, 255, 255));
		resultado.setDisabledTextColor(new Color(0, 0, 0));
		resultado.setSelectionColor(new Color(0, 0, 0));
		resultado.setEnabled(false);
		resultado.setBounds(283, 128, 111, 23);
		contentPane.add(resultado);
		resultado.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Cantidad convertida");
		lblNewLabel_1.setBounds(283, 98, 138, 19);
		contentPane.add(lblNewLabel_1);
	}
}
