package targil7;

public class NotePaperDeco extends PaperDecorator{
    public NotePaperDeco(Paper paper) {
        super(paper);
    }

    @Override
    public String write(){
        return super.write() + decorateWithNotePaper();
    }

    private String decorateWithNotePaper() {
        return " Note";
    }
}
