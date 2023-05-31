package targil7;

public class ElementCount  implements ElementCountVisitor{
    private int elementsCount = 0;

    public int getElementsCount(){
        return elementsCount;
    }
    @Override
    public void visit(Island island) {
        elementsCount += 1;
    }

    @Override
    public void visit(Lake lake) {
        elementsCount += 1;
    }

    @Override
    public void visit(Boat boat) {
        elementsCount += 1;
    }

    @Override
    public void visit(Flag flag) {
        elementsCount += 1;
    }

    @Override
    public void visit(Kid kid) {
        elementsCount += 1;
    }

    @Override
    public void visit(Tree tree) {
        elementsCount += 1;
    }

    @Override
    public void visit(Kite kite) {
        elementsCount += 1;
    }
}
