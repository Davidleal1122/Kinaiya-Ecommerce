package com.kinaiya.component2;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.geom.Ellipse2D;
import javax.swing.JPanel;

public class AboutPanel extends JPanel {

	aboutContentPanel aboutContentPanel;
	aboutContentPanel2 aboutContentPanel2;
	
	Color e4dfd5 = new Color(228, 223, 213);
	
	boolean change1 = true, change2;
	
	public AboutPanel() {

		int width = 1200;
		int height = 700;

		aboutContentPanel = new aboutContentPanel();
		aboutContentPanel2 = new aboutContentPanel2();
		
		setBounds(0, 0, width, height);
		setLayout(null);
		setOpaque(false);
		setVisible(false);
		
		add(aboutContentPanel);
		add(aboutContentPanel2);
		
		addMouseMotionListener(new MouseMotionAdapter() {
			public void mouseMoved(MouseEvent e) {
				int width = getWidth();
				int height = getHeight();
				
				Ellipse2D circle1 = new Ellipse2D.Double(width / 2 - 20, height - 30, 10, 10);
				Ellipse2D circle2 = new Ellipse2D.Double(width / 2, height - 30, 10, 10);
				
				if(circle1.contains(e.getPoint())) {
					setCursor(new Cursor(Cursor.HAND_CURSOR));
				}
				else if(circle2.contains(e.getPoint())) {
					setCursor(new Cursor(Cursor.HAND_CURSOR));
				}
				else {
					setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
				}
			}
		});
		addMouseListener(new MouseAdapter() {
			int width = getWidth();
			int height = getHeight();
			
			Ellipse2D circle1 = new Ellipse2D.Double(width / 2 - 20, height - 30, 10, 10);
			Ellipse2D circle2 = new Ellipse2D.Double(width / 2, height - 30, 10, 10);
			
			public void mouseClicked(MouseEvent e) {
				
				if(circle1.contains(e.getPoint())) {
					change1 = true;
					change2 = false;
					repaint();
					tabClicked(aboutContentPanel);
				}
				else if(circle2.contains(e.getPoint())) {
					change1 = false;
					change2 = true;
					repaint();
					tabClicked(aboutContentPanel2);
				}
			}
		});
	}

	public void paintComponent(Graphics g) {
		int width = getWidth();
		int height = getHeight();

		GradientPaint gra = new GradientPaint(0, 0, e4dfd5, width, 0, _887E9D);

		Graphics2D g2 = (Graphics2D) g;
		g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		g2.setPaint(gra);
		g2.fillRect(0, 0, width, height);
		g2.setColor(change1 ? Color.black : Color.gray);
		g2.fillOval(width / 2 - 20, height - 30, 10, 10);
		g2.setColor(change2 ? Color.black : Color.gray);
		g2.fillOval(width / 2, height - 30, 10, 10);
		super.paintComponent(g);
	}
	
	Color _7B8077 = new Color(123, 128, 119);
	Color _887E9D = new Color(136, 126, 157);
	
	public void tabClicked(JPanel panel) {
		aboutContentPanel.setVisible(false);
		aboutContentPanel2.setVisible(false);
		panel.setVisible(true);
	}
}
