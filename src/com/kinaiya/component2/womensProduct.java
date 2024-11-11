package com.kinaiya.component2;

import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JPanel;
import javax.swing.JLabel;
import com.kinaiya.swing.*;

public class womensProduct extends JPanel {

	int x;
	int y;
	int width;
	int height;

	int i;

	String desc = "";

	// menProducts Page 1
	public womensProduct(int x, int y, int width, int height) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;

		setBounds(x, y, width, height);
		setLayout(null);
		setOpaque(false);
		setVisible(false);

		// Array of image paths
		String[] imagePaths = { "C:\\Users\\David\\eclipse-workspace\\kkkk\\ELearning\\mensProduct\\1.jpg",
				"C:\\Users\\David\\eclipse-workspace\\kkkk\\ELearning\\mensProduct\\2.jpg",
				"C:\\Users\\David\\eclipse-workspace\\kkkk\\ELearning\\mensProduct\\3.jpg",
				"C:\\Users\\David\\eclipse-workspace\\kkkk\\ELearning\\mensProduct\\4.jpg", };
		String[] imagePaths2 = { "C:\\Users\\David\\eclipse-workspace\\kkkk\\ELearning\\womensProduct\\1w.jpg",
				"C:\\Users\\David\\eclipse-workspace\\kkkk\\ELearning\\womensProduct\\2w.jpg",
				"C:\\Users\\David\\eclipse-workspace\\kkkk\\ELearning\\womensProduct\\3w.jpg",
				"C:\\Users\\David\\eclipse-workspace\\kkkk\\ELearning\\womensProduct\\4w.jpg" };
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

		for (i = 0; i < 4; i++) {

			int posX = ((itemGap + 10) * (i + 1)) + (sizeWidth * i);
			JLabel label = new JLabel();
			ImageIcon icon = iconList3.get(i);

			String[] desc = { "        Blue Tshirt", "    DNK Green Tshirt", "    Flamingo Tshirt",
			"Orange Pattern Tshirt" };

			lightBrownButton button = new lightBrownButton(C2D8EB, "ADD TO CART",  font, fontColor);
			JPanel items = new JPanel(null);
			JLabel descrip = new JLabel(desc[i]);
			JLabel meng = new JLabel("Women");
			JLabel price = new JLabel("P299.00");
			meng.setBounds(55, itemGap + sizeWidth - 5, getWidth(), 10);
			descrip.setBounds(20, itemGap + sizeWidth - 20, getWidth(), 10);
			price.setBounds(55, itemGap + sizeWidth + 15, getWidth(), 10);
			button.setBounds(0, sizeHeight - 40, sizeWidth, 40);
			
			items.add(price);
			items.add(descrip);
			items.add(meng);
			items.add(button);

			label.setIcon(icon);
			label.setBounds(0, 0, sizeOfPicItem, sizeOfPicItem);
			items.add(label);
			items.setBackground(new Color(0, 0, 0, 0));
			items.setOpaque(false);
			items.setBounds(posX, itemGap, sizeWidth, sizeHeight);
			

			add(items);
		}
		for (int in = 0; in < 4; in++) {

			ImageIcon icon = iconList2.get(in);

			String[] desc = { "   Basic Gray Jeans", "   Blue Denim Jeans", "   Blue Denim Shorts",
					"  Slim Fit Bue Jeans" };

			int posX = ((itemGap + 10) * (in + 1)) + (sizeWidth * in);
			String priMsg[] = {"P359.00", "P359.00", "P299.00", "P359.00"};
			
			lightBrownButton button = new lightBrownButton(C2D8EB, "ADD TO CART",  font, fontColor);
			JPanel items = new JPanel(null);
			JLabel label = new JLabel();
			JLabel descrip = new JLabel(desc[in]);
			JLabel meng = new JLabel("Women");
			JLabel price = new JLabel(priMsg[in]);
			
			meng.setBounds(55, itemGap + sizeWidth - 5, getWidth(), 10);
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

			ImageIcon icon = iconList.get(in);

			String[] desc = { "Black Hoodie", " Blue Hoodie", "Green Hoodie", "  Red Hoodie" };

			int posX = ((itemGap + 10) * (in + 1)) + (sizeWidth * in);

			lightBrownButton button = new lightBrownButton(C2D8EB, "ADD TO CART",  font, fontColor);
			JPanel items = new JPanel(null);
			JLabel label = new JLabel();
			JLabel descrip = new JLabel(desc[in]);
			JLabel meng = new JLabel("Women");
			JLabel price = new JLabel("P559.50");
			meng.setBounds(55, itemGap + sizeWidth - 5, getWidth(), 10);
			descrip.setBounds(40, itemGap + sizeWidth - 25, getWidth(), 15);
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
			items.setBounds(posX, (itemGap + sizeHeight + itemGap) * 2 + itemGap * 3, sizeWidth, sizeHeight);


			add(items);
		}

	}

	Color C2D8EB = new Color(194, 216, 235);

	Font font = new Font("Arial", Font.PLAIN, 10);
	Color fontColor = Color.black;

}