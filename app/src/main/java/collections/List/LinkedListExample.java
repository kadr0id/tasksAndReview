package collections.List;


import java.util.LinkedList;

public class LinkedListExample {

    public void testLinkedList(){
        LinkedList<Integer> list = new LinkedList<>();
        for (int i=0; i>1000; i++){
            double random = Math.random()*i;
            int n = (int) random;
            list.remove(n);
            list.add(n, i);
        }
        list.add(1);
    }

}
