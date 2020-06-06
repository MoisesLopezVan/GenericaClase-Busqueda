/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplosgenerica;

/**
 *
 * @author MoisesDario
 */
class ListaSimple<T> {
      private Node<T> head;
    private int listCount;
    
    public ListaSimple(){
        head = new Node(null);
    }
    
    public void add(T data){
        Node<T> temp = new Node(data);
        Node<T> Current = head;
        
        while(Current.getNext() != null){
            Current = Current.getNext();
            //System.out.println("recorriendo: " + Current.data);
        }
        Current.setNext(temp);
        listCount++;
    }
    
    public T get(int index){
        if(index < 0){
            return null;
        }
        Node<T> Current = head.getNext();
        for(int i =0; i<index; i++){
            if(Current.getNext() == null){
                return null;
            }
            Current = Current.getNext();          
        }
        return Current.getData();
    }
    
    public boolean remove(int index)
    // remueve el elemento en la posici�n indicada
    {
        // 
        if (index < 1 || index > size())
            return false;
        Node<T> Current = head;
        for (int i = 1; i < index; i++) {
            if (Current.getNext() == null)
                return false;
             Current = Current.getNext();
        }
        Current.setNext(Current.getNext().getNext());
        listCount--; // disminuimos el contador de nodos
        return true;
    }
 
    public int size()
    // returns the number of elements in this list.
    {
        return listCount;
    }
 
    public String toString() {
        Node<T> Current = head.getNext();
        String output = "";
        while (Current != null) {
            output += "[" + Current.getData().toString() + "]";
            Current = Current.getNext();
        }
        return output;
    }
 
    public class Node<T>{
        Node<T> next;
        private T data;
        
        public Node(T dataValue){
            next = null;
            data = dataValue;
        }
        
        public Node (T dataValue, Node<T> nextValue){
            next =  nextValue;
            data = dataValue;
        }
        
        public T getData(){
            return data;
        }
        
        public void setData(T dataValue){
            data = dataValue;
        }
        
        public Node<T> getNext(){
            return next;
        }
        
        public void setNext(Node<T> nextValue){
            next =  nextValue;
        }
    }
}
