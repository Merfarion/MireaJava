package com.company;

public class Main {
    public static final String ANSI_RESET = "\u001B[0m";
       public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_BLUE = "\u001B[34m";
            public static void main(String[] args) {
                doSome(TextEnum.TEXT1);
                doSome(TextEnum.TEXT2);
                doSome(TextEnum.TEXT3);
                doSome(TextEnum.TEXT4);
        }

    public static void doSome (TextEnum te){
        System.out.println(te.getField());
        switch (te){
            case TEXT1 -> System.out.println(ANSI_RED + " text example" + ANSI_RESET);
            case TEXT2 -> System.out.println(ANSI_YELLOW + " text example" + ANSI_RESET);
            case TEXT3 -> System.out.println(ANSI_PURPLE + " text example" + ANSI_RESET);
            case TEXT4 -> System.out.println(ANSI_BLUE + " text example" + ANSI_RESET);
        }
    }
}
