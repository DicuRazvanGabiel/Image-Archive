package RightPane;

import javafx.scene.Node;
import javafx.scene.layout.VBox;

public class RightPane {
	
	private VBox rightPane;
	
	private ImageData imageData;
	
	private MetaData metaData;

	public RightPane() {
		
		rightPane = new VBox(10);
		
		imageData = new ImageData();
		
		metaData = new MetaData();
		
		rightPane.getChildren().addAll(imageData.getNode(),metaData.getNode());
	}

	public Node getNode() {
		return rightPane;
	}
	
	

}
