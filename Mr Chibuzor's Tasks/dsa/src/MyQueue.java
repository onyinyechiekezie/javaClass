public class MyQueue   {
   private String[] element = new String[5];
   private int size = 0;

    public String[] getElement() {
        return element;
    }

    public void setElement(String[] elements) {
        this.element = elements;
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public String enqueue(String item) {
        if (size < element.length) {
            element[size++] = item;
        }
        return "Queue is full!";
    }

    public String dequeue() {
        if (isEmpty()) {
            return "Queue is empty!";
        }
        String item = element[0];
        for (int index = 1; index < size; index++) {
            element[index - 1] = element[index];
        }
        size--;
        return item;
    }

    public void increaseCapacity() {
        String[] newElements = new String[element.length * 2];
        int index = 0;
        // Copy elements from front to rear in the new array
        while (size > 0) {
            newElements[index++] = dequeue();
        }
        element = newElements;
    }

    public boolean isFull() {
        return size == element.length;
    }

}
//        }
//        System.arraycopy(element, 0, newElements, 0, element.length);
//        element = newElements;
//    }




//public class MyQueue {
//    private String[] queue;
//    private int front;
//    private int rear;
//    private int size;
//    private static final int INITIAL_CAPACITY = 10;
//
//    public MyQueue() {
//        queue = new String[INITIAL_CAPACITY];
//        front = 0;
//        rear = 0;
//        size = 0;
//    }
//
//    // Method to add an element to the queue (enqueue)
//    public void enqueue(String element) {
//        if (size == queue.length) {
//            // If the array is full, we need to resize it
//            resize();
//        }
//        queue[rear] = element;
//        rear = (rear + 1) % queue.length; // Circular increment
//        size++;
//    }
//
//    // Method to remove and return the element at the front of the queue (dequeue)
//    public String dequeue() {
//        if (isEmpty()) {
//            throw new NoSuchElementException("Queue is empty");
//        }
//        String removedElement = queue[front];
//        front = (front + 1) % queue.length; // Circular increment
//        size--;
//        return removedElement;
//    }
//
//    // Method to check if the queue is empty
//    public boolean isEmpty() {
//        return size == 0;
//    }
//
//    // Method to get the current size of the queue
//    public int getSize() {
//        return size;
//    }
//
//    // Method to resize the array when it's full
//    private void resize() {
//        int newCapacity = queue.length * 2;
//        String[] newQueue = new String[newCapacity];
//        int i = 0;
//        // Copy elements from front to rear in the new array
//        while (size > 0) {
//            newQueue[i++] = dequeue();
//        }
//        queue = newQueue;
//        front = 0;
//        rear = size;
//    }
//}

//    }
//
//    // Add a new element to the queue (simplified example)
//    public void enqueue(String item) {
//        if (size < element.length) {
//            element[size++] = item;  // Add item and increment size
//        } else {
//            // Handle case when the queue is full (resize array, throw an exception, etc.)
//            System.out.println("Queue is full!");
//        }
//    }
//
//    // Dequeue an element from the queue (simplified example)
//    public String dequeue() {
//        if (size == 0) {
//            return null;  // Handle empty queue case
//        }
//
//        String item = element[0];
//        for (int i = 1; i < size; i++) {
//            element[i - 1] = element[i];  // Shift elements left
//        }
//        size--;  // Decrement size
//        return item;
//    }
//}
