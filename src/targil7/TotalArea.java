package targil7;

public class TotalArea implements TotalAreaVisitor{
    private int totalArea = 0;

    public int getTotalArea() {
        return totalArea;
    }

    @Override
    public void visit(Island island) {
        totalArea += (int) Math.PI * Math.pow(island.getLength() / 2,2);
    }

    @Override
    public void visit(Lake lake) {
        totalArea += (int) Math.PI * Math.pow(lake.getLength() / 2,2);
    }

    @Override
    public void visit(Boat boat) {
        int circleRadius = (int) boat.getWidth() /2;
        int semiCircleArea = (int) (Math.PI * Math.pow(circleRadius,2) / 2);
        int rectangleArea = (int) (boat.getWidth() * (boat.getLength() - circleRadius));
        totalArea += (semiCircleArea + rectangleArea);
    }

    @Override
    public void visit(Flag flag) {
        //totalArea += (int) (flag.getLength() * flag.getWidth());
    }

    @Override
    public void visit(Kid kid) {
        int circleRadius = (int) kid.getWidth() /2;
        int circleArea = (int) (Math.PI * Math.pow(circleRadius,2));
        int rectangleArea = (int) (kid.getWidth() * (kid.getLength() - (circleRadius * 2)));
        totalArea += (circleArea + rectangleArea);
    }

    @Override
    public void visit(Tree tree) {
        int rectangleWidth = (int) (tree.getWidth() / 2);
        int rectangleArea = (int) (rectangleWidth * (tree.getLength() / 2));
        int triangleArea = (int) ((tree.getWidth() * (tree.getLength() / 2)) / 2);
        totalArea += (rectangleArea + triangleArea);
    }

    @Override
    public void visit(Kite kite) {
        totalArea += (int) (kite.getLength() * kite.getWidth() / 2);
    }
}
