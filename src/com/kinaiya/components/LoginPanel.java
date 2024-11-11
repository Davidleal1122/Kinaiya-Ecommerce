package com.kinaiya.components;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;

import com.kinaiya.component2.ShopPanel;
import com.kinaiya.swing.ButtonOutLine;
import com.kinaiya.swing.Labels;
import com.kinaiya.swing.MyPasswordField;
import com.kinaiya.swing.MyTextField;
import com.kinaiya.swing.button;
import com.kinaiya.component2.exitANDminimizeButton;

public class LoginPanel extends JPanel {

	ActionListener event;
	public MyTextField textField;
	public MyPasswordField pwField;
	ShopPanel aboutPanel;
	LoginPanel loginPanel;
	Timer timer;
	Graphics2D g2;

	String name = "KenDebie";

	ButtonOutLine signupButton = new ButtonOutLine();
	public button signinButton = new button();

	public Labels wrongCred = new Labels(470, 300, 250, 20, Color.red);
	
	public boolean isLogin = false;

	public LoginPanel() {

		setBounds(0, 0, 900, 600);
		setLayout(null);
		setOpaque(false);

		

		

		signupButton.setText("SIGN UP");
		signinButton.setText("SIGN IN");
		signupButton.setBounds(110, 370, 130, 30);
		signinButton.setBounds(550, 400, 130, 30);
		signupButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				event.actionPerformed(e);
			}

		});

		// login

		textField = new MyTextField();
		pwField = new MyPasswordField();

		textField.setBounds(470, 200, 300, 40);
		pwField.setBounds(470, 250, 300, 40);

		textField.setHint("Username");
		pwField.setHint("Password");

		JLabel header = new JLabel("Welcome to Kinaiya,");
		JLabel description1 = new JLabel("<html>A clothing that ignites <br> your inner confidence!</html>");
		JLabel label = new JLabel("LOGIN ACCOUNT");

		label.setForeground(new Color(117, 89, 70));
		label.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 25));
		label.setBounds(520, 130, 250, 40);

		description1.setForeground(Color.WHITE);
		header.setForeground(Color.white);

		header.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 30));
		description1.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 25));

		// label.setBounds(520, 130, 250, 40);
		header.setBounds(40, 150, 300, 25);
		description1.setBounds(40, 70, 300, 300);
		
		exitANDminimizeButton exitANDmin = new exitANDminimizeButton(getWidth() - 70, -7, new Color(255, 51, 51), new Color(255, 175, 51), new Color(255, 51, 51, 200), new Color(255, 175, 51, 200));	

		add(exitANDmin);
		add(description1);
		add(header);
		add(label);
		add(signinButton);
		add(signupButton);
		add(pwField);
		add(textField);
		add(wrongCred);
	}

	protected void paintComponent(Graphics g) {
		int first_size = 150;

		Graphics2D g2 = (Graphics2D) g;
		GradientPaint gra = new GradientPaint(-50, 0, C4AB9C, 300, 0, _6A4D4C);

		g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		g2.setPaint(gra);
		g2.fillRect(0, 0, 350, getHeight());
		g2.setColor(mainColor);
		g2.fillOval(275, (getHeight() / 2) - (first_size / 2), first_size, first_size);
		ImageIcon icon = new ImageIcon("C:\\Users\\David\\eclipse-workspace\\kkkk\\ELearning\\img\\Logo.png");
		icon.paintIcon(this, g, 276, 232);
		super.paintComponent(g);

	}

	public void addEvent(ActionListener event) {
		this.event = event;
	}

	Color C4AB9C = new Color(196, 171, 156);
	Color _6A4D4C = new Color(106, 77, 76);

	// color palette
	Color mainColor = new Color(117, 89, 70);
	Color effectColor = new Color(117, 89, 70, 180);

	Color currentFontColor = new Color(12, 124, 114);
	Color _7D5546 = new Color(125, 85, 70);
}
