import java.util.Scanner;

public class Main {
    //Минимальный доход компании
    private static int minIncome = 200000;
    //Максимальный доход компании
    private static int maxIncome = 900000;
    //Плата за аренду офиса
    private static int officeRentCharge = 140000;
    //Плата за телефон
    private static int telephonyCharge = 12000;
    //Плата за Интернет
    private static int internetAccessCharge = 7200;
    //Зарплата помощника
    private static int assistantSalary = 45000;
    //Зарплата финансового менеджера
    private static int financeManagerSalary = 90000;
    //Нологовый процент
    private static double mainTaxPercent = 0.24;
    //Процент менеджерам
    private static double managerPercent = 0.15;
    //Минимальная сумма инвестиций
    private static double minInvestmentsAmount = 100000;

    //Запуск программы
    public static void main(String[] args) {

        //==============================================================================================================
        //Расчет суммы при минимальных инвестициях - 100 000 руб
        int fixedCharges = officeRentCharge + telephonyCharge + internetAccessCharge + assistantSalary + financeManagerSalary;
        double x = ((minInvestmentsAmount + fixedCharges - fixedCharges * mainTaxPercent) /
                (1 - managerPercent - mainTaxPercent + (managerPercent * mainTaxPercent)));
        System.out.println("Минимальная сумма, чтобы компания могла инвестировать - " + x + " руб.");
        //==============================================================================================================

        //Запуск цикла while
        while (true) {
            //Программа просит ввести сумму доходов
            System.out.println("Введите сумму доходов компании за месяц " +
                    "(от 200 до 900 тысяч рублей): ");
            //Запускается сканер для считывания веденного ткста
            int income = (new Scanner(System.in)).nextInt();
            //Проверяется условие минимального и максимального дохода, продолжать выполнять пока не попадет в границу min-max
            if (!checkIncomeRange(income)) {
                continue;
            }
            //Вычисляется зарплата менеджера в зависимости от дохода и процента
            double managerSalary = income * managerPercent;
            //Вычисляется чистый доход: Доход - зарплата менеджера - комунальные платежи
            double pureIncome = income - managerSalary -
                    calculateFixedCharges();
            //Вычисляется сумма налога в зависимости от чистого дохода и процента налога
            double taxAmount = mainTaxPercent * pureIncome;
            //Вычисляется чистый доход после уплаты налогов
            double pureIncomeAfterTax = pureIncome - taxAmount;
            //Проверяется условия при котором можно делать инвестиции: чистый доход после уплаты налогов должен быть больше или равне минимальной сумме инвестиций
            boolean canMakeInvestments = pureIncomeAfterTax >=
                    minInvestmentsAmount;
            //Выводится зарплата менеджера
            System.out.println("Зарплата менеджера: " + managerSalary);
            //Выводится общая сумма налогов
            System.out.println("Общая сумма налогов: " +
                    (taxAmount > 0 ? taxAmount : 0));
            //Вывод может ли компния инвестировать
            System.out.println("Компания может инвестировать: " +
                    (canMakeInvestments ? "да" : "нет"));
            //Если чистый доход меньше нуля
            if (pureIncome < 0) {
                System.out.println("Бюджет в минусе! Нужно срочно зарабатывать!");
            }
        }
    }

    //Вывод текста если доход меньше нижней грацницы
    private static boolean checkIncomeRange(int income) {
        if (income < minIncome) {
            System.out.println("Доход меньше нижней границы");
            //Возвращает falce
            return false;
        }
        //Вывод текста если доход выше верхней грацницы
        if (income > maxIncome) {
            System.out.println("Доход выше верхней границы");
            //Возвращает falce
            return false;
        }
        //Возвращает true если входит в границу min - max
        return true;
    }

    //Калькулятор вычисляет все комунальные платежи
    private static int calculateFixedCharges() {
        return officeRentCharge +
                telephonyCharge +
                internetAccessCharge +
                assistantSalary +
                financeManagerSalary;
    }
}
