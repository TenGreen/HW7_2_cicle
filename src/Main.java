public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int salary = 15000;
        int total = 0;
        int i = 1;
        while (total < 2_459_000) {
            total = total + total / 100;
            total = total + salary;
            i++;
            System.out.print("Месяц " + i);
            System.out.println(", сумма накоплений равна" + total);
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        int i = 0;
        while (i < 10) {
            i++;
            System.out.print(i + " ");
        }
        System.out.println();
        for (; i > 0; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void task3() {
        System.out.println("Задача 3");
        int totalPopulation = 12_000_000;
        int birthRate = 17;
        int mortality = 8;
        int year = 1;
        while (year < 10) {
            totalPopulation = totalPopulation + ((totalPopulation / 1000) * (birthRate - mortality));
            System.out.println("Год " + year + ", численность населения составляет " + totalPopulation);
            year++;
        }

    }

    public static void task4() {
        System.out.println("Задача 4");
        double salary = 15_000.0d;
        int i = 0;
        double total = 0;
        do {
            i++;
            total = total + (total / 100) * 7;
            total = (total + salary);
            System.out.println("Месяц " + i + " , сумма накоплений " + total);
        }
        while (total < 12_000_000.0d);

    }

    public static void task5() {
        System.out.println("Задача 5");
        double salary = 15_000.0d;
        int i = 0;
        double total = 0;
        do {
            i++;
            total = total + (total / 100) * 7;
            total = (total + salary);
            if (i % 6 == 0) {
                System.out.println("Месяц " + i + " , сумма накоплений " + total);
            }
        }
        while (total < 12_000_000.0d);
    }

    public static void task6() {
        System.out.println("Задача 6");
        double salary = 15_000.0d;
        double total = 0;
        int i = 0;
        do {
            i++;
            total = total + (total / 100) * 7;
            total = (total + salary);
            if (i % 6 == 0) {
                System.out.println("Месяц " + i + ", сумма накоплений " + total);
            }
        }
        while (i != 12 * 9);
    }

    public static void task7() {
        System.out.println("Задача 7");
        int dateOfTheWeeklyReport = 3;
        int day = dateOfTheWeeklyReport;
        while ((day <= 31)) {
            System.out.println("Сегодня пятница, " + day + "-е число. Необходимо подготовить отчет");
            day = day + 7;
        }
    }

    public static void task8() {
        System.out.println("Задача 8");
        int flightPeriod = 79;
        int beginOfThePeriod = 2023 - 200;
        int endOfThePeriod = 2023 + 100;
        int year = (beginOfThePeriod + (79 - beginOfThePeriod % flightPeriod));
        while (year <= endOfThePeriod) {
            System.out.println(year);
            year = year + flightPeriod;
        }
    }
}
