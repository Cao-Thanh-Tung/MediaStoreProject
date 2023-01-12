package hust.soict.dsai.aims.screen;

import hust.soict.dsai.aims.media.Book;
import hust.soict.dsai.aims.store.Store;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class AddBookToStoreController {
	private Store store;
	private StoreScreen.AddBook addBookHandler;
	public AddBookToStoreController(Store store, StoreScreen.AddBook addBookHandle) {
		this.store = store;
		this.addBookHandler = addBookHandle;
	}
    @FXML
    private TextField bookCost;

    @FXML
    private TextField bookAuthor;

    @FXML
    private Button bookAddButton;

    @FXML
    private TextField bookCategory;

    @FXML
    private TextField bookTitle;

    @FXML
    void addBook(ActionEvent event) {
    	try {
        	int cost = Integer.parseInt(bookCost.getText());
        	String author = bookAuthor.getText();
        	String category = bookCategory.getText();
        	String title = bookTitle.getText();
        	store.addMedia(new Book(title, category, cost, author));
        	Alert alert = new Alert(AlertType.INFORMATION);
    		alert.setTitle("Success");
    		alert.setHeaderText("Results:");
    		alert.setContentText("Them thanh cong!");

    		alert.showAndWait();
    		
    	}
    	catch(Exception e) {
        	Alert alert = new Alert(AlertType.INFORMATION);
    		alert.setTitle("Fail");
    		alert.setHeaderText("Results:");
    		alert.setContentText("Them that Bai!");

    		alert.showAndWait();
    	}

    }
    

    @FXML
    void seeStorehandle(ActionEvent event) {
    	new StoreScreen(store, this.addBookHandler.cart);
    	this.addBookHandler.AddBookToStoreScreen.dispose();
    }

}