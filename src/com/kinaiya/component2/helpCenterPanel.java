package com.kinaiya.component2;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.kinaiya.swing.Labels;

public class helpCenterPanel extends JPanel{
	
	ImageIcon backIcon1 = new ImageIcon("C:\\Users\\David\\eclipse-workspace\\kkkk\\ELearning\\src\\fonts\\backIcon1.png");
	ImageIcon backIcon2 = new ImageIcon("C:\\Users\\David\\eclipse-workspace\\kkkk\\ELearning\\src\\fonts\\backIcon2.png");
	public JLabel backIconLbl1 = new JLabel();
	Font fontBerlin25 = new Font("Berlin Sans FB Demi", Font.PLAIN, 25);
	Color mainColor = new Color(12, 124, 114);
	Font fontArial15 = new Font("Arial", Font.PLAIN, 15);
	Font fontArial17 = new Font("Arial", Font.PLAIN, 17);
	Color descColor = Color.black;
	
	public helpCenterPanel() {
		
		setBounds(0,0,900, 600);
		setLayout(null);
		setVisible(false);
		setOpaque(false);
		
		JLabel backIconLbl2 = new JLabel();
		backIconLbl1.setIcon(backIcon1);
		backIconLbl1.setBounds(getWidth() -35, 5, 30, 25);
		backIconLbl1.addMouseListener(new MouseAdapter() {
			
			public void mouseReleased(MouseEvent e) {
				backIconLbl1.setVisible(true);
				backIconLbl2.setVisible(false);
			}
			public void mousePressed(MouseEvent e) {
				backIconLbl1.setVisible(false);
				backIconLbl2.setVisible(true);
			}
		});
		add(backIconLbl1);
		backIconLbl2.setIcon(backIcon2);
		backIconLbl2.setBounds(getWidth() -35, 5, 30, 25);
		add(backIconLbl2);
		
		Labels label1 = new Labels("Welcome to SkillHub!", mainColor, fontBerlin25, 150, 45, 300, 60);
		Labels label2 = new Labels("the ultimate destination for learning and upskilling!", mainColor, fontArial15, 150, 85, 350, 20);
		Labels label3 = new Labels("<html>Welcome to Skillhub's e-learning help center!<br><br>"
								  + "At Skillhub, we offer a wide range of courses across various industries and fields "
								  + "to help you achieve your learning goals. Whether you're looking to upskill or "
								  + "reskill, we've got you covered.<br>"
								  + "To enroll in a course, simply browse our course catalog and select the course"
								  + "that best suits your needs. <br><br>"
								  + "Once you've found the right course, click on the \"Enroll Now\" button and follow the instructions "
								  + "for payment. Our courses have varying prices depending on the content and level of expertise required,"
								  + " so please refer to the course description for pricing information.<br><br>"
								  + "Some courses may have prerequisites or recommended background knowledge, so be sure to"
								  + " check the course description for more information before enrolling.<br><br>"
								  + "We understand that sometimes, a course might not meet your expectations. While refunds"
								  + " are generally not provided for completed courses, we do offer a satisfaction guarantee for some of"
								  + " our courses. Please refer to the course description for specific details.<br><br>"
								  + "If you need any assistance or have questions that aren't answered in the course description, our"
								  + " support team is available to help you during business hours.</html> ", 
								  descColor, fontArial15, 40, 105, 530, 500);
		Labels label4 = new Labels("<html>You can reach us through our online chat features.<html>",
									Color.white, fontArial15, getWidth() - 285, 230, 250, 30);
		add(label4);
		add(label1);
		add(label2);
		add(label3);
		
		
		
	}
	public void paintComponent(Graphics g){
		int iconSize = 90;	
		
		Graphics2D g2 = (Graphics2D)g;
		g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		g2.setColor(new Color(12, 124, 114));
		g2.fillOval(40, 40, iconSize, iconSize);
		g2.fillRoundRect(getWidth() - 320, 200, 300, 350, 100, 400);
		ImageIcon icon = new ImageIcon("C:\\Users\\cabre\\eclipse-workspace\\ELearning\\img\\iconHelpCenter.png");
		icon.paintIcon(this, g, -56, 3);
		super.paintComponent(g);
		
	}
}
