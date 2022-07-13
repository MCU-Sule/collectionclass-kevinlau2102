package com.collectionclass.pt02_2072030;

import com.collectionclass.pt02_2072030.model.Student;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

public class HelloController {
    @FXML
    private TableView<Student> table;
    @FXML
    private TableColumn<Integer, Student> col1;
    @FXML
    private TableColumn<String, Student> col2;
    @FXML
    private TextField nrpAdd;
    @FXML
    private TextField nama;
    @FXML
    private TextField nrpDel;

    public ObservableList<Student> sList;

    public void initialize() {
        sList = FXCollections.observableArrayList(
                new Student(1, "Juan"),
                new Student(2, "Andi"),
                new Student(3, "Budi"),
                new Student(4, "Kevin"),
                new Student(5, "Michael")
        );
        table.setItems(sList);
        col1.setText("NRP");
        col1.setCellValueFactory(new PropertyValueFactory<>("nrp"));
        col2.setText("Nama");
        col2.setCellValueFactory(new PropertyValueFactory<>("nama"));

    }
    @FXML
    protected void addStudent() {
        int nrp = Integer.parseInt(nrpAdd.getText());
        String sName = nama.getText();
        sList.add(new Student(nrp, sName));
        nrpAdd.setText("");
        nama.setText("");
    }
    @FXML
    protected void delStudent() {
        int nrp = Integer.parseInt(nrpDel.getText());
        for (Student st: sList) {
            if (nrp == st.getNrp()) {
                sList.remove(st);
                break;
            }
        }
        nrpDel.setText("");
    }
}