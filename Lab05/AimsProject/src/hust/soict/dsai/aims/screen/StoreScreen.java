package hust.soict.dsai.aims.screen;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;


import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.media.DigitalVideoDisc;
import hust.soict.dsai.aims.media.Disc;
import hust.soict.dsai.aims.media.Media;
import hust.soict.dsai.aims.media.Playable;
import hust.soict.dsai.aims.store.Store;

public class StoreScreen extends JFrame {
	private Store store;
	private Cart cart;
	// Cao Thanh Tung 20200569
	JPanel createNorth() {
		JPanel north = new JPanel();
		north.setLayout(new BoxLayout(north, BoxLayout.Y_AXIS));
		north.add(createMenuBar());
		north.add(createHeader());
		return north;
	}
	JMenuBar createMenuBar() {
		JMenu menu = new JMenu("Options");
		
		JMenu smUpdateStore = new JMenu("Update Store");
		smUpdateStore.add(new JMenuItem("Add Book"));
		smUpdateStore.add(new JMenuItem("Add CD"));
		smUpdateStore.add(new JMenuItem("Add DVD"));
		
		menu.add(smUpdateStore);
		menu.add(new JMenuItem("View store"));
		menu.add(new JMenuItem("View cart"));
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setLayout(new FlowLayout(FlowLayout.LEFT));
		menuBar.add(menu);
		
		return menuBar;
	}
	
	JPanel createHeader() {
		
		JPanel header =new JPanel();
		header.setLayout(new BoxLayout(header, BoxLayout.X_AXIS));
		
		JLabel title = new JLabel("AiMS");
		title.setFont(new Font(title.getFont().getName(), Font.PLAIN, 50));
		title.setForeground(Color.CYAN);
		
		JButton cart = new JButton("View cart");
		cart.setPreferredSize(new Dimension(100, 50));
		cart.setMaximumSize(new Dimension(100,50));
		
		header.add(Box.createRigidArea(new Dimension(10,10)));
		header.add(title);
		header.add(Box.createHorizontalGlue());
		header.add(cart);
		header.add(Box.createRigidArea(new Dimension(10,10)));
		
		return header;
	}
	JPanel createCenter() {
		JPanel center = new JPanel();
		center.setLayout(new GridLayout(3,3,2,2));
		
		ArrayList<Media> mediaInStore = store.getItemsInStore();
		for(int i = 0; i<9; i++) {
			MediaStore cell = new MediaStore(mediaInStore.get(i));
			// gan su kien cho tung cai button
			Media tmp = mediaInStore.get(i);
			center.add(cell);
			// Gan su kien cho cac nut
			// Cao Thanh Tung 20200569
			cell.ButtonAdd.addActionListener(new ActionListener(){
				@Override
				public void actionPerformed(ActionEvent e) {
					// Them vao gio hang
					cart.addMedia(tmp);
				}
				
			});
			cell.ButtonPlay.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// Choi nhac
					if(tmp instanceof Playable) {
						Playable tmp1 = (Playable) tmp;
						tmp1.play();
					}
					
				}
			});
		}
		
		return center;
	}
	public StoreScreen(Store store, Cart cart) {
		// Cao Thanh Tung 20200569
		this.store = store;
		this.cart = cart;
		Container cp = getContentPane();
		cp.setLayout(new BorderLayout());
		
		cp.add(createNorth(), BorderLayout.NORTH);
		cp.add(createCenter(), BorderLayout.CENTER);
		
		setVisible(true);
		setTitle("Store");
		setSize(1024, 768);
	}
	
	public static void main(String[] args) {
		Store store = new Store();
		Cart cart = new Cart();
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The lion King", "Animation", "Roger Allers", 97, 19.95f);
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Start Wars", "Science Fiction", "George Lucas", 87, 24.95f);
		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation","George Lucas", 87, 18.99f);
		DigitalVideoDisc dvd4 = new DigitalVideoDisc("The lion King", "Animation", "Roger Allers", 97, 19.95f);
		DigitalVideoDisc dvd5 = new DigitalVideoDisc("Start Wars", "Science Fiction", "George Lucas", 87, 24.95f);
		DigitalVideoDisc dvd6 = new DigitalVideoDisc("Aladin", "Animation","George Lucas", 87, 18.99f);
		DigitalVideoDisc dvd7 = new DigitalVideoDisc("The lion King", "Animation", "Roger Allers", 97, 19.95f);
		DigitalVideoDisc dvd8 = new DigitalVideoDisc("Start Wars", "Science Fiction", "George Lucas", 87, 24.95f);
		DigitalVideoDisc dvd9 = new DigitalVideoDisc("Aladin", "Animation","George Lucas", 87, 18.99f);
		store.addMedia(dvd1, dvd2, dvd3, dvd4, dvd5, dvd6, dvd7, dvd8,dvd9);
		new StoreScreen(store, cart);
	}
}
