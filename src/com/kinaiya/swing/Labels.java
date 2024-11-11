package com.kinaiya.swing;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Labels extends JLabel {
	String description;
	Color colorFont;
	Font font; // font format e.g Arial Font.BOLD 25
	int x, y, width, height;
	boolean hide;
	ImageIcon iconEye;
	ImageIcon iconEyeHide;

	String name;
	Color changeFontColor = new Color(12, 124, 114, 180);
	Color currentFontColor = new Color(12, 124, 114);
	Color _755946_ = new Color(117, 89, 70);
	Color _755946 = new Color(117, 89, 70, 230);

	public Labels(String description, Color colorFont, Font font, int x, int y, int width, int height) {

		this.description = description;
		this.colorFont = colorFont;
		this.font = font;
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;

		setBounds(x, y, width, height);
		setFont(font);
		setForeground(colorFont);
		setText(description);

	}

	// for about, helpCenter etc label
	public Labels(String name, Font font, Color colorFont) {
		this.name = name;
		this.font = font;
		this.colorFont = colorFont;
		setForeground(colorFont);
		setText(name);
		setFont(font);
		setCursor(new Cursor(Cursor.HAND_CURSOR));
		addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				setForeground(changeFontColor);
			}

			public void mouseExited(MouseEvent e) {
				setForeground(currentFontColor);
			}
		});
	}
	//for eye and eye hide Icon
	public Labels(int x, int y, int width, int height, ImageIcon iconEye) {
		this.iconEye = iconEye;
		setBounds(x, y, width, height);
		setIcon(iconEye);
		setCursor(new Cursor(Cursor.HAND_CURSOR));
	}
	//for alert message if the credential's wrong
	public Labels(int x, int y, int width, int height, Color fontColor) {
		setBounds(x, y, width, height); 
		setForeground(fontColor);
		
	}
	//for privacy policy and terms and conditions
	public Labels(int x, int y, int width, int height, String label) {
		this.description = label;
		setBounds(x, y, width, height); 
		setForeground(_755946_);
		setText(label);
		setFont(font1);
		setCursor(new Cursor(Cursor.HAND_CURSOR));
		addMouseListener(new MouseAdapter() {
		public void mouseEntered(MouseEvent e) {
			setForeground(_755946);
		}
		public void mouseExited(MouseEvent e) {
			setForeground(_755946_);
		}
			
		});
	}
	public Labels(String label, int x, int y, int width, int height) {
		this.description = label;
		setBounds(x, y, width, height); 
		setForeground(Color.black);
		setText(label);
		setFont(new Font("Arial", Font.PLAIN, 10));
	}
	Font font1 = new Font("Berlin Sans FB Demi", Font.PLAIN, 10);
}








