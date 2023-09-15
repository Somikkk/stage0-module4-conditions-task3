package school.mjc.stage0.conditions.task3;

public class Divider {
    public void isDividableBy5And11(int number) {
        if(number == 0) {
            System.out.println("cannot divide by zero");
            return;
        }
        if(number % 5 == 0 && number % 11 == 0) {
            System.out.println("Dividable");
        } else {
            System.out.println("Non-dividable");
        }
    }

    public static void main(String[] args) {
        new Divider().isDividableBy5And11(0);
    }
}
