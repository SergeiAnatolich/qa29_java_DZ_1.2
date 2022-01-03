public class Main {
    public static void main(String[] args) {
        int score = 100; //счет пользователя
        int refill = 100; //пополнение счета
        int multiplicity = 100; //кратность начисления бонусов
        int bonusRate = 1; //бонусная ставка в рублях
        int bonus;
        if (refill > 1000) {
            bonus = refill / multiplicity * bonusRate;
        } else {
            bonus = 0;
        }
        score = score + refill + bonus;
        System.out.println("Ваш баланс: " + score +
                " рублей");
        System.out.println("Ваш бонус: " + bonus + " рублей");
    }
}