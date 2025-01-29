

public class MyArrayList {
    private String[] elements = new String[4];
    private int size;


    public String[] getElements() {
        return elements;
    }

    public void setElements(String[] elements) {
        this.elements = elements;
    }

    public int getSize() {
        return size;
    }


    public boolean isEmpty() {
        return size == 0;
    }

    public void add(String onyii) {
        if (isFull()) increaseCapacity();
        elements[size++] = onyii;

    }

    public void increaseCapacity() {
        String[] newElements = new String[elements.length * 2];
        System.arraycopy(elements, 0, newElements, 0, elements.length);
        elements = newElements;
    }

    public boolean isFull() {
        return size == elements.length;
    }

    public boolean clear() {
        for (int index = 0; index < elements.length; index++) {
            elements[index] = "";
        }
        size = 0;
        return true;
    }

    public void remove(int index) {
        System.arraycopy(elements, index + 1, elements, index, size - index - 1);
        elements[--size] = null;
    }


    public String get(int index) {
        if (index >= 0 && index < size) {
            return elements[index];
        } else {
            return "None";
        }
    }


    public boolean contains(String element) {
        for (String item : elements) {
            if (element.equals(item)) return true;
        }
        return false;
    }
}

