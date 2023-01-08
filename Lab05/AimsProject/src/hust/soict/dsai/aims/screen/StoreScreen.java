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

import javax.naming.LimitExceededException;
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
import hust.soict.dsai.aims.media.Book;
import hust.soict.dsai.aims.media.DigitalVideoDisc;
import hust.soict.dsai.aims.media.Disc;
import hust.soict.dsai.aims.media.Media;
import hust.soict.dsai.aims.media.Playable;
import hust.soict.dsai.aims.store.Store;
import javafx.application.Platform;
import javafx.stage.Stage;

public class StoreScreen extends JFrame {
	private Store store;
	private Cart cart;
	private CartScreen cartScreen;
	private AddBookToStore addBookToStoreScreen;
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
		
		JMenuItem btnAddBook = new JMenuItem("Add Book");
		JMenuItem btnAddCD = new JMenuItem("Add CD");
		JMenuItem btnAddDVD = new JMenuItem("Add DVD");
		btnAddBook.addActionListener(new AddBook(this, this.cart));
		btnAddCD.addActionListener(new AddCD(this, this.cart));
		btnAddDVD.addActionListener(new AddDVD(this, this.cart));
		smUpdateStore.add(btnAddBook);
		smUpdateStore.add(btnAddCD);
		smUpdateStore.add(btnAddDVD);
		
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
		
		JButton cartButton = new JButton("View cart");
		cartButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				cartScreen.setVisible(true);
				
			}
			
		});
		cartButton.setPreferredSize(new Dimension(100, 50));
		cartButton.setMaximumSize(new Dimension(100,50));
		
		header.add(Box.createRigidArea(new Dimension(10,10)));
		header.add(title);
		header.add(Box.createHorizontalGlue());
		header.add(cartButton);
		header.add(Box.createRigidArea(new Dimension(10,10)));
		
		
		return header;
	}
	JPanel createCenter() {
		JPanel center = new JPanel();
		center.setLayout(new GridLayout(3,3,2,2));
		
		ArrayList<Media> mediaInStore = store.getItemsInStore();
		for(int i = 0; i<mediaInStore.size(); i++) {
			MediaStore cell = new MediaStore(mediaInStore.get(i));
			// gan su kien cho tung cai button
			Media tmp = mediaInStore.get(i);
			center.add(cell);
			// Gan Su kien cho nut Add
			// Cao Thanh Tung 20200569
			cell.ButtonAdd.addActionListener(new ActionListener(){
				@Override
				public void actionPerformed(ActionEvent e) {
					// Them vao gio hang
					cart.addMedia(tmp);
				}
				
			});
			// neu media la 1 the hien cua Playable thi gan su kien cho nut Play
			if(tmp instanceof Playable) {
				cell.ButtonPlay.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						// Choi nhac
						Playable tmp1 = (Playable) tmp;
						tmp1.play();	
					}
				});
			};
		}
		
		return center;
	}
	
	public class AddBook implements ActionListener{
		public Cart cart;
		public AddBookToStore AddBookToStoreScreen;
		public StoreScreen storeScreen;
		public AddBook(StoreScreen storeScreen, Cart cart) {
			this.cart = cart;
			this.storeScreen = storeScreen;
		}
		@Override
		public void actionPerformed(ActionEvent e) { 
			storeScreen.dispose();
			AddBookToStore addBookToStoreScreen = new AddBookToStore(store, this);
		}
	}
	
	public class AddCD implements ActionListener{
		public Cart cart;
		public AddCDToStore AddCDToStoreScreen;
		public StoreScreen storeScreen;
		public AddCD(StoreScreen storeScreen, Cart cart) {
			this.cart = cart;
			this.storeScreen = storeScreen;
		}
		@Override
		public void actionPerformed(ActionEvent e) { 
			storeScreen.dispose();
			AddCDToStore addCDToStoreScreen = new AddCDToStore(store, this);
		}
	}
	
	public class AddDVD implements ActionListener{
		public Cart cart;
		public AddDVDToStore AddDVDToStoreScreen;
		public StoreScreen storeScreen;
		public AddDVD(StoreScreen storeScreen, Cart cart) {
			this.cart = cart;
			this.storeScreen = storeScreen;
		}
		@Override
		public void actionPerformed(ActionEvent e) { 
			storeScreen.dispose();
			AddDVDToStore addDVDToStoreScreen = new AddDVDToStore(store, this);
		}
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
		this.cartScreen = new CartScreen(cart);
		this.cartScreen.setVisible(false);
		setTitle("Store");
		setSize(1024, 768);
	}
}
