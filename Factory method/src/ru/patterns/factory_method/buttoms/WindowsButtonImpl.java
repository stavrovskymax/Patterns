package ru.patterns.factory_method.buttoms;

public class WindowsButtonImpl implements Button {
    @Override
    public void render() {
        System.out.println("Render Windows button");
    }

    @Override
    public void onClick() {
        System.out.println("Click on Windows button");
    }
}
