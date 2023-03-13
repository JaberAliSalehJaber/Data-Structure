public class ArrayStack<E>  implements Stack<E>{
    public static final int Capacity=1111;
    private E[] data;
    private int t =-1;
    public ArrayStack(){this(Capacity);}
    public ArrayStack(int capacity){
        data = (E[]) new Object[capacity];
    }
    @Override
    public int size(){ return(t+1);}
    @Override
    public boolean isEmpty(){ return(t == -1);}
    @Override
    public void push(E e) throws  IllegalStateException{
        if(size() == data.length) throw new  IllegalStateException("Stack is full");
        data[++t] = e;
    }
    @Override
    public E top(){
        if(isEmpty()) return null;
        return data[t];
    }
    @Override
    public E pop(){
        if(isEmpty()) return null;
        E answer = data[t];
        data[t] = null;
        t--;
        return answer;
    }
    public void signatureTransfer(ArrayStack S, ArrayStack T){
        while(!S.isEmpty())
            T.push(S.pop());
    }
    public void removAll(){
        while(!isEmpty())
            pop();
    }
    public void clone(ArrayStack array){
        ArrayStack arr = new ArrayStack();
        while(!array.isEmpty())
            arr.push(array.pop());
        while(!arr.isEmpty())
            push((E) arr.pop());
    }
}
