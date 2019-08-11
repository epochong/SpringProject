package com.epochong.practice;

/**
 * @author epochong
 * @date 2019/7/25 16:25
 * @email epochong@163.com
 * @blog epochong.github.io
 * @describe
 */
public class Circular implements Shape {
    private final double radius;

    public Circular(double radius) {
        this.radius = radius;
    }

    public double computeArea() {
        return Math.PI * Math.pow(radius,2);
    }

    public double computeSide() {
        return 2 * radius * Math.PI;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public String toString() {
        return "Circular{" +
                "radius=" + radius +
                '}';
    }
}
