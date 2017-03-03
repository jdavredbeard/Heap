package rc.cracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.NoSuchElementException;

/**
 * Created by jonathandavenport on 3/3/17.
 * This is a MinHeap!
 */
public class MyHeap<T extends Comparable<T>> {
    private ArrayList<T> heap;

    public MyHeap() {
        heap = new ArrayList<T>();
    }
    public MyHeap(ArrayList<T> initial) {
        heap = new ArrayList<T>();
        for (T item: initial) {
            insert(item);
        }
    }
    public void insert(T newElement) {
        heap.add(newElement);
        percolateUp();
    }
    public void percolateUp() {
        int k = heap.size() - 1;
        while (k > 0) {
            int p = (k - 1) /2;
            if (p >= 0) {
                T item = heap.get(k);
                T parent = heap.get(p);
                if (heap.get(k).compareTo(heap.get(p)) < 0) {
                    heap.set(p, item);
                    heap.set(k, parent);
                }
                else break;
            }
            k = p;

        }

    }

    public void percolateDown() {
        int k = 0;
        int l = (2*k) + 1;
        while (l < heap.size()) {
            int r = (2*k) + 2;
            int min = l;
            if (r < heap.size()) {
                if (heap.get(l).compareTo(heap.get(r)) > 0) {
                    min = r;
                }
            }
            T item = heap.get(k);
            T minChild = heap.get(min);
            heap.set(min, item);
            heap.set(k, minChild);
            k = min;
            l = (2*k) + 1;
        }
    }

    public T delete() throws NoSuchElementException{
        if (heap.size() == 0) throw new NoSuchElementException();
        if (heap.size() == 1) return heap.remove(0);
        T hold = heap.get(0);
        int last = heap.size() - 1;
        heap.set(0, heap.get(last));
        heap.remove(last);
        percolateDown();
        return hold;
    }



    public ArrayList<T> getHeap() {
        return heap;
    }




}
