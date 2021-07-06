package MaasHesaplayici;

public class Employee {
    private String name;
    public double salary;
    private int workHours, hireYear;

    public Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public double tax(){
        if(this.salary >= 1000){
            return salary*0.3;
        }
        return 0.0;
    }

    public double bonus(){
        int exstraHours = this.workHours - 40;
        if(exstraHours > 0){
            return 30*exstraHours;
        }
        return 0.0;
    }

    public double incrase(){
        int year = 2020 - this.hireYear;
        if(year < 10){
            return salary*0.5;
        }else if(year >= 10 && year < 20){
            return salary * 0.10;
        }else{
            return salary * 0.15;
        }
    }

    public void toString(Employee emp){
        System.out.println("Tax : " + emp.tax());
        System.out.println("Bonus : " + emp.bonus());
        System.out.println("Incrase salary : " + emp.incrase());
        double totalSalary = emp.salary - emp.tax() + emp.bonus();
        System.out.println("Total salary with tax and bonus : " + totalSalary);
        System.out.println("Total salary with the raise of salary : " + (emp.salary + emp.incrase()));
    }
}
