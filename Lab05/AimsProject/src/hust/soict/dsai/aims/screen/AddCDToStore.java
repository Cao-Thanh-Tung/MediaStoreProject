package hust.soict.dsai.aims.screen;

import java.io.IOException;

import javax.swing.JFrame;

import hust.soict.dsai.aims.store.Store;
import javafx.application.Platform;
import javafx.embed.swing.JFXPanel;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class AddCDToStore extends JFrame{
	// Cao Thanh Tung 20200569
	private Store store;
	private StoreScreen.AddCD addCDHandler;
	
	public AddCDToStore(Store store, StoreScreen.AddCD addCDHandler) {
		this.store = store;
		this.addCDHandler = addCDHandler;
		addCDHandler.AddCDToStoreScreen = this;
		JFXPanel fxPanel = new JFXPanel();
		this.add(fxPanel);
		this.setVisible(true);
		this.setTitle("Cart");
		this.setSize(900, 500);
		Platform.runLater(new Runnable() {

			@Override
			public void run() {
				try {
					FXMLLoader loader = new FXMLLoader(getClass().getResource("/hust/soict/dsai/aims/screen/CD.fxml"));
					AddCDToStoreController controller = new AddCDToStoreController(store, addCDHandler);
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
