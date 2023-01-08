package hust.soict.dsai.aims.screen;

import java.io.IOException;

import javax.swing.JFrame;

import hust.soict.dsai.aims.store.Store;
import javafx.application.Platform;
import javafx.embed.swing.JFXPanel;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class AddDVDToStore extends JFrame{
	// Cao Thanh Tung 20200569
	private Store store;
	private StoreScreen.AddDVD addDVDHandler;
	
	public AddDVDToStore(Store store, StoreScreen.AddDVD addDVDHandler) {
		this.store = store;
		this.addDVDHandler = addDVDHandler;
		addDVDHandler.AddDVDToStoreScreen = this;
		JFXPanel fxPanel = new JFXPanel();
		this.add(fxPanel);
		this.setVisible(true);
		this.setTitle("Cart");
		this.setSize(900, 500);
		Platform.runLater(new Runnable() {

			@Override
			public void run() {
				try {
					FXMLLoader loader = new FXMLLoader(getClass().getResource("/hust/soict/dsai/aims/screen/DVD.fxml"));
					AddDVDToStoreController controller = new AddDVDToStoreController(store, addDVDHandler);
					loader.setController(controller);
					Parent root = loader.load();
					fxPanel.setScene(new Scene(root));
				} catch(IOException e) {
					e.printStackTrace();
				}
				
			}
			
		});
	}
}
