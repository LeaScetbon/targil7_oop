package targil7;

public class TotalArea implements TotalAreaVisitor{
    private double totalArea = 0;

    public double getTotalArea() {
        return totalArea;
    }

    @Override
    public void visit(Island island) {
        totalArea += Math.PI * Math.pow(island.getLength() / 2,2);
    }

    @Override
    public void visit(Lake lake) {
        totalArea += Math.PI * Math.pow(lake.getLength() / 2,2);
    }

    @Override
    public void visit(Boat boat) {
        double circleRadius = boat.getWidth() /2;
        double semiCircleArea = (Math.PI * Math.pow(circleRadius,2) / 2);
        double rectangleArea = (boat.getWidth() * (boat.getLength() - circleRadius));
        totalArea += (semiCircleArea + rectangleArea);
    }

    @Override
    public void visit(Flag flag) {
        totalArea += flag.getLength() * flag.getWidth();
    }

    @Override
    public void visit(Kid kid) {
        double circleRadius = kid.getWidth() /2;
        double circleArea = (Math.PI * Math.pow(circleRadius,2));
        double rectangleArea = (kid.getWidth() * (kid.getLength() - (circleRadius * 2)));
        totalArea += (circleArea + rectangleArea);
    }

    @Override
    public void visit(Tree tree) {
        double rectangleWidth = (tree.getWidth() / 2);
        double rectangleArea = (rectangleWidth * (tree.getLength() / 2));
        double triangleArea = ((tree.getWidth() * (tree.getLength() / 2)) / 2);
        totalArea += (rectangleArea + triangleArea);
    }

    @Override
    public void visit(Kite kite) {
        totalArea += (kite.getLength() * kite.getWidth() / 2);
    }
}
