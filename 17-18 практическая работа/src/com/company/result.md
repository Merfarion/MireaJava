```java
package com.company;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> mas  = new ArrayList<>(10);

        for (int i = 0;i<10;i++){
int p = in.nextInt();
mas.add(i,p);
        }
        int i =0;
        int sum1=0;
        int sum2=0;
        int sum3=0;

        while (i<10){
            int t = mas.get(i);
           sum1+= t;
            i++;
        }
        System.out.println("sum1= "+ sum1);
        i=0;
        do{
            int t = mas.get(i);
            sum2+= t;
            i++;
        }while(i<9);
        System.out.println("sum2= "+ sum2);
            for (int k =0; k<10;k++){
                int t = mas.get(k);
                sum3+= t;
            }
        System.out.println("sum3= "+ sum3);

        for (String str:args){
            System.out.println("аргумент = "+ str);
        }
        for (int k =1; k<=10;k++){
            double a =0;
            a= 1/k;
           System.out.printf("%f ",a);
        }
        System.out.println();
        int a =2;
        int b =20;
        int kol = a+ (int) (Math.random()*b);
        int mas2 []= new int [kol];
        for (int g= 0;g<kol;g++){
            int h = a+ (int) (Math.random()*b);
            mas2[g]= h;
        }
        for (int g= 0;g<kol;g++){
            int h =mas2[g];
            System.out.print(h + " ");
        }
        System.out.println();
        for (int w =0;w<kol;w++){
            for (int y = 0;y< kol-1;y++){
                int f = mas2[y];
                int u = mas2[y+1];
                int temp =0;
                if(f>u){
                temp = mas2[y];
                mas2[y]= mas2[y+1];
                mas2[y+1]=temp;
                }
            }
        }
        for (int g= 0;g<kol;g++){
            int h =mas2[g];
            System.out.print(h + " ");
        }
        System.out.println();
        Random r = new Random();
        int dif= b-a;
        kol = r.nextInt(dif);
        int mas3 [] = new int[kol];
        for (int g= 0;g<kol;g++){
            int h = r.nextInt(dif);
            mas3[g]=h;
        }
        for (int g= 0;g<kol;g++){
            int h =mas3[g];
            System.out.print(h+ " ");
        }
        System.out.println();
        for (int w =0;w<kol;w++){
            for (int y = 0;y< kol-1;y++){
                int f = mas3 [y];
                int u = mas3[y+1];
                int temp =0;
                if(f>u){
                temp=mas3[y];
                mas3[y]=mas3[y+1];
                mas3[y+1] = temp;

                }
            }
        }
        for (int g= 0;g<kol;g++){
            int h =mas3[g];
            System.out.print(h+" ");
        }
        System.out.println();
        System.out.println("Введите число для факториала");
        int fac = in.nextInt();
        int fact =1;
        for(int w=1;w <=fac;w++){
            fact*=w;
        }
        System.out.println(fact);
        System.out.println(factorial(fac));
        if (fact == factorial(fac)){
            System.out.print("Все верно");
        }
	// write your code here
    }
    static int factorial( int fac) {
        int fact =1;
        for(int w=1;w <=fac;w++){
            fact*=w;
        }
        return fact;
    }
}
```


```java
package com.company;

import javax.swing.*;

public class Main {
    public static void main(String[] args){
        SwingUtilities.invokeLater(()->{
            MyApp app = new MyApp();
            app.setVisible(true);
        });
    }
}
```


```java
package com.company;

import javax.swing.*;
import java.awt.*;

public class MyApp extends JFrame {
    private int clickCount = 0;
    private double a =0;
    private double b = 0;
    private double res;
    public MyApp() {
    setTitle("Calculator");
    setSize(250,250);

    JLabel label1 = new JLabel("Значение A");
    label1.setHorizontalAlignment(JLabel.CENTER);
    JLabel label2 =new JLabel("Значение Б");
    label2.setHorizontalAlignment(JLabel.CENTER);
    JLabel label3 = new JLabel("Результат");
    label3.setHorizontalAlignment(JLabel.CENTER);
    JButton button1 = new JButton("+");
    JButton button2 = new JButton("-");
    JButton button3 = new JButton("*");
    JButton button4 = new JButton("/");
    JTextField text1 = new JTextField(22);
    JTextField text2 = new JTextField(22);
    JPanel panel = new JPanel();
        JPanel panel2 = new JPanel();
    add(panel);
    panel.setLayout(new GridLayout(6,0));
    panel.add(label1);
        panel.add(text1);
        panel2.add(button1);
        panel2.add(button2);
        panel2.add(button3);
        panel2.add(button4);
        panel.add(panel2);
        panel.add(label2);
        panel.add(text2);

        panel.add(label3);
ActionListener(action->{
            try {
                a= Double.parseDouble(text1.getText());
                b= Double.parseDouble(text2.getText());
                res = a+b;
                label3.setText("Результат: "+res);
            }catch (Exception e){
                label3.setText("error");}
        });
        button2.addActionListener(action->{
            try {
                a= Double.parseDouble(text1.getText());
                b= Double.parseDouble(text2.getText());
                res = a-b;
                label3.setText("Результат: "+res);
            }catch (Exception e){
                label3.setText("error");}
        });
        button3.addActionListener(action->{
            try {
                a= Double.parseDouble(text1.getText());
                b= Double.parseDouble(text2.getText());
                res = a*b;
                label3.setText("Результат: "+res);
            }catch (Exception e){
                label3.setText("error");}
        });
        button4.addActionListener(action->{
            try {
                a= Double.parseDouble(text1.getText());
                b= Double.parseDouble(text2.getText());
                res = a/b;
                    label3.setText("Результат: " + res);
            }catch (Exception e){
                label3.setText("error");}
        });
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
```


```java
package work;
import java.util.ArrayList;
public class Main {


    static int sum;
    public static void main(String[] args) throws InterruptedException {

    long startTime = System.currentTimeMillis();
        ArrayList<Thread> threads = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            final int h = i;
            Thread thread = new Thread(()->work(h));
            thread.start();
            threads.add(thread);
        }
        for (Thread t : threads) {
           System.out.println(t.getState());
            t.join();
        }
        long endTime = System.currentTimeMillis();
        System.out.println(endTime-startTime);
        System.out.println(sum);

    }
    private  static  void work (int i){
        long startTime = System.currentTimeMillis();
      long result =mathOperation(i*1000, 100_000_000 );
        long endTime = System.currentTimeMillis();
        System.out.println(i+": |"+(endTime-startTime)+"|"+result);
    }

    private  synchronized static long mathOperation(int count,int k){
        long a = 0;
        for (int i = 0; i < k; i++) {
            a += (count + i) * Math.sqrt(Math.sqrt(count + i))-Math.sqrt(count+i);
            sum++;
        }
        return a;
    }
}
```


```java
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
```


```java
package com.company;

public enum TextEnum {
    TEXT1("Hello1"),
    TEXT2("Hello2"),
    TEXT3("Hello3"),
    TEXT4("Hello4");
    private final String field;

    TextEnum(String field) {
        this.field = field;
    }

    public String getField() {
        return field;
    }
}
```


```java
package com.company;

public class Employee {
private int age;



    public void addAge(int age) throws ThrowException {
        if (age<0){
            throw new ThrowException();
        }
            this.age += age;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "age=" + age +
                '}';
    }
}
```


```java
package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Employee gleb  = new Employee();
        try {
            int b = Integer.parseInt(new Scanner(System.in).nextLine());
            gleb.addAge(b);

        }
       catch (ThrowException ex){
           System.out.println("error");
       }
        catch (NumberFormatException vv){
            System.out.println("Incorrect input format");
        }
        finally {
            System.out.println(gleb);
        }
        throw new ThrowRuntimeException();
	// write your code here
    }
}
```


```java
package com.company;

public class ThrowException extends Exception {

}
```


```java
package com.company;

public class ThrowRuntimeException extends RuntimeException{
}
```


```java
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int h = scanner.nextInt();
        System.out.println("Выберите решение: 1) с регулярными выражениями; 2)без регулярных выражений;");
        switch (h) {
            case 1: {
                System.out.print("Количество правил: ");
                int k = 0;
                try {
                    k = Integer.parseInt(scanner.nextLine());
                } catch (NumberFormatException e) {
                    e.printStackTrace();
                }
                String path;
                String zamena;
                Map<String, String> rule = new HashMap<>();
                for (int i = 0; i < k; i++) {
                    Pattern pattern = Pattern.compile("(?<path>\\w+) (?<zamena>\\w+)");
                    Matcher matcher = pattern.matcher(scanner.nextLine());
                    if (matcher.find()) {
                        path = matcher.group("path");
                        zamena = matcher.group("zamena");
                        rule.put(path, zamena);
                    }
                }

                String text = scanner.next();
                List<Map.Entry<String, String>> ruleConvert = new ArrayList<>(rule.entrySet());
                StringBuilder regex = new StringBuilder();
                for (int i = 0; i < ruleConvert.size(); i++) {
                    regex.append(ruleConvert.get(i).getKey());
                    if (i < ruleConvert.size() - 1) {
                        regex.append("|");
                    }
                }
                Pattern onePattern = Pattern.compile(regex.toString());
                Matcher oneMatcher = onePattern.matcher(text);
                String result = oneMatcher.replaceAll(index -> rule.get(index.group()));
                System.out.println("result: " + result);
            }
            break;


            case 2: {
                System.out.print("Количество правил: ");
                int k = 0;
                try {
                    k = Integer.parseInt(scanner.nextLine());
                } catch (NumberFormatException e) {
                    e.printStackTrace();
                }

                Map<String, String> rule = new HashMap<>();
                for (int i = 0; i < k; i++) {

                    rule.put(scanner.next(), scanner.next());
                }
                String text = scanner.next();
                String rezult = text;
                for (int i = 0; i < text.length(); i++) {
                    for (int j = 0; j < rule.size(); j++) {
                        String t = (String) rule.keySet().toArray()[j];
                        String r = (String) rule.values().toArray()[j];
                        if (i + t.length() < rezult.length() && rezult.substring(i, i + t.length()).equals(t)) {
                            rezult = rezult.replace(t, r + " ");
                            i += r.length();
                            break;
                        }
                    }
                }
                rezult = rezult.replace(" ", "");
                System.out.println(rezult);
            }
            break;
        }
    }
}
```


```java
package com.company;

import java.awt.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Graph {
    Node s1 = new Node();
    Node s2 = new Node();
    Node s3 = new Node();
    Node s4 = new Node();
    Node s5 = new Node();
    Node head = s1;
private ArrayList<String> rezult = new ArrayList<>();
    public Graph() {
        s1.setall(0,"create_project",s2);
        s1.setall(1,"add_library",s5);
        s2.setall(0,"test",s3);
        s2.setall(1,"drop_db",s4);
        s3.setall(0,"drop_db",s4);
        s3.setall(1,"add_library",s5);
        s4.setall(0,"restart",s3);
        s4.setall(1,"deploy",s5);
        s5.setall(0,"deploy",s1);
        s5.setall(1,"restart",s3);
    }

    public void work (int state){
        for (int i = 0; i <head.getConnections().size() ; i++) {
            if (head.getConnections().get(i)==state){
                rezult.add(head.getInstructions().get(i));
                head= head.getStates().get(i);
            }
        }
    }
public void getInstruction(){
    for (String res:rezult
         ) {
        System.out.println(res);
    }
}
}
```


```java
package com.company;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Graph graph = new Graph();
        int k = 0;
      while (true) {

          if(k==-1){
              break;
          }
          k = sc.nextInt();
          graph.work(k);
      }
      graph.getInstruction();
    }
}
```


```java
package com.company;

import java.util.ArrayList;

public class Node {
private ArrayList<Integer> connections = new ArrayList<>();
private ArrayList<String> instructions = new ArrayList<>();
private ArrayList<Node> states =  new ArrayList<>();
public void setall (int connection,String instruction,Node state){
    connections.add(connection);
    instructions.add(instruction);
    states.add(state);
}

    public ArrayList<Integer> getConnections() {
        return connections;
    }

    public ArrayList<String> getInstructions() {
        return instructions;
    }

    public ArrayList<Node> getStates() {
        return states;
    }

}
```


```java
package com.company;

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.SplittableRandom;

public class Main {
    public static void main(String[] args){
        File folder = new File("C:/Users/gleba/IdeaProjects/MireaJava/");
        File result = new File("C:/Users/gleba/IdeaProjects/MireaJava/17-18 практическая работа/src/com/company/result.md");
        for (File file:folder.listFiles()
             ) {
            if (folder.isDirectory()){
                file = file.getAbsoluteFile();
            }
            System.out.println(file.getName());
        }
        File[]children = folder.listFiles();
        for (File file : children) {
            System.out.println(file.getAbsolutePath());
        }
        System.out.println("\n-----------------------");
        System.out.println("String[] list():\n");

        String[] paths = folder.list();
        for (String path : paths) {

            System.out.println(path);
        }
        recursive recursive = new recursive();
        recursive.fetchChild(folder);
//        if (folder.isDirectory()){
//
//            }
        }
//        Path path = Paths.get(".");
//
//        String basePath = "";
//        String mainFile = basePath + "/Main.java";
//        String newFile = basePath + "/Copy.txt";
//        File file = new File(mainFile);
//        if (file.isDirectory()) {
//            String[] list = file.list();
//
//            for (String s : list) {
//                System.out.println(Paths.get(basePath, s).toAbsolutePath());
//            }
//        }
//        Scanner sc = new Scanner(System.in);
//        String mainFilePath = file.getAbsolutePath();
//        try {
//            try (
//                    BufferedReader reader = new BufferedReader(new FileReader(mainFilePath));
//                    PrintWriter writer = new PrintWriter(newFile)) {
//                String line = reader.readLine();
//                while (line != null) {
//                    System.out.println(line);
//                    writer.write(line);
//                    writer.write('\n');
//                    sc.nextLine();
//                    line = reader.readLine();
//                }
//            }
//        } catch (FileNotFoundException e) {
//            System.out.println("Incorrect file path");
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//        System.out.println(path);
    }


```


```java
package com.company;

import java.io.*;
import java.util.Scanner;

public class recursive {
    private File result;
    public recursive() {
        this.result = new File("C:/Users/gleba/IdeaProjects/MireaJava/17-18 практическая работа/src/com/company/result.md");
        result.delete();
    }
    public void fetchChild(File file) {
        Scanner sc = new Scanner(System.in);
        if (file.isDirectory()) {
            File[] children = file.listFiles();

            for (File child : children) {
                // Рекурсивный (Recursive)
                this.fetchChild(child);
            }
        }
        if(file.isFile()){
            if(file.getAbsolutePath().endsWith(".java")) {
                String path = file.getAbsolutePath();
                System.out.println(file.getAbsolutePath());
                //System.out.println(path);
                try (BufferedReader br = new BufferedReader(new FileReader(path));
                     FileWriter writer = new FileWriter(result,true);
                PrintWriter bw = new PrintWriter(writer)) {
                    String text = br.readLine();
                    bw.write("```java"+"\n");
                        while (text!= null) {
                System.out.println(text);
                bw.write(text);
                bw.write( "\n");
               text = br.readLine();
            }
                        bw.write("```"+"\n\n\n");
                }
                catch (IOException ex) {
                    System.out.println(ex.getMessage());
                }
            }
}}}
```


```java
package com.company;

public class Ball {
    private String name;
    private String material;
    private double weight;
    private int price;
}
```


```java
package com.company;

public class Book {
    private String name;
    private int kolstr;
    private double weight;
    private int god;
}
```


```java
package com.company;

import java.util.Scanner;

public class Dog {
    private String name;
    private int age;

    Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    Scanner in = new Scanner(System.in);


    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void Age() {
        System.out.println("Возраст данной собаки равен " + age * 7 + "человеческих лет");
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
```


```java
package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        String[] names = {"Kolly","Molly","Jack"};
        int[]ages = {2,5,7};
        Dog dog1 = new Dog(names[0],ages[0]);
        Dog dog2 = new Dog(names[1],ages[1]);
        Dog dog3 = new Dog(names[2],ages[3]);
	// write your code here
        Dog[] pitomnik = new Dog [] {dog1,dog2,dog3};

    }
}
```


```java
package com.company;

public class Shape {
   private String name;
    private int length;
    private double weight;
    private int height;

    @Override
    public String toString() {
        return "Shape{" +
                "name='" + name + '\'' +
                ", length=" + length +
                ", weight=" + weight +
                ", height=" + height +
                '}';
    }
}
```


```java
package com.company.zadanie1;

public class Circle {
private double radius;
public Circle(double radius){
    this.radius = radius;
}

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
```


```java
package com.company.zadanie1;

public class CircleTest {
    public static void main(String[] args){
Circle circle = new Circle(24.5);
System.out.println("Радиус окружности равен: " + circle.getRadius());
circle.setRadius(28.5);
        System.out.println("Радиус окружности равен: " + circle.getRadius());
    }
}
```


```java
package com.company.zadanie2;

public class Human {
    private String name;
    private int height;
    private double weight;
    Hand larm ;
    Leg lleg ;
    Hand rarm ;
    Leg rleg ;
    Head head ;

    public Human(String name, int height, double weight, int fingerr,int fingerl, int sizel,int sizer,String form) {
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.larm = new Hand(fingerl);
        this.lleg = new Leg(sizel);
        this.rarm = new Hand(fingerr);
        this.rleg = new Leg(sizer);
        this.head = new Head(form);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Hand getLarm() {
        return larm;
    }

    public void setLarm(int fingerl) {
        larm.setFingers(fingerl);
    }

    public Leg getLleg() {
        return lleg;
    }

    public void setLleg(int sizel) {
        lleg.setSize(sizel);
    }

    public Hand getRarm() {
        return rarm;
    }

    public void setRarm(int fingerr) {
        rarm.setFingers(fingerr);
    }

    public Leg getRleg() {
        return rleg;
    }

    public void setRleg(int sizer) {
        rleg.setSize(sizer);
    }

    public Head getHead() {
        return head;
    }

    public void setHead(String form) {
        head.setForm(form);
    }



    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", height=" + height +
                ", weight=" + weight +
                ", larm=" + larm.getFingers() +
                ", lleg=" + lleg.getSize() +
                ", rarm=" + rarm.getFingers() +
                ", rleg=" + rleg.getSize() +
                ", head=" + head.getForm() +
                '}';
    }

    public class Hand {
        protected int fingers;
        public Hand(int fingers){
            this.fingers=fingers;
        }

        public int getFingers() {
            return fingers;
        }

        public void setFingers(int fingers) {
            this.fingers = fingers;
        }

        public void status (){
            if (fingers == 5){
                System.out.println("Нормальная рука");
            }
            else {
                System.out.println("А кому нужны пальцы?");
            }
        }
    }
    public class Head {
        protected    String form;
        public Head(String form){
            this.form = form;
        }

        public String getForm() {
            return form;
        }

        public void setForm(String form) {
            this.form = form;
        }

        public void intelligence() {
            System.out.println("Интеллект отсутствует");
        }
    }
    public class Leg {
        protected int size;
        public Leg (int size){
            this.size = size;
        }

        public int getSize() {
            return size;
        }

        public void setSize(int size) {
            this.size = size;
        }

        public void comment(){
            if(size <39) {
                System.out.println("Ножка Золушки");
            }
            else
            if(size<43){

                System.out.println("Нормальный размер ноги");
            }
            else{
                System.out.println("Лыжи");
            }
        }
    }
}
```


```java
package com.company.zadanie2;

public class Test {
    public static void main(String[] args){
Human gleb = new Human("Gleb",184,62.5, 5,5,43,43,"round");
gleb.setHead("oval");
System.out.println(gleb.toString());

    }


}
```


```java
package com.company.zadanie3;

public class Book {
    //автор, название, год написания и т. д.
   private String name, author;
    private int god,kolvostr;
    public Book (){}
   public Book(String name, String author, int god,int kolvostr){
        this.name =name;
        this.author = author;
        this.god = god;
        this.kolvostr = kolvostr;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getGod() {
        return god;
    }

    public void setGod(int god) {
        this.god = god;
    }

    public int getKolvostr() {
        return kolvostr;
    }

    public void setKolvostr(int kolvostr) {
        this.kolvostr = kolvostr;
    }
}
```


```java
package com.company.zadanie3;

import java.util.Scanner;

public class BookTest {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
    Book book = new Book("Война и мир","Толстой",1905,777);
    System.out.println("Название книги: "+ book.getName()+"\nАвтор: "+book.getAuthor()+"\nКоличество страниц: "+book.getKolvostr()+"\nГод выпуска: "+book.getGod());
    book.setAuthor("Гоголев");
    book.setGod(1813);
    System.out.println("Название книги: "+ book.getName()+"\nАвтор: "+book.getAuthor()+"\nКоличество страниц: "+book.getKolvostr()+"\nГод выпуска: "+book.getGod());
    }
}
```


```java
package com.company;

public class Circle extends Shape{
    protected double radius;
    public Circle(){

    }
    public Circle(double radius){
        this.radius = radius;
    }
    public Circle (double radius,String color,boolean filled){
        super(color,filled);
        this.radius = radius;

    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea(){
        double s=3.14*radius*radius;
return s;
    }
    public double getPerimeter(){
        double p=2*3.14*radius;
       return  p;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}
```


```java
package com.company;

public class Main {
    public static void main(String[] args) {
Circle circle = new Circle(12);
System.out.println(circle.getArea());
        System.out.println(circle.getPerimeter());
        Rectangle rectangle = new Rectangle(3,5);
        System.out.println(rectangle.getArea());
        System.out.println(rectangle.getPerimeter());
        Square square = new Square(5);
        System.out.println(square.getArea());
        System.out.println(square.getPerimeter());
        // write your code here
    }
}
```


```java
package com.company;

public class Rectangle extends Shape{
    protected double width;
    protected double length;
    public Rectangle () {

    }
    public Rectangle(double width,double length){
        this.width =width;
        this.length = length;
    }
    public Rectangle(double width,double length,String color,boolean filled){
       super(color, filled);
        this.width =width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
    public double getArea(){
        double s =width*length;
return  s;
    }
    public double getPerimeter(){
        double p =2*width + (2*length);
        return p;
    }


    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", length=" + length +
                '}';
    }
}
```


```java
package com.company;

public abstract class Shape {
    protected String color;
    protected boolean filled;
    public Shape() {}
    public Shape(String color, boolean filled){
        this.color=color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }
    public double getArea(){
        double s=0;
return s;
    }
    public double getPerimeter(){
        double p =0;
        return p;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }
}
```


```java
package com.company;

public class Square extends Shape{
    private double side;
public Square (){}
public Square (double side){
this.side = side;
}
    public Square (double side,String color,boolean filled){

        this.side = side;

        this.color = color;
        this.filled = filled;
    }
public double getSide(){
    return side;
}
public void setSide (double side){
    this.side = side;
}
    public double getArea(){
    double s=side*side;
return s;
    }
    public double getPerimeter(){
    double p= 4*side;
    return p;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
```


```java
package com.company;

public class Circle extends Shape{
    protected double radius;
    public Circle(){

    }
    public Circle(double radius){
        this.radius = radius;
    }
    public Circle (double radius,String color,boolean filled){
        super(color,filled);
        this.radius = radius;

    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea(){
        double s=3.14*radius*radius;
        return s;
    }
    public double getPerimeter(){
        double p=2*3.14*radius;
        return  p;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}
```


```java
package com.company;

public class Main {
    public static void main(String[] args) {
/*Circle circle = new Circle(12);
System.out.println(circle.getArea());
        System.out.println(circle.getPerimeter());
        Rectangle rectangle = new Rectangle(3,5);
        System.out.println(rectangle.getArea());
        System.out.println(rectangle.getPerimeter());
        Square square = new Square(5);
        System.out.println(square.getArea());
        System.out.println(square.getPerimeter());*/
        // write your code here
        MovableCircle circle = new MovableCircle(2, 2, 5);
        System.out.println(circle);
        circle.setRadius(6.5);
        circle.Move(5, 2);
        System.out.println(circle);
        MovableRectangle rectangle = new MovableRectangle(3, 1, 4, 5);
        System.out.println(rectangle);
        rectangle.setP1(7, 6);
        System.out.println(rectangle);
        rectangle.Move(-2, 4);
        System.out.println(rectangle);
        rectangle.setWidth(rectangle.getWidth()*2);
        System.out.println(rectangle);
        rectangle.setLength(rectangle.getLength()+4);
        System.out.println(rectangle);
        rectangle.setLength(rectangle.getLength()-5);
        System.out.println(rectangle);
    }
}
```


```java
package com.company;

public interface Movable {

    void Move(int right, int down);
}

```


```java
package com.company;

public class MovableCircle extends Circle  implements Movable {
    private MovablePoint center;


    public MovableCircle(int x,int y, double radius) {
        this.radius = radius;
        this.center = new MovablePoint(x,y);

    }


    @Override
    public void Move(int right, int down) {
        center.Move(right, down);
    }

    @Override
    public String toString() {
        return "MovableCircle{" +
                "center=" + center +
                ", radius=" + radius +
                '}';
    }
}
```


```java
package com.company;

public class MovablePoint implements Movable {
    private double x,y;

    public MovablePoint(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    @Override
    public void Move(int right, int down) {
        x+=right;
        y+=down;
    }

    @Override
    public String toString() {
        return "MovablePoint{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
```


```java
package com.company;
import static java.lang.Math.*;
public class MovableRectangle  implements Movable {

    private MovablePoint p1;
    private MovablePoint p2;
    Rectangle r = new Rectangle();
    private double w,l;
    public MovableRectangle(int x1, int y1,int x2,int y2){
        this.p1 = new MovablePoint(x1,y1);
        this.p2 = new MovablePoint(x2,y2);

        r.setWidth(abs(abs(x1)-abs(x2)));
        r.setLength(abs(abs(y1)-abs(y2)));
        w= r.getWidth();
        l= r.getLength();
    }
    public MovablePoint getP1() {
        return p1;
    }

    public void setWidth(double width) {
        System.out.println(width);
        r.setWidth(width);
        if(width!=0) {
            p1.setX(p1.getX() + ((abs(w - width)) / 2));
            p2.setX(p2.getX() - ((abs(w - width)) / 2));
        }
        w=width;
    }

    public  double getWidth (){
        return r.getWidth();
    }

    public void setLength (double length){
        r.setLength(length);
        System.out.println(l);
        System.out.println(length);
        if(length!=0) {
            p1.setY(p1.getY() + ((abs(l - length)) / 2));
            p2.setY(p2.getY() - ((abs(l - length)) / 2));
        }
        l=length;
    }

    public  double getLength (){
        return r.getLength();
    }
    public void setP1(int x,int y) {
        this.p1 = new MovablePoint(x,y);
        r.setWidth(abs(abs(p1.getX())-abs(p2.getX()))) ;
        r.setLength(abs(abs(p1.getY())-abs(p2.getY())));
        w=r.getWidth();
        l=r.getLength();
    }

    public MovablePoint getP2() {
        return p2;
    }

    public void setP2(int x,int y) {
        this.p2 = new MovablePoint(x,y);
        r.setWidth(abs(abs(p1.getX())-abs(p2.getX()))) ;
        r.setLength(abs(abs(p1.getY())-abs(p2.getY())));
        l=r.getLength();
        w=r.getWidth();
    }

    @Override
    public String toString() {
        return "MovableRectangle{" +
                "p1=" + p1 +
                ", p2=" + p2 +
                ", r=" + r +

                '}';
    }

    @Override

    public void Move(int right, int down) {
        p1.Move(right, down);
        p2.Move(right, down);
    }
}
```


```java
package com.company;

public class Rectangle extends Shape{
    protected double width;
    protected double length;
    public Rectangle () {

    }
    public Rectangle(double width,double length){
        this.width =width;
        this.length = length;
    }
    public Rectangle(double width,double length,String color,boolean filled){
        super(color, filled);
        this.width =width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
    public double getArea(){
        double s =width*length;
        return  s;
    }
    public double getPerimeter(){
        double p =2*width + (2*length);
        return p;
    }


    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", length=" + length +
                '}';
    }
}
```


```java
package com.company;

public abstract class Shape {
    protected String color;
    protected boolean filled;
    public Shape() {}
    public Shape(String color, boolean filled){
        this.color=color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }
    public double getArea(){
        double s=0;
        return s;
    }
    public double getPerimeter(){
        double p =0;
        return p;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }
}
```


```java
package com.company;

public class Square extends Rectangle{
    public Square (){}
    public Square (double side){
        this.length = side;
    }
    public Square (double side,String color,boolean filled){

        super.length = side;
        super.width = side;
        this.color = color;
        this.filled = filled;
    }
    public double getSide(){
        return length;
    }
    public void setSide (double side){
        this.length = side;
    }
    public double getArea(){
        double s=length*length;
        return s;
    }
    public double getPerimeter(){
        double p= 4*length;
        return p;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

```


```java
package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int k = 0;
        int sum=0;
        Scanner in = new Scanner(System.in);
        k = in.nextInt();
        int mas[][] = new int[k][k];
        for (int i=0;i<k;i++){
            for (int j=0; j<k; j++){
               // mas [i][j] = in.nextInt();
                mas [i][j] = (int) (Math.random()*40-20);
            }
        }
        for (int i=0;i<k;i++){
            for (int j=0; j<k; j++){
                System.out.print(mas[i][j] +"\t");
            }
            System.out.println();
        }
        for (int i=0;i<k;i++){
            for (int j=0; j<k;j++){
                if(i>0&&j>0){
                    mas[i][j]+=Math.max(mas[i-1][j],mas[i][j-1]);
                }
                else {
                    if (i>0){
                        mas[i][j]+=mas[i-1][j];
                    }
                    else if(j>0){
                        mas [i][j]+=mas[i][j-1];
                    }
                }

            }
        }
       System.out.print(mas[k-1][k-1]);

	// write your code here
    }
}
```


```java
package com.company;
import java.util.*;
public class Company {
    private double income=0;
    private ArrayList <Employee> employees = new ArrayList<Employee>();
    private
    Random r = new Random();

    public void hire(Employee man){
    employees.add(man);
        Collections.sort(employees, new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o1.getEmployeePosition().getJobTitle().compareTo(o2.getEmployeePosition().getJobTitle());
            }
        });
        //выглядит громозко, но я тут и дальше пытался контролировать зарплаты топ менеджеров при добавлении
        //или удалении сотрудников. Есть косяк с тем, что пересобирается доход каждый раз, из-за чего при тестах немного отличается каждый раз :-3
        income = 0;
        for (Employee i :employees){
            if (i.getEmployeePosition().getJobTitle()=="Manager"){
                double t = i.getSalary();
                i.setSalary(t);
            }
        }
        for (Employee i :employees){
            if (i.getEmployeePosition().getJobTitle()=="TopManager"){
                i.setSalary(i.getSalary());
            }
        }
    }
    public void hireAll(ArrayList<Employee> employee){
    employees.addAll(employee);
    Collections.sort(employees, new Comparator<Employee>() {
        @Override
        public int compare(Employee o1, Employee o2) {
            return o1.getEmployeePosition().getJobTitle().compareTo(o2.getEmployeePosition().getJobTitle());
        }
    });
        income = 0;
        for (Employee i :employees){
            if (i.getEmployeePosition().getJobTitle()=="Manager"){
                double t = i.getSalary();
                i.setSalary(t);
            }
        }
        for (Employee i :employees){
            if (i.getEmployeePosition().getJobTitle()=="TopManager"){
                i.setSalary(i.getSalary());
            }
        }
    }
    public  void fire (int k) {
        employees.remove(k);
        income = 0;
        for (Employee i : employees) {
            if (i.getEmployeePosition().getJobTitle() == "Manager") {
                double t = i.getSalary();
                i.setSalary(t);
            }
        }
        if(income < 10000000){
        for (Employee i : employees) {
            if (i.getEmployeePosition().getJobTitle() == "TopManager"&& i.getSalary()>60000) {
                    i.setSalary(i.getSalary()/2.5);
        }
        }
    }
    }
    public void firex (int p){
        Random r =new Random();
        double k = employees.size() * ((double)p/100);
        System.out.println(k);
        for (int g = 0;g<(int)k;g++){
            employees.remove(r.nextInt(employees.size()));
        }
        income = 0;
        for (Employee i : employees) {
            if (i.getEmployeePosition().getJobTitle() == "Manager") {
                double t = i.getSalary();
                i.setSalary(t);
            }
        }
        if(income < 10000000){
            for (Employee i : employees) {
                if (i.getEmployeePosition().getJobTitle() == "TopManager"&& i.getSalary()>60000) {
                    i.setSalary(i.getSalary()/2.5);
                }
            }
        }
    }
    public double getlncome(){
        return income;
    }
    public void setIncome(double income) {
        this.income += income;
    }

    public void  getEmployees() {
        for (Employee i: employees) {
            System.out.println(i);
        }
    }
    public ArrayList<Employee> getTopSalaryStaff(int count){
        ArrayList <Employee> topsalary = new ArrayList<Employee>();
        Collections.sort(employees, new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return (int)(o2.getSalary()-o1.getSalary());
            }
        });
        for(int i = 0;i<count;i++){
            topsalary.add(employees.get(i));
        }
        return topsalary;
    }
    public ArrayList<Employee> getLowestSalaryStaff(int count){
        ArrayList <Employee> lowestsalary = new ArrayList<Employee>();
        Collections.sort(employees, new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return (int)(o1.getSalary()-o2.getSalary());
            }
        });
        for(int i = 0;i<count;i++){
            lowestsalary.add(employees.get(i));
        }
        return lowestsalary;
    }
public void getTopSalary(int count){
    Collections.sort(employees, new Comparator<Employee>() {
        @Override
        public int compare(Employee o1, Employee o2) {
            return (int)(o2.getSalary()-o1.getSalary());
        }
    });
    for(int i = 0;i<count;i++){
        System.out.println(employees.get(i).getSalary());
    }
}
public void getLowestSalary(int count){
    Collections.sort(employees, new Comparator<Employee>() {
        @Override
        public int compare(Employee o1, Employee o2) {
            return (int)(o1.getSalary()-o2.getSalary());
        }
    });
    for(int i = 0;i<count;i++){
        System.out.println(employees.get(i).getSalary());
    }
}
    //public void SetPosition
}
```


```java
package com.company;

public class Employee  {
   private String SecondName,Name;
   private EmployeePosition employeePosition;
   private double salary;

   public Employee(String secondName, String name, EmployeePosition employeePosition, double salary) {
      SecondName = secondName;
      Name = name;
      this.employeePosition = employeePosition;
      this.salary = employeePosition.calcSalary(salary);
   }

   public String getSecondName() {
      return SecondName;
   }

   public void setSecondName(String secondName) {
      SecondName = secondName;
   }

   public String getName() {
      return Name;
   }

   public void setName(String name) {
      Name = name;
   }

   public EmployeePosition getEmployeePosition() {
      return employeePosition;
   }

   public void setEmployeePosition(EmployeePosition employeePosition) {
      this.employeePosition = employeePosition;
   }

   public double getSalary() {
      return salary;
   }

   public void setSalary(double salary) {
      employeePosition.calcSalary(salary);

   }

   @Override
   public String toString() {
      return "Employee{" +
              "SecondName='" + SecondName + '\'' +
              ", Name='" + Name + '\'' +
              ", job=" + employeePosition.getJobTitle() +
              ", salary=" + salary +
              '}';
   }
}
```


```java
package com.company;

public interface EmployeePosition {
    String getJobTitle();
    double calcSalary(double base);
}
```


```java
package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
    Company company = new Company();
    int k=0,n=1,salary,job;
        String name,secondname;
        ArrayList<Employee> employees = new ArrayList<Employee>();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String[] names = new String[]{"gleb","artem","sasha","masha","egor","vasilisa","misha","grisha","jack","robert","fedya","tom","sam","tolya","kolya","petya","polina"};
        String[] secondnames = new String[] {"gonets","socrat","pifagor","ivanov","blue","ford","uran","silver","kent","dragon","firefly","shepard","vakarian","trump","white","black"};
        Scanner in = new Scanner(System.in);
        Random r = new Random();
while (n!=0) {
    System.out.println("Выберите способ добавления сотрудников" + "\n" + "0:закончить ввод; 1:одного сотрудника; 2:список сотрудников");
    n = in.nextInt();
    switch (n) {

        case 1: {

            name = bufferedReader.readLine();
            secondname =bufferedReader.readLine() ;

            System.out.println("1:operator 2:manager 3:topmanager");
            job= in.nextInt();
            switch (job) {
                case 1: {
                    salary = in.nextInt();
                    Employee e = new Employee(secondname, name, new Operator(company), salary);
                    company.hire(e);
                }
                break;
                case 2: {
                    salary = in.nextInt();
                    Employee e = new Employee(secondname, name, new Manager(company), salary);
                    company.hire(e);
                }
                break;
                case 3: {
                    salary = in.nextInt();
                    Employee e = new Employee(secondname, name, new TopManager(company), salary);
                    company.hire(e);
                }
                break;
            }
        }
        break;
        case 2: {
            k = in.nextInt();

            for (int i = 0; i < k; i++) {
                employees.add(new Employee(secondnames[r.nextInt(secondnames.length)], names[r.nextInt(names.length)], new Operator(company), (r.nextInt(20000) + 20000)));
            }
            k = in.nextInt();

            for (int i = 0; i < k; i++) {
                employees.add(new Employee(secondnames[r.nextInt(secondnames.length)], names[r.nextInt(names.length)], new Manager(company), (r.nextInt(20000) + 30000)));
            }
            k = in.nextInt();

            for (int i = 0; i < k; i++) {
                employees.add(new Employee(secondnames[r.nextInt(secondnames.length)], names[r.nextInt(names.length)], new TopManager(company), (r.nextInt(20000) + 40000)));
            }
            company.hireAll(employees);
            company.hireAll(employees);
            company.hireAll(employees);
        }
        break;
    }
}
       company.getEmployees();
        System.out.println(company.getTopSalaryStaff(10));
        System.out.println(company.getLowestSalaryStaff(20));
        System.out.println();
        System.out.println(company.getlncome());
        int p =0;
        System.out.println("Сколько процентов сотрудников надо удалить?");
        p= in.nextInt();
        company.firex(p);
        System.out.println();
        System.out.println(company.getlncome());
        company.getEmployees();
        System.out.println();
        company.getTopSalary(10);
        System.out.println();
        company.getLowestSalary(20);
	// write your code here

    }
}
```


```java
package com.company;

import java.util.Random;

public class Manager implements EmployeePosition {
    private int a=115000,b=140000;
    private int diff = b-a;
    Random r = new Random();
    Company company;

    public Manager(Company company) {
        this.company = company;
        //company.setIncome(company.getlncome()+(r.nextInt(diff+1)+a));
    }

    @Override
    public String getJobTitle() {
        return "Manager";
    }

    @Override
    public double calcSalary(double base) {
        int t;
        t=(r.nextInt(diff+1)+a);
        company.setIncome(t);
        return t*0.05 + base;
    }
}
```


```java
package com.company;
public class Operator implements EmployeePosition {
Company company;
    public Operator(Company company) {
        this.company = company;
    }

    @Override
    public String getJobTitle() {
        return "Operator";
    }

    @Override
    public double calcSalary(double base) {
        return base;
    }
}
```


```java
package com.company;

import java.util.Random;

public class TopManager implements EmployeePosition {
Company company;

    public TopManager(Company company) {
        this.company = company;
    }

    @Override
    public String getJobTitle() {
        return "TopManager";
    }

    @Override
    public double calcSalary(double base) {
        if(company.getlncome()>10000000){
            return base*2.5;
        }
        else {
            return base;
        }
    }
}
```


```java
package com.company;

import java.util.ArrayList;

public class Company {
    private final ArrayList<Employee> employees;

    public Company() {
        employees = new ArrayList<>();
    }
    public void addemplyee(Employee employee){
        employees.add(employee);
    }
    public void removeemployee(int index){
        employees.remove(index);
    }


    public ArrayList<Employee> getEmployees() {
        return employees;
    }
    public void DoSmthWithEmpl(EmployeeSelector selector,EmployeesHandle handler){
        int count = 0;
        for (Employee employee: employees){
            if(selector.isneeed(employee)){
                handler.HandleEmployees(employee,count);
                count++;
            }
        }
        System.out.println(count);
    }
    @Override
    public String toString() {
        return "Company{" +
                "employees=" + employees +
                '}';
    }
}
```


```java
package com.company;

import java.time.LocalDate;
import java.util.Random;

public class Employee {
    private String Name;
    private String Secondname;
    private LocalDate dob ;
    private String location;
    private long number;
    private int salary;
    Random r = new Random();

    public Employee(String name, String secondname, String location, long number, int salary) {
        Name = name;
        Secondname = secondname;
        this.dob = LocalDate.of(r.nextInt(20)+1980,r.nextInt(11)+1,
                r.nextInt(27)+1);
        this.location = location;
        this.number = number;
        this.salary = salary;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getSecondname() {
        return Secondname;
    }

    public void setSecondname(String secondname) {
        Secondname = secondname;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public long getNumber() {
        return number;
    }

    public void setNumber(long number) {
        this.number = number;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "Name='" + Name + '\'' +
                ", Secondname='" + Secondname + '\'' +
                ", dob=" + dob +
                ", location='" + location + '\'' +
                ", number=" + number +
                ", salary=" + salary +
                '}';
    }
}
```


```java
package com.company;

public interface EmployeeSelector {
  boolean isneeed (Employee employee);
}
```


```java
package com.company;

public interface EmployeesHandle {
    void HandleEmployees(Employee employee,int count);
}
```


```java
package com.company;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.time.*;
public class Main {

    public static void main(String[] args) {
        String[] names = new String[]{"gleb","artem","sasha","masha","egor","vasilisa","misha","grisha","jack","robert","fedya","tom","sam","tolya","kolya","petya","polina"};
        String[] secondnames = new String[] {"gonets","socrat","pifagor","ivanov","blue","ford","uran","silver","kent","dragon","firefly","shepard","vakarian","trump","white","black"};
        Scanner in = new Scanner(System.in);
        Random r = new Random();
    Company company = new Company();
    for (int i = 0;i<25;i++){
        company.addemplyee(new Employee(names[r.nextInt(names.length)],
                secondnames[r.nextInt(secondnames.length)],"Moscow",r.nextInt(999_999_999)+990000000,
                r.nextInt(10000)+28000));
    }
        System.out.println(company.toString());
    company.removeemployee(5);
    company.DoSmthWithEmpl(new Selector(36000,32000),
            ((employee, count) -> System.out.println("employee"+count+":"+employee)));
    String k = "masha";
    company.DoSmthWithEmpl(new EmployeeSelector() {
                               @Override
                               public boolean isneeed(Employee employee) {
                                   return employee.getName() == k;
                               }

                           },
            new EmployeesHandle() {
                @Override
                public void HandleEmployees(Employee employee, int count) {
                    System.out.println("=="+count + "==");
                    System.out.println(employee);
                }
            }
    );
        ArrayList<Employee> selemployees = new ArrayList<>();
    company.DoSmthWithEmpl(
            employee-> employee.getName()==k,
            (employee, count) -> selemployees.add(employee));
    EmployeeSelector selector = employee -> employee.getSalary()>33000;
    company.DoSmthWithEmpl(
            selector,
            new EmployeesHandle() {
                @Override
                public void HandleEmployees(Employee employee, int count) {
                    System.out.println("=="+count + "==");
                    System.out.println(employee);
                }
            }
    );
	// write your code here
    }

}
```


```java
package com.company;

public class Selector implements EmployeeSelector {
    private  int salary1;
    private  int salary2;

    public Selector(int salary1, int salary2) {
        this.salary1 = salary1;
        this.salary2 = salary2;
    }


    @Override
    public boolean isneeed(Employee employee) {
        return employee.getSalary()<salary1&&employee.getSalary()>salary2;
    }
}
```


```java
package com.company;

import java.time.Instant;
import java.util.Scanner;
import java.time.Duration;
public class Main {

    public static void main(String[] args) {
        Instant start = Instant.now();

        Scanner in = new Scanner(System.in);
       int N = in.nextInt();
        int k=0, b=1,c=0;
        for (int i=1; i<N;i++){
            if (i<=13){
                if(k==12) {
                    k = 0;
                    c += 1;
                }
                k++;
                if (k==1 || k==3|| k==6){
                    b+=c;
                }
                else {
                    b+=c+1;
                }
            }
            else{
                if (k==15){
                    k = 0;
                    c += 1;
                }
                k++;
                if (k==1 || k==3||k==4|| k==6||k==9){
                    b+=c;
                }
                else {
                    b+=c+1;
                }
            }


        }
        System.out.println(b);
        Instant finish = Instant.now();
        long elapsed = Duration.between(start,finish).toMillis();
        System.out.println(elapsed);


    }
}
```


