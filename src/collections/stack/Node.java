package collections.stack;

/**
 * Created by Denni on 20.05.2016.
 */
public class Node {
    private Integer element;
    private Node next;

    public Node(Integer element, Node next) {
        this.element = element;
        this.next = next;
    }

    public Integer getElement() {
        return element;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node getNext() {
        return next;
    }
}
