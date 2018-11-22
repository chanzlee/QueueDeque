import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class QueueDeque {
    public static void main(String[] args) {
//        Queue<String> q = new LinkedList<String>();
//        q.offer("chan");
//        q.offer("lee");
//        System.out.println(q.peek());
//        System.out.println(q.poll());
//        System.out.println(q.poll());
//        System.out.println(q.isEmpty());
        JosephusProblem();

    }

    public static void JosephusProblem () {
        Queue<Integer> queue = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        int numPeople = sc.nextInt();
        int cntForStep = sc.nextInt();
        StringBuilder sb = new StringBuilder("<");


        //Enqueue
        for (int i=1; i <= numPeople; i++) {
            queue.offer(i);
        }

        while(!queue.isEmpty()) {
            for (int j=1; j <= cntForStep - 1; j++) {
                queue.offer(queue.poll());
            }
            sb.append(queue.poll()+", ");
        }
        sb.delete(sb.length()-2, sb.length());
        System.out.println(sb+">");
    }
}
