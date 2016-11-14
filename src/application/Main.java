package application;
	


import BottPane.AddImageController;
import BottPane.BottPane;
import CenterPane.CenterPane;
import CenterPane.CenterPane2;
import LeftPane.LeftPane;
import RightPane.RightPane;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.control.SplitPane;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage; 


public class Main extends Application {
	
	private LeftPane leftPane;
	
	private RightPane rightPane;

	private CenterPane2 center;

	private ImageChangeController imageChangeController;
	
	private AddImageController addImageController;
	
	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	public void start(Stage primaryStage) {
		primaryStage = new Stage();
		primaryStage.setHeight(1024);
		primaryStage.setWidth(1280);
		primaryStage.setTitle("Image Archive");		
		
		Wrapper mainWrapper = new Wrapper(Orientation.VERTICAL,.7);
		
		SplitPane topSplitPane = new SplitPane();
		topSplitPane.setOrientation(Orientation.HORIZONTAL);
		topSplitPane.setDividerPositions(.2,.8);
		topSplitPane.setMinHeight(50);

		leftPane = new LeftPane();
		
		center = new CenterPane2();
		
		rightPane = new RightPane();
	
		
		imageChangeController = new ImageChangeController(center);
		addImageController = new AddImageController();
		BottPane bottPane = new BottPane(imageChangeController,addImageController);
		addImageController.setBottPane(bottPane);
		
		topSplitPane.getItems().addAll(leftPane.getNode(),center.getNode(),rightPane.getNode());
		
		mainWrapper.addNode(topSplitPane, bottPane.getNode());
		
		Scene scene = new Scene (mainWrapper.getNode(),1280,1024);
		scene.getStylesheets().add("application/application.css");
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}
	
	
}
