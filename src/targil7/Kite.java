package targil7;

import targil7.Color;

public class Kite extends Element {
    Color color;

    public Kite(double width, double height, Color color, String path) {
        super(width, height, path);
        this.color = color;
    }

    public Color getColor() {
        return color;
    }
    public void setColor(Color color) {
        this.color = color;
    }
	
    @Override
    public String getName() {
        return "kite";
    }

    @Override
    public Habitat getHabitat() {
        return Habitat.TERRESTRIAL;
    }

    @Override
    public void accept(ElementCountVisitor elementCountVisitor) {
        elementCountVisitor.visit(this);
    }

    @Override
    public void accept(ShortPrintVisitor shortPrintVisitor) {
        shortPrintVisitor.visit(this);
    }

    @Override
    public void accept(TotalAreaVisitor totalAreaVisitor) {
        totalAreaVisitor.visit(this);
    }

    @Override
    public void accept(LongPrintVisitor longPrintVisitor) {
        longPrintVisitor.visit(this);
    }
}
