package hust.soict.dsai.aims.screen;

import hust.soict.dsai.aims.media.CompactDisc;
import hust.soict.dsai.aims.media.DigitalVideoDisc;
import hust.soict.dsai.aims.store.Store;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;

public class AddDVDToStoreController {
	// Cao Thanh Tung 20200569
	private Store store;
	private StoreScreen.AddDVD addDVDHandler;
	public AddDVDToStoreController(Store store, StoreScreen.AddDVD addDVDHandler) {
		this.store = store;
		this.addDVDHandler = addDVDHandler;
	}
    @FXML
    private TextField DVDDirector;

    @FXML
    private TextField DVDTitle;

    @FXML
    private TextField DVDLength;

    @FXML
    private TextField DVDCategory;

    @FXML
    private TextField DVDCost;

    @FXML
    void addDVD(ActionEvent event) {
    	try {
        	float cost = Float.parseFloat(DVDCost.getText());
        	String category = DVDCategory.getText();
        	String title = DVDTitle.getText();
        	String director = DVDDirector.getText();
        	int length = Integer.parseInt(DVDLength.getText());
        	store.addMedia(new DigitalVideoDisc(title, category, director, length, cost));
    		Alert alert = new Alert(AlertType.INFORMATION);
    		alert.setTitle("Success");
    		alert.setHeaderText("Results:");
    		alert.setContentText("Them thanh cong!");

    		alert.showAndWait();
    	}catch(Exception e) {
    		Alert alert = new Alert(AlertType.INFORMATION);
    		alert.setTitle("Fail");
    		alert.setHeaderText("Results:");
    		alert.setContentText("Them that bai!");

    		alert.showAndWait();
    	}
    }
    @FXML
    void seeStore(ActionEvent event) {
    	new StoreScreen(store, this.addDVDHandler.cart);
    	this.addDVDHandler.AddDVDToStoreScreen.dispose();
    }
}

