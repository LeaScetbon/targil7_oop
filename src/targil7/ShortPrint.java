package targil7;
public class ShortPrint implements ShortPrintVisitor {



    @Override
    public void visit(Island island) {
        if(!island.getPath().isEmpty()){
            System.out.print( island.getPath() + '/');
        }
        System.out.println( island.getName());
    }

    @Override
    public void visit(Lake lake) {
        if(!lake.getPath().isEmpty()){
            System.out.print( lake.getPath() + '/');
        }
        System.out.println(lake.getName());
    }

    @Override
    public void visit(Boat boat) {
        System.out.println( boat.getPath() + '/' + boat.getName());
    }

    @Override
    public void visit(Flag flag) {
        System.out.println(flag.getPath() + '/' + flag.getName());
    }

    @Override
    public void visit(Kid kid) {
        System.out.println(kid.getPath() + '/' + kid.getName());
    }

    @Override
    public void visit(Tree tree) {
        System.out.println(tree.getPath() + '/' + tree.getName());
    }

    @Override
    public void visit(Kite kite) {
        System.out.println(kite.getPath() + '/' + kite.getName());
    }


}