package targil7;
// TODO: Implement Composite (change this file).

import java.util.ArrayList;

public class Island extends Element {
    private String name;
    private ArrayList<Element> elements;
    public Island(String name, double diameter, String path) {
        //TODO: fix
        super(diameter,diameter,path);
        this.name = name;
        this.elements = new ArrayList<>();
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

    public void addToIsland(){
        elements.add(this);
    }

}


