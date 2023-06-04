package targil7;

public class DiagramPaperDeco extends PaperDecorator{
    public DiagramPaperDeco(Paper paper) {
        super(paper);
    }

    @Override
    public String write(){
        return super.write() + decorateWithDiagramPaper();
    }

    private String decorateWithDiagramPaper() {
        return " Diagram";
    }
}
