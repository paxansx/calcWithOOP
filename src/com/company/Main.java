package com.company;

import java.util.Collections;
import java.util.NavigableMap;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {
        Equation ex = new Equation(); // создаем объект ех  класса Equation

        ex.imputExample(); // ввызываем метод по вводу уравнения с консоли. операции по преобразованию и подсчету внутри.

        ex.outputResult(); //выводим результат в томже формате что и вводит пользователь


    }
}

