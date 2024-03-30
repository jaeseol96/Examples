public class LinkedList {
    private Node top;
    private int numElements;

    public LinkedList() {
        this.top = null;
        this.numElements = 0;
    }

    public void printInOrder() {
        System.out.print("<<");
        printInOrder(top);
        System.out.print(" >>");

    }

    private void printInOrder(Node curr) {
        if (curr != null) {
            System.out.print(" " + curr.value);
            printInOrder(curr.next);
        }
    }

    private Node getNode(int index) {
        if (index < 0 || isEmpty()) {
            throw new IndexOutOfBoundsException(index + " is not indexable.");
        }

        Node curr = top;
        int posn = 0;
        while (curr != null && posn < index) {
            curr = curr.next;
            posn++;
        }
        return curr;
    }

    public void orderedInsert(Object insert) {
        // start at front of list, compare elements until find correct spot to put
        // element
        // insert the element
        Node curr = top;
        Node prev = null;
        Node toInsert = new Node(insert);
        while (curr != null && curr.compareTo(toInsert) < 0) {
            prev = curr;
            curr = curr.next;

        }

        // insert element

        if (prev == null) {
            toInsert.next = top;
            top = toInsert;
        } else {
            prev.next = toInsert;
            toInsert.next = curr;
        }
    }

    private boolean isEmpty() {
        return this.top == null;
    }

    // Remove by object
    public void removeElement(Object obj) {
        // remove first element or
        // remove middle/last element
        Node curr = top;
        Node prev = null;

        while (curr != null && !curr.value.equals(obj)) {
            prev = curr;
            curr = curr.next;
        }
        if (curr == null) {
            System.out.println("Element not found");
        } else if (curr == top) {
            top = curr.next;
            numElements--;
        } else {
            prev.next = prev.next.next;
            numElements--;
        }
    }

    public void add(Object obj) {
        Node newNode = new Node(obj, top);
        this.top = newNode; 
    }

    public void addToPosition(int index, Object o) {
        if (index < 0 || index > numElements) {
            throw new IndexOutOfBoundsException("Negative numbers cannot be index");
        }
        if (index == 0) {
            top = new Node(o, top);
            numElements++;
        } else {
            Node curr = top;
            Node prev = null;
            int counter = 0;
            while (curr != null && counter < index) {
                prev = curr;
                curr = curr.next;
                counter++;
            }
            if (curr == null && counter != index) { // must be at end of list
                throw new IndexOutOfBoundsException(index + " is too big, not that many elements in the list");
            }
            Node newNode = new Node(o, curr);
            prev.next = newNode;
            numElements++;

        }
    }



    public String toString() {
        Node curr = top;
        String result = "";
        if (isEmpty()) {
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

        public Node(Object value) {
            this.value = value;
            this.next = null;
        }

        public String toString() {
            return value.toString();
        }

        public int compareTo(Node other) {
            int curr = (Integer) this.value;
            int otherInt = (Integer) other.value;
            return curr - otherInt;

        }
    }
}