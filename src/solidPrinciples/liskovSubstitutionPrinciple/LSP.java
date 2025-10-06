package solidPrinciples.liskovSubstitutionPrinciple;

public class LSP {

    public static void main(String[] args) {
//        Bird sparrow = new Sparrow();
//        sparrow.fly();
//
//        Bird penguin = new Penguin();
//        penguin.fly(); // should not work

        Bird sparrow = new Sparrow();
        sparrow.eat();
        ((Flyable)sparrow).fly(); // substituable

        Bird penguin = new Penguin();
        penguin.eat(); // and no fly method -- so not breaking the correctness of the program
    }
}

//abstract class Bird {
//    public abstract void fly();
//}

//class Sparrow extends Bird {
//    @Override
//    public void fly() {
//        System.out.println("Sparrow flying");
//    }
//}

//class Penguin extends Bird {
//    @Override
//    public void fly() {
//        System.out.println("Penguin can not fly");
//    }
//}


// correct way
interface Flyable {
    void fly();
}


abstract class Bird {
    public abstract void eat();
}


class Sparrow extends Bird implements Flyable {

    @Override
    public void eat() {
        System.out.println("Sparrow eating");
    }

    @Override
    public void fly() {
        System.out.println("Sparrow flying");
    }
}

class Penguin extends Bird {

    @Override
    public void eat() {
        System.out.println("Penguin eating ");
    }
}


