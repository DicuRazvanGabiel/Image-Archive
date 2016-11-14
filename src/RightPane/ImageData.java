package RightPane;

import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.VBox;

public class ImageData {
	
	private ScrollPane scrollPane;
	
	private VBox imageDataPane;
	
	private Label lbImageData;
	
	private Label titleLabel = new Label("Image Data");
	
	private VBox mainPane = new VBox();


	public ImageData() {
		
		scrollPane = new ScrollPane();
		
		imageDataPane = new VBox(10);
		
		lbImageData = new Label(" 01 Discription");
		
		imageDataPane.getChildren().add(lbImageData);
		
		titleLabel.getStyleClass().add("bordered-titled-title");
		
		scrollPane.setContent(imageDataPane);
		scrollPane.getStyleClass().add("border");
		
		mainPane.getChildren().addAll(titleLabel,scrollPane);
		mainPane.getStyleClass().add("bordered-titled-border");
	}

	public Node getNode() {
		return mainPane;
	}
	
	

}
