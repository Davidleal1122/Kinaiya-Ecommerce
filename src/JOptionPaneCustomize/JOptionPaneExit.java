package JOptionPaneCustomize;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JDialog;
import javax.swing.JFrame;

public class JOptionPaneExit extends JDialog{

	private final JFrame frame;
	Background background;
	boolean show;
	

	public JOptionPaneExit(JFrame frame){
		super(frame, true);
		this.frame = frame;
		init();
		
	}
	
	public void init() {
		background = new Background();
		setUndecorated(true);
		setVisible(false);
		setSize(300, 200);
		setLocationRelativeTo(frame);
		setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				dispose();
			}
		});
		setBackground(new Color(0, 0, 0, 0));
		add(background);
		background.noButton.addMouseListener(new MouseAdapter() {
        	public void mouseClicked(MouseEvent e) {
        		dispose();
        	}
        });
		
		
	}
	
}
