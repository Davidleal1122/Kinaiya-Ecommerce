package com.kinaiya.component2;

import java.awt.Color;
import java.awt.Font;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.JLabel;

import com.kinaiya.components.SignUpPanel;
import com.kinaiya.swing.MyTextField;
import com.kinaiya.swing.MyPasswordField;

public class userProfile extends JPanel{
	int width = 1200;
	int height = 700;
	
	SignUpPanel signupPanel;
	
	public userProfile() {
		setBounds(0, 0, width, height);
		setLayout(null);
		setOpaque(false);
		setVisible(false);
		
		
		
		ImageIcon icon1 = new ImageIcon("C:\\Users\\David\\eclipse-workspace\\kkkk\\ELearning\\img\\userLogo.png");
		MyTextField userName = new MyTextField();
		MyTextField name = new MyTextField();
		MyTextField email = new MyTextField();
		MyPasswordField pass = new MyPasswordField();
		
		userName.setBounds(width /3 + 100, height / 3, 250, 40);
		userName.setText(SignUpPanel.getUsername);
		name.setBounds(width /3 + 100, height / 3 + 80, 250, 40);
		name.setText(SignUpPanel.getFirstName + " " + SignUpPanel.getLastName);
		email.setBounds(width /3 + 100, height / 3 + 160, 250, 40);
		email.setText(SignUpPanel.getEmail);
		pass.setBounds(width /3 + 100, height / 3 + 240, 250, 40);
		pass.setText(SignUpPanel.getPassword);
		JLabel userLogo = new JLabel(icon1);
		userLogo.setBounds(100, height / 2 - 150, 350, 350);
		
		userName.setEditable(false);
		name.setEditable(false);
		email.setEditable(false);
		pass.setEditable(false);
		
		add(pass);
		add(email);
		add(name);
		add(userName);
		add(userLogo);
		
	}
	public void paintComponent(Graphics g) {
		int width = getWidth();
		int height = getHeight();

		GradientPaint gra = new GradientPaint(0, 0, e4dfd5, 0, height, _7B8077);

		Graphics2D g2 = (Graphics2D) g;
		g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		g2.setPaint(gra);
		g2.fillRect(0, 0, width, height);

		super.paintComponent(g);
	}
	Color mainColor = new Color(117, 89, 70);
	Color effectColor = new Color(117, 89, 70, 180);
	Color e4dfd5 = new Color(228, 223, 213);
	Color cf9f82 = new Color(207, 159, 130);
	Color bdb8ad = new Color(189, 184, 173);
	Color c4ab9c = new Color(196, 171, 156);
	Color e1c292 = new Color(225, 194, 146);
	Color transparent = new Color(0, 0, 0, 0);
	Color _7B8077 = new Color(123, 128, 119);
	Color _545454 = new Color(84, 84, 84);
}
