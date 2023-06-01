package targil7;

public class TotalArea implements TotalAreaVisitor{
    private int totalArea = 0;

    public int getTotalArea() {
        return totalArea;
    }

    @Override
    public void visit(Island island) {
        int area = (int) (Math.PI * Math.pow(island.getLength() / 2,2));
        System.out.println(island.getName() + " area is " + area);
        totalArea += area;
    }

    @Override
    public void visit(Lake lake) {
        int area = (int) (Math.PI * Math.pow(lake.getLength() / 2,2));
        System.out.println(lake.getName() + " area is " + area);
        totalArea += area;
    }

    @Override
    public void visit(Boat boat) {
        double circleRadius = boat.getWidth() /2;
        double semiCircleArea = (Math.PI * Math.pow(circleRadius,2) / 2);
        double rectangleArea = (boat.getWidth() * (boat.getLength() - circleRadius));
        int area = (int) (semiCircleArea + rectangleArea);
        System.out.println(boat.getName() + " area is " + area);
        totalArea += area;
    }

    @Override
    public void visit(Flag flag) {
        int area = (int) (flag.getLength() * flag.getWidth());
        System.out.println(flag.getName() + " area is " + area);
        totalArea += area;
    }

    @Override
    public void visit(Kid kid) {
        double circleRadius = kid.getWidth() /2;
        double circleArea = (Math.PI * Math.pow(circleRadius,2));
        double rectangleArea = (kid.getWidth() * (kid.getLength() - (circleRadius * 2)));
        int area = (int) (circleArea + rectangleArea);
        System.out.println(kid.getName() + " area is " + area);
        totalArea += area;
    }

    @Override
    public void visit(Tree tree) {
        double rectangleWidth = (tree.getWidth() / 2);
        double rectangleArea = (rectangleWidth * (tree.getLength() / 2));
        double triangleArea = ((tree.getWidth() * (tree.getLength() / 2)) / 2);
        int area = (int) (rectangleArea + triangleArea);
        System.out.println(tree.getName() + " area is " + area);
        totalArea += area;
    }

    @Override
    public void visit(Kite kite) {
        int area = (int) (kite.getLength() * kite.getWidth() / 2);
        System.out.println(kite.getName() + " area is " + area);
        totalArea += area;
    }
}
