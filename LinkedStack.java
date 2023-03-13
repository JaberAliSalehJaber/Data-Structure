public class LinkedStack<E>implements Stack<E> {
    private SinglyLinkedListSt<E> list = new SinglyLinkedListSt<>();
    public LinkedStack(){}

    @Override
    public int size() {
        return list.size;
    }

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public void push(E e) {
        list.addFirst(e);
    }

    @Override
    public E top() {
        return list.first();
    }

    @Override
    public E pop() {
        return list.removeFirst();
    }

    public void signatureTransfer(LinkedStack S, LinkedStack T){
        while(!S.isEmpty())
            T.push(S.pop());
    }
    public void removAll(){
        while(!isEmpty())
            pop();
    }
}

