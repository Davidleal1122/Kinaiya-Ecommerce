package com.kinaiya.component2;

import javax.swing.BorderFactory;

import javax.swing.ImageIcon;

import javax.swing.JPanel;
import javax.swing.JScrollPane;

import ModernScrollBar.ScrollBarCustom;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.Rectangle;

public class ShopPanel extends JPanel {

	Color mainColor = new Color(117, 89, 70);
	Color effectColor = new Color(117, 89, 70, 180);
	Color e4dfd5 = new Color(228, 223, 213);
	Color cf9f82 = new Color(207, 159, 130);
	Color bdb8ad = new Color(189, 184, 173);
	Color c4ab9c = new Color(196, 171, 156);
	Color e1c292 = new Color(225, 194, 146);
	Color transparent = new Color(0, 0, 0, 0);

	boolean change1 = true, change2, change3;
	boolean _change1, _change2, _change3;

	Font font = new Font("Arial", Font.BOLD, 25);
	
	JScrollPane scrollPane, scrollPane1, scrollPane2;

	@SuppressWarnings("serial")
	public ShopPanel() {

		int width = 1200;
		int height = 700;

		
		
		mensProduct = new mensProduct(300, 170, width / 2 + 250, height - 200) {
			public void paintComponent(Graphics g) {
				Graphics2D g2 = (Graphics2D)g;
				
				int width = getWidth();
				int height = getHeight();
				
				g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
				g2.setColor(Color.white);
				g2.fillRect(0, 0, width, height);
			}
		};
		
		scrollPane = new JScrollPane(mensProduct); 
	    scrollPane.setBounds(300, 170, width / 2 + 250, height - 200); 
	    scrollPane.setOpaque(false); 
	    scrollPane.setBackground(new Color(0,0,0,0)); 
	    scrollPane.setVerticalScrollBar(new ScrollBarCustom()); // Apply custom scrollbar UI 
	    scrollPane.setBorder(BorderFactory.createEmptyBorder());
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        scrollPane.setPreferredSize(new Dimension(20, 2100));
        
        scrollPane.setFocusable(false); 
	    add(scrollPane); 
	    mensProduct.setPreferredSize(new Dimension(width / 2 + 250, 1000));
	    mensProduct.setLayout(null);
	    scrollPane.setViewportView(mensProduct);
        
        womensProduct = new womensProduct(300, 170, width / 2 + 250, height - 200) {
			public void paintComponent(Graphics g) {
				Graphics2D g2 = (Graphics2D)g;
				
				int width = getWidth();
				int height = getHeight();
				
				g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
				g2.setColor(Color.white);
				g2.fillRect(0, 0, width, height);
			}
		};
		
		scrollPane1 = new JScrollPane(womensProduct); 
	    scrollPane1.setBounds(300, 170, width / 2 + 250, height - 200); 
	    scrollPane1.setOpaque(false); 
	    scrollPane1.setBackground(new Color(0,0,0,0)); 
	    scrollPane1.setVerticalScrollBar(new ScrollBarCustom()); // Apply custom scrollbar UI 
	    scrollPane1.setBorder(BorderFactory.createEmptyBorder());
        scrollPane1.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        scrollPane1.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        scrollPane1.setPreferredSize(new Dimension(20, 2100));
        
	     
        scrollPane1.setFocusable(false); 
	    add(scrollPane1); 
	    womensProduct.setPreferredSize(new Dimension(width / 2 + 250, 1000));
	    womensProduct.setLayout(null);
	    scrollPane1.setViewportView(womensProduct);
	    
	    accProduct = new accessoriesProduct(300, 170, width / 2 + 250, height - 200) {
			public void paintComponent(Graphics g) {
				Graphics2D g2 = (Graphics2D)g;
				
				int width = getWidth();
				int height = getHeight();
				
				g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
				g2.setColor(Color.white);
				g2.fillRect(0, 0, width, height);
			}
		};
		
		scrollPane2 = new JScrollPane(accProduct); 
		scrollPane2.setBounds(300, 170, width / 2 + 250, height - 200); 
		scrollPane2.setOpaque(false); 
		scrollPane2.setBackground(new Color(0,0,0,0)); 
		scrollPane2.setVerticalScrollBar(new ScrollBarCustom()); // Apply custom scrollbar UI 
		scrollPane2.setBorder(BorderFactory.createEmptyBorder());
		scrollPane2.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane2.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane2.setPreferredSize(new Dimension(20, 2100));
        
		scrollPane2.setFocusable(false); 
	    add(scrollPane2); 
	    accProduct.setPreferredSize(new Dimension(width / 2 + 250, 700));
	    accProduct.setLayout(null);
	    scrollPane2.setViewportView(accProduct);
	    
	    
		
		setBounds(0, 0, width, height);
		setLayout(null);
		setOpaque(false);
		addMouseMotionListener(new MouseMotionAdapter() {
			public void mouseMoved(MouseEvent e) {

				int x = 90;
				int sizeWidth = 200;
				int sizeHeight = 40;

				Rectangle rect1 = new Rectangle(x, height - 380, sizeWidth / 3, sizeHeight);
				Rectangle rect2 = new Rectangle(x, height - 330, sizeWidth / 2, sizeHeight);
				Rectangle rect3 = new Rectangle(x, height - 280, sizeWidth, sizeHeight);

				if (rect1.contains(e.getPoint())) {
					setCursor(new Cursor(Cursor.HAND_CURSOR));
					_change1 = true;
					_change2 = false;
					_change3 = false;
				} else if (rect2.contains(e.getPoint())) {
					setCursor(new Cursor(Cursor.HAND_CURSOR));
					_change1 = false;
					_change2 = true;
					_change3 = false;
				} else if (rect3.contains(e.getPoint())) {
					setCursor(new Cursor(Cursor.HAND_CURSOR));
					_change1 = false;
					_change2 = false;
					_change3 = true;
				} else {
					setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
					_change1 = false;
					_change2 = false;
					_change3 = false;
				}
				repaint();
			}
		});
		addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {

				int x = 90;
				int sizeWidth = 200;
				int sizeHeight = 40;

				Rectangle rect1 = new Rectangle(x, height - 380, sizeWidth / 3, sizeHeight);
				Rectangle rect2 = new Rectangle(x, height - 330, sizeWidth / 2, sizeHeight);
				Rectangle rect3 = new Rectangle(x, height - 280, sizeWidth, sizeHeight);

				if (rect1.contains(e.getPoint())) {
					change1 = true;
					change2 = false;
					change3 = false;
					tabClicked(mensProduct, scrollPane);

				} else if (rect2.contains(e.getPoint())) {
					change1 = false;
					change2 = true;
					change3 = false;
					tabClicked(womensProduct, scrollPane1);

				} else if (rect3.contains(e.getPoint())) {
					change1 = false;
					change2 = false;
					change3 = true;
					tabClicked(accProduct, scrollPane2);
				}
				repaint();
			}
		});
		
	}

	public void paintComponent(Graphics g) {

		int width = getWidth();
		int height = getHeight();

		GradientPaint gra = new GradientPaint(0, 0, e4dfd5, 0, height, _7B8077);

		Graphics2D g2 = (Graphics2D) g;
		g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		g2.setPaint(gra);
		g2.fillRect(0, 0, width, height);
		changeColor(g);

		super.paintComponent(g);
	}

	public void changeColor(Graphics g) {
		ImageIcon categories = new ImageIcon("C:\\Users\\David\\eclipse-workspace\\kkkk\\ELearning\\img\\categories.png");

		int height = getHeight();

		int iconsWidth = -categories.getIconWidth() / 3 - 15;
		int iconsHeight = -categories.getIconHeight() / 2 + 30;

		Graphics2D g2 = (Graphics2D) g;
		// mouse hover
		g2.setColor(_change1 ? C2C0BE : new Color(0, 0, 0, 0));
		g2.fillRect(80, height - 380, 250, 40);
		g2.setColor(_change2 ? C2C0BE : new Color(0, 0, 0, 0));
		g2.fillRect(80, height - 330, 250, 40);
		g2.setColor(_change3 ? C2C0BE : new Color(0, 0, 0, 0));
		g2.fillRect(80, height - 280, 250, 40);
		// mouse clicked
		g2.setColor(change1 ? Color.white : new Color(0, 0, 0, 0));
		g2.fillRect(80, height - 380, 250, 40);
		g2.setColor(change2 ? Color.white : new Color(0, 0, 0, 0));
		g2.fillRect(80, height - 330, 250, 40);
		g2.setColor(change3 ? Color.white : new Color(0, 0, 0, 0));
		g2.fillRect(80, height - 280, 250, 40);

		g2.setFont(font);
		g2.setColor(Color.black);
		g2.drawString("MEN", 90, height - 350);
		g2.drawString("WOMEN", 90, height - 300);
		g2.drawString("ACCESSORIES", 90, height - 250);
		categories.paintIcon(this, g, iconsWidth + 90, iconsHeight + (height / 3));
		super.paintComponent(g);
	}

	Color _7B8077 = new Color(123, 128, 119);
	Color C2C0BE = new Color(194, 192, 190);
	
	mensProduct mensProduct;
	womensProduct womensProduct;
	accessoriesProduct accProduct;
	
	public void tabClicked(JPanel panel, JScrollPane scroll) {
		mensProduct.setVisible(false);
		womensProduct.setVisible(false);
		scrollPane.setVisible(false);
		scrollPane1.setVisible(false);
		panel.setVisible(true);
		scroll.setVisible(true);
	}
}