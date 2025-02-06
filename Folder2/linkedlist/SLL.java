package Folder2.linkedlist;

class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
    }
}

public class SLL{
    Node head,tail;
    public void insert(int data){
        Node newNode = new Node(data);
        if(head==null){
            head = newNode;
            tail = newNode;
        } 
        else{
            tail.next = newNode;
            tail = tail.next;
        }
    }

    public int delete(){
        Node pointer;
        if(head==null){
            return -1;
        }
        else{
            Node temp = head;
            if(temp.next==null){
                head = null;
                return temp.data;
    
            }
            while(temp.next.next!=null){
                temp = temp.next;
            }
            pointer = temp.next;
            temp.next = null;
            return pointer.data;
        }
    }

    public void display(){
        if(head==null){
            System.out.println("No elements are there to print..:-{");
        }
        else{
            Node temp = head;
            while(temp!=null){
                System.out.print(temp.data + "-");
                temp = temp.next;
            }
            System.out.println("NULL");
        }
    }


}