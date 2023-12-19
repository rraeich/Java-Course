
public class Employee {

    String name;
    double salary;
    int workHours;
    int hireYear;

    Employee(String name,double salary,int workHours,int hireYear){

        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    double tax(){

        double taxf=0;
        if (this.salary > 1000){
            taxf = (this.salary * 3 / 100);
        }

        return taxf;
    }

    double bonus(){

        int wmoney=0,wh;

        if (this.workHours > 40){
            wh = this.workHours - 40;
            wmoney = wh * 30;
        }

        return wmoney;
    }

    double raiseSalary(){

        double increase=0;

        if (2021 - this.hireYear < 10){
             increase = this.salary * 5 / 100;
        }

        else if (2021 - this.hireYear > 9 && 2021 - this.hireYear < 20){
            increase = this.salary * 10 / 100;
        }

        else if (2021 - this.hireYear > 19){
            increase = this.salary * 15 / 100;
        }

        return increase;
    }

    void infoWorker(){

        double total = this.salary + bonus() + raiseSalary() - tax();

        System.out.println("---------------------------------------");
        System.out.println("Worker's name: " + this.name);
        System.out.println("Salary: " + this.salary + " ₺");
        System.out.println("Weekly working hours: " + this.workHours);
        System.out.println("Hire year: " + this.hireYear);
        System.out.println("Tax: " + tax() + " ₺");
        System.out.println("Bonus: " + bonus() + " ₺");
        System.out.println("Salary increase: "+ raiseSalary() + " ₺");
        System.out.println("Salary with tax and bonus: " + (this.salary + bonus() - tax()) + " ₺");
        System.out.println("Total salary: " + total + " ₺");
        System.out.println("---------------------------------------");
    }
}