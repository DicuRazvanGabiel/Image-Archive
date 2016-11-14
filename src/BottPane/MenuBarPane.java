package BottPane;

import java.io.File;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.control.ToolBar;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

public class MenuBarPane {
	
	private Button addImageMenu = new Button("F1=Add Image");
	
	private Button exportMenu = new Button("F3=Export");
	
	private Button printMenu = new Button("F5=Print");
	
	private Button exitMenu = new Button("F4=Exit");
	
	private Button searchMenu = new Button("F7=Search");
	
	private Button resetMenu = new Button("F8=Reset Filter");
	
	private Button addToBufferMenu = new Button("F10=Add to Imagebuffer");
	
	private Button showMenu = new Button("F11=Show Imagebuffer");
	
	private Button todayMenu = new Button("F12=Today’s Images");
	
	private ToolBar menuBar = new ToolBar();

	private AddImageController addImageController;


	public MenuBarPane(AddImageController addImageController) {
		
		this.addImageController = addImageController;

		menuBar.getItems().addAll(addImageMenu,exportMenu,printMenu,exitMenu,searchMenu,resetMenu,addToBufferMenu,showMenu,todayMenu);
		
		addImageMenu.setOnAction(e -> addImage());
	}

	private void addImage() {
		FileChooser fileChooser = new FileChooser();
		fileChooser.setTitle("Open Resource File");
		fileChooser.getExtensionFilters().addAll(new FileChooser.ExtensionFilter("Image Files", "*.jpg", "*.png"));
		File selectedFile = fileChooser.showOpenDialog(null);

		if (selectedFile != null) {
			addImageController.addImage(selectedFile);
		}
		
	}

	public Node getNode() {
		return menuBar;
	}
	
	

}
