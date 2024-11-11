package com.kinaiya.component2;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionAdapter;
import java.awt.geom.Ellipse2D;

import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.JLabel;
import com.kinaiya.components.SignUpPanel;
import com.kinaiya.swing.buttonHeader;

public class HeaderPanel extends JPanel{
	
	MouseListener listener;
	HomePanel homePanel;
	ShopPanel womenPanel;
	AboutPanel aboutPanel;
	ContactPanel contactPanel;
	userProfile userProfile;
	
	SignUpPanel signupPanel = new SignUpPanel();
	public JLabel user = new JLabel();
	
	String name;

	Color _755946_ = new Color(117, 89, 70);
	Color mainColor = new Color(117, 89, 70);
	Color effectColor = new Color(117, 89, 70, 180);
	Color e4dfd5 = new Color(228, 223, 213);
	Color cf9f82 = new Color(207, 159, 130);
	Color bdb8ad = new Color(189, 184, 173);
	Color transparent = new Color(0, 0, 0, 0);
	Color e1c292 = new Color(225, 194, 146);
	Font font = new Font("Arial", Font.PLAIN, 20);
	
	ImageIcon icon1 = new ImageIcon("C:\\Users\\David\\eclipse-workspace\\kkkk\\ELearning\\img\\userIcon.png");
	
	public buttonHeader homeButton = new buttonHeader("HOME", font, 215, 85, 80, 50);
	public buttonHeader shopButton = new buttonHeader("SHOP", font, 305, 85, 100, 50);
	public buttonHeader aboutButton = new buttonHeader("ABOUT", font, 770, 85, 120, 50);
	public buttonHeader contactButton = new buttonHeader("CONTACT", font, 890, 85, 120, 50);
	
	public JLabel userIcon;
	
	boolean change1, change2, change3, change4, change5;

	public HeaderPanel() {
		
		int width = 1200;
		int height = 150;
		
		setBounds(0, 0, width, height);
		setLayout(null);
		setOpaque(false);
		
		homePanel = new HomePanel();
		womenPanel = new ShopPanel();
		aboutPanel = new AboutPanel();
		contactPanel = new ContactPanel();
		userProfile = new userProfile();
		
		add(userProfile);
		add(homeButton);
		add(shopButton);
		add(aboutButton);
		add(contactButton);
		
		user.setBounds(1000, 100, 100, 50);
		add(user);
		
		userIcon = new JLabel(icon1);
		userIcon.setBounds(width - 130, 85, 50, 50);
		add(userIcon);
		function();
	}
	public void paintComponent(Graphics g) {
		
		int width = getWidth();
		int height = getHeight();
		
		Graphics2D g2 = (Graphics2D) g;
		ImageIcon icon1 = new ImageIcon("C:\\Users\\David\\eclipse-workspace\\kkkk\\ELearning\\img\\headerLogo.png");
		Image img1 = icon1.getImage();
		Image imgScale1 = img1.getScaledInstance(300, 213, Image.SCALE_SMOOTH);
		ImageIcon scaledIcon1 = new ImageIcon(imgScale1);
		
		g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		g2.setColor(_9B9B9B);
		g2.drawLine(50, height - 10, width - 50, height - 10);
		scaledIcon1.paintIcon(this, g, -20, 0);
		
		g2.setColor(Color.BLACK);
		
		changeColor(g2);
		super.paintComponent(g);
	}
	public void changeColor(Graphics2D g2) {
		g2.setColor(change1 ? C2C0BE : transparent);
		g2.fillRect(215, 85, 80, 50);
		g2.setColor(change2 ? C2C0BE : transparent);
		g2.fillRect(305, 85, 100, 50);
		g2.setColor(change4 ? C2C0BE : transparent);
		g2.fillRect(770, 85, 120, 50);
		g2.setColor(change5 ? C2C0BE : transparent);
		g2.fillRect(890, 85, 120, 50);
		
		repaint();
	}
	public void setUser(String name) {
		this.name = name;
	}
	public void function() {
		homeButton.addMouseListener(new MouseListener() {

			@Override
			public void mouseClicked(MouseEvent e) {
				
				
			}

			@Override
			public void mousePressed(MouseEvent e) {
				
				
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				
				
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				change1 = true;
			}

			@Override
			public void mouseExited(MouseEvent e) {
				change1 = false;
			}
			
		});
		shopButton.addMouseListener(new MouseListener() {

			@Override
			public void mouseClicked(MouseEvent e) {
				
				
			}

			@Override
			public void mousePressed(MouseEvent e) {
				
				
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				
				
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				change2 = true;
			}

			@Override
			public void mouseExited(MouseEvent e) {
				change2 = false;
			}
			
		});
		aboutButton.addMouseListener(new MouseListener() {

			@Override
			public void mouseClicked(MouseEvent e) {
				
				
			}

			@Override
			public void mousePressed(MouseEvent e) {
				
				
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				
				
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				change4 = true;
			}

			@Override
			public void mouseExited(MouseEvent e) {
				change4 = false;
			}
			
		});
		contactButton.addMouseListener(new MouseListener() {

			@Override
			public void mouseClicked(MouseEvent e) {
				
				
			}

			@Override
			public void mousePressed(MouseEvent e) {
				
				
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				
				
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				change5 = true;
			}

			@Override
			public void mouseExited(MouseEvent e) {
				change5 = false;
			}
			
		});
		
	}
	//Separator Line Color
	Color _9B9B9B = new Color(155, 155, 155);
	//Effect Color in Button
	Color C2C0BE = new Color(194, 192, 190);
	
	public void addEvent(MouseListener listener) {
		this.listener = listener;
	}
}
