package rc.cracking;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        MyHeap<Integer> newHeap = new MyHeap<Integer>();
        newHeap.insert(2);
        System.out.println(newHeap.getHeap().toString());
        newHeap.insert(3);
        System.out.println(newHeap.getHeap().toString());
        newHeap.insert(6);
        System.out.println(newHeap.getHeap().toString());
        newHeap.insert(4);
        System.out.println(newHeap.getHeap().toString());
        newHeap.insert(1);
        System.out.println(newHeap.getHeap().toString());

        MyHeap<Integer> twoHeap = new MyHeap<Integer>(new ArrayList<Integer>(Arrays.asList(1,3,6,4,8,5,9,7,2,10,11)));
//        System.out.println(twoHeap.getHeap().toString());
//        twoHeap.delete();
//        System.out.println(twoHeap.getHeap().toString());
//        twoHeap.delete();
//        System.out.println(twoHeap.getHeap().toString());

        ArrayList<Integer> heapsorted = new ArrayList<Integer>();
        int size = twoHeap.getHeap().size();
        for (int i = 0; i < size; i++) {
            heapsorted.add(twoHeap.delete());
        }
        System.out.println(heapsorted.toString());
    }


}
