package application;

import javafx.geometry.Orientation;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.control.SplitPane;

public class Wrapper {
	
	private SplitPane split;
	
	public Wrapper(Orientation orientation, double splitLocation){
		split = new SplitPane();
		
		split.setOrientation(orientation);
		split.setDividerPositions(splitLocation);
	}
	
	public void addNode(final Node node1, final Node node2){
		split.getItems().addAll(node1, node2);
	}
	
	public Parent getNode(){
		return split;
	}

}
