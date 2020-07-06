package com.greenhand.classstudy;

public class ConstructInit {

    //first init
    public int init = 1;

    //second init
    {
        init = 2;
    }

    //third init
    ConstructInit(){
        init = 3;
    }

    public static void main(String[] args) {
        ConstructInit constructInit = new ConstructInit();
        System.out.println(constructInit.init);
        ConstructInit1 constructInit1 = new ConstructInit1();
        System.out.println(constructInit1.init);
        ConstructInit2 constructInit2 = new ConstructInit2();
        System.out.println(constructInit2.init);
        ConstructInit3 constructInit3 = new ConstructInit3();
        System.out.println(constructInit3.init);
        ConstructInit4 constructInit4 = new ConstructInit4();
        System.out.println(constructInit4.init);
//        System.out.println(ConstructInit5.staticInit);//only run static init
        new ConstructInit5();
        System.out.println(ConstructInit5.staticInit);

    }

}

class ConstructInit1 {

    //first init
    {
        init = 4;
    }

    //second init
    public int init = 3;

}

class ConstructInit2{
    int init = 5;

    {
        //Method internal variable
        int init = 6;
    }
}

class ConstructInit3{
    //first init
    int init;

    //third init
    ConstructInit3(){
        init = 8;
    }

    //second init
    {
        init = 7;
    }
}

class ConstructInit4{
    //first init
    int init;

    //third init
    ConstructInit4(){
        this(9);
        init = 10;
    }

    ConstructInit4(int num){
        init = num;
    }

    //second init
    {
        init = 11;
    }

}

class ConstructInit5{
    //first init
    int init;
    static int staticInit;

    //third init
    {
        init = 11;
    }

    //second init
    static {
        staticInit = 5;
    }

}
