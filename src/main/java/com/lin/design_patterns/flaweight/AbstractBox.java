package com.lin.design_patterns.flaweight;

public abstract class AbstractBox {
    public abstract String getShape();

    public void display(String color) {
        System.out.println("方块形状:" + getShape() + "，颜色:" + color);
    }
}
