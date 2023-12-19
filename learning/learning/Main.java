package learning;

//import learning.LL;

public class Main {
        public static void main(String[] args) {
            LL newList = new LL();


            newList.insertFirst(20);
            newList.insertFirst(39);
            newList.insertFirst(40);
            newList.insertFirst(50);
            
            newList.insertFirst(40);

            //newList.NotcontainsEl(40);

            newList.display();

            newList.removeElements1(40);

            newList.display();

            





            newList.display();

        }
}
