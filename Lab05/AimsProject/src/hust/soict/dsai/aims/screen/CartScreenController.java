package hust.soict.dsai.aims.screen;



import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.media.Media;
import hust.soict.dsai.aims.media.Playable;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.cell.PropertyValueFactory;

public class CartScreenController {
	private Cart cart;
	
    @FXML
    private TableView<Media> tblMedia;

    @FXML
    private TableColumn<Media, String> colMediaTitle;

    @FXML
    private TableColumn<Media, String> colMediacategory;

    @FXML
    private TableColumn<Media, Float> colMediaCost;

    @FXML
    private ToggleGroup filterCategory;
    

    @FXML
    private Button btnPlay;

    @FXML
    private Button btnRemove;
    
    @FXML
    private Label totalCost;
    
    public CartScreenController(Cart cart) {
    	super();
    	this.cart = cart;
    }
    
  @FXML
  void removeMedia(ActionEvent event) {

  	// Cao Thanh Tung 20200569
  	Media media = tblMedia.getSelectionModel().getSelectedItem();
  	cart.removeMedia(media);
  }
  
    
    
    @FXML
    private void initialize() {
    	// Cao Thanh Tung 20200569
    	// Lay du lieu tu title cua cart
    	colMediaTitle.setCellValueFactory(new PropertyValueFactory<Media, String>("title"));
    	// Lay du lieu ti categery cua cart
    	colMediacategory.setCellValueFactory(new PropertyValueFactory<Media, String>("category"));
    	// Lay du lieu tu cost cua cart
    	colMediaCost.setCellValueFactory(new PropertyValueFactory<Media, Float>("cost"));
    	tblMedia.setItems(this.cart.getItemsOrdered());
    	
    	
    	btnPlay.setVisible(false);
    	btnRemove.setVisible(false);
    	tblMedia.getSelectionModel().selectedItemProperty().addListener(
    			new ChangeListener<Media>() {
    				@Override
    				public void changed(ObservableValue<? extends Media> observable, Media oldValue, Media newValue) {
    					if(newValue != null) {	// Neu Media moi duoc chon
    						updateButtonBar(newValue);	// Cap nhat trang thai moi cua button
    					}
    				}
    				
    			    private void updateButtonBar(Media media) {
    			    	btnRemove.setVisible(true);
    			    	// Neu no la 1 the hien cua Playable thi hien nut Play khong thi thoi
    			    	if(media instanceof Playable) {
    			    		btnPlay.setVisible(true);
    			    	}else {
    			    		btnPlay.setVisible(false);
    			    	}
    			    }
    			}
    			);
    	totalCost.setText(this.cart.totalCost()+ "$");
    		
    }
    

    

}
