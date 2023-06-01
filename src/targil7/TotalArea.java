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
        double circleRadius = boat.getWidth() /2;
        double semiCircleArea = (Math.PI * Math.pow(circleRadius,2) / 2);
        double rectangleArea = (boat.getWidth() * (boat.getLength() - circleRadius));
        totalArea += (int) (semiCircleArea + rectangleArea);
    }

    @Override
    public void visit(Flag flag) {
        totalArea += (int) (flag.getLength() * flag.getWidth());
    }

    @Override
    public void visit(Kid kid) {
        double circleRadius = kid.getWidth() /2;
        double circleArea = (Math.PI * Math.pow(circleRadius,2));
        double rectangleArea = (kid.getWidth() * (kid.getLength() - (circleRadius * 2)));
        totalArea += (int) (circleArea + rectangleArea);
    }

    @Override
    public void visit(Tree tree) {
        double rectangleWidth = (tree.getWidth() / 2);
        double rectangleArea = (rectangleWidth * (tree.getLength() / 2));
        double triangleArea = ((tree.getWidth() * (tree.getLength() / 2)) / 2);
        totalArea += (int) (rectangleArea + triangleArea);
    }

    @Override
    public void visit(Kite kite) {
        totalArea += (int) (kite.getLength() * kite.getWidth() / 2);
    }
}
