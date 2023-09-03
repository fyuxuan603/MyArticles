package com.fyx.homework.homework06;

public class LabeledPoint extends Point{
    //特有属性
    private String label;

    public LabeledPoint(double x, double y, String label) {
        super(x, y);
        this.label = label;
    }
}
