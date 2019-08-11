package com.epochong.practice;

/**
 * @author epochong
 * @date 2019/7/25 16:33
 * @email epochong@163.com
 * @blog epochong.github.io
 * @describe
 */
public class XmlShapeCompute {
    private Shape circular;
    private Shape rectangle;
    private Shape triangle;
    public Shape compute(String shapeName) {
        if (shapeName == null || shapeName.length() == 0) {
            throw new IllegalArgumentException("Not found " + shapeName);
        }if (shapeName.equals("circular")) {
            return circular;
        }
        if (shapeName.equals("rectangle")) {
            return rectangle;
        }if (shapeName.equals("triangle")) {
            return triangle;
        }throw new IllegalArgumentException("Not found " + shapeName);
    }
    public void setTriangle(Shape triangle) {
        this.triangle = triangle;
    }
    public void setRectangle(Shape rectangle) {
        this.rectangle = rectangle;
    }
    public void setCircular(Shape circular) {
        this.circular = circular;
    }
}
