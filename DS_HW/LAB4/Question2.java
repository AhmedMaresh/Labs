package LAB4;

public class Question2<E> {
    public int size(){
        if (tail == null){
            return 0;

        }
        int counter=1;
        Node<E> actual=tail.getNext();
        while(actual !=tail){
            counter++;
            actual=actual.getNext();
        }
        return counter;
    }
}
