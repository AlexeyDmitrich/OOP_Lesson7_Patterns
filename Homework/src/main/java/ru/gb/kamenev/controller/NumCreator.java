package main.java.ru.gb.kamenev.controller;


import main.java.ru.gb.kamenev.model.ComplexNumber;

public class NumCreator {
    ComplexNumber createComplexNumber (int index, int material, int imaginary){
        return new ComplexNumber(index, material, imaginary);
    }
}
