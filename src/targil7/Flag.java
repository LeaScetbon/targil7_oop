package targil7;

import targil7.Color;

public class Flag extends Element {

    Color color;
    int carrierHeight;

    public Flag(double width, double length, Color color, int carrierHeight, String path) {
        super(width, length, path);
        this.color = color;
        this.carrierHeight = carrierHeight;
    }
 
    public Color getColor() {
        return color;
    }
    public int getCarrierHeight() {
        return carrierHeight;
    }

    @Override
    public String getName() {
        return Flag.class.getSimpleName().toLowerCase();
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
