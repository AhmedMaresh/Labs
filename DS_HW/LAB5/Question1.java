package LAB5;

public class Question1 {
    public static <E> void splitInHalf(circularlyLinkedList<E> A, circularlyLinkedList<E> B, circularlyLinkedList<E> C) {
    }
    Node<E> tailA = A.tail;

    Node<E> mid = A.head;

    for (int i = 0; i < A.size() / 2 - 1; i++) {
        mid = mid.getNext();
    }

    Node<E> next = mid.getNext();

    mid.setNext(tailB.getNext());

    tailL.setNext(next);

    B.head = A.head;

    B.tail = mid;

    C.head = next;

    C.tail = tailA;
    
}
