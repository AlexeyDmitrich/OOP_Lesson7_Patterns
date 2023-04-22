package main.java.ru.gb.kamenev.model;

public interface Subtractionable <T extends Number> extends Calculatable {
    T subtraction(T arg2);
}
