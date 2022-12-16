public class main {
    public static void main(String[] args) throws FullException, EmptyException {
        MyQueue<Integer> queue = new CyclicArrayQueue<>(3);
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        System.out.println(queue.first());
        //queue.enqueue(999);
        queue.dequeue();
        queue.enqueue(4);
        System.out.println(queue.first());
        queue.dequeue();
        queue.enqueue(5);
        System.out.println(queue.first());
    }

}