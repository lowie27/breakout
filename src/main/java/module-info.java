module be.inf1.breakout {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;
    requires javafx.media;
    opens be.inf1.breakout to javafx.fxml;
    exports be.inf1.breakout;
}
