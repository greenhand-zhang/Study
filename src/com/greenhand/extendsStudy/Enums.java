package com.greenhand.extendsStudy;

public class Enums {

    enum Size {
        small("s"),mid("m"),big("b");
        private String abb;
        private Size(String abb){
            this.abb = abb;
        }

        public String getAbb() {
            return abb;
        }
    }


    public static void main(String[] args) {
        System.out.println(Enum.valueOf(Size.class, "small"));
        Size small = Enum.valueOf(Size.class, "small");
        System.out.println(small.getAbb());

        Size[] values = Size.values();
        for (Size value : values) {
            System.out.println(value);
        }

        System.out.println(small.ordinal());

        Class<Size> sizeClass = Size.class ;
        Size mid = Enum.valueOf(Size.class, "mid");
        Size big = Enum.valueOf(Size.class, "big");
        System.out.println(mid.compareTo(mid));
        System.out.println(mid.compareTo(big));
        System.out.println(mid.compareTo(small));

    }
}
