package targil7;

public class EquationPaperDeco extends PaperDecorator{
    public EquationPaperDeco(Paper paper) {
        super(paper);
    }

    @Override
    public String write(){
        return super.write() + decorateWithEquationPaper();
    }

    private String decorateWithEquationPaper() {
        return " Equation";
    }
}
