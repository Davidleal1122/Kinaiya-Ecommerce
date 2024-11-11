package com.kinaiya.component2;

import com.kinaiya.swing.MyTextFieldsign_up;

import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Insets;
import java.awt.RenderingHints;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;

public class ContactPanel extends JPanel {

	Color mainColor = new Color(117, 89, 70);
	Color effectColor = new Color(117, 89, 70, 180);
	Color e4dfd5 = new Color(228, 223, 213);
	Color cf9f82 = new Color(207, 159, 130);
	Color bdb8ad = new Color(189, 184, 173);
	Color c4ab9c = new Color(196, 171, 156);
	Color e1c292 = new Color(225, 194, 146);
	Color transparent = new Color(0, 0, 0, 0);
	
	public ContactPanel() {

		int width = 1200;
		int height = 700;

		setBounds(0, 0, width, height);
		setLayout(null);
		setOpaque(false);
		
		JLabel label = new JLabel("<html><center>How can we assist you?<br>\r\n"
				+ "You can reach us  through our online chat feature <br> "
				+ "or you can email us at <u>support@kinaiya.com.</u></center></html>");
		label.setBounds(width / 10, height / 2, 400, 100);
		label.setFont(new Font("Arial", Font.PLAIN, 17));
		add(label);
		
		MyTextFieldsign_up name = new MyTextFieldsign_up();
		MyTextFieldsign_up email = new MyTextFieldsign_up();
		JTextArea text = new JTextArea() {
			public void paintComponent(Graphics g) {
				super.paintComponent(g);
		        if (this.getText().length() == 0) {
		            int h = getHeight();
		            ((Graphics2D) g).setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
		            Insets ins = getInsets();
		            FontMetrics fm = g.getFontMetrics();
		            g.setColor(new Color(180, 180, 180));
		            g.drawString("Enter your feedback/concern here....", ins.left, 23 + fm.getAscent() / 2 - 2);
		        }
			}
		};
		text.setLineWrap(true);
		text.setWrapStyleWord(true);
		text.setBounds(width / 2 + 100, (height / 2 - 25 ) + 130, 300, 150);
		text.setBorder(new EmptyBorder(15, 15, 15, 15));
		add(text);
		
		name.setBounds(width / 2 + 100, (height / 2 - 25 ), 300, 40);
		email.setBounds(width / 2 + 100, (height / 2 - 25 ) + 60, 300, 40);
		email.setHint("Email Address");
		name.setHint("Name");
		add(email);
		add(name);
		
		

	}
	public void paintComponent(Graphics g) {
		int width = getWidth();
		int height = getHeight();

		GradientPaint gra = new GradientPaint(0, 0, e4dfd5, 0, height, _7B8077);

		Graphics2D g2 = (Graphics2D) g;
		g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		g2.setPaint(gra);
		g2.fillRect(0, 0, width, height);
		g2.setColor(e4dfd5);
		g2.fillRect(50, 150, width - 100, 120);
		g2.fillRect(width / 2, 290, width / 2 - 50, height - 340);
		g2.setColor(_545454);
		g2.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 60));
		g2.drawString("Contact Us", width / 2 - 150, 200);
		g2.setFont(new Font("Arial", Font.BOLD, 20));
		g2.drawString("Get in touch for all your fashion needs!", width / 2 - 200, 240);
		g2.setColor(Color.black);
		g2.drawString("You tell us, we listen!", width / 6, height / 2);

		super.paintComponent(g);
	}
	Color _7B8077 = new Color(123, 128, 119);
	Color _545454 = new Color(84, 84, 84);
}
