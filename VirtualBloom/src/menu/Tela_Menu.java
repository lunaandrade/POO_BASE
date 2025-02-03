package menu;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.JFrame;
import java.awt.Toolkit;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Cursor;
import login.Tela_Login;

public class Tela_Menu {

	public JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tela_Menu window = new Tela_Menu();
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
	public Tela_Menu() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage(Tela_Menu.class.getResource("/resourses/Logo_Icon.png")));
		frame.setBounds(100, 100, 621, 384);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setLocationRelativeTo(null);
		
		JButton btnJogo = new JButton();
		btnJogo.setBounds(36, 97, 105, 104);
		frame.getContentPane().add(btnJogo);
		btnJogo.setContentAreaFilled(false); // Remove o fundo
		btnJogo.setBorderPainted(false); // Remove a borda
		btnJogo.setFocusPainted(false); // Remove o efeito de foco
		btnJogo.setOpaque(false); // Garante a transparência
		btnJogo.setCursor(new Cursor(Cursor.HAND_CURSOR)); // Muda o cursor para mãozinha
		
		JButton btnApp = new JButton();
		btnApp.setBounds(253, 97, 105, 104);
		frame.getContentPane().add(btnApp);
		btnApp.setContentAreaFilled(false);
		btnApp.setBorderPainted(false);
		btnApp.setFocusPainted(false);
		btnApp.setOpaque(false);
		btnApp.setCursor(new Cursor(Cursor.HAND_CURSOR)); // Muda o cursor para mãozinha
	
		JButton btnSobre = new JButton();
		btnSobre.setOpaque(false);
		btnSobre.setFocusPainted(false);
		btnSobre.setContentAreaFilled(false);
		btnSobre.setBorderPainted(false);
		btnSobre.setBounds(469, 97, 105, 104);
		frame.getContentPane().add(btnSobre);
		btnSobre.setCursor(new Cursor(Cursor.HAND_CURSOR)); // Muda o cursor para mãozinha
		
		JButton btnVoltarM = new JButton();
		btnVoltarM.setOpaque(false);
		btnVoltarM.setFocusPainted(false);
		btnVoltarM.setContentAreaFilled(false);
		btnVoltarM.setBorderPainted(false);
		btnVoltarM.setBounds(22, 11, 54, 20);
		frame.getContentPane().add(btnVoltarM);
		btnVoltarM.setCursor(new Cursor(Cursor.HAND_CURSOR)); // Muda o cursor para mãozinha
		
		btnVoltarM.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false); // Esconde a tela de menu
				Tela_Login login = new Tela_Login(); // Cria a instância da tela de login
				login.frame.setVisible(true); // Exibe a tela de login
			}
		});
		
		JLabel lbFundo = new JLabel();
		lbFundo.setBounds(0, 0, 611, 345);
		lbFundo.setIcon(new ImageIcon(Tela_Menu.class.getResource("/resourses/Tela_Menu.png")));
		lbFundo.setBackground(Color.WHITE);
		frame.getContentPane().add(lbFundo);
	}
}
