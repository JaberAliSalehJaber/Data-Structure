public class stack_One_Two_Three {
    //Q_one
    public void signatureTransfer(LinkedStack S, LinkedStack T){
        while(!S.isEmpty())
            T.push(S.pop());
    }
    //Q_two
    public void removall(){
        while (!isEmpty())
            pop();
    }
    //Q_three
    public void clone(ArrayStack array){
        ArrayStack arr = new ArrayStack();
        while(!array.isEmpty())
            arr.push(array.pop());
        while(!arr.isEmpty())
            push((E) arr.pop());
    }
}
