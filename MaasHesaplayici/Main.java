package MaasHesaplayici;

public class Main {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        Employee e2 = new Employee("Einstein",2500,55,2000);
        e1.name="Tesla";
        e1.salary=2000;
        e1.hireYear=2010;
        e1.workHours=50;
        e1.infoPrint(e1);
        e2.infoPrint(e2);


    }

}
