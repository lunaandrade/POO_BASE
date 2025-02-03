package jogo;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Cursor;

import javax.swing.ImageIcon;
import java.awt.Toolkit;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;

public class Tela_Jogo {

	private JFrame frame;
	private JTextField textField;
	private JButton btnNewButton;
	private String palavra = "CAVALO"; // Palavra secreta
	private String letraCorreta = "A";

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tela_Jogo window = new Tela_Jogo();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Tela_Jogo() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage(Tela_Jogo.class.getResource("/resourses/Logo_Icon.png")));
		frame.setResizable(false);
		frame.setBounds(100, 100, 621, 384);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setFont(new Font("Gill Sans MT", Font.PLAIN, 40));
		textField.setBounds(189, 252, 28, 33);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField.setOpaque(false); // Remove o fundo
		textField.setBackground(new Color(0, 0, 0, 0)); // Fundo transparente
		textField.setBorder(null); // Remove a borda

		// Altera o cursor para o cursor de texto (quando o mouse passar por cima)
		textField.setCursor(new Cursor(Cursor.TEXT_CURSOR));
	
		JLabel lbLetra = new JLabel("");
		lbLetra.setFont(new Font("Gill Sans MT", Font.PLAIN, 30));
		lbLetra.setBounds(189, 252, 28, 33);
		frame.getContentPane().add(lbLetra);
		 
		btnNewButton = new JButton("Verificar");
		btnNewButton.setBounds(365, 184, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		btnNewButton.addActionListener(e -> {
			// Pega a letra digitada no textField
			String letraDigitada = textField.getText().toUpperCase();

			// Verifica se a letra está correta
			if (letraDigitada.equals(letraCorreta)) {
				JOptionPane.showMessageDialog(frame, "Acertou a letra!");
				lbLetra.setText(letraDigitada); // Atualiza o JLabel com a letra correta
				textField.setVisible(false);
				textField.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			} else {
				JOptionPane.showMessageDialog(frame, "Errou! Tente novamente.");
			}
		});	
		
		JLabel lbFundo = new JLabel();
		lbFundo.setIcon(new ImageIcon(Tela_Jogo.class.getResource("/resourses/Tela_Jogo.png")));
		lbFundo.setBackground(Color.WHITE);
		lbFundo.setBounds(0, 0, 616, 346);
		frame.getContentPane().add(lbFundo);
		
		
	}
}
