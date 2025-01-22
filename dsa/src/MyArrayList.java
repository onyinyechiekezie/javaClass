import java.util.Arrays;
import java.util.Objects;

public class MyArrayList {
    private String [] elements;
    private int size;

    public MyArrayList(int capacity) {
        elements = new String[capacity];
        size = 0;
    }
    public MyArrayList() {

    }
    public String[] getElements() {
        return elements;
    }

    public void setElements(String[] elements) {
        this.elements = elements;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean add(String onyii) {
        if (size == elements.length) {
            if (size>=elements.length) {
                elements = Arrays.copyOf(elements, size * 2);
            }
            elements[size] = onyii;
        }
        size++;
        return true;
    }

    public boolean clear() {
        for(int index = 0; index < elements.length; index++) {
            elements[index] = "";
        }
        size = 0;
        return true;
    }

    public void remove(int index) {

        System.arraycopy(elements, index + 1, elements, index, size - index - 1);
        elements[--size] = null;
    }

    public String set(int index, String value) {
        System.arraycopy(elements, index + 1, elements, index, size - index + 1);
        Arrays.fill(elements, value);
        return elements[index];
    }



}
