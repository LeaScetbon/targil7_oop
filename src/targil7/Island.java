package targil7;
// TODO: Implement Composite (change this file).

import java.util.ArrayList;

public class Island extends Element {
    private String name;
    private ArrayList<Element> itsElements;

    public Island(String name, double diameter, String path) {
        //TODO: fix
        super(diameter,diameter,path);
        this.name = name;
        itsElements = new ArrayList<>();
    }

    public void addToIsland(){
        itsElements.add(this);
    }

    public ArrayList<Element> getItsElements() {
        return itsElements;
    }

    @Override
    public String getName() {
        //TODO: fix
        return name;
    }

    @Override
    public Habitat getHabitat() {
        return Habitat.AQUATIC;
    }

    @Override
    public void accept(ElementCountVisitor elementCountVisitor) {
        for (Element element : itsElements){
            element.accept(elementCountVisitor);
        }
        elementCountVisitor.visit(this);
    }

    @Override
    public void accept(ShortPrintVisitor shortPrintVisitor) {
        for (Element element : itsElements){
            element.accept(shortPrintVisitor);
        }
        shortPrintVisitor.visit(this);
    }

    @Override
    public void accept(TotalAreaVisitor totalAreaVisitor) {
        for (Element element : itsElements){
            element.accept(totalAreaVisitor);
        }
        totalAreaVisitor.visit(this);
    }

    @Override
    public void accept(LongPrintVisitor longPrintVisitor) {
        longPrintVisitor.visit(this);
        for (Element element : itsElements){
            element.accept(longPrintVisitor);
        }
    }
}


