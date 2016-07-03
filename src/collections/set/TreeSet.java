package collections.set;

import java.util.NoSuchElementException;

/**
 * Created by Denni on 10.06.2016.
 */
public class TreeSet {

    private Node head;
    private Node lastPosition;

    private class Node {
        public Integer element;
        public Node parrent;
        public Node leftChild;
        public Node rightChild;

        public Node(Integer element) {
            this.element = element;
        }
    }

    public boolean add(Integer element) {

        Node nd = new Node(element);
        if (head == null) {
            head = nd;
            return true;
        } else {
            return findAddPosition(element, head);

        }
    }


    public boolean contains(Integer element) {
        if (findElement(head, element)) {
            return true;
        }
        return false;
    }

    public void loc() {
        inOrder(head);
    }

    public void inOrder(Node position) {

        if (position != null) {
            inOrder(position.leftChild);
            System.out.println(position.element + " ");
            inOrder(position.rightChild);
        }

    }

    public boolean findElement(Node position, Integer element) {
        if (position != null && (position.element == element

                || findElement(position.leftChild, element)
                || findElement(position.rightChild, element))) {
            return true;
        }
        return false;


//        boolean result = false;
//    if (position != null) {
//        if (position.element == element) {
//            return true;
//        }
//        result = findElement(position.leftChild, element);
//        if (result == true) {
//            return true;
//        }
//
//        result = findElement(position.rightChild, element);
//        if (result == true) {
//            return true;
//        }
//
//
//    }
//    return false;
    }

    public boolean findAddPosition(Integer element, Node current) {

        if (element < current.element & current.leftChild == null) {
            Node nd = new Node(element);
            nd.parrent = current;
            current.leftChild = nd;
            return true;
        } else if (element > current.element & current.rightChild == null) {
            Node nd = new Node(element);
            nd.parrent = current;
            current.rightChild = nd;
            return true;
        } else if (element < current.element & current.leftChild != null) {

            return findAddPosition(element, current.leftChild);
        } else if (element > current.element & current.rightChild != null) {

            return findAddPosition(element, current.rightChild);
        } else {
            return false;
        }
    }


    public int remove(int element) {
        if (removeValue(head, element) == element) {
            return element;
        }
        return -1;
    }


    public int removeValue(Node position, int element) {
        int deletevalue;

        if (element == position.element & position.leftChild == null & position.rightChild == null) {
            deletevalue = position.element;
            if (position == head) {
                head = null;
            } else if (position.element > position.parrent.element) {
                position.parrent.rightChild = null;
            } else {
                position.parrent.leftChild = null;
            }
            return deletevalue;
        } else if (element == position.element & position.leftChild != null & position.rightChild == null) {
            deletevalue = position.element;
            if (position == head) {
                head = position.leftChild;

            } else if (position.parrent.element > position.parrent.parrent.element) {
                position.parrent.parrent.rightChild = position.leftChild;
            } else {
                position.parrent.parrent.leftChild = position.leftChild;
            }
            position.leftChild = null;
            return deletevalue;
        } else if (element == position.element & position.leftChild == null & position.rightChild != null) {
            deletevalue = position.element;
            if (position == head) {
                head = position.rightChild;

            } else if (position.parrent.element > position.parrent.parrent.element) {
                position.parrent.parrent.rightChild = position.rightChild;
            } else {
                position.parrent.parrent.leftChild = position.rightChild;
            }
            position.rightChild = null;
            return deletevalue;


        } else if (element == position.element & position.leftChild != null & position.rightChild == null) {
            deletevalue = position.element;
            if (position == head) {
                head = position.leftChild;

            } else if (position.parrent.element > position.parrent.parrent.element) {
                position.parrent.parrent.rightChild = position.leftChild;
            } else {
                position.parrent.parrent.leftChild = position.leftChild;
            }
            position.leftChild = null;
            return deletevalue;


        }else if (element < position.element & position.leftChild != null) {

            return removeValue(position.leftChild, element);
        } else if (element > position.element & position.rightChild != null) {

            return removeValue(position.rightChild, element);
        } else {

            throw new NoSuchElementException();
        }

    }


    private Node getSuccesor(Node delNode) {
        Node successorParent = delNode;
        Node successor = delNode;
        Node corrent = delNode.rightChild;

        while (corrent != null) {
            {
                successorParent = successor;
                successor = corrent;
                corrent = corrent.leftChild;
            }
            if (successor != delNode.rightChild) {
                successorParent.leftChild = successor.rightChild;
                successor.rightChild = delNode.rightChild;
            }
        }


        return successor;
    }
}


