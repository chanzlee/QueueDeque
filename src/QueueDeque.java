import java.util.LinkedList;
import java.util.Queue;

public class QueueDeque {
    public static void main(String[] args) {
        Queue<String> q = new LinkedList<String>();
        q.offer("chan");
        q.offer("lee");
        System.out.println(q.peek());
        System.out.println(q.poll());
        System.out.println(q.poll());
        System.out.println(q.isEmpty());
        
    }
}
