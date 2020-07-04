package com.greenhand.Start;

public class MathStudy {

    private double x;
    private double y;

    private double floorMod1(double x, double y){
        return x%y;
    }

    private double floorMod2(double x, double y){
        return (x%y+y)%y;
    }

    private void fordouble(){
        for (double index = 0; index != 10; index+=0.1){
            System.out.println(index);
        }
    }

    private double floorMod3(long x, long y){
        return Math.floorMod(x, y);
    }

    public static void main(String[] args) {
        new MathStudy().fordouble();
        System.out.println(Math.sqrt(4));
        System.out.println(Math.sqrt(5.0));
        System.out.println(Math.sqrt(-4.0));

        System.out.println(new MathStudy().floorMod1(4, 3));
        System.out.println(new MathStudy().floorMod1(-4, 3));

        System.out.println(new MathStudy().floorMod2(4, 3));
        System.out.println(new MathStudy().floorMod2(-4, 3));

        System.out.println(new MathStudy().floorMod3(4, 3));
        System.out.println(new MathStudy().floorMod3(-4, 3));

        System.out.println(Math.sin(30));

        int result = 1000000000 * 3;
        System.out.println(result);

        //Math class can throw Exception
        try {
            result = Math.multiplyExact(1000000000, 3);
            System.out.println(result);
        }catch (ArithmeticException arithmeticException){
            arithmeticException.printStackTrace();
        }

        double x = 3.3;
        double y = 3.9;
        long xRes = Math.round(x); //3
        long yRes = Math.round(y); //4
        System.out.println(xRes + " " + yRes);

        int z = 3;
        System.out.println(z += 3.5); //6
        String s;



    }

}
