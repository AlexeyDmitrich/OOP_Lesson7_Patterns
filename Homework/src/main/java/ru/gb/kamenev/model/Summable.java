package ru.gb.kamenev.model;

public interface Summable <T extends Number> extends Calculatable {
    T sum (T arg2);
}
