public class DoubleLinkedList<T> {

    private int listSize;
    private Node<T> listFront;
    private Node<T> listBack;
    private Node<T> anchor;

    public DoubleLinkedList() {
        listSize = 0;
        listFront = null;
        listBack = null;
        anchor = null;
    }

    //region setters and setters
    public int getListSize() {
        return listSize;
    }

    public void setListSize(int listSize) {
        this.listSize = listSize;
    }

    public Node<T> getListFront() {
        return listFront;
    }

    public void setListFront(Node<T> listFront) {
        this.listFront = listFront;
    }

    public Node<T> getListBack() {
        return listBack;
    }

    public void setListBack(Node<T> listBack) {
        this.listBack = listBack;
    }

    public Node<T> getAnchor() {
        return anchor;
    }

    public void setAnchor(Node<T> anchor) {
        this.anchor = anchor;
    }

    //endregion

    public boolean isEmpty (){
        return  listSize == 0;
    }

    public void print(){
        if(isEmpty()){
            System.out.println("It's empty");
        }
        Node<T> temp = listFront;
        while(temp != null){
            System.out.println(temp.getElement());
            temp = temp.getNext();
        }
    }

    public void pushFront(T element){
        if (isEmpty()){
            listFront = new Node<>(element,null,null);
            listBack = listFront;
        }
        else{
            Node<T> temp = new Node<>(element,listFront, null);
            listFront.setPrev(temp);
            listFront = temp;
        }
        listSize++;
    }

    public void pushBack(T element){
        if(isEmpty()){
            listBack = new Node<>(element,null, null);
            listFront = listBack;
        }
        else{
            Node<T> temp = new Node<>(element,null, listBack);
            listBack.setNext(temp);
            listBack = temp;
        }
        listSize++;
    }

    public void insert(T element, int pos){
        if(pos == 0){
            pushFront(element);
        }
        else if(pos == listSize){
            pushBack(element);
        }
        else if(pos < 0 || pos > listSize){
            System.out.println("Invalid pos");
        }
        else {
            int numaux = 0;
            Node<T> aux = listFront;
            while (numaux < pos){
                aux = aux.getNext();
                numaux++;
            }

            Node<T> newNode = new Node<>(element,aux,aux.getPrev());
            aux.getPrev().setNext(newNode);
            aux.setPrev(newNode);
            listSize++;
        }
    }

    public void popFront(){

        if (isEmpty()){
            System.out.println("It's empty");
            return;
        }

        Node<T> nodeToDelete = listFront;
        listFront = listFront.getNext();

        if (listFront != null){
            listFront.setPrev(null);
        }
        nodeToDelete = null;
        listSize--;
    }

    public void popBack(){
        if (isEmpty()){
            System.out.println("It's empty");
            return;
        }

        Node<T> nodeToDelete = listBack;

        if(nodeToDelete == listFront){// si el temporal es igual al inicio(solo un elemento)
            popFront();
            return;
        }

        listBack = nodeToDelete.getPrev();
        listBack.setNext(null);
        nodeToDelete = null;

        listSize--;
    }

    public void remove(int pos){
        if(isEmpty()){
            System.out.println("It's empty");
        }
        else if(pos == 0){
            popFront();
        }
        else if(pos == listSize){
            popBack();
        }
        else if(pos < 0 || pos > listSize){
            System.out.println("Invalid pos");
        }
        else{
           int auxPos = 0;
           Node<T> aux = listFront;

           while (auxPos < pos){
               aux = aux.getNext();
               auxPos++;
           }

           aux.getPrev().setNext(aux.getNext());
           aux.getNext().setPrev(aux.getPrev());
           aux = null;
           listSize--;
        }
    }

    public void clearList(){

        Node<T> aux = null;

        while (listFront != null){
            aux = listFront;
            listFront = listFront.getNext();
            aux = null;
        }

        listSize = 0;
        listFront = null;
        listBack = null;
        anchor = null;
    }
}
