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


}