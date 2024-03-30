public class OrderedInsertMain {
    public static void main(String[] args) {
        LinkedList ordered = new LinkedList();
        ordered.orderedInsert(6);
        System.out.println(ordered);
        ordered.orderedInsert(-1);
        ordered.orderedInsert(11);
        ordered.orderedInsert(7);
        System.out.println(ordered);
        ordered.printInOrder();
    }
}
