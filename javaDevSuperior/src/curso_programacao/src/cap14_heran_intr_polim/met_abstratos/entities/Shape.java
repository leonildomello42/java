package cap14_heran_intr_polim.met_abstratos.entities;

import cap14_heran_intr_polim.met_abstratos.entities.enums.Color;

public abstract class Shape {

    private Color color;

    public Shape() {
    }

    public Shape(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public abstract double area();
}
