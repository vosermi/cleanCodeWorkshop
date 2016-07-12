package com.zuehlke.cleancodeworkshop.smellyshapes;

public class Square extends Rectangle {

    public Square(Point point, int edgeLength) {
        super(new Point(point.getX(), point.getY()), edgeLength, edgeLength);
    }

    public Square(Point point, int edgeLength, Color color) {
        super(new Point(point.getX(), point.getY()), edgeLength, edgeLength);
        this.c = color;
    }

    public boolean containsPoint(Point point) {
        return getX() <= point.getX() && point.getX() <= getX() + getWidth() && getY() <= point.getY() && point.getY() <= getY() + getWidth();
    }

    public int getHeight() throws RuntimeException {
        throw new RuntimeException("Square does not have a height, only edgeLength");
    }

    public String toString() {
        return String.format("Square: (%d,%d) edgeLength=%d color=%s",
                getX(), getY(), getWidth(), c.getColorAsHex());
    }

    public boolean contains(Point point1, Point point2) {
        return contains(new Point(point1.getX(), point1.getY())) && contains(new Point(point2.getX(), point2.getY()));
    }

    public String toXml() {
        StringBuilder builder = new StringBuilder();

        builder.append("<square");
        builder.append(" x=\"" + this.getX() + "\"");
        builder.append(" y=\"" + this.getY() + "\"");
        builder.append(" edgeLength=\"" + this.getWidth() + "\"");
        builder.append(" />\n");

        return builder.toString();
    }
}
