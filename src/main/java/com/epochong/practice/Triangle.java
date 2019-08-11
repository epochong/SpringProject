package com.epochong.practice;

/**
 * @author epochong
 * @date 2019/7/25 16:30
 * @email epochong@163.com
 * @blog epochong.github.io
 * @describe
 */
public class Triangle implements Shape {
    private final double a;
    private final double b;
    private final double c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double computeArea() {
        double p = (a + b + c) / 2;
        double s = Math.sqrt((p - a) * (p - b) * (p - c) * p);
        return s;
    }

    public double computeSide() {
        return a + b + c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}';
    }
}
