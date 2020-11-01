package ru.patterns.factory_method.dialogs;

import ru.patterns.factory_method.buttoms.Button;
import ru.patterns.factory_method.buttoms.HtmlButtonImpl;

public class HtmlDialogImpl extends Dialog {
    @Override
    public Button createButton() {
        return new HtmlButtonImpl();
    }
}
