import java.util.*;

public class QueueDeque {
    public static void main(String[] args) {
//        Queue<String> q = new LinkedList<String>();
//        q.offer("chan");
//        q.offer("lee");
//        System.out.println(q.peek());
//        System.out.println(q.poll());
//        System.out.println(q.poll());
//        System.out.println(q.isEmpty());
//        JosephusProblem();
        CircleQue();
    }

    //1158/ 11866
    public static void JosephusProblem() {
        Queue<Integer> queue = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        int numPeople = sc.nextInt();
        int cntForStep = sc.nextInt();
        StringBuilder sb = new StringBuilder("<");


        //Enqueue
        for (int i = 1; i <= numPeople; i++) {
            queue.offer(i);
        }

        while (!queue.isEmpty()) {
            for (int j = 1; j <= cntForStep - 1; j++) {
                queue.offer(queue.poll());
            }
            sb.append(queue.poll() + ", ");
        }
        sb.delete(sb.length() - 2, sb.length());
        System.out.println(sb + ">");
    }

    public static void CircleQue() {
        Deque<Integer> deque = new LinkedList<>();
//        deque.offerFirst(1);
//        deque.offerLast(2);
//        deque.pollFirst();
//        System.out.println(deque);
//        deque.push(1);
//        System.out.println(deque.peekLast());
//        deque.pollLast();
//        System.out.println(deque);

        Scanner sc = new Scanner(System.in);
        int numElement = sc.nextInt();
        int iteration = sc.nextInt();

        for (int i = 1; i <= numElement; i++) {
            deque.offer(i);
        }

        int answerCount = 0;

        while (iteration-- > 0) {
            int lookUp = sc.nextInt();
            while (true) {

                int position = ((LinkedList<Integer>) deque).indexOf(lookUp);
                int left = position;
                int right = deque.size() - left - 1;
                System.out.println(deque.size());

                if (left == 0) {
                    deque.pollFirst();
                    break;
                } else if (left <= right) {
                    deque.offerLast(deque.pollFirst());
                    System.out.println("leftLoop");
                    answerCount++;
                } else {
                    deque.offerFirst(deque.pollLast());
                    System.out.println("rightLoop");
                    answerCount++;
                }
            }

        }
        sc.close();
        System.out.println(answerCount);

    }
}

