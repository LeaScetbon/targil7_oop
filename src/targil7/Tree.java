package targil7;

public class Tree extends Element {

    int leavesAmount;

    public Tree(double width, double height, int leavesAmount, String path) {
        super(width, height, path);
        this.leavesAmount = leavesAmount;
    }

    public int getLeavesAmount() {
        return leavesAmount;
    }

    @Override
    public String getName() {
        return "tree";
    }
    @Override
    public Habitat getHabitat() {
        return Habitat.TERRESTRIAL;
    }
}
