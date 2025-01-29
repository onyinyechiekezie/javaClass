public class MySet {
    MyArrayList myList = new MyArrayList();


    public int size() {
        return myList.getSize();
    }

    public boolean isEmpty() {
        return myList.isEmpty();
    }

    public void add(String onyii) {
        if (!myList.contains(onyii))
            myList.add(onyii);
    }

    public void remove(int index) {
        myList.remove(index);
    }

    public void duplicate() {
        for (int index = 0; index < myList.getSize() - 1; index++) {
            if (myList.get(index).equals(myList.get(index + 1))) {
                myList.remove(index);
                index--;
            }
        }
    }

}


   /* public boolean add(String elements) {
        boolean isExist = false;

        for(int index = 0 ; index < getSize() ; index++) {
            if(get(index).equals(elements)){
                isExist = true;
                break;
            }
        }
        if(!isExist){
            super.add(elements);
        }
        return isExist;
    }*/




