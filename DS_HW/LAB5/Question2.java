package LAB5;

public class Question2 {
    public int sz() {

        int counter = 0;
        Node<E> actual = header.getNext();

        while (actual != trailer) {
            counter++;
            actual = actual.getNext();
        }

        return counter;
    }
}
