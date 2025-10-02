package solidPrinciples.openClosedPrinciple;

public class OCP {
    public static void main(String[] args) {
//        TaxCalculator taxCalculator1 = new TaxCalculator();
//        double tax = taxCalculator1.generateTax(100);
//        System.out.println(tax);

        TaxCalculator taxCalculator = new IndianTaxGenerator();
        double indianTax = taxCalculator.generateTax(100);
        TaxCalculator taxCalculator1 = new USATaxGenerator();
        double usaTax = taxCalculator1.generateTax(100);
        System.out.println(indianTax);
        System.out.println(usaTax);
    }
}

// wrong way
// creating a tax calculator
//class TaxCalculator {
//    public double generateTax(double amount) {
//        return (amount + amount * 0.18);
//    }
//}

// but what if some day we want to generate tax for US or some other country, then we need to change parameters of may
// be generateTax with some region which will cause lot of changes in many classes calling this method.


// better way with ocp
interface TaxCalculator {
    double generateTax(double amount);
}

class IndianTaxGenerator implements TaxCalculator {
    @Override
    public double generateTax(double amount) {
        return (amount + amount * 0.18);
    }
}

class USATaxGenerator implements TaxCalculator {
    @Override
    public double generateTax(double amount) {
        return (amount + amount * 0.28);
    }
}
