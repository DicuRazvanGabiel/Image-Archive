package BottPane;

import java.io.File;

import application.ImageChangeController;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.ScrollPane;
import javafx.scene.image.Image;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class BottPane {
	
	private ImageChangeController imageChangeController;
	
	private ScrollPane scrollPane = new ScrollPane();
	
	private HBox hboxPane = new HBox(10);
	
	private MenuBarPane menuBar;
	
	private BorderPane borderPane = new BorderPane();

	private Label titleLabel = new Label("Images");
	
	private VBox mainPane = new VBox();
	
	public BottPane(ImageChangeController imageChangeController,AddImageController addImageController){
		
		this.imageChangeController = imageChangeController;
		
		menuBar = new MenuBarPane(addImageController);
		
		scrollPane.setContent(hboxPane);
		scrollPane.getStyleClass().add("scroll-pane");
		
		hboxPane.getStyleClass().add("bordered-titled-content");
		
		titleLabel.getStyleClass().add("bordered-titled-title");
		
		mainPane.getChildren().addAll(titleLabel,scrollPane);
		mainPane.getStyleClass().add("bordered-titled-border");
		
		borderPane.setCenter(mainPane);
		borderPane.setBottom(menuBar.getNode());
	}

	public Node getNode() {
		return borderPane;
	}

	public void addImage(File selectedFile) {
		hboxPane.getChildren().add(new GalleryItem(selectedFile.toURI().toString(), imageChangeController).getNode());
		
		
	}


	
}
