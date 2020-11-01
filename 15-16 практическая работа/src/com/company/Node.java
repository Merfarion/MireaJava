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
