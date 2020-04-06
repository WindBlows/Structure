public class Main {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.add(0, 3);
        linkedList.add(1, 4);
        linkedList.add(2, 5);
        linkedList.add(3, 6);
        System.out.println(linkedList);
        linkedList.remove(2);
        System.out.println(linkedList);
    }
}
