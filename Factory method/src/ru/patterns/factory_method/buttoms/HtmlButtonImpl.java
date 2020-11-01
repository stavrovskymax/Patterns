package ru.patterns.factory_method.buttoms;

public class HtmlButtonImpl implements Button {
    @Override
    public void render() {
        System.out.println("Render Html button");
    }

    @Override
    public void onClick() {
        System.out.println("Click on Html button");
    }
}
