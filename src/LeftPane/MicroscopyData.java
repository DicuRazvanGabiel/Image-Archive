package LeftPane;

import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.VBox;

public class MicroscopyData {

	private ScrollPane microscopyDataPane;

	private Label lbMicroscopyData;
	
	private VBox mainPane = new VBox();
	
	private Label titleLabel = new Label("Microscopy Data");

	public MicroscopyData() {
		microscopyDataPane = new ScrollPane();
		lbMicroscopyData = new Label("Microscopy Data");
		microscopyDataPane.setContent(lbMicroscopyData);
		microscopyDataPane.setPadding(new Insets(10, 10, 10, 10));
		microscopyDataPane.getStyleClass().add("bordered-titled-content");
		
		titleLabel.getStyleClass().add("bordered-titled-title");
		
		mainPane.getChildren().addAll(titleLabel,microscopyDataPane);
		mainPane.getStyleClass().add("bordered-titled-border");
	}

	public Node getNode() {

		return mainPane;
	}

}
