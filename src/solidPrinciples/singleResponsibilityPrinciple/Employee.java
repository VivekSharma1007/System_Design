package solidPrinciples.singleResponsibilityPrinciple;

public class Employee {
    public int id;
    public String name;
    public String designation;

}

// class is only responsible for one purpose, job, responsibility
class SalaryCalculator {
    public int salaryGenerator(Employee emp) {
        System.out.println("generate");
        return 1000;
    }
}

class ReportGenerator {
    public String generateReport() {
        return "report generate";
    }
}
