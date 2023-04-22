package ru.gb.kamenev;


import ru.gb.kamenev.model.ComplexNumber;

public class Main {
    public static void main(String[] args) {
        ComplexNumber z1 = new ComplexNumber(1, 1, -1);
        System.out.println(z1);
        ComplexNumber z2 = new ComplexNumber(2, 2, 3);
        System.out.println(z2);
        ComplexNumber summ = z1.sum(z2);
        System.out.println(summ);
        ComplexNumber subt = z1.subtraction(z2);
        System.out.println(subt);
        ComplexNumber mult = z1.multiplication(z2);
        System.out.println(mult);
    }
}