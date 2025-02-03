package login;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.UIManager;
import java.awt.Color;
import javax.swing.JPasswordField;
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import javax.swing.Action;
import java.awt.Cursor;
import java.awt.event.ActionListener;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Toolkit;

public class Tela_Login {

	public JFrame frame;
	private JTextField textField_Email;
	private JButton btnResetar;
	private JPasswordField passwordField;
	private final Action action = new SwingAction();
	private JButton btnAjuda;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tela_Login window = new Tela_Login();
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
	public Tela_Login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage(Tela_Login.class.getResource("/resourses/Logo_Icon.png")));
		frame.setResizable(false);
		frame.setBounds(100, 100, 622, 385);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setLocationRelativeTo(null); //centraliza a janela 
		
		
		textField_Email = new JTextField();
		textField_Email.setFont(new Font("Tw Cen MT", Font.PLAIN, 13));
		textField_Email.setBounds(188, 119, 203, 20);
		frame.getContentPane().add(textField_Email);
		textField_Email.setColumns(10);
		
		JButton btnEntrar = new JButton();
		btnEntrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnEntrar.setBackground(UIManager.getColor("Button.background"));
		btnEntrar.setBounds(188, 218, 65, 23);
		frame.getContentPane().add(btnEntrar);
		btnEntrar.setContentAreaFilled(false); // Remove o fundo
		btnEntrar.setBorderPainted(false); // Remove a borda
		btnEntrar.setFocusPainted(false); // Remove o efeito de foco
		btnEntrar.setOpaque(false); // Garante a transparência
		btnEntrar.setCursor(new Cursor(Cursor.HAND_CURSOR)); // Muda o cursor para mãozinha
		
		btnResetar = new JButton();
		btnResetar.setBounds(352, 218, 71, 23);
		frame.getContentPane().add(btnResetar);
		btnResetar.setContentAreaFilled(false); // Remove o fundo
		btnResetar.setBorderPainted(false); // Remove a borda
		btnResetar.setFocusPainted(false); // Remove o efeito de foco
		btnResetar.setOpaque(false); // Garante a transparência
		btnResetar.setCursor(new Cursor(Cursor.HAND_CURSOR)); // Muda o cursor para mãozinha
		
		 // Adicionando o ActionListener ao botão Resetar
	    btnResetar.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent e) {
	            // Apaga o conteúdo dos campos de email e senha
	            textField_Email.setText("");  // Limpa o campo de e-mail
	            passwordField.setText("");  // Limpa o campo de senha
	        }
	    });
		
		passwordField = new JPasswordField();
		passwordField.setBounds(188, 176, 203, 20);
		frame.getContentPane().add(passwordField);
		
		btnAjuda = new JButton();
		btnAjuda.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				Tela_Ajuda telaAjuda = new Tela_Ajuda();
	            telaAjuda.frame.setVisible(true); // Torna a tela de ajuda visível
			}
		});
		btnAjuda.setAction(action);
		btnAjuda.setBounds(502, 11, 94, 12);
		frame.getContentPane().add(btnAjuda);
		btnAjuda.setContentAreaFilled(false); // Remove o fundo
		btnAjuda.setBorderPainted(false); // Remove a borda
		btnAjuda.setFocusPainted(false); // Remove o efeito de foco
		btnAjuda.setOpaque(false); // Garante a transparência
		btnAjuda.setCursor(new Cursor(Cursor.HAND_CURSOR)); // Muda o cursor para mãozinha
		
		/**public void actionPerformed(ActionEvent e) {
             // Cria uma nova instância da TelaAjuda
           Tela_Ajuda telaAjuda = new TelaAjuda();
           Tela_Ajuda.frame.setVisible(true); // Torna a tela de ajuda visível
         }}
         **/
		
		JLabel lbFundo = new JLabel();
		lbFundo.setBackground(new Color(255, 255, 255));
		lbFundo.setIcon(new ImageIcon(Tela_Login.class.getResource("/resourses/Tela_Login.png")));
		lbFundo.setBounds(0, 0, 616, 346);
		frame.getContentPane().add(lbFundo);
	}
	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, null);
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
		}
	}
}
