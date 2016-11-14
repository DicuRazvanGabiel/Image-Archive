package BottPane;

import application.ImageChangeController;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;

public class GalleryItem  {
	
	private VBox vboxItem = new VBox(5);
	
	private ImageView imageView = new ImageView();

	private Label infoImage = new Label("Info image label");
	
	private Image selectedImage;
	
	private ImageChangeController imageChangeController;
	
	public GalleryItem(String pathImage, ImageChangeController imageChangeController ){
		
		this.imageChangeController = imageChangeController;
		
		selectedImage = new Image(pathImage);
		
		imageView.setImage(selectedImage);
		imageView.preserveRatioProperty().set(true);
		imageView.fitHeightProperty().bind(new SimpleDoubleProperty(150));
		
		vboxItem.getChildren().addAll(imageView, infoImage);
		
		vboxItem.setOnMouseClicked(new EventHandler<Event>() {

			@Override
			public void handle(Event event) {
				imageChangeController.changeImage(selectedImage);
			}
		});
	}


	public Node getNode() {
		return vboxItem;
	}


}
