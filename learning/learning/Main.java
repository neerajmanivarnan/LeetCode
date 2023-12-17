package learning;

//import learning.LL;

public class Main {
        public static void main(String[] args) {
            LL newList = new LL();

            newList.insertFirst(10);
            newList.insertFirst(20);
            newList.insertFirst(30);
            newList.insertFirst(40);
            newList.insertFirst(40);

            newList.display();

            System.out.println("after insert");

            newList.insertAfter(70, 30);

            



            newList.display();

            newList.deleteFirst();

            newList.display();

            newList.deleteLast();

            newList.display();
        }
}
