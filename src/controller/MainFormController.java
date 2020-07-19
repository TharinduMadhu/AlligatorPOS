package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class MainFormController {
    public AnchorPane root;

    public void btnAddCustomer_OnAction(ActionEvent actionEvent) throws IOException {
        Scene customerForm = new Scene(FXMLLoader.load(getClass().getResource("/view/ManageCustomer.fxml")));
        Stage primaryStage = (Stage) (root.getScene().getWindow());
        primaryStage.setScene(customerForm);
        primaryStage.centerOnScreen();
        primaryStage.show();
    }

    public void btnPlaceOrder_OnAction(ActionEvent actionEvent) throws IOException {
        Scene placeOrderForm = new Scene(FXMLLoader.load(getClass().getResource("/view/placeOrder.fxml")));
        Stage primaryStage = (Stage) (root.getScene().getWindow());
        primaryStage.setScene(placeOrderForm);
        primaryStage.centerOnScreen();
        primaryStage.show();
    }

    public void btnAddItem_OnAction(ActionEvent actionEvent) throws IOException {
        /*
        To do:
        Create and add ManageItemForm.fxml
         */

//        Scene addItemForm = new Scene(FXMLLoader.load(getClass().getResource("/view/")));
//        Stage primaryStage = (Stage) (root.getScene().getWindow());
//        primaryStage.setScene(addItemForm);
//        primaryStage.centerOnScreen();
//        primaryStage.show();
    }

    public void btnSearchOrder_OnAction(ActionEvent actionEvent) throws IOException {
        /*
        To do:
        Create and add SearchOrderForm.fxml
         */

//        Scene searchOrderForm = new Scene(FXMLLoader.load(getClass().getResource("/view/")));
//        Stage primaryStage = (Stage) (root.getScene().getWindow());
//        primaryStage.setScene(searchOrderForm);
//        primaryStage.centerOnScreen();
//        primaryStage.show();
    }
}
