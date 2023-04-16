package com.phq.qlthuvien;

import java.io.IOException;
import javafx.fxml.FXML;

public class PrimaryController {

    @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot("Main");
    }
    @FXML
    private void switchToSignUp() throws IOException {
        App.setRoot("signup");
    }
}
