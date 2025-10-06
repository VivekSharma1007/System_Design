package solidPrinciples.interfaceSegregationPrinciple;

public class ISP {
    public static void main(String[] args) {
        Printer printer = new BasicPrinter();
        printer.print();

        AllInOnePrinter allPrinter = new AllInOnePrinter();
        allPrinter.print();
        allPrinter.scan();
    }
}


// wrong way
//interface Printer {
//    void print();
//    void scan();
//}
//
//class BasicPrinter implements Printer {
//
//    @Override
//    public void print() {
//        System.out.println("Basic printer printing");
//    }
//
//    @Override
//    public void scan() {
//        System.out.println("Can not scan"); // wrong way
//    }
//}


// Good way
interface Printer {
    void print();
}

interface Scanner {
    void scan();
}

class BasicPrinter implements Printer {

    @Override
    public void print() {
        System.out.println("Basic printer printing");
    }
}

class AllInOnePrinter implements Printer, Scanner {

    @Override
    public void print() {
        System.out.println("All in one Printer printing");
    }

    @Override
    public void scan() {
        System.out.println("All in one printer scanning");
    }
}