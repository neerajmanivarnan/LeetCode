package learning;

public class LL{

    Node head;
    Node tail;
    int size;

    LL(){
        this.size = 0;
    }

    private class Node{
        private int val;
        private Node next;

        public Node(int val){
            this.val = val;

        }

        public Node(int val,Node next){
            this.val = val;
            this.next = next;
        }

    }

    public void insertFirst(int val){
       Node node = new Node(val);
    //    node.next = head;
    //    head = node;

       if(head == null){
        head = node;
        node.next = null;
        tail = head;
       }else{
        tail.next = node;
        tail = node;
       }
       size += 1;
       

       

    }

    public void display(){
        Node current = head;
        while(current != null){
            System.out.print(current.val+"->");
            current = current.next;
            
        }
        System.out.println("NULL");
        System.out.println("Size of the list is "+size);
    }

    public void insertLast(int val){
        Node node = new Node(val);
        if(tail == null ){
            head = node;
            node.next = null;
            tail = head;
            size+=1;
        }else{
            tail.next = node;
            tail = node;
            size+=1;
        }
    }

    public void insertAfter(int val,int key){
        Node node = new Node(val);
        if(head == null){
            System.out.println("List empty");
        }else{
            Node current = head;
            while(current != null){
                
                if(current.val == key){
                    if(current == tail){
                        node.next = null;
                        tail = node;
                        size+=1;
                        break;
                    }else{
                        node.next = current.next;
                        current.next = node;
                        size+=1;
                        break;
                    }
                    
                }else{
                    current = current.next;
                }
            }
        }
    }

    public void deleteFirst(){
        head = head.next;
        size-=1;
    }

    public void deleteLast(){
        Node current = head;
        if(tail == null){
            System.out.println("List empty");
        }else if(size == 1){
            head.next = null;
            tail = head;
        }else{
            while(current.next != tail){
                current=current.next;
            }
            current.next = null;
            tail = current;
            size-=1;
        }
    }

}