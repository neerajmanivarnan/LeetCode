public class LL{
    public static void main(String[] args) {
        LinkedList nums = new LinkedList();
        nums.add(10);
        nums.add(20);
        nums.add(30);
        System.out.println("Linked List before insert : ");
        nums.printValues();
        nums.insertAfter(20,20);
        System.out.println("Linked List after insert : ");

        nums.printValues();
    }
}

class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
        next = null;
    }

}


class LinkedList{
    Node head=null;

    

    public  void add(int data){
        Node newNode = new Node( data);

        Node current = head;

        if(head == null){
            head=newNode;
        }else{
            while(current.next!=null){
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public void printValues(){
        Node current = head;
        while(current!=null){
            System.out.print(current.data+" ");
            current = current.next;
        }
    }

    public void insertAfter(int key,int data){
        Node current = head;
        Node newNode = new Node(data);
        while(current.data!=key ){
            current = current.next;
        }
        newNode.next = current.next;
        current.next = newNode;


    }

    // public void insertBefore(int key,int data){
    //     Node current = head;
    //     Node newNode = new Node(data);
    //     while(current.next.data!=key ){
    //         current = current.next;
    //     }
    //     newNode.next = current.next;
    //     current.next = newNode;


    // }

    // public void deleteAfter(int key){
    //     Node current = head;
    //     //Node newNode = new Node(data);
    //     while(current.data!=key ){
    //         current = current.next;
    //     }
    //     newNode.next = current.next;
    //     current.next = newNode;
    // }

    
}