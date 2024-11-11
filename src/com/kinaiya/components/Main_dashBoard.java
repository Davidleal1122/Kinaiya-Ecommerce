package com.kinaiya.components;

import java.awt.Cursor;
import java.awt.Rectangle;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionAdapter;

import javax.swing.JFrame;
import javax.swing.JPanel;

import com.kinaiya.component2.userProfile;
import com.kinaiya.component2.HomePanel;
import com.kinaiya.component2.AboutPanel;
import com.kinaiya.component2.HeaderPanel;
import com.kinaiya.component2.MenPanel;
import com.kinaiya.component2.ContactPanel;
import com.kinaiya.component2.ShopPanel;
import com.kinaiya.component2.homeContentPanel;
import com.kinaiya.component2.homeContentPanel2;
import com.kinaiya.component2.homeContentPanel3;

public class Main_dashBoard extends JFrame{

	public static JFrame Main_dashBoard;
	
	JPanel contentPane;
	HomePanel homePanel;
	ShopPanel shopPanel;
	AboutPanel aboutPanel;
	MenPanel menPanel;
	ContactPanel contactPanel;
	HeaderPanel headerPanel;
	homeContentPanel homeContentPanel;
	homeContentPanel2 homeContentPanel2;
	homeContentPanel3 homeContentPanel3;
	userProfile userProfile;
	
	public Main_dashBoard() {
		
		contentPane = new JPanel();
		setContentPane(contentPane);
		setSize(1200, 700);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);
		setUndecorated(true);
		setResizable(false);
		
		homeContentPanel = new homeContentPanel();
		homeContentPanel2 = new homeContentPanel2();
		homeContentPanel3 = new homeContentPanel3();
		headerPanel = new HeaderPanel();
		homePanel = new HomePanel();
		aboutPanel = new AboutPanel();
		contactPanel = new ContactPanel();
		shopPanel = new ShopPanel();
		menPanel = new MenPanel();
		userProfile = new userProfile();
		
		contentPane.add(headerPanel);
		contentPane.add(homePanel);
		contentPane.add(aboutPanel);
		contentPane.add(contactPanel);
		contentPane.add(shopPanel);
		contentPane.add(menPanel);
		contentPane.add(userProfile);
		
		headerPanel.homeButton.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				tabClicked(homePanel);
			}
		});
		headerPanel.shopButton.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				tabClicked(shopPanel);
			}
		});
		headerPanel.aboutButton.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				tabClicked(aboutPanel);
			}
		});
		headerPanel.contactButton.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				tabClicked(contactPanel);
			}
		});
		homeContentPanel2.shopNow.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				tabClicked(shopPanel);
			}
		});
		homeContentPanel.shopNow.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				tabClicked(shopPanel);
			}
		});
		homeContentPanel3.shopNow.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				tabClicked(shopPanel);
			}
		});
		headerPanel.userIcon.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				tabClicked(userProfile);
			}
		});
		
	}
	public void tabClicked(JPanel panel) {
		homePanel.setVisible(false);
		shopPanel.setVisible(false);
		menPanel.setVisible(false);
		aboutPanel.setVisible(false);
		contactPanel.setVisible(false);
		userProfile.setVisible(false);
		panel.setVisible(true);
	}
	
}
