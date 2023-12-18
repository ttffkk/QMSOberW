module de.tk.infoscreen_oberw {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;

    opens de.tk.infoscreen_oberw to javafx.fxml;
    exports de.tk.infoscreen_oberw;
}