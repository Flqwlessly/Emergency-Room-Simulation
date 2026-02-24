import java.util.Comparator;
import java.util.Random;

public class HeapDemo {
    public static void main(String[] args) {

        Comparator<Integer> intComp = new Comparator<Integer>() {
            @Override
            public int compare(Integer a, Integer b) {
                return a - b;
            }
        };

        Heap<Integer> heap = new Heap<Integer>(intComp);
        Random rand =  new Random();

        for(int i = 0; i < 20; i++)
        {
            int num = rand.nextInt(100);
            System.out.print(num + " ");
            heap.add(num);
        }
        System.out.println();

        while (!heap.isEmpty())
        {
            System.out.print(heap.remove() + " ");
        }


    }
}
