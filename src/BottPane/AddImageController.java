package BottPane;

import java.io.File;

public class AddImageController {

	private BottPane bottPane;

	public AddImageController() {
		
	}

	public void addImage(File selectedFile) {
		bottPane.addImage(selectedFile);
		
	}

	public void setBottPane(BottPane bottPane) {
		this.bottPane = bottPane;
		
	}

}
