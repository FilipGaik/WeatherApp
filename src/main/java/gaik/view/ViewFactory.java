package gaik.view;

import gaik.controller.BaseController;
import gaik.controller.MainWindowController;

public class ViewFactory {

    public void showMainWindow() {
        BaseController controller = new MainWindowController();
    }
}
