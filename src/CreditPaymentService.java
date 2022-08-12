public class CreditPaymentService {
    //interestRate-процентная ставка в месяц, равная годовой ставке, поделённой на 12.
    //credit-общая сумма кредита
    //countPayments-на сколлько лет
    public int calculate(int credit, double interestRate, int countPayments) {
        System.out.print("Сумма кредита: " + credit);
        System.out.print(" Процентная ставка: " + interestRate);
        //рассчет длительности задолжности в месяцах
        int countMonth = countPayments * 12;
        //рассчитаем коэффициент аннуитета
        double procentStavka = (interestRate / 12) / 100;
        double coefficient = procentStavka * Math.pow((1 + procentStavka), countMonth) / (Math.pow((1 + procentStavka), countMonth) - 1);
        int result = (int) (credit * coefficient);
        System.out.println(" Ежемесячный платёж: " + result);
        return result;

    }
}
