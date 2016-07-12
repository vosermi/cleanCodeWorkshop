package com.zuehlke.cleancodeworkshop.smellyshapes;


public class Rectangle extends Shape {

    protected Color c = new Color("Blue");
    private final Point point;
    int width;
    int height;

    public Rectangle(Point point, int width, int height) {
        this.point = point;
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public boolean contains(Point point) {
        return this.getX() <= point.getX() && point.getX() <= this.getX() + width && this.getY() <= point.getY() && point.getY() <= this.getY() + height;
    }

    public int calculate() {
        return width * height;
    }

    public int getX() {
        return this.point.getX();
    }

    public int getY() {
        return this.point.getY();
    }

    public String toString() {
        return String.format("Rectangle: (%d,%d) width=%d height=%d color=%s", getX(), getY(), width, height,
                c.getColorAsHex());
    }

    public String toXml() {
        StringBuilder builder = new StringBuilder();

        builder.append("<rectangle");
        builder.append(" x=\"" + this.getX() + "\"");
        builder.append(" y=\"" + this.getY() + "\"");
        builder.append(" width=\"" + this.getWidth() + "\"");
        builder.append(" height=\"" + this.getHeight() + "\"");
        builder.append(" />\n");

        return builder.toString();
    }
}
