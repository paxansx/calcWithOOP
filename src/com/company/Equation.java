package com.company;

import java.util.Scanner;

public class Equation {
    int n1 = 0, n2 = 0; //переменные для хранения преобразованных значений и операций с ними
    int check1 = 0;// своеобразный флаг для арабских, мне показалось удобнее в даннгом случае чем бул
    int check2 = 0;//тоже самое но для римских
    String num1; //то что вводит пользователь
    String sing;
    String num2;




    void imputExample(){  //ввод пользователем урвнения
        Scanner in = new Scanner(System.in);
        System.out.println("Enter equation for example:3 + 4 or I + V  ");
        num1 = in.next(); // для меня это способ был проще всего. работает с вводом в одну строку. но через пробел.(как и в ТЗ)
        sing = in.next();
        num2 = in.next();
        translationInArabInt();
}
    void translationInArabInt() { // преобразование стрингов в нужные инты, и сразу исключаем значения которые не входят в ТЗ
        String[] arab = new String[]{"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
        String[] rome = new String[]{"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
        try {

            for (int i = 1; i <= 10; i++) {

                if (num1.equals(arab[i-1])) {
                    n1 = i;
                    check1++;
                }
                if (num2.equals(arab[i-1])) {
                    n2 = i;
                    check1++;
                }
                if (num1.equals(rome[i-1])) {
                    n1 = i;
                    check2++;
                }
                if (num2.equals(rome[i-1])) {
                    n2 = i;
                    check2++;
                }
                if(n1>0&&n2>0)break;// прикращаем цикл если заполнили все переменные
            }
            // если чек1 или чек2 будут = 1 то значит пользователь ввел разные виды цифр и выкидываем ошибку
            // если н1 или  н2 ровны нулю значит ввел  некоректные цифры
            if (n1 == 0 || n2 == 0||check1 == 1 || check2 == 1) throw new Exception();
        } catch (Exception e) {
            System.out.print("Error! You enter incorrect number");
            System.exit(1);
        }
    }
    void outputResult(){
        // чеком проверяем какие цифры надо вывести  арабские или римские
        if (check1==2)
            System.out.println(Counting.count(sing,n1,n2));
        if (check2==2)
            System.out.println(IntegerConverter.intToRoman(Counting.count(sing,n1,n2)));
    }
    }

