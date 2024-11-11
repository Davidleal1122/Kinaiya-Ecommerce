package com.kinaiya.main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class progressBar extends JFrame {

	private JPanel contentPane;
	private JProgressBar progressBar;
	private Timer timer;
	private int progressValue;
	private int xPosition; // X position of the text

	public progressBar() {
		setUndecorated(true);

		setSize(700, 500);

		xPosition = getWidth(); // Set initial x position to the panel's width
		contentPane = new JPanel() {
			public void paintComponent(Graphics g) {
				int width = getWidth();
				int height = getHeight();

				Color c4AB9C = new Color(196, 171, 156);
				Color _7d5546 = new Color(125, 85, 70);

				ImageIcon icon = new ImageIcon("C:\\Users\\David\\eclipse-workspace\\kkkk\\ELearning\\img\\KINAIYA-PROGBAR.gif.mp4");
				
				Font font = new Font("Berlin Sans FB Demi", Font.PLAIN, 30);
				GradientPaint gra = new GradientPaint(0, 0, c4AB9C, 0, height, _7d5546);

				Graphics2D g2 = (Graphics2D) g;
				g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
				g2.setPaint(gra);
				g2.fillRect(0, 0, width, height);
				g2.setColor(Color.white);
				g2.setFont(font);
				g2.drawString("A clothing that ignites your inner", xPosition, 360); // Use the xPosition variable
				g2.drawString("confidence!", xPosition + 150, 390);

				icon.paintIcon(this, g2, 0, 0);
				
				super.paintComponents(g);
			}
		};

		setContentPane(contentPane);
		progressBar = new JProgressBar(0, 100) {
			protected void paintComponent(Graphics g) {
				int width1 = getWidth();
				Graphics2D g2d = (Graphics2D) g.create();

				// Set the background color
				g2d.setColor(Color.WHITE);
				g2d.fillRect(0, 0, getWidth(), getHeight());

				GradientPaint gra = new GradientPaint(0, 0, e4dfd5, width1, 0, _7B8077);
				// Draw the progress bar
				g2d.setPaint(gra);
				int width = (int) (getPercentComplete() * getWidth());
				g2d.fillRect(0, 0, width, getHeight());

				// Draw the text
				g2d.setColor(Color.BLACK);
				g2d.setFont(getFont());
				FontMetrics fm = g2d.getFontMetrics();
				String text = String.format("%.0f%%", getPercentComplete() * 100);
				int textWidth = fm.stringWidth(text);
				int textHeight = fm.getHeight();
				int x = (getWidth() - textWidth) / 2;
				int y = (getHeight() + textHeight) / 2;
				g2d.drawString(text, x, y);

				g2d.dispose();
			}
		};
		progressBar.setValue(0);
		progressBar.setStringPainted(true);
		progressBar.setBounds(0, 470, 700, 30);

		contentPane.add(progressBar);
		contentPane.setLayout(null);

		// Create a timer to simulate progress updates
		timer = new Timer(40, new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				progressValue += 1;
				progressBar.setValue(progressValue);

				if (progressValue >= 100) {
					timer.stop();
					dispose();
					Main main = new Main();
					main.setVisible(true);
				}
			}
		});

		// Start the timer
		timer.start();
		setLocationRelativeTo(null);
		Timer timer = new Timer(10, new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				xPosition -= 6; // Update the x position by a desired value (controls speed)
				repaint(); // Repaint the panel to update the text position

				if (xPosition - 140 < 0) { // Replace "200" with  the desired text width
					((Timer) e.getSource()).stop(); // Stop the timer when the text moves completely off-screen
				}
			}
		});
		timer.start();
	}


	Color _7B8077 = new Color(123, 128, 119);
	Color e4dfd5 = new Color(228, 223, 213);
}