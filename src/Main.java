public class Main {
    public static void main(String[] args) {
        int score = 100; //счет пользователя
        int refill = 1100; //пополнение счета
        int multiplicity = 100; //кратность начисления бонусов
        int bonusRate = 1; //бонусная ставка в рублях
        int bonus;
        if (refill > 100) {
            score = score + refill + refill / multiplicity;
            bonus = refill / multiplicity;
        } else {
            score = score + refill;
            bonus = 0;
        }
        System.out.println("Ваш баланс: " + score +
                " рублей");
        System.out.println("Ваш бонус: " + bonus + " рублей");
    }
}