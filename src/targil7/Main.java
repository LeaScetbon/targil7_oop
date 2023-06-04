package targil7;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toMap;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose from the following options:\n" +
                "a: Art\n" +
                "p: Papers");
        String choice = scanner.nextLine();
        if (choice.equals("a")){
            artMenu(scanner);
        }
        if (choice.equals("p")){
            paperMenu(scanner);
        }
    }
    public static Painting readElementDetails(String path) throws IOException {
        Painting painting = new Painting();
        Map<String, Element> files = new HashMap();

        Files.lines(Paths.get(path))
            .map(str -> ElementDetailsFactory.getPaintingElement(str))
            .forEach(e-> painting.addElement(e));
        return painting;
    }
    public static void artMenu(Scanner scanner) throws IOException {
        System.out.println("Enter the path of the painting description");
        String path=scanner.nextLine();
        Painting root= readElementDetails(path);
        System.out.println("Choose from the following options:\n" +
                "q: quit\n" +
                "c: count elements\n" +
                "lp: long print\n" +
                "sh: short print\n" +
                "ta: total area");
        String myString;
        while (!(myString = scanner.nextLine()).equals("q")) {
            switch (myString) {
                case "c":
                    //TODO: Add counting behavior
                    int count = 0;
                    for(Element element : root.elementList){
                        ElementCount countVisitor = new ElementCount();
                        element.accept(countVisitor);
                        count += countVisitor.getElementsCount();
                    }
                    System.out.println(count);
                    break;
                case "sh":
                    //TODO: Add short representation behavior
                    ShortPrint shortPrintVisitor = new ShortPrint();
                    for(Element element : root.elementList){
                        element.accept(shortPrintVisitor);
                    }
                    break;
                case "ta":
                    //TODO: Add area calculation behavior
                    TotalArea totalAreaVisitor = new TotalArea();
                    for (Element element : root.elementList) {
                        element.accept(totalAreaVisitor);
                    }
                    System.out.println(Math.round(totalAreaVisitor.getTotalArea()));
                    break;
                case "lp":
                    //TODO: Add long representation behavior
                    LongPrintVisitor longPrintVisitor = new LongPrint();
                    for (Element element : root.elementList) {
                        element.accept(longPrintVisitor);
                    }
                    System.out.println();
                    break;
            }
        }
    }


    public static void paperMenu(Scanner scanner) {
        System.out.println("Choose from the following paper:\n" +
                "ac: academic paper\n" +
                "cn: contract\n" +
                "jr: journal article\n" +
                "bk: book");
        // TODO: Add a Paper Factory and use it to create a Paper
        String choice = scanner.nextLine();
        PaperFactory paperFactory = new PaperFactory();
        Paper paper = paperFactory.createPaper(choice);
        while (!choice.equals("s")) {
            System.out.println("Choose from the following options:\n" +
                    "a: add element\n" +
                    "s: submit");
            choice = scanner.nextLine();
            if (choice.equals("a")) {
                paper = paperElementMenu(scanner, paper);
            }
            if (choice.equals("s")) {
                System.out.println(paper.write());
            }
        }
    }

    public static Paper paperElementMenu(Scanner scanner, Paper paper) {
        System.out.println("Choose from the following elements:\n" +
                "tb: table\n" +
                "eq: equation\n" +
                "d: diagram\n" +
                "nt: note");
        String choice = scanner.nextLine();
        // TODO: Use a Paper-Element Factory to create a decorated Hamburger
        switch (choice){
            case "tb":
                paper = new TablePaperDeco(paper);
                break;
            case "eq":
                paper = new EquationPaperDeco(paper);
                break;
            case "d":
                paper = new DiagramPaperDeco(paper);
                break;
            case "nt":
                paper = new NotePaperDeco(paper);
                break;
        }
        return paper;
    }
}
