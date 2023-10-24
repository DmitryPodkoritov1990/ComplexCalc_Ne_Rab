package Presenter;

import Model.ComplexNumber;
import Model.MathOperations;

import javax.swing.text.View;
import java.util.Scanner;

public class Presenter {
    public ComplexNumber calculations(ComplexNumber a, ComplexNumber b, String mathOp) {
        switch (mathOp) {
            case "+":
                return MathOperations.add(a, b);
            case "-":
                return MathOperations.substract(a, b);
            case "*":
                return MathOperations.multiple(a, b);
            case "/":
                return MathOperations.divide(a, b);
            default:
                throw new IllegalArgumentException("Unknown MathOperation ");
        }
    }



    public void StartCalc1() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите вещественную часть числа ");
        double re = scanner.nextDouble();
        System.out.println("Введите мнимую часть числа ");
        double im = scanner.nextDouble();
        ComplexNumber a = new ComplexNumber(re, im);
        ComplexNumber b = new ComplexNumber(0, 0);
//        Presenter pres = new Presenter();
        System.out.println("Выберите действие ");
        System.out.println("1 - Сложение комплексного числа ");
        System.out.println("2 - Вычитание комплексного числа ");
        System.out.println("3 - Умножение комплексного числа ");
        System.out.println("4 - Деление комплексного числа ");
        int swt = scanner.nextInt();
        if (swt == 1){
            System.out.println(MathOperations.add(a,b));
        }
        if(swt ==2){
            System.out.println(MathOperations.substract(a,b));
        }
        if(swt == 3){
            System.out.println(MathOperations.multiple(a,b));
        }
        if(swt == 4){
            System.out.println(MathOperations.divide(a,b));
        }

    }
}

