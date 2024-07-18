import java.util.LinkedList;
import java.util.Queue;

public class Arraylists
{
    public static void main(String[] args)
    {
        Queue<Integer> q=new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        System.out.println("Elements added to queue: "+q);
        System.out.println("Poll Element in queue: "+q.poll());
        System.out.println("Peek Element in queue: "+q.peek());
        System.out.println("Element removed from queue: "+q.remove());
        System.out.println("Elements after remove from queue: "+q);
    }
}
