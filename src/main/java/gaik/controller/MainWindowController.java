package gaik.controller;

import gaik.view.ViewFactory;
import javafx.fxml.Initializable;
import java.net.URL;
import java.util.ResourceBundle;

public class MainWindowController extends BaseController implements Initializable {
    public MainWindowController(ViewFactory viewFactory, String fxmlName) {
        super(viewFactory, fxmlName);
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        loadViews();
    }

    private void loadViews() {
    }
}
