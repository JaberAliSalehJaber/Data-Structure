public class circularlyLinkrdLast<E> {
    private Node<E>tail=null;
    private int size=0;
    public circularlyLinkrdLast(){}

    public boolean isEmpty()
    {
        return size==0;
    }
    public E first()
    {
        if(isEmpty())return null;
        return tail.getNext().getElement();
    }
    public E last()
    {
        if(isEmpty())return null;
        return tail.getElement();
    }
    //homework Q1 for Lab5
    public void addFirst(E element)
    {
        if (isEmpty())
        {
            tail=new Node<>(element,null);
            tail.next=tail;
        }else
        {
            Node<E> newest= new Node<>(element,tail.next);
            tail.next=newest;
        }
        size++;
    }
    public void addLast(E element)
    {
        addFirst(element);
        tail=tail.next;
    }
    public E removeFirst()
    {
        if (isEmpty())return null;
        Node<E> x =tail.next;
        if (x==tail)
            tail=null;
        else
            tail.next=x.next;
        size--;
        return x.element;
    }
    public void rotate()
    {
        if (tail!=null)
            tail=tail.next;
    }

    //homework Q2 for Lab5
    public int size(){
        if (tail ==null)
            return  0;
        if (tail.getNext()== tail)
            return 1;
        Node<E> cheak = tail.getNext();
        int l=1;
        while (cheak != tail){
            cheak =cheak.next;
            l++;
        }
        return l;
    }
    //homework Q3 for Lab5
    public boolean equals(circularlyLinkrdLast e){
        Node<E> one = tail.next;
        Node<E> two = e.tail.next;
        boolean chek = false;
        while(one != tail && two != e.tail){
            if(one.element != two.element)
                return false;
            one = one.next;
            two = two.next;
        }
        if(one == tail && two == e.tail)
            return true;
        return false;
    }
    //homework Q4 for Lab5
    public boolean equalsdeffrint(circularlyLinkrdLast e){
        Node<E> one = tail.next;
        Node<E> two = e.tail.next;
        while(two != e.tail){
            if(one.element == two.element)
                break;
            two = two.next;
        }
        while(one.element == two.element && two != e.tail){
            one = one.next;
            two = two.next;
        }
        if(one.element != two.element)
            return false;

        return true;
    }

    //homework Q5 for Lab5
    public void half(circularlyLinkrdLast link, circularlyLinkrdLast link1){
        if(!isEmpty())
            if(size % 2 == 0){
                int count = 1;
                while(count <= size/2){
                    tail = tail.next;
                    link.addLast(tail.element);
                    count++;
                }
                while(count <= size){
                    tail = tail.next;
                    link1.addLast(tail.element);
                    count++;
                }
            }
    }
    //homework Q6 for Lab5
    public void clone(circularlyLinkrdLast link2){
        if(!isEmpty()){
            Node<E> n = tail;
            while(n.next != tail){

                n = n.next;
                link2.addLast(n.element);
            }
            link2.addLast(tail.element);
        }
    }


    private static class Node<E>
    {
        E element;
        Node<E>next;

        public Node(E element, Node<E> next) {
            this.element = element;
            this.next = next;
        }

        public E getElement() {
            return element;
        }

        public void setElement(E element) {
            this.element = element;
        }

        public Node<E> getNext() {
            return next;
        }

        public void setNext(Node<E> next) {
            this.next = next;
        }
    }
    public static void main(String[] args) {
        circularlyLinkrdLast o1 = new circularlyLinkrdLast();
        circularlyLinkrdLast o2 = new circularlyLinkrdLast();
        circularlyLinkrdLast o3 = new circularlyLinkrdLast();

        o1.addLast(1);
        o1.addLast(2);
        o1.addLast(3);
        o1.addLast(4);
        o1.addLast(5);
        o1.addLast(6);

    }
}


