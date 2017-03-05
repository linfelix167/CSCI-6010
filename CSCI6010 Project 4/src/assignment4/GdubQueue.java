package assignment4;

/**
 * Assignment 4 Queue
 *
 * Create GdubQueue class that performs queue ADT operations as discussed in class.
 *
 * Create a main method in a separate class to demonstrate that your implementation of queue works.
 *
 * @author Felix
 */
public class GdubQueue {

    private int[] queue; // queue array
    private int head = 0; // index of first element
    private int tail = 0; // index of next available position
    private int numOfItem = 0; // number of elements in queue

    /**
     * Initializes queue array
     * @param size
     */
    public GdubQueue(int size){

        queue = new int[size];
    }

    /**
     *  Add element to queue
     * @param num
     */
    public void enqueue(int num){
        if(isFull()){
            System.out.println("Queue is full");
        }
        else{
        queue[tail] = num;
        tail = (tail + 1) % queue.length;
        numOfItem++;
        System.out.println(num + " add to queue.");
        }
    }

    /**
     * Removes and return the element which is currently in head
     * @return the removed head element
     */
    public int dequeue(){

        int num = 0;
        if(isEmpty()){
            System.out.println("Queue is empty.");
        }
        else{
        num = queue[head];
        queue[head] = 0;
        head = (head + 1) % queue.length;
        numOfItem--;
        }

        return num;
    }

    /**
     * Return the currently head element of queue array
     * @return head element
     */
    public int peek(){
        if(isEmpty()){
            System.out.println("Queue is empty.");
        }

        return queue[head];
    }

    /**
     * Is this queue is full?
     * @return true, if queue is full
     */
    public boolean isFull(){

        return numOfItem == queue.length;
    }

    /**
     * Is this queue is empty
     * @return true, if queue is empty
     */
    public boolean isEmpty(){

        return numOfItem == 0;
    }
}