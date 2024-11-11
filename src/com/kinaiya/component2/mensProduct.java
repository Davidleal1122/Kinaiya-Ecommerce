package com.kinaiya.component2;

import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JPanel;
import javax.swing.JLabel;
import com.kinaiya.swing.*;

public class mensProduct extends JPanel {

	int x;
	int y;
	int width;
	int height;

	

	String desc = "";

	// menProducts Page 1
	public mensProduct(int x, int y, int width, int height) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;

		setBounds(x, y, width, height);
		setLayout(null);
		setOpaque(false);

		// Array of image paths
		String[] imagePaths = { "C:\\Users\\David\\eclipse-workspace\\kkkk\\ELearning\\mensProduct\\1.jpg",
				"C:\\Users\\David\\eclipse-workspace\\kkkk\\ELearning\\mensProduct\\2.jpg",
				"C:\\Users\\David\\eclipse-workspace\\kkkk\\ELearning\\mensProduct\\3.jpg",
				"C:\\Users\\David\\eclipse-workspace\\kkkk\\ELearning\\mensProduct\\4.jpg", };
		String[] imagePaths2 = { "C:\\\\Users\\\\David\\\\eclipse-workspace\\\\kkkk\\\\ELearning\\\\mensProduct\\\\5.jpg",
				"C:\\\\Users\\\\David\\\\eclipse-workspace\\\\kkkk\\\\ELearning\\\\mensProduct\\\\6.jpg",
				"C:\\\\Users\\\\David\\\\eclipse-workspace\\\\kkkk\\\\ELearning\\\\mensProduct\\\\7.jpg",
				"C:\\\\Users\\\\David\\\\eclipse-workspace\\\\kkkk\\\\ELearning\\\\mensProduct\\\\8.jpg" };
		String[] imagePaths3 = { "C:\\Users\\David\\eclipse-workspace\\kkkk\\ELearning\\mensProduct\\9.png",
				"C:\\Users\\David\\eclipse-workspace\\kkkk\\ELearning\\mensProduct\\10.png",
				"C:\\Users\\David\\eclipse-workspace\\kkkk\\ELearning\\mensProduct\\11.png",
				"C:\\Users\\David\\eclipse-workspace\\kkkk\\ELearning\\mensProduct\\12.png" };

		// Create an ArrayList to store the ImageIcons
		List<ImageIcon> iconList = new ArrayList<>();
		List<ImageIcon> iconList2 = new ArrayList<>();
		List<ImageIcon> iconList3 = new ArrayList<>();

		// Populate the list with ImageIcons using a for loop
		for (String path : imagePaths) {
			ImageIcon icon = new ImageIcon(path);
			iconList.add(icon);
		}
		for (String path : imagePaths2) {
			ImageIcon icon = new ImageIcon(path);
			iconList2.add(icon);
		}
		for (String path : imagePaths3) {
			ImageIcon icon = new ImageIcon(path);
			iconList3.add(icon);
		}

		// Do something with the ImageIcons...

		int itemGap = 25;
		int sizeWidth = 160;
		int sizeHeight = 260;
		int sizeOfPicItem = 160;

		for (int i = 0; i < 4; i++) {

			int posX = ((itemGap + 10) * (i + 1)) + (sizeWidth * i);
			JLabel label = new JLabel();
			ImageIcon icon = iconList.get(i);

			String[] desc = { "Black Hoodie", "  Blue Hoodie", "Green Hoodie", "   Red Hoodie" };

			lightBrownButton button = new lightBrownButton(C2D8EB, "ADD TO CART",  font, fontColor);
			JPanel items = new JPanel(null);
			JLabel descrip = new JLabel(desc[i]);
			JLabel meng = new JLabel("Men");
			JLabel price = new JLabel("P559.50");
			meng.setBounds(65, itemGap + sizeWidth - 5, getWidth(), 10);
			descrip.setBounds(40, itemGap + sizeWidth - 20, getWidth(), 10);
			price.setBounds(55, itemGap + sizeWidth + 15, getWidth(), 10);
			label.setBounds(0, 0, sizeOfPicItem, sizeOfPicItem);
			button.setBounds(0, sizeHeight - 40, sizeWidth, 40);
			
			items.add(price);
			items.add(descrip);
			items.add(meng);
			items.add(button);

			label.setIcon(icon);
			items.setOpaque(false);
			items.add(label);
			items.setBounds(posX, itemGap, sizeWidth, sizeHeight);
			

			add(items);
		}
		for (int in = 0; in < 4; in++) {

			ImageIcon icon = iconList2.get(in);

			String[] desc = { "Faint Washed Denim", "     Dark Grey Jeans", "   Dark Brown Jeans",
					"          Dark Blue" };

			int posX = ((itemGap + 10) * (in + 1)) + (sizeWidth * in);

			lightBrownButton button = new lightBrownButton(C2D8EB, "ADD TO CART",  font, fontColor);
			JPanel items = new JPanel(null);
			JLabel label = new JLabel();
			JLabel descrip = new JLabel(desc[in]);
			JLabel meng = new JLabel("Men");
			JLabel price = new JLabel("P359.00");
			meng.setBounds(65, itemGap + sizeWidth - 5, getWidth(), 10);
			descrip.setBounds(20, itemGap + sizeWidth - 20, getWidth(), 10);
			price.setBounds(55, itemGap + sizeWidth + 15, getWidth(), 10);
			button.setBounds(0, sizeHeight - 40, sizeWidth, 40);
			
			items.add(price);
			items.add(descrip);
			items.add(meng);
			items.add(button);
			
			label.setIcon(icon);
			label.setBounds(0, 0, sizeOfPicItem, sizeOfPicItem);
			items.setBackground(new Color(0, 0, 0, 0));
			items.setOpaque(false);
			items.add(label);
			items.setBounds(posX, itemGap + sizeHeight + itemGap * 3, sizeWidth, sizeHeight);

			


			add(items);
		}
		for (int in = 0; in < 4; in++) {

			ImageIcon icon = iconList3.get(in);

			String[] desc = { "        Blue Tshirt", "   DNK Green Tshirt", "     Flamingo Tshirt",
					"Orange Pattern Tshirt" };

			int posX = ((itemGap + 10) * (in + 1)) + (sizeWidth * in);

			lightBrownButton button = new lightBrownButton(C2D8EB, "ADD TO CART",  font, fontColor);
			JPanel items = new JPanel(null);
			JLabel label = new JLabel();
			JLabel descrip = new JLabel(desc[in]);
			JLabel meng = new JLabel("Men");
			JLabel price = new JLabel("P559.50");
			meng.setBounds(65, itemGap + sizeWidth - 5, getWidth(), 10);
			descrip.setBounds(20, itemGap + sizeWidth - 25, getWidth(), 15);
			price.setBounds(55, itemGap + sizeWidth + 15, getWidth(), 10);
			button.setBounds(0, sizeHeight -40, sizeWidth, 40);
			
			items.add(price);
			items.add(descrip);
			items.add(meng);
			items.add(button);
			
			label.setIcon(icon);
			label.setBounds(0, 0, sizeOfPicItem, sizeOfPicItem);
			items.setBackground(new Color(0, 0, 0, 0));
			items.setOpaque(false);
			items.add(label);
			items.setBounds(posX, (itemGap + sizeHeight + itemGap) * 2 + itemGap * 3, sizeWidth, sizeHeight);

			
			
			add(items);
		}

	}

	Color C2D8EB = new Color(194, 216, 235);

	Font font = new Font("Arial", Font.PLAIN, 10);
	Color fontColor = Color.black;

}