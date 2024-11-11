package com.kinaiya.swing;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.border.EmptyBorder;

public class buttonHeader extends JButton {

	int x, y, width, height;
	String name;
	Font font;
	
	MouseListener listener;
	
	boolean change;

	Color mainColor = new Color(117, 89, 70);
	Color effectColor = new Color(117, 89, 70, 180);
	Color cf9f82 = new Color(207, 159, 130);
	Color bdb8ad = new Color(189, 184, 173);
	Color e1c292 = new Color(225, 194, 146);
	Color transparent = new Color(0, 0, 0, 0);
	Color e4dfd5 = new Color(228, 223, 213);
	Color c4ab9c = new Color(196, 171, 156);

	public buttonHeader(String name, Font font, int x, int y, int width, int height) {

		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		this.name = name;
		this.font = font;

		setOpaque(false);
		setForeground(Color.black);
		setFocusable(false);
		setContentAreaFilled(false);
		setBorder(new EmptyBorder(5, 0, 5, 0));
		setCursor(new Cursor(Cursor.HAND_CURSOR));
		setFont(font);
		setText(name);
		setBounds(x, y, width, height);

	}
	
}
