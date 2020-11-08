package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
        button1.addActionListener (action->{
            try {
                a= Double.parseDouble(text1.getText());
                b= Double.parseDouble(text2.getText());
                res = a+b;
                label3.setText("Результат: "+res);
            }catch (Exception e){
                label3.setText("error");}
        }
        );


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