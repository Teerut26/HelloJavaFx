package ku.cs.controllers;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import ku.cs.models.Student;
import ku.cs.services.FXRouter;

import java.io.IOException;

public class StudentController {
    @FXML
    Label nameLabel;

    @FXML
    public void initialize() {

        Student student = new Student("", "Teerut");
        showStudent(student);
    }
    private void showStudent(Student student) {
        nameLabel.setText(student.getName());
    }

    @FXML
    protected void onHandleButtonClick() {
        try {
            FXRouter.goTo("hello");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}