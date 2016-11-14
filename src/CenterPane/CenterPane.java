package CenterPane;

import javafx.scene.Node;
import javafx.scene.control.ScrollPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;

public class CenterPane {
	
	Pane imagePane;
	
	ScrollPane scrollPane;
	
	ImageView imageView;

	public CenterPane() {
		imagePane = new Pane();
		imageView = new ImageView();
		scrollPane = new ScrollPane();
		
		imageView.setImage(new Image(getClass().getResourceAsStream("/res/1.png")));
		imagePane.getChildren().setAll(imageView);
		scrollPane.setContent(imagePane);
	}

	public Node getNode() {
		return scrollPane;
	}
	
	

}
