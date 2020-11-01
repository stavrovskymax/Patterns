package ru.patterns.factory_method;

import ru.patterns.factory_method.dialogs.Dialog;
import ru.patterns.factory_method.dialogs.HtmlDialogImpl;
import ru.patterns.factory_method.dialogs.WindowsDialogImpl;

public class Application {
    public static void main(String[] args) {
        String os = "Windows";
        Dialog dialog;

        if (os.equals("Windows")) {
            dialog = new WindowsDialogImpl();
        } else if (os.equals("Web")) {
            dialog = new HtmlDialogImpl();
        } else {
            throw new IllegalArgumentException("Error! Unknown operating system.");
        }

        dialog.renderWindow();
    }
}
