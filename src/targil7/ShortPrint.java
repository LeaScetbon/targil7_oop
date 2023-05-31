package targil7;

public class ShortPrint implements ShortPrintVisitor{
    @Override
    public void visit(Island island) {
        System.out.println("The name of the element is " + island.getName());
    }

    @Override
    public void visit(Lake lake) {
        System.out.println("The name of the element is " + lake.getName());
    }

    @Override
    public void visit(Boat boat) {
        System.out.println("The name of the element is " + boat.getName());
    }

    @Override
    public void visit(Flag flag) {
        System.out.println("The name of the element is " + flag.getName());
    }

    @Override
    public void visit(Kid kid) {
        System.out.println("The name of the element is " + kid.getName());
    }

    @Override
    public void visit(Tree tree) {
        System.out.println("The name of the element is " + tree.getName());
    }

    @Override
    public void visit(Kite kite) {
        System.out.println("The name of the element is " + kite.getName());
    }
}
