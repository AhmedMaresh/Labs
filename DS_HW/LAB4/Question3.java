package LAB4;

public class Question3<E> {
    public boolean equals(Object o){
        if (o==null || getClass() != o.getClass()){
            return false;
        }
        circlarlyLinkedList<E> other=(circlarlyLinkedList<E>) o;
        if (size() == 0 && other.size()==0){
            return true;
        }
        else {
            return false;
        }
        Node<E> actual=tail.getNext();
        Node<E> otherActual = other.tail.getNext();
        while (actual != tail) {
            if (!actual.getElement().equals(otherActual.getElement())){
                return false;
            }
            actual=actual.getNext();
            otherActual=otherActual.getNext();
        }
        return tail.getElement().eqauls(other.tail.getElement());
    }
}
