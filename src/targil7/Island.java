package targil7;
// TODO: Implement Composite (change this file).
 
public class Island extends Element {
    private String name;
    public Island(String name, double diameter, String path) {
        //TODO: fix
        super(0,0,null);
        this.name = name;
    }

    @Override
    public String getName() {
        //TODO: fix
        return this.name;
    }

    @Override
    public Habitat getHabitat() {
        return Habitat.AQUATIC;
    }
}
