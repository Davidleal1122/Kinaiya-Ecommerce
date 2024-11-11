package com.kinaiya.component2;

import java.awt.Color;
import java.awt.Font;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

import javax.swing.JPanel;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class aboutContentPanel extends JPanel{

	int PanelWidth = 1100;
	int PanelHeight = 500;
	
	public aboutContentPanel() {
		
		setBounds(50, 150, PanelWidth, PanelHeight);
		setLayout(null);
		setOpaque(false);
		
		// Create Header 
	    JLabel header = new JLabel("Welcome to Kinaiya!"); 
	    header.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 50)); 
	    header.setForeground(new Color(117, 89, 70)); 
	 
	    JLabel description1 = new JLabel("A clothing that ignites your inner confidence!"); 
	    description1.setForeground(new Color(117, 89, 70)); 
	    description1.setFont(new Font("sansserif", Font.PLAIN, 20)); 
	 
	    JLabel description2 = new JLabel( 
	      "<html>Welcome to Kinaiya Ecommerce, a brand that offers clothes and accessories imprinted with empowering and supportive statements. Our mission is to provide a platform for positive change in society by creating products that promote self-love, empowerment, and motivation.<br><br>" 
	      + "Our name \"Kinaiya\" is a bisaya word that speaks to the inner character of an individual, encompassing all their unique traits and characteristics. We believe that wearing our collection not only enhances your personal style but also serves as a representation of who you are as a person.<br><br>" 
	      + "At Kinaiya, we strive to be a safe space for spreading love and positivity. We aim to encourage people to speak up for themselves and others who may not have a voice and stand up for what they believe in. Whether you're looking for the perfect fit or shopping on a budget, Kinaiya is your one-stop-shop for modern yet affordable fashion.<br><br>" 
	      + "Our logo symbolizes passion and finding our inner character, with various symbols representing different meanings. The sun represents confidence, positive energy, peace, and growth. The bow tie symbolizes your true bold identity and uncompromising embrace of style. The semicolon with a fire sign represents the purpose in life and releasing our inner character and fire in our hearts. Finally, the hanger symbolizes how what we wear reflects our personality and character as individuals.<br><br>" 
	      + "Thank you for choosing Kinaiya Ecommerce, where we combine burning passion with the sense of fashion to empower individuals and create positive change in society.</html>"); 
	 
	    description2.setForeground(Color.BLACK); 
	    description2.setFont(new Font("Arial", Font.PLAIN, 15)); 
	 
	    
	 
	    // Create label with image icon 
	    
	    header.setBounds(450, 10, 500, 50); 
	    description1.setBounds(490, 50, 400, 50); 
	    description2.setBounds(350, 40, 700, 500); 
	    add(description2); 
	    add(header); 
	    add(description1); 
		
	}
	public void paintComponent(Graphics g) {
		int width = getWidth();
		int height = getHeight();

		Graphics2D g2 = (Graphics2D) g;
		g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		
		ImageIcon elevateFont = new ImageIcon(
				"C:\\Users\\David\\eclipse-workspace\\kkkk\\ELearning\\img\\aboutLogo.png");
		
		elevateFont.paintIcon(this, g2, 0, height/5);
		

		super.paintComponent(g);
	}
}
