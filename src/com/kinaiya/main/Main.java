package com.kinaiya.main;

import java.awt.Frame;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

import javax.swing.JFrame;
import javax.swing.JPanel;

import com.kinaiya.component2.ShopPanel;
import com.kinaiya.component2.TermsAndCondition;
import com.kinaiya.component2.devProfile;
import com.kinaiya.component2.helpCenterPanel;
import com.kinaiya.components.LoginPanel;
import com.kinaiya.components.Main_dashBoard;
import com.kinaiya.components.SignUpPanel;
import com.kinaiya.component2.HeaderPanel;
import com.kinaiya.component2.PrivacyAndPolicy;

import JOptionPaneCustomize.Background;
import JOptionPaneCustomize.JOptionPaneExit;
import com.kinaiya.swing.MyPasswordField;

public class Main extends JFrame {

	JPanel contentPane;
	SignUpPanel signupPanel = new SignUpPanel();
	LoginPanel login_panel;
	ShopPanel aboutPanel;
	JOptionPaneExit exit;
	Background background;
	devProfile devProfile;
	helpCenterPanel helpCenter;
	HeaderPanel headerPanel;
	MyPasswordField pwField = new MyPasswordField();
	TermsAndCondition termsCon;
	PrivacyAndPolicy privacy;

	public Main() {

		contentPane = new JPanel();
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setSize(900, 600);
		setLocationRelativeTo(null);
		setResizable(false);
		setUndecorated(true);

		termsCon = new TermsAndCondition();
		privacy = new PrivacyAndPolicy();
		headerPanel = new HeaderPanel();
		devProfile = new devProfile();
		login_panel = new LoginPanel();
		signupPanel = new SignUpPanel();
		background = new Background();

		contentPane.add(privacy);
		contentPane.add(termsCon);
		contentPane.add(background);
		contentPane.add(login_panel);
		contentPane.add(signupPanel);

		functions();
	}

	public static void main(String[] args) {

//		new Main().setVisible(true);
		progressBar progressBar = new progressBar();
		progressBar.setVisible(true);
//		Main_dashBoard main = new Main_dashBoard();
//		main.setVisible(true);
	}

	public void functions() {
		signupPanel.buttonSignUp(signupPanel, login_panel);
		login_panel.addEvent(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				changePanels(signupPanel);
			}

		});
		signupPanel.addEvent(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				changePanels(login_panel);

			}

		});
		login_panel.signinButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String userName = SignUpPanel.getUsername;
				String passWord = SignUpPanel.getPassword;

				if (login_panel.textField.getText().equals(userName)
						&& login_panel.pwField.getText().equals(passWord)) {
					Main_dashBoard dashBoard = new Main_dashBoard();
					dashBoard.setVisible(true);
					dispose();
				} else if (login_panel.textField.getText().length() == 0
						&& login_panel.pwField.getText().length() == 0) {
					login_panel.wrongCred.setText("Please enter your credentials.");
					login_panel.wrongCred.setVisible(true);
				} else if (login_panel.textField.getText().length() != 0) {
					if (login_panel.pwField.getText().length() == 0) {
						login_panel.wrongCred.setText("Please enter your password.");
						login_panel.wrongCred.setVisible(true);
					} else {
						login_panel.wrongCred.setText("Wrong credentials, please try again.");
						login_panel.wrongCred.setVisible(true);
					}
				} else {
					login_panel.wrongCred.setText("Wrong credentials, please try again.");
					login_panel.wrongCred.setVisible(true);
				}
			}

		});
		signupPanel.terms.addMouseListener(new MouseAdapter(){

			public void mouseClicked(MouseEvent e) {
				changePanels(termsCon);
			}
			
		});
		signupPanel.privacy.addMouseListener(new MouseAdapter(){

			public void mouseClicked(MouseEvent e) {
				changePanels(privacy);
			}
			
		});
		termsCon.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				int width = 900;
				if(new Rectangle(width - 50, 0 , 30, 30).contains(e.getPoint())) {
					changePanels(signupPanel);
				}
			}
		});
		privacy.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				int width = 900;
				if(new Rectangle(width - 50, 0 , 30, 30).contains(e.getPoint())) {
					changePanels(signupPanel);
				}
			}
		});

	}
	public void changePanels(JPanel panel) {
		signupPanel.setVisible(false);
		login_panel.setVisible(false);
		termsCon.setVisible(false);
		privacy.setVisible(false);
		panel.setVisible(true);
	}
}