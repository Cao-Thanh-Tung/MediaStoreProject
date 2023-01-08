package hust.soict.dsai.aims.screen;
import javafx.application.Platform;
import javafx.embed.swing.JFXPanel;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Dialog;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.io.IOException;

import javax.swing.JFrame;

import hust.soict.dsai.aims.media.Book;
import hust.soict.dsai.aims.store.Store;
import javafx.scene.control.ButtonBar.ButtonData;
import javafx.scene.layout.GridPane;
import javafx.util.Callback;
// child dialog
public class AddBookToStore extends JFrame{
	// Cao Thanh Tung 20200569
		private Store store;
		private StoreScreen.AddBook addBookHandler;
		
		public AddBookToStore(Store store, StoreScreen.AddBook addBookHandler) {
			this.store = store;
			this.addBookHandler = addBookHandler;
			addBookHandler.AddBookToStoreScreen = this;
			JFXPanel fxPanel = new JFXPanel();
			this.add(fxPanel);
			this.setVisible(true);
			this.setTitle("Cart");
			this.setSize(900, 500);
			Platform.runLater(new Runnable() {

				@Override
				public void run() {
					try {
						FXMLLoader loader = new FXMLLoader(getClass().getResource("/hust/soict/dsai/aims/screen/book.fxml"));
						AddBookToStoreController controller = new AddBookToStoreController(store, addBookHandler);
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
