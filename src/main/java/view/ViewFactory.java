package view;

import controller.BaseController;
import controller.MainController;

public class ViewFactory {

    public void showMainWindow() {
        BaseController mainController = new MainController();
    }
}
