package com.kinaiya.component2;

import javax.swing.JPanel;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

import com.kinaiya.components.SignUpPanel;
import com.kinaiya.main.Main;
import javax.swing.JTextArea;

import ModernScrollBar.ScrollBarCustom;

import javax.swing.JScrollPane;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class TermsAndCondition extends JPanel{

	TermsAndCondition terms;
	
	int width = 900;
	int height = 600;
	boolean back = true;
	
	public TermsAndCondition() {
		
		setBounds(0, 0, width, height);
		setLayout(null);
		setOpaque(false);
		setVisible(false);
		
		 JLabel title = new JLabel("<html>Welcome to Kinaiya's Privacy Policy!</html>"); 
		    title.setForeground(Color.WHITE); 
		    title.setFont(new Font("Arial", Font.BOLD, 25)); 
		    title.setBounds(50, 30, 500, 50); 
		    add(title); 
		    
		 
		    String longText = "Privacy Policy for Kinaiya Ecommerce:\r\n" 
		      + "• At Kinaiya, we value your privacy and are committed to protecting any personal information that you provide us. This Privacy Policy outlines how we collect, use, and disclose your personal data when you interact with our ecommerce platform.\r\n" 
		      + "\r\n" 
		      + "• Collection of Information: We may collect personal information such as your name, email address, shipping address, and payment details when you make a purchase on our website. We also collect non-personal information such as your IP address and browsing behavior using cookies and similar technologies.\r\n" 
		      + "\r\n" 
		      + "• Use of Information: We use your personal information to process your orders, communicate with you about your purchases, and improve our services. We may also use your information to send you marketing communications about our products and promotions, but only if you have provided your consent.\r\n" 
		      + "\r\n" 
		      + "• Disclosure of Information: We may share your personal information with third-party service providers who assist us in fulfilling your orders, processing payments, or analyzing website traffic. We will never sell your personal information to any third parties for marketing purposes without your consent.\r\n" 
		      + "\r\n" 
		      + "• Security: We take appropriate measures to protect your personal information from unauthorized access, alteration, disclosure, or destruction. However, please note that no online data transmission can be guaranteed to be 100% secure.\r\n" 
		      + "\r\n" 
		      + "• Retention of Information: We will retain your personal information for as long as necessary to fulfill the purposes outlined in this Privacy Policy, unless a longer retention period is required by law.\r\n" 
		      + "\r\n" 
		      + "• Your Rights: You have the right to access, update, or delete your personal information at any time. You may also withdraw your consent to receive marketing communications from us. To exercise these rights or to submit a privacy-related inquiry, please contact us at [insert contact information].\r\n" 
		      + "\r\n" 
		      + "• Changes to this Policy: We may update this Privacy Policy from time to time to reflect changes in our practices or applicable laws. The updated policy will be posted on our website, and we encourage you to review it periodically.\r\n" 
		      + "\r\n" 
		      + "By using our website, you consent to the terms of this Privacy Policy. If you do not agree with these terms, please do not use our ecommerce platform.\r\n";       
		 
		    JTextArea textArea = new JTextArea(longText); 
		    textArea.setLineWrap(true); 
		    textArea.setWrapStyleWord(true); 
		    textArea.setEditable(false); 
		    textArea.setOpaque(false); 
		    textArea.setBackground(new Color(0,0,0,0)); 
		    textArea.setFont(new Font("Arial", Font.PLAIN, 20)); 
		    textArea.setForeground(Color.black); 
		 
		    JScrollPane scrollPane = new JScrollPane(textArea); 
		    scrollPane.setBounds(50, 100, width - 100, height - 150); 
		    scrollPane.setOpaque(false); 
		    scrollPane.setBackground(new Color(0,0,0,0)); 
		    scrollPane.setVerticalScrollBar(new ScrollBarCustom()); // Apply custom scrollbar UI 
		     
		    scrollPane.setFocusable(false); 
		    add(scrollPane); 
		    textArea.setPreferredSize(new Dimension(width, 1000));
		    textArea.setLayout(null);
		    scrollPane.setViewportView(textArea);
		    
		    addMouseMotionListener(new MouseMotionAdapter() {
				public void mouseMoved(MouseEvent e) {
					
					if(new Rectangle(width - 50, 0 , 30, 30).contains(e.getPoint())) {
						back = true;
						repaint();
					}
					else {
						back = false;
						repaint();
					}
				}
			});
		
	}
	public void paintComponent(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		
		Image backIcon1 = new ImageIcon(getClass().getResource("C:\\Users\\David\\eclipse-workspace\\kkkk\\ELearning\\src\\fonts\\backIcon1.png")).getImage();
		Image backIcon2 = new ImageIcon(getClass().getResource("C:\\Users\\David\\eclipse-workspace\\kkkk\\ELearning\\src\\fonts\\backIcon2.png")).getImage();
		
		super.paintComponent(g);
		GradientPaint gra = new GradientPaint(0, 0, e4dfd5, width, 0, _887E9D);
		
		g2.setPaint(gra);
		g2.fillRect(0, 0, width, height);
		g2.drawImage(back ? backIcon1 : backIcon2, width - 50, 0, null);
	}
	Color _887E9D = new Color(136, 126, 157);
	Color e4dfd5 = new Color(228, 223, 213);
}
