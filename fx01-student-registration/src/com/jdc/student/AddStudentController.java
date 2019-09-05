package com.jdc.student;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

public class AddStudentController implements Initializable{
	
	@FXML
	private TextField txtName;
	@FXML
	private TextField txtPhone;
	@FXML
	private TextField txtAddress;
	@FXML
	private ComboBox<Courses> cbxCourse;
	@FXML
	private ComboBox<Integer> cbxDuration;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		cbxCourse.getItems().addAll(Courses.values());
		cbxDuration.getItems().addAll(3,4,5);
	}
	
	public void addNew() {
		Student s = new Student();
		s.setName(txtName.getText());
		s.setAddress(txtAddress.getText());
		s.setPhone(txtPhone.getText());
		s.setCourse(cbxCourse.getValue());
		s.setDuration(cbxDuration.getValue());
		
		System.out.println(s);
	}
	
	public void cancel() {
//		txtName.getScene().getWindow().hide();
		Platform.exit();
	}
}
