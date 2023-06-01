package targil7;

public class LongPrint implements LongPrintVisitor{
    @Override
    public void visit(Island island) {
        if (island.getItsElements().isEmpty()) {
            System.out.print("An empty island named " + island.getName() + ". ");
        } else {
            System.out.print("An island named " + island.getName() + " containing: ");
        }
    }

    @Override
    public void visit(Lake lake) {
        System.out.print("A lake named " + lake.getName() + " containing: ");
    }


    @Override
    public void visit(Boat boat) {
        System.out.print("A boat made of " + boat.getMaterial() + " material. ");
    }

    @Override
    public void visit(Flag flag) {
       // System.out.print("A " + flag.getColor() + " flag high of " + flag.getCarrierHeight() + " ");
    }

    @Override
    public void visit(Kid kid) {
        System.out.print("A " + kid.getAge()+ " year old kid with " + kid.getHairColor() + " hair. ");
    }

    @Override
    public void visit(Tree tree) {
        System.out.print("A tree with an amount of " + tree.getLeavesAmount() + " leaves. ");
    }

    @Override
    public void visit(Kite kite) {
        System.out.print("A kite of color: " + kite.getColor() + ". ");
    }
}
