package com.kinaiya.components;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

import JOptionPaneCustomize.JOptionPaneExit;
import com.kinaiya.swing.Labels;
import com.kinaiya.component2.exitANDminimizeButton;
import com.kinaiya.main.Main;
import com.kinaiya.swing.ButtonOutLine;
import com.kinaiya.swing.MyPasswordField;
import com.kinaiya.swing.MyTextField;
import com.kinaiya.swing.button;

public class SignUpPanel extends JPanel {
	private ActionListener event;

	public button button2;
	public ButtonOutLine button;
	
	public Labels terms, privacy;
	

	int widthOfGreen = 350;

	boolean uncheck = false;

	ImageIcon icon1 = new ImageIcon("C:\\Users\\David\\eclipse-workspace\\kkkk\\ELearning\\img\\Logo.png");
	Image img1 = icon1.getImage();
	Image imgScale1 = img1.getScaledInstance(300, 213, Image.SCALE_SMOOTH);

	Image checkIcon = new ImageIcon(getClass().getResource("/fonts/check.png")).getImage();
	Image uncheckIcon = new ImageIcon(getClass().getResource("/fonts/uncheck.png")).getImage(); // .getScaledInstance(20,
																								// 20,
																								// Image.SCALE_SMOOTH);

	public static String getUsername, getFirstName, getLastName, getEmail, getPassword;

	public static Labels msg = new Labels(80, 600 - 210, 250, 50, Color.red);

	public SignUpPanel() {

		// signup

		setBounds(0, 0, 900, 600);
		setVisible(false);
		setLayout(null);
		setOpaque(false);
		
		firstName = new MyTextField();
		lastName = new MyTextField();
		Emailfield = new MyTextField();
		userName = new MyTextField();
		// Create Header
		JLabel header = new JLabel("Welcome to Kinaiya!");
		header.setBounds(getWidth() - 320, 70, 300, 25);
		header.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 30));
		header.setForeground(new Color(255, 255, 255));

		JLabel description1 = new JLabel(
				"<html>Elevate your wardrobe with Kinaiya's <br> one-of-a-kind designs</html>");
		description1.setForeground(new Color(255, 255, 255));
		description1.setFont(new Font("sansserif", Font.PLAIN, 18));
		description1.setBounds(getWidth() - 320, 40, 300, 200);

		// add signup button to panel
		button = new ButtonOutLine();
		button.setText("SIGN IN");
		button.setBounds(getWidth() - (widthOfGreen - 100), 400, 130, 30);

		// Add loginHeader label to contentPane
		JLabel loginHeader = new JLabel("CREATE AN ACCOUNT");
		loginHeader.setForeground(mainColor);
		loginHeader.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 25));
		loginHeader.setBounds(100, 70, 270, 90); // 500

		// Add Sign in form

		firstName.setBounds(70, 150, 300, 40);
		firstName.setHint("First Name");
		add(firstName);

		lastName.setBounds(70, 200, 300, 40);
		lastName.setHint("Last Name");
		add(lastName);

		userName.setBounds(70, 250, 300, 40);
		userName.setHint("User Name");
		add(userName);

		Emailfield.setBounds(70, 300, 300, 40);
		Emailfield.setHint("Email");
		add(Emailfield, "ww 60%");

		PasswordField = new MyPasswordField();
		PasswordField.setHint("Password");
		PasswordField.setBounds(70, 350, 300, 40);
		add(PasswordField);

		button2 = new button();
		button2.setBounds(155, 530, 130, 30);
		button2.setText("SIGN UP");

		Labels check = new Labels("<html>I agree to the terms and conditions and privacy policy</html>", 150,
				getHeight() - 170, 180, 50);
		privacy = new Labels(275, getHeight() - 115, 85, 20, "PRIVACY POLICY");
		terms = new Labels(85, getHeight() - 115, 120, 20, "TERMS AND CONDITIONS");
		
		exitANDminimizeButton exitANDmin = new exitANDminimizeButton(getWidth() - 70, -7, new Color(255, 51, 51), new Color(255, 175, 51), new Color(255, 51, 51, 200), new Color(255, 175, 51, 200));

		add(exitANDmin);
		add(msg);
		add(check);
		add(terms);
		add(privacy);
		add(button2);
		add(button);
		add(loginHeader);
		add(header);
		add(description1);

		button.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				event.actionPerformed(e);
			}

		});

		addMouseMotionListener(new MouseMotionAdapter() {
			public void mouseMoved(MouseEvent e) {
				int x = 135;
				int y = getHeight() - 155;
				if (new Rectangle(x, y, 10, 10).contains(e.getPoint())) {
					setCursor(new Cursor(Cursor.HAND_CURSOR));
				} else {
					setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
				}
			}
		});
		addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				int x = 135;
				int y = getHeight() - 155;
				if (new Rectangle(x, y, 10, 10).contains(e.getPoint())) {
					uncheck = !uncheck;
					repaint();
				}
			}
		});

	}

	public void paintComponent(Graphics g) {

		int first_size = 150;

		Graphics2D g2 = (Graphics2D) g;
		GradientPaint gra = new GradientPaint(getWidth() - 350, 0, C4AB9C, getWidth() - 50, 0, _6A4D4C);

		g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		g2.setPaint(gra);
		g2.fillRect(getWidth() - widthOfGreen, 0, widthOfGreen, getHeight());
		g2.setColor(mainColor);
		g2.fillOval((getWidth() - widthOfGreen) - (first_size / 2), (getHeight() / 2) - (first_size / 2), first_size,
				first_size);
		createShowHide(g2);
		ImageIcon icon = new ImageIcon(
				"C:\\Users\\David\\eclipse-workspace\\kkkk\\ELearning\\img\\Logo.png");
		icon.paintIcon(this, g, 478, 233);
		super.paintComponent(g);
	}

	public void addEvent(ActionListener event) {
		this.event = event;
	}

	public void createShowHide(Graphics2D g2) {
		int x = 120;
		int y = getHeight() - 170;
		g2.drawImage(uncheck ? checkIcon : uncheckIcon, x, y, null);
	}

	Color C4AB9C = new Color(196, 171, 156);
	Color _6A4D4C = new Color(106, 77, 76);

	Color mainColor = new Color(117, 89, 70);
	Color effectColor = new Color(117, 89, 70, 180);

	public static MyTextField firstName;
	public static MyTextField lastName;
	public static MyTextField Emailfield;
	public static MyTextField userName;
	public static MyPasswordField PasswordField;

	public void buttonSignUp(JPanel signUpPanel, JPanel logInPanel) {
		button2.addActionListener(e -> {
			int requiredPassLength = 8;

			System.out.print("Clicked");
			
			getUsername = userName.getText();
			getFirstName = firstName.getText();
			getLastName = lastName.getText();
			getEmail = Emailfield.getText();
			getPassword = PasswordField.getText();
			

			if (!getUsername.isBlank() && 
					!getFirstName.isBlank() &&
					!getLastName.isBlank() && 
					!getEmail.isBlank()&& 
					!getPassword.isBlank()) {

				if (getPassword.length() < requiredPassLength) {
					msg.setForeground(Color.red);
					msg.setText("Your password must be 8 characters.");
				} else if (isSpace(getPassword)) {
					msg.setForeground(Color.red);
					msg.setText("Password must not include whitespace.");
				} else if (!uncheck) {
					msg.setForeground(Color.black);
					msg.setText("<html>You must agree to the Terms and Condition<br> and Privacy Policy</html>");

				} else {
					

					JOptionPane.showMessageDialog(null,
							"<html>Account created successfully!<br>Click OK to LogIn<html>", "Message",
							JOptionPane.INFORMATION_MESSAGE);

					signUpPanel.setVisible(false);
					logInPanel.setVisible(true);
					
					userName.setText(null);
					firstName.setText(null);
					lastName.setText(null);
					Emailfield.setText(null);
					PasswordField.setText(null);
					msg.setText(null);
				}

			} else if (getUsername.isBlank() || getFirstName.isBlank() || getLastName.isBlank() || getEmail.isBlank()
					|| getPassword.isBlank()) {

				msg.setForeground(Color.red);
				msg.setText("Please fill the information required");
			} else if (isSpace(getPassword)) {
				msg.setText("Password must not include whitespace.");
			}

		});
	}

	public boolean isSpace(String password) {
		for (char currentChar : password.toCharArray()) {
			if (Character.isWhitespace(currentChar)) {
				return true;
			}

		}
		return false;
	}
}