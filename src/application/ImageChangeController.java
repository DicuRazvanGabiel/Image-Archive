package application;

import CenterPane.CenterPane2;
import javafx.scene.image.Image;

public class ImageChangeController {

	private CenterPane2 centerPane;
	
	

	public ImageChangeController(CenterPane2 centerPane) {
		this.centerPane = centerPane;
	}



	public void changeImage(Image selectedImage) {
		centerPane.chengeImage(selectedImage);
		
	}

}
