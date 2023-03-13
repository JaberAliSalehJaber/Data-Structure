public class SinglyLinkrdLast <E>{
        private Node<E>head=null;
        private Node<E>tail=null;
        private int size=0;



        public boolean isEmpty()
        {
            return size==0;
        }
        public E first()
        {
            if (isEmpty()) return null;
            return head.getElement();
        }
        public E last()
        {
            if (isEmpty()) return null;
            return tail.getElement();
        }
        public void addFirst(E element)
        {
            head= new Node<E>(element,head);
            if (isEmpty())
                tail=head;
            size++;
        }
        public void addLast(E element)
        {
            Node<E>newest= new Node<>(element,null);
            if (isEmpty())
                head=newest;
            else
                tail.setNext(newest);
            tail=newest;
            size++;
        }
        public E removeFirst()
        {
            if (isEmpty())return null;
            E deleted= head.element;
            head=head.next;
            size--;
            if (size==0)
                tail=null;
            return deleted;
        }

        private static class Node<E>
        {
            E element;
            Node<E> next;

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
        // homework Q1 for Lab4
        public boolean equals(Node n,Node n1) {
            if (n == n1){
                if (n.next == n1.next){
                    if(n.element == n1.element){
                        return true;
                    }
                }
            }
            return false;
        }
        // homework Q2 for Lab4
        private void find(){
            if (head != null){
                Node t =head;
                while (t.next != null){
                    System.out.println(t.next.getElement());
                    t=t.next;
                }
            }
            else System.out.println("Is Empty");
        }
        // homework Q3 for Lab4
        private int size(){
            int num_el =0;
            if (head !=null){
                Node t=head;
                num_el++;
                while (t.next !=null){
                    num_el++;
                    t=t.next;
                }
                return num_el;
            }
            return num_el;
        }
        // homework Q4 for Lab4
        private void rotate(){
            if (!isEmpty()){
                E ele= tail.getElement();
                tail.element =head.getElement();
                head.element =ele;
            }
        }
        // homework Q5 for Lab4
        private void groub(SinglyLinkrdLast x,SinglyLinkrdLast y){
            if (!x.isEmpty() && !y.isEmpty()){
                x.tail.next =y.head;
                head= x.head;
                tail=y.tail;
            }
        }
        // homework Q6 for Lab4
        private void revers(){
            if (head != null){
                Node pr =null;
                Node cur =head , next;
                while (cur !=null){
                    next=cur.next;
                    cur.next=pr;
                    pr=cur;
                    cur=next;
                }
                tail=head;
                head=pr;
            }
        }

        public static void main(String[] args) {
            SinglyLinkrdLast ob =new SinglyLinkrdLast();
            SinglyLinkrdLast ob1 =new SinglyLinkrdLast();
            SinglyLinkrdLast ob2 =new SinglyLinkrdLast();
            SinglyLinkrdLast<Integer>l=new SinglyLinkrdLast<>();
//        System.out.println(l.isEmpty());
//        System.out.println(l.size());
//        l.addFirst(11);
//        l.addLast(12);
//        l.addLast(13);
//        l.addFirst(10);
//        while (!l.isEmpty()){
//            System.out.print(l.removeFirst()+"\t");
//        }
//        System.out.println(l.size());
        }
    }

