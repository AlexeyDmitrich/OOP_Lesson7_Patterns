package ru.gb.kamenev.controller;

import ru.gb.kamenev.model.ComplexNumber;

public class NumCreator {
    ComplexNumber createComplexNumber (int index, int material, int imaginary){
        return new ComplexNumber(index, material, imaginary);
    }
}