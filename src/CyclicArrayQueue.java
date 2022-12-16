import java.util.ArrayList;
import java.util.List;

public class CyclicArrayQueue<E> implements MyQueue<E> {
    private List<E> queue;
    private int front = 0, rear = 0;

    public CyclicArrayQueue(int n) {
        queue = new ArrayList<>(n + 1);
        for (int i = 0; i <= n; i++) {
            queue.add(null);
        }
    }

    @Override
    public void enqueue(E x) throws FullException {
        if (isFull())
            throw new FullException("CyclicArrayQueue full! Couldn't enqueue");
        else {
            queue.set(rear, x);
            rear = (rear + 1) % queue.size();
        }
    }

    @Override
    public void dequeue() {
        if (!isEmpty())
            front = (front + 1) % queue.size();
    }

    @Override
    public E first() throws EmptyException {
        if (isEmpty())
            throw new EmptyException("CyclicArrayQueue empty! Couldn't get first");
        else
            return queue.get(front);
    }
    @Override
    public boolean isEmpty() {
        return front == rear;
    }

    @Override
    public boolean isFull() {
        return (rear + 1) % queue.size() == front;
    }
}
