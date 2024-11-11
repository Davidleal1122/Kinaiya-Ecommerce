package com.kinaiya.swing;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.FontMetrics;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Insets;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

import javax.swing.ImageIcon;
import javax.swing.JPasswordField;

import com.kinaiya.components.SignUpPanel;
import com.kinaiya.main.Main;

public class MyPasswordField extends JPasswordField {

	SignUpPanel signupPanel;
	Main main;
	
	boolean hide = true;
	Image eyeIcon = new ImageIcon(getClass().getResource("/fonts/eye.png")).getImage();
	Image eyeHideIcon = new ImageIcon(getClass().getResource("/fonts/eye_hide.png")).getImage();
	
	public String getHint() {
		return hint;
	}

	public void setHint(String hint) {
		this.hint = hint;
	}

	private String hint = "";
	

	public MyPasswordField() {
		setOpaque(false);
		setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 20, 10, 50));
		setBackground(new Color(0, 0, 0, 0));
		setForeground(Color.decode("#7A8C8D"));
		setFont(new java.awt.Font("sansserif", 0, 13));
		setSelectionColor(new Color(75, 175, 152));
		setEchoChar('*');
		addMouseMotionListener(new MouseMotionAdapter() {
			public void mouseMoved(MouseEvent e) {
				int x = getWidth() - 30;
				if(new Rectangle(x, 0 , 30, 30).contains(e.getPoint())) {
					setCursor(new Cursor(Cursor.HAND_CURSOR));
				}
				else {
					setCursor(new Cursor(Cursor.TEXT_CURSOR));
				}
			}
		});
		addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				int x = getWidth() - 30;
				if(new Rectangle(x, 0 , 30, 30).contains(e.getPoint())) {
					hide = !hide;
					if(hide) setEchoChar('*');
					else setEchoChar((char)0);
					repaint();
				}
			}
		});
	}

	@Override
	protected void paintComponent(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		g2.setColor(new Color(228, 223, 213));//
		g2.fillRect(0, 0, getWidth(), getHeight());
		g2.setColor(new Color(117, 89, 70));
		g2.fillRect(0, 0, 5, getHeight());
		createShowHide(g2);
		super.paintComponent(g);
	}

	@Override
	public void paint(Graphics g) {
		super.paint(g);
		if (getPassword().length == 0) {
			int h = getHeight();
			((Graphics2D) g).setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING,
					RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
			Insets ins = getInsets();
			FontMetrics fm = g.getFontMetrics();
			g.setColor(new Color(180, 180, 180));	
			g.drawString(hint, ins.left, h / 2 + fm.getAscent() / 2 - 2);
			
		}
	}
	public void p(Graphics g) {
		g.setColor(Color.red);
		g.drawRect(0, 0, getWidth() - 6, getHeight() - 1);
	}
	public void createShowHide(Graphics2D g2) {
		int x = getWidth() - 30;
		int y = (getHeight() - 20) / 2;
		g2.drawImage(hide ? eyeHideIcon : eyeIcon, x, y, null);
	}
}
