package com.kinaiya.component2;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class MenPanel extends JPanel {

	Color mainColor = new Color(117, 89, 70);
	Color effectColor = new Color(117, 89, 70, 180);
	Color e4dfd5 = new Color(228, 223, 213);
	Color cf9f82 = new Color(207, 159, 130);
	Color bdb8ad = new Color(189, 184, 173);
	Color c4ab9c = new Color(196, 171, 156);
	Color e1c292 = new Color(225, 194, 146);
	Color transparent = new Color(0, 0, 0, 0);
	
	public MenPanel() {
		
		int width = 1200;
		int height = 700;

		setBounds(0, 0, width, height);
		setLayout(null);
		setOpaque(false);
		
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
	Color _7B8077 = new Color(123, 128, 119);
}
