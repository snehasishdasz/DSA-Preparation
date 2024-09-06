package LinkedList;

public class basicLL {
    public static void display(Node head) {
        Node temp = head;
        while(temp !=null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }
    //This is the process to make a node
    public static class Node{
        int data; //value
        Node next; //address of next node
        Node(int data){
            this.data = data;
        }
    }
    public static void main(String[] args){
        Node a = new Node(5);
        // System.out.println(a.next); //address
        Node b = new Node(3);
        Node c = new Node(9);
        Node d = new Node(8);
        Node e = new Node(16);
        // 5  3  9  8  16
        a.next = b;  //5 -> 3  9  8  16
        // System.out.println(a.next); //address
        //LinkedList.basicLL$Node@4617c264
        // System.out.println(b);
        //LinkedList.basicLL$Node@4617c264
        // System.out.println(a.next.data);
        //Op - 3
        b.next = c; //5 -> 3 -> 9  8  16
        c.next =  d; //5 -> 3 -> 9 -> 8  16
        d.next = e; //5 -> 3 -> 9 -> 8 -> 16 
        //LINKEDLIST CONNECTED
        //System.out.println(a.data); //print a
        //System.out.println(a.next.data); //print b
        //System.out.println(a.next.next.data); //print c
        //System.out.println(a.next.next.next.data); //print d
        //System.out.println(a.next.next.next.next.data); //print e

        // Node temp = a;
        // for(int i = 1; i <= 5; i++){
        //     System.out.println(temp.data+" ");
        //     temp = temp.next;
        // }

        //*Printing the List
        // while(temp!=null){
        //     System.out.print(temp.data+" ");
        //     temp = temp.next;
        // }

        display(a);
    }
}

