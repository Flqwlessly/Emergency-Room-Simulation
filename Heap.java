import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Heap<T> {

    private final ArrayList<T> list = new ArrayList<>(); //Creates the heap
    private final Comparator<T> comparator; //Sorts the heap

    public Heap(Comparator<T> c) //Default constructor takes in a comparator object
    {
        this.comparator = c;

    }

    public void add(T e) //Adds an element to the heap, ensures its in the correct position too
    {
        list.add(e);
        siftUp(list.size() - 1);
    }

    public T remove()
    {
        if (list.isEmpty())
        {
            return null;
        }

        T root = list.get(0);
        T last = list.remove(list.size() - 1);
        if (!list.isEmpty())
        {
            list.set(0, last);
            siftDown(0);
        }
        return root;
    }

    public boolean isEmpty()
    {
        return list.isEmpty();
    }

    private void siftUp(int index)
    {
        while (index > 0)
        {
            int parent = (index - 1) / 2;
            if(comparator.compare(list.get(index), list.get(parent)) < 0)
            {
                Collections.swap(list, index, parent);
                index = parent;
            }
            else
            {
                break;
            }
        }
    }

    private void siftDown(int index)
    {
        int size = list.size();

        while(true)
        {
            int left = 2 * index + 1;
            int right = 2 * index + 2;
            int smallest = index;

            if (left < size && comparator.compare(list.get(left), list.get(smallest)) < 0)
            {
                smallest = left;
            }
            if (right < size && comparator.compare(list.get(right), list.get(smallest)) < 0)
            {
                smallest = right;
            }
            if (smallest != index)
            {
                Collections.swap(list, index, smallest);
                index = smallest;
            }
            else
            {
                break;
            }

        }

    }



}
