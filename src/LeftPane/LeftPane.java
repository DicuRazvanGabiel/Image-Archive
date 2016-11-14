package LeftPane;

import javafx.scene.Node;
import javafx.scene.layout.VBox;

public class LeftPane {

	private VBox leftWrapper;

	
	public LeftPane() {
		leftWrapper = new VBox();

		SearchField searchField = new SearchField();

		MicroscopyData microscopyData = new MicroscopyData();

		leftWrapper.getChildren().addAll(searchField.getNode(), microscopyData.getNode());
	}

	public Node getNode() {
		return leftWrapper;
	}

}
