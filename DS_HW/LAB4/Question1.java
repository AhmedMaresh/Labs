package LAB4;

public class Question1<E> {
    public void addFirst(E e){
        if (sz == 0){
            tail=new Node<>(e,null);
            tail.setNext(tail);
        }
        else {
            tail.setNext(new Node<>(e,tail.getNext()));
        }
        sz++;
    }
}
