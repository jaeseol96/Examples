public class LinkedList {
    private Node top;

    public LinkedList() {
        this.top = null;

    }

    public void add(Object obj) {
        Node newNode = new Node(obj, top);
        this.top = newNode; 
    }

    public void addToPosition(int index, Object o) {
        int counter = 0;
        if (index > 0) {
            while (counter < index && ) {
                
            }
        }
    }

    private Node getNode(int posn) {
        
    }

    public String toString() {
        String result = "";
        if (top == null) {
            return "Empty linked list";
        } else {
            result = "<< ";
            Node current = top;
            while(current != null) {
                result += current.toString() + " ";
                current = current.next;
            }
            result += " >>"; 
            return result;
        }
    }

    class Node {
        Object value;
        Node next; 

        public Node(Object value, Node next) {
            this.value = value;
            this.next = next;
        }

        public String toString() {
            return value.toString();
        }
    }
}