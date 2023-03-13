
    public class DoublyLinkedList<E> {
        private static class Node<E> {
            private E element;
            private Node<E> prev;
            private Node<E> next;
            public Node(E e, Node<E> p, Node<E> n){
                element = e;
                prev = p;
                next = n;
            }
            public E getElement() { return element; }
            public Node<E> getPrev() { return prev;}
            public Node<E> getNext() { return next;}
            public void setPrev(Node<E> p) { prev = p; }
            public void setNext(Node<E> n) { next = n; }
        }

        private Node<E> header;
        private Node<E> trailer;
        private int size = 0;

        public DoublyLinkedList(){
            header = new Node<>(null, null, null);
            trailer = new Node<>(null, header, null);
        }

        public boolean isEmpty() { return size == 0; }
        public E first() {
            if(isEmpty()) return null;
            return header.getNext().getElement();
        }
        public E last() {
            if(isEmpty()) return null;
            return trailer.getPrev().getElement();
        }

        public void addFirst(E e){
            addBetween(e, header, header.getNext());
        }
        public void addLast(E e){
            addBetween(e, trailer.getPrev(), trailer);
        }
        public void addBetween(E e, Node<E> predecessor, Node<E> successor) {
            Node<E> newset = new Node<>(e, predecessor, successor);
            predecessor.setNext(newset);
            successor.setPrev(newset);
            size++;
        }
        public E removeFirst(){
            if(isEmpty()) return null;
            return remove(header.getNext());
        }
        public E removeLast(){
            if(isEmpty()) return null;
            return remove(trailer.getPrev());
        }
        public E remove(Node<E> node){
            Node<E> predecessor = node.getPrev();
            Node<E> successor = node.getNext();
            predecessor.setNext(successor);
            successor.setPrev(predecessor);
            size--;
            return node.getElement();
        }

        //homework Q2 for Lab6
        public int size(){
            if(header.getNext() == null) return 0;
            int i = 0;
            Node<E> e = header.getNext();
            while(e != trailer){
                e = e.getNext();
                i++;
            }
            return i;
        }
        //homework Q3 for Lab6
        public boolean equals(DoublyLinkedList list){
            if(this == list)
                return true;
            else if(this.size() == list.size()){
                Node<E> e = this.header.getNext();
                Node<E> e2 = list.header.getNext();
                while(e != null){
                    if(e.getElement() != e2.getElement())
                        return false;
                    e = e.getNext();
                    e2 = e2.getNext();
                }
                return true;
            }
            return false;
        }
        //homework Q4 for Lab6
        public void merge(DoublyLinkedList M){
            if(!isEmpty() && !M.isEmpty()){
                while(!M.isEmpty()){
                    addLast((E) M.removeFirst());
                }
            }
        }
        //homework Q5 for Lab6
        public void Sentinel(){
            trailer.setNext(header.getNext());
            header.getNext().setPrev(trailer);
            header.setNext(null);
        }
        //homework Q6 for Lab6
        public void Rotback(){
            Sentinel();
            Node<E> e = trailer.getNext();
            trailer = trailer.getPrev();
            trailer.setNext(e);
        }
        //homework Q7 for Lab6
        public void clone(DoublyLinkedList M){
            if(!isEmpty() && !M.isEmpty()){
                while(!isEmpty()){
                    removeFirst();
                }
                Node<E> m = M.header.getNext();
                while(m != M.trailer){
                    addLast(m.getElement());
                    m = m.getNext();
                }
            }
        }
        public static void main(String[] args) {
            DoublyLinkedList L = new DoublyLinkedList();
            DoublyLinkedList M = new DoublyLinkedList();
        }
    }

