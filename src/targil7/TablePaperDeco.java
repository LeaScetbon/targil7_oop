package targil7;

public class TablePaperDeco extends PaperDecorator{
    public TablePaperDeco(Paper paper) {
        super(paper);
    }

    @Override
    public String write(){
        return super.write() + decorateWithTablePaper();
    }

    private String decorateWithTablePaper() {
        return " Table";
    }
}
