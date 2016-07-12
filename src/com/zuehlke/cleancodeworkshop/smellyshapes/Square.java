package com.zuehlke.cleancodeworkshop.smellyshapes;

public class Square extends Rectangle {

    public Square(int x, int y, int edgeLength) {
        super(x, y, edgeLength, edgeLength);
    }

    public Square(int x, int y, int edgeLength, Color color) {
        super(x, y, edgeLength, edgeLength);
        this.c = color;
    }

    public boolean containsPoint(int x, int y) {
        return getX() <= x && x <= getX() + getWidth() && getY() <= y && y <= getY() + getWidth();
    }

    public int getHeight() throws RuntimeException {
        throw new RuntimeException("Square does not have a height, only edgeLength");
    }

    public String toString() {
        return String.format("Square: (%d,%d) edgeLength=%d color=%s",
                getX(), getY(), getWidth(), c.getColorAsHex());
    }

    public boolean contains(int x1, int y1, int x2, int y2) {
        return contains(x1, y1) && contains(x2, y2);
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
