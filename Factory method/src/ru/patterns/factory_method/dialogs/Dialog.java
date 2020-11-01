package ru.patterns.factory_method.dialogs;

import ru.patterns.factory_method.buttoms.Button;

public abstract class Dialog {

    public void renderWindow() {
        Button button = createButton();
        button.render();
        button.onClick();
    }

    public abstract Button createButton();
}
