package LeftPane;

import java.nio.charset.MalformedInputException;

import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;

public class SearchField {

	Label lbDiscipline;

	private GridPane searchFieldPane;

	private Label lbStudyID;

	private Label lbAnimalNo;

	private ComboBox<String> coDiscipline;

	private ComboBox<String> coStudyID;

	private ComboBox<String> coAnimalNo;
	
	private ScrollPane scrollPane = new ScrollPane();
	
	private Label titleLabel = new Label("Search Field");
	
	private VBox mainPane = new VBox();

	public SearchField() {
		searchFieldPane = new GridPane();
		searchFieldPane.setPadding(new Insets(10, 10, 10, 10));
		searchFieldPane.setVgap(10);
		searchFieldPane.setHgap(10);
		
		titleLabel.getStyleClass().add("bordered-titled-title");
		//searchFieldPane.getChildren().add(titleLabel);
		//scrollPane.getStyleClass().add("bordered-titled-border");

		initLabel();

		initComboBox();
		
		mainPane.getChildren().addAll(titleLabel,scrollPane);
		mainPane.getStyleClass().add("bordered-titled-border");
	}

	private void initComboBox() {
		coDiscipline = new ComboBox();
		GridPane.setConstraints(coDiscipline, 1, 0);
		coDiscipline.getItems().addAll("Item 1", "Item 2");
		coDiscipline.setPromptText("Select");

		coStudyID = new ComboBox();
		GridPane.setConstraints(coStudyID, 1, 1);
		coStudyID.getItems().addAll("Item 1", "Item 2");
		coStudyID.setPromptText("Select");

		coAnimalNo = new ComboBox();
		GridPane.setConstraints(coAnimalNo, 1, 2);
		coAnimalNo.getItems().addAll("Item 1", "Item 2");
		coAnimalNo.setPromptText("Select");
		

		searchFieldPane.getChildren().addAll(coDiscipline, coStudyID, coAnimalNo);
		scrollPane.setContent(searchFieldPane);
		searchFieldPane.getStyleClass().add("bordered-titled-content");
	}

	private void initLabel() {
		lbDiscipline = new Label("01 Discipline");
		GridPane.setConstraints(lbDiscipline, 0, 0);
		lbStudyID = new Label("02 Study ID");
		GridPane.setConstraints(lbStudyID, 0, 1);
		lbAnimalNo = new Label("03 Animal No");
		GridPane.setConstraints(lbAnimalNo, 0, 2);

		searchFieldPane.getChildren().addAll(lbDiscipline, lbStudyID, lbAnimalNo);
	}

	public Node getNode() {
		return mainPane;
	}
}
