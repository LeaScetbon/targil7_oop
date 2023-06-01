package targil7;

import java.util.Locale;

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
        if (lake.getItsElements().isEmpty()) {
            System.out.print("An empty island named " + lake.getName() + ". ");
        } else {
            System.out.print("A lake named " + lake.getName() + " containing: ");
        }
    }


    @Override
    public void visit(Boat boat) {
        System.out.print("A boat made of " + boat.getMaterial().toString().toLowerCase() + " material. ");
    }

    @Override
    public void visit(Flag flag) {
        System.out.print("A " + flag.getColor().toString().toLowerCase() + " flag high of " + flag.getCarrierHeight() + ". ");
    }

    @Override
    public void visit(Kid kid) {
        System.out.print("A " + kid.getAge()+ " year old kid with " + kid.getHairColor().toString().toLowerCase() + " hair. ");
    }

    @Override
    public void visit(Tree tree) {
        System.out.print("A tree with an amount of " + tree.getLeavesAmount() + " leaves. ");
    }

    @Override
    public void visit(Kite kite) {
        System.out.print("A kite of color: " + kite.getColor().toString().toLowerCase() + ". ");
    }
}
