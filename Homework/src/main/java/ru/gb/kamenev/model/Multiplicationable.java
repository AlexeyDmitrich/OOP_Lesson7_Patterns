package ru.gb.kamenev.model;

public interface Multiplicationable <T extends Number> extends Calculatable{
    T multiplication (T arg2);
}
