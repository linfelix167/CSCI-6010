package assignment4;


public class Driver {
    public static void main(String[] args){

        GdubQueue q = new GdubQueue(5);

        System.out.println(q.isEmpty()); // Check th queue is empty or not

        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);
        q.enqueue(5);
        q.enqueue(1);
        System.out.println();

        System.out.println(q.dequeue() + " remove from queue.");
        System.out.println(q.dequeue() + " remove from queue.");
        System.out.println(q.dequeue() + " remove from queue.");
        System.out.println();

        System.out.println("Now, the element in the head is " + q.peek());

        System.out.println(q.isEmpty()); // Check th queue is empty or not
    }

    }

