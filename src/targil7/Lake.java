package targil7;

public class Lake extends Element {
    private String name;
    public Lake(String name, double diameter, String path) {
        //TODO: fix
        super(diameter, diameter, path);
        String lake_name = name;//Comment envoyer name à getName() ?
        //super(0,0,null);
        this.name = name;
    }

    @Override
    public String getName() {
        //TODO: fix
        return this.name;
    }

    @Override
    public Habitat getHabitat() {
        return Habitat.TERRESTRIAL;
    }
}
