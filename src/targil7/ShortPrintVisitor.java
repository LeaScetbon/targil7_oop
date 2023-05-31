package targil7;

public interface ShortPrintVisitor {
    public void visit(Island island);
    public void visit(Lake lake);
    public void visit(Boat boat);
    public void visit(Flag flag);
    public void visit(Kid kid);
    public void visit(Tree tree);
    public void visit(Kite kite);
}
