package ss09_DSA.bai_tap.ArrayList;

import java.util.Arrays;

public class MyList <E> {
    private int size = 0;
    public static final int DEFAULT_CAPACITY = 10;
    private Object elements[];

    public MyList(){
        elements = new Object[DEFAULT_CAPACITY];
    }

    public MyList(int capacity){
        elements = new Object[capacity];
    }

    private void ensureCapa(){
        int newSize = elements.length*2;
        elements = Arrays.copyOf(elements,newSize);
    }

    public void add(int index, E e){
        if(size == elements.length){
            ensureCapa();
        }
        for(int i =elements.length-1; i> index; i--){
            elements[i] = elements[i-1];
        }
        elements[index] = e;
        size++;
    }

    public void remove(int index){
        if(index<0  || index > elements.length){
            throw new IndexOutOfBoundsException("Not available in array!!");
        }
        for(int i = index;i < elements.length-1;i++){
            elements[i] = elements[i+1];
        }
        elements[elements.length-1] = null;
        size--;
    }

    public int size(){
        return size;
    }

    public MyList<E> clone(){
        return  this;
    }

    public boolean contains(E o){
        boolean check  = false;
        for(Object varible: elements){
            if(varible == o){
                check = true;
            }
        }
        return check;
    }

    public int indexOf(E o){
        int poisiton = -1;
        for(int i =0;i < size; i++){
            if(elements[i].equals(o)){
                poisiton = i;
                break;
            }
        }
        return  poisiton;
    }

    public void add(E o){
        if(size == elements.length){
            ensureCapa();
        }
        elements[size] = o;
        size++;
    }

    public void ensureCapa( int minCapacity){
        elements = Arrays.copyOf(elements,minCapacity);
    }
    public void clear(){
        for(int i =0; i < size; i++){
            elements[i] = null;
        }
    }

    public E get(int index){
        if(index < 0 || index > elements.length){
            throw new IndexOutOfBoundsException("Not available in array!!");
        }
        return (E) elements[index];
    }

    @Override
    public String toString() {
        return "MyList{" +
                "size=" + size +
                ", elements=" + Arrays.toString(elements) +
                '}';
    }
}
