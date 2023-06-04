package targil7;
import java.util.Scanner;
public class PaperFactory {
    Scanner scanner = new Scanner(System.in);
    public static Paper createPaper(String code){
        //TODO: fix
        switch(code){
            case "ac":
                return new AcademicPaper();
            case "cn":
                return new Contract();
            case "jr":
                return new JournalArticle();
            case "bk":
                return new Book();
            default:
                throw new RuntimeException("wrong PaperType");
        }

    }
}
