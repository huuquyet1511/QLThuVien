module com.phq.qlthuvien {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;

    opens com.phq.qlthuvien to javafx.fxml;
    exports com.phq.qlthuvien;
}
