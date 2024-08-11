public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;
    double taxAmount = 0.0;
    double bonusAmount = 0.0;
    double raiseAmount = 0.0;
    double initialSalary; // Başlangıç maaşı için yeni bir değişken

    Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
        this.initialSalary = salary; // Başlangıç maaşını sakla
    }

    void tax() {
        if (this.salary > 1000) {
            taxAmount = this.salary * 0.03;
        } else {
            taxAmount = 0.0;
        }
    }

    void bonus() {
        int extraHours = this.workHours - 40;
        if (extraHours > 0) {
            bonusAmount = extraHours * 30;
        } else {
            bonusAmount = 0.0;
        }
    }

    void raiseSalary() {
        int extraYear = 2021 - this.hireYear;
        double yearAmount;
        if (extraYear < 10) {
            yearAmount = 0.05;
        } else if (extraYear >= 10 && extraYear < 20) {
            yearAmount = 0.10;
        } else {
            yearAmount = 0.15;
        }
        raiseAmount = this.salary * yearAmount;
        this.salary += raiseAmount;
    }

    void print() {
        // Vergi ve bonusları başlangıç maaşı üzerinden hesaplayın
        double salaryBeforeTaxAndBonus = this.initialSalary;
        tax();
        bonus();

        // Maaş artışını yap
        double salaryBeforeRaise = this.salary;
        raiseSalary();

        // Vergi ve bonusları hesaplanmış maaş artışına ekliyoruz
        double salaryAfterTaxAndBonus = salaryBeforeRaise + bonusAmount - taxAmount;
        double totalSalary = raiseAmount+salaryAfterTaxAndBonus;

        System.out.println("Adı : " + this.name);
        System.out.println("Maaşı : " + this.initialSalary);
        System.out.println("Çalışma Saati : " + this.workHours);
        System.out.println("Başlangıç Yılı : " + this.hireYear);
        System.out.println("Vergi : " + taxAmount);
        System.out.println("Bonus : " + bonusAmount);
        System.out.println("Maaş Artışı : " + raiseAmount);
        System.out.println("Vergi ve Bonuslar ile birlikte maaş : " + salaryAfterTaxAndBonus);
        System.out.println("Toplam Maaş : " + totalSalary);
    }
    }
