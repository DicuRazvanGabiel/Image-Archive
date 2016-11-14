package CenterPane;


import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.event.EventHandler;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.ScrollEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;

public class CenterPane2 {

	private ImageView imageView = new ImageView();
	
    private ScrollPane scrollPane = new ScrollPane();
    
    private BorderPane mainPane = new BorderPane();
    
    final DoubleProperty zoomProperty;
    
    private Button buttonPlus = new Button("+");
    
    private Label buttonPercentLevel = new Label();
    
    private Button buttonMinus = new Button("-");
    
    private FlowPane paneButton = new FlowPane();

	private Image selectedImage;
    
	public CenterPane2(){
		
		zoomProperty = new SimpleDoubleProperty(100);
		
		buttonPercentLevel.setText(String.valueOf(zoomProperty.get())+"%");
		
//		selectedImage = new Image(getClass().getResourceAsStream("/res/1.png"));
//		imageView.setImage(selectedImage);
		imageView.preserveRatioProperty().set(true);
		scrollPane.setContent(imageView);
		
        buttonPlus.setOnAction(e ->zoomIn());
        buttonMinus.setOnAction(e ->zoomOut());
        
        paneButton.getChildren().addAll(buttonMinus,buttonPercentLevel,buttonPlus);
        paneButton.setAlignment(Pos.CENTER);
        
        mainPane.setCenter(scrollPane);
        mainPane.setBottom(paneButton);
    }

	private void zoomIn() {
		zoomProperty.set(zoomProperty.get() + 10);
		buttonPercentLevel.setText(String.valueOf(zoomProperty.get())+"%");
	}

	private void zoomOut() {
		if(zoomProperty.get() - 10 > 0 ){
			zoomProperty.set(zoomProperty.get() - 10);
			buttonPercentLevel.setText(String.valueOf(zoomProperty.get())+"%");
		}
	}

	public Node getNode() {
		return mainPane;
	}

	public void chengeImage(Image selectedImage) {
		imageView.setImage(selectedImage);
		zoomProperty.set(100);
		DoubleProperty initialRatio = new SimpleDoubleProperty();
		initialRatio.bind(scrollPane.widthProperty().multiply(100).divide(selectedImage.widthProperty()));
		imageView.fitWidthProperty().bind(scrollPane.widthProperty().multiply(zoomProperty).divide(initialRatio));
		
		
	}

}