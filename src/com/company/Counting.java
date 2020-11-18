package com.company;

public class Counting {// не очень уверен что нужен отдельный класс для операции. хотелось бы совет
    public static int count( String sing, int n1, int n2) {
        int result=0;
        try {
            switch (sing) {
                case "+":
                    result = n1 + n2;
                    break;
                case "-":
                    result = n1 - n2;
                    break;
                case "*":
                    result = n1 * n2;
                    break;
                case "/":
                    result = n1 / n2;
                    break;
                default: throw new Exception();

            }
        } catch(Exception e){
        System.out.print("Error! You enter incorrect operation sing ");
        System.exit(1);
        }
        return  result;
    }
}
