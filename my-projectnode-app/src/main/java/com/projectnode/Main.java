package com.projectnode;

public class Main 
{
    public static void main( String[] args )
    {
        Node<String> no1 = new Node<String>("Jean");
        Node<String> no2 = new Node<String>("Pierre");
        Node<String> no3 = new Node<String>("Cordeiro");
        Node<String> no4 = new Node<String>("Aboumrad");
        
        no1.setNextNode(no2);
        no2.setNextNode(no3);
        no3.setNextNode(no4);
        
        System.out.println(no1);
        System.out.println(no1.getNextNode());
        System.out.println(no2.getNextNode());
        System.out.println(no3.getNextNode());
        
    }
}
