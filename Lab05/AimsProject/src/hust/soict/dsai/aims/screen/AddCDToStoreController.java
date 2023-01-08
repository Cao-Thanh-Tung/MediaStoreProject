package hust.soict.dsai.aims.screen;

import hust.soict.dsai.aims.media.Book;
import hust.soict.dsai.aims.media.CompactDisc;
import hust.soict.dsai.aims.store.Store;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;

public class AddCDToStoreController {
	private Store store;
	private StoreScreen.AddCD addCDHandler;
	public AddCDToStoreController(Store store, StoreScreen.AddCD addCDHandler) {
		this.store = store;
		this.addCDHandler = addCDHandler;
	}
	@FXML
    private TextField CDArtist;

    @FXML
    private TextField CDDirector;

    @FXML
    private TextField CDTitle;

    @FXML
    private TextField CDCategory;

    @FXML
    private TextField CDCost;

    @FXML
    private TextField CDLength;

    @FXML
    void addCD(ActionEvent event) {
    	float cost = Float.parseFloat(CDCost.getText());
    	String artist = CDArtist.getText();
    	String category = CDCategory.getText();
    	String title = CDTitle.getText();
    	String director = CDDirector.getText();
    	int length = Integer.parseInt(CDLength.getText());
    	store.addMedia(new CompactDisc(title, category, cost, length, director, artist));
		Alert alert = new Alert(AlertType.INFORMATION);
		alert.setTitle("Success");
		alert.setHeaderText("Results:");
		alert.setContentText("Them thanh cong!");

		alert.showAndWait();
    }

    @FXML
    void seeStore(ActionEvent event) {
    	new StoreScreen(store, this.addCDHandler.cart);
    	this.addCDHandler.AddCDToStoreScreen.dispose();
    }

}
