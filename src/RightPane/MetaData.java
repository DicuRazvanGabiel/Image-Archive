package RightPane;

import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.VBox;

public class MetaData {
	
	private VBox metaDataPane;
	
	private ScrollPane scrollPane;
	
	private Label lbMetaData;
	
	private Label titleLabel = new Label("Meta Data");
	
	private VBox mainPane = new VBox();

	public MetaData() {
		
		scrollPane = new ScrollPane();
		
		metaDataPane = new VBox(10);
		
		lbMetaData = new Label(" File Name");
		
		metaDataPane.getChildren().add(lbMetaData);
		scrollPane.setContent(metaDataPane);
		
		titleLabel.getStyleClass().add("bordered-titled-title");
		
		mainPane.getChildren().addAll(titleLabel,scrollPane);
		mainPane.getStyleClass().add("bordered-titled-border");
	}

	public Node getNode() {
		return mainPane;
	}
}
