package com.kinaiya.swing;

import java.awt.AlphaComposite;

import org.jdesktop.animation.timing.Animator;
import org.jdesktop.animation.timing.TimingTarget;
import org.jdesktop.animation.timing.TimingTargetAdapter;

import com.kinaiya.component2.AboutPanel;
import com.kinaiya.component2.ContactPanel;
import com.kinaiya.component2.HeaderPanel;
import com.kinaiya.component2.HomePanel;
import com.kinaiya.component2.MenPanel;
import com.kinaiya.component2.ShopPanel;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.RenderingHints;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.Timer;
import javax.swing.border.EmptyBorder;

public class lightBrownButton extends JButton {

	
	private Animator animator;
    private int targetSize;
    private float animatSize;
    private Point pressedPoint;
    private float alpha;
    private Color effectColor = new Color(255, 255, 255);
    
    Timer timer;
    
    
    public Color getEffectColor() {
        return effectColor;
    }

    public void setEffectColor(Color effectColor) {
        this.effectColor = effectColor;
    }
    
    Color buttonColor;
    String nameButton;
    Font font;
    Color fontColor;
    
    public lightBrownButton(Color buttonColor, String nameButton, Font font, Color fontColor){
    	this.buttonColor = buttonColor;
    	this.nameButton = nameButton;
    	this.fontColor = fontColor;
    	
    	setFont(font);
    	setText(nameButton);
    	setOpaque(false);
    	setForeground(fontColor);
    	setFocusable(false);
    	setContentAreaFilled(false);
        setBorder(new EmptyBorder(5, 0, 5, 0));
        setCursor(new Cursor(Cursor.HAND_CURSOR));
        
        
        addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent me) {
                targetSize = Math.max(getWidth(), getHeight()) * 2;
                animatSize = 0;
                pressedPoint = me.getPoint();
                alpha = 0.5f;
                if (animator.isRunning()) {
                	animator.stop();
                }
                animator.start();
            }
        });
        TimingTarget target = new TimingTargetAdapter() {
            @Override
            public void timingEvent(float fraction) {
                if (fraction > 0.5f) {
                    alpha = 1 - fraction;
                    
                }
                animatSize = fraction * targetSize;
                repaint();
            }
        };
        animator = new Animator(700, target);
        animator.setAcceleration(0.5f);
        animator.setDeceleration(0.5f);
        animator.setResolution(0);
        
        
    }
    
	
	protected void paintComponent(Graphics grphcs) {
        int width = getWidth();
        int height = getHeight();
        BufferedImage img = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2 = img.createGraphics();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setColor(buttonColor);
        g2.fillRoundRect(0, 0, width, height, height - 30, height - 30);
        if (pressedPoint != null) {
            g2.setColor(effectColor);
            g2.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_ATOP, alpha));
            g2.fillOval((int) (pressedPoint.x - animatSize / 2), (int) (pressedPoint.y - animatSize / 2), (int) animatSize, (int) animatSize);
        }
        g2.dispose();
        grphcs.drawImage(img, 0, 0, null);
        super.paintComponent(grphcs);
    }
}

