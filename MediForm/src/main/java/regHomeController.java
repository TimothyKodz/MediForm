import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.event.ActionEvent;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class regHomeController implements Initializable{

    @FXML
    void toRegNewPatient(ActionEvent event) throws IOException {
        Parent regNewPatientParent = FXMLLoader.load(getClass().getResource("regNewPatient.fxml"));
        Scene regNewPatientScene = new Scene(regNewPatientParent);

        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(regNewPatientScene);
        window.show();
    }

    @FXML
    void toEnterId(ActionEvent event) throws IOException {
        Parent enterIDParent = FXMLLoader.load(getClass().getResource("enterID.fxml"));
        Scene enterIDScene = new Scene(enterIDParent);

        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(enterIDScene);
        window.show();
    }

    @FXML
    void logout(ActionEvent event) throws IOException {
        Parent logout = FXMLLoader.load(getClass().getResource("login.fxml"));
        Scene logout1 = new Scene(logout);

        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(logout1);
        window.show();
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
}
