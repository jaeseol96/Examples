public class LinkedListMain {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.add(3);
        ll.add(5);
        ll.add(7);
        ll.add(9);
        ll.removeElement(5);
        System.out.println(ll);
    }
}

