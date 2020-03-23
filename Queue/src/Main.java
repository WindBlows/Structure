public class Main {
    public static void main(String[] args) {
        ArrayQueue arrayQueue = new ArrayQueue();
        for (int i = 0; i < 10; i++) {
            arrayQueue.enqueue(i);
        }
        System.out.println(arrayQueue);

        arrayQueue.dequeue();
        arrayQueue.getFront();
        System.out.println(arrayQueue);
    }
}
