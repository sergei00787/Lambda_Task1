package calculator;

public class Main {

    public static void main(String[] args) {

        Calculator calc = Calculator.instance.get();

        Integer plus = (Integer) calc.plus.apply( 1, 2);
        int minus = calc.minus.apply(1, 1);
        int mult = calc.multiply.apply(plus, minus);

        // Ошибка деления на ноль.
        int div = (int) calc.devide.apply(plus, 0);

        int aPow = calc.pow.apply(10);
        int aAbs = calc.abs.apply(-20);

        boolean isPositive = calc.isPositive.test(-5);

        calc.printlnString.accept("Test command plus: 1 + 2 = ");
        calc.println.accept(plus);

        calc.printlnString.accept("Test command minus: 1 - 1 = ");
        calc.println.accept(minus);

        calc.printlnString.accept("Test command multiply: 1 * 0 = ");
        calc.println.accept(mult);

        calc.printlnString.accept("Test command divide: 1 / 0 = ");
        calc.println.accept(div);

        calc.printlnString.accept("Test command pow: 10 * 10 = ");
        calc.println.accept(aPow);

        calc.printlnString.accept("Test command abs: abs(-20) = ");
        calc.println.accept(aAbs);

        calc.printlnString.accept("Test command isPositive: isPositive(-5) return ");
        calc.printlnString.accept(String.valueOf(isPositive));

    }
}
