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
                    for(Element element : root.elementList){
                        ElementCount countVisitor = new ElementCount();
                        element.accept(countVisitor);
                        int count = countVisitor.getElementsCount();
                        if(count > 1) {
                            System.out.println(count);
                        }
                    }
                    break;
                case "sh":
                    //TODO: Add short representation behavior
                    for(Element element : root.elementList){
                        ShortPrint shortPrintVisitor = new ShortPrint();
                        element.accept(shortPrintVisitor);
                    }
                    break;
                case "ta":
                    //TODO: Add area calculation behavior
                    for(Element element : root.elementList){
                        TotalArea areaVisitor = new TotalArea();
                        element.accept(areaVisitor);
                        System.out.println("The total area of the element " + element.getName() + " is " + areaVisitor.getTotalArea());
                    }
                    break;
                case "lp":
                    //TODO: Add long representation behavior
                    for(Element element : root.elementList){
                        LongPrint longPrintVisitor = new LongPrint();
                        element.accept(longPrintVisitor);
                    }
                    break;
            }
        }
    }


    public static void paperMenu(Scanner scanner){
        System.out.println("Choose from the following paper:\n" +
                "ac: academic paper\n" +
                "cn: contract\n" +
                "pr: journal article\n" +
                "bk: book");
        // TODO: Add a Paper Factory and use it to create a Paper
        Paper paper = null;
        String choice="";
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
   public static Paper paperElementMenu(Scanner scanner, Paper paper){
        System.out.println("Choose from the following elements:\n" +
                "tb: table\n" +
                "eq: equation\n" +
                "d: diagram\n" +
                "nt: note");
        // TODO: Use a Paper-Element Factory to create a decorated Hamburger
        return null;
    }
}
