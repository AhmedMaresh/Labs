package LAB4;

import study.doublyLinkedList;

public class Question4<E> {
    public boolean same(circularlyLinkedList<E> m,circularlyLinkedList<E> d){
        if (m.size()!=d.size()){
            return false;
        }
        if (m.size()==0 && d.size()==0){
            return true;
        }
        Node<E> tailM=m.tail;
        Node<E> tailD=d.tail;
        set<Node<E>> visit=new doublyLinkedList.Node<>();
        Node<E> actualM=tailM.getNext();
        Node<E> actualD=tailD.getNext();
        while (actualM != tailM){
            visit.add(actualM);
            actualM=actualM.getNext();
        }
        visit.add(tailM);
        while (actualD != tailD){
            if (visit.contains(actualD)){
                return false;
            }
            actualD=actualD.getNext();
        }
        return visit.contains(tailD);
    }
}
