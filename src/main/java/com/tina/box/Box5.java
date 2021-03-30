package com.tina.box;

public class Box5 extends Box{
        public Box5() {
            length = 10;
            width = 20;
            height = 20;
        }
        @Override
        public String getName() {
            return "BOX 5";
        }

        @Override
        public int getPrice() {
            return 90;
        }
}
