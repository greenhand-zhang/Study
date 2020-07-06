package com.greenhand.classstudy;

public class ConstructStaticInit {

    //first init
    public static int init = 1;

    //second init
    static {
       init = 2;
    }

    public static void main(String[] args) {
        System.out.println(init);
        System.out.println(ConstructStaticInit1.init);
        System.out.println(ConstructStaticInit2.init);
        System.out.println(ConstructStaticInit3.init); //7 not Constructor
        new ConstructStaticInit3();
        System.out.println(ConstructStaticInit3.init);
        new ConstructStaticInit4();
        System.out.println(ConstructStaticInit4.init);
        new ConstructStaticInit5();
        System.out.println(ConstructStaticInit5.init);
    }

}

class ConstructStaticInit1 {

    //first init
    static {
        init = 4;
    }

    //second init
    static int init = 3;

}

class ConstructStaticInit2{
    static int init = 5;

    static {
        //Method internal variable
        int init = 6;
    }
}

class ConstructStaticInit3{
    //first init
    static int init;
    //second init
    static {
        init = 7;
    }
    //third init
    ConstructStaticInit3(){
        init = 8;
    }


}

class ConstructStaticInit4{
    //first init
    static int init;

    //third init
    ConstructStaticInit4(){
        init = 8;
    }

    //second init
    static {
        init = 7;
    }
}

class ConstructStaticInit5{
    //first init
    static int init;

    //third init
    ConstructStaticInit5(){
        this(9);
        init = 10;
    }

    ConstructStaticInit5(int num){
        init = num;
    }

    //second init
    static {
        init = 11;
    }
}
