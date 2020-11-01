package ru.patterns.factory_method.dialogs;

import ru.patterns.factory_method.buttoms.Button;
import ru.patterns.factory_method.buttoms.WindowsButtonImpl;

public class WindowsDialogImpl extends Dialog {
    @Override
    public Button createButton() {
        return new WindowsButtonImpl();
    }
}
