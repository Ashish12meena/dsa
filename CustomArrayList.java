// CutomArrayList class implementation

import java.util.Arrays;

public class CustomArrayList<T> {
    private Object[] array;
    private int size = 0;

    CustomArrayList(int length) {
        array = new Object[length];
    }

    CustomArrayList() {
        array = new Object[10];
    }

    public void addLast(T value) {
        ensureCapacity();
        array[size++] = value;
    }
    public void add(int index,T value) {
        if (size < index || index<0) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
       ensureCapacity();
        
        for (int i = size; i > index; i--) {
            array[i] = array[i-1];
        }
        array[index] = value;
        size++;
    }


    public void removeLast() {
        if (size == 0) {
            System.out.println("Array is empty, nothing to remove.");
            return;
        }
        array[--size] = null; 

    }

    @SuppressWarnings("unchecked")
    public T get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        return (T) array[index];
    }

    private void ensureCapacity() {
        if (size == array.length) {
            array = Arrays.copyOf(array, array.length * 2);
        }
    }

    public int size() {
        return size;
    }

    public void display() {
        for (int i = 0; i < size; i++) {
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        CustomArrayList<Integer> list = new CustomArrayList<>(3);
        System.out.println();
        list.addLast(23);
        list.addLast(45);
        list.addLast(67);
        list.addLast(81);
        list.addLast(86);
        list.addLast(83);
        list.display();
        list.add(2, 72);
        list.display();
       list.removeLast();
        list.display();
        System.out.println(list.get(4));
    }
}