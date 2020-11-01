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
