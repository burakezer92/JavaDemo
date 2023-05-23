package MaasHesaplayici;

public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;

    Employee(String name,int salary,int workHours,int hireYear){
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }
    Employee(){

    }


    double tax(){
        if(this.salary<=1000&&this.salary>0){
            System.out.println("1000$ maaş'a kadar vergi alınmaz.");
            return this.salary;
        } else if (this.salary>1000) {
            System.out.println(this.salary + " maaşınızdan " + this.salary*0.03 +" vergi alınmıştır.");
            this.salary = this.salary-this.salary*0.03;
            return this.salary;
        }
        System.out.println("Geçersiz tutarda maaş girilmiştir.");
        return 0;
    }

    double bonus(){
        if(this.workHours>40){
            this.salary += (this.workHours-40)*30;
            System.out.println(this.workHours + " saat çalışma saatinden: " + (this.workHours-40)*30 + "$ Bonus kazanılmıştır.");
            return this.salary;
        } else if (0<this.workHours&&this.workHours<=40) {
            System.out.println("Çalışma saati : " + this.workHours + " Bonus kazanılmamıştır.");
            return this.salary;
        }
        System.out.println("Geçersiz çalışma saati girildi.");
        return 0;
    }
    
    double raiseSalary(){
        if (0<2021-this.hireYear&&2021-this.hireYear<10){
            return this.salary = this.salary*1.05;
        } else if (2021-this.hireYear<15) {
            return this.salary = this.salary*1.10;
        } else if (2021-this.hireYear>20) {
            return this.salary = this.salary*1.15;
        }
        System.out.println("Çalışma yılı geçersiz girildi.");
        return 0;
    }
    void infoPrint(Employee e1){
        e1.tax();
        System.out.println(e1.name +" isimli çalışlanın vergiden sonra maaşı " + e1.salary + " olmuştur.");
        e1.bonus();
        System.out.println(e1.name +" isimli çalışlanın bonus dahil maaşı " + e1.salary + " olmuştur.");
        e1.raiseSalary();
        System.out.println(e1.name +" isimli çalışlanın tecrübe bonusu dahil maaşı " + e1.salary + " olmuştur.");
        System.out.println();
        System.out.println("*******************************************************");
        System.out.println();

    }




}
