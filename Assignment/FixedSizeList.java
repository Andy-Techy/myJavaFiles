// this tool creates a fixed size list using Arrays

// INTUITION:
//     List grows and shrink. this tool helps to create a static list using arrays, why?

//     arrays are designed to be efficient, direct access to data using contiguous block of memory.

//     in java, the only available methods available are .lenght and index[], as a result, methods in lists are used to manipulate data
//     as this gives rise to arrayLists in java.


//E is Element. A general data type meaning a list of all data types can be created
public class FixedSizeList <E> {
    private E [] data; 


    // creating a default capacity  of 7
    public static final int CAPACITY = 7;

    // creating a variable to track changes made to list
    private int size = 0;

    // declaring constructors user uses to create list
    public FixedSizeList() {
        this(CAPACITY);
    }

    @SuppressWarnings("unchecked")
    public FixedSizeList (int desiredSize) {
        data = (E[])new Object[desiredSize];
    }
    
    // creating a method to check if index is within range
    // void because we don't want it to return anything
    // check index takes to arguments, the index and the array size
    public void  checkIndex(int i, int n) {
        // if statement to check index in range
        if (i < 0 || i >= n) 
            throw new IndexOutOfBoundsException("Index" + i + " out of bounds.");
    }
    //creating a method to add an element at an index
    // int i - at a particular index
    // E -  a generic element  called e
    public void addIndex(int i, E e){
        // we first check if index is in size or out of bounds
        checkIndex(i, size + 1);

        // checking if default list content  is the same as size
        if (size == data.length)
            throw new IllegalStateException("List is full");

        //if list not full loop through the list
        for (int k = size - 1; k >= i; k--) {
            data [k + 1] = data[k];
        }

        data[i] = e;
        size ++;    
    }
    //creating method to allow user add element without specifying index that's at the last place
    public void addIndex(E e) {
        int i = size;
        //calling the addIndex method
        addIndex(i, e);
    }

    //creating a remove method
    public E remove(int i){
        //for any given index, first check if index is in list
        checkIndex(i, size);

        //creating a temporal variable  of the type E
        E temp = data[i];

        //looping through and replace
        for (int k = i;  k > size - 1; k++){
            data[k] = data[k + 1];
        }
        data[size - 1]  = null;

        //decrementing size by 1
        size --;

        //returning deleted element
        return temp;
    }

    //creating a method to return size of list
    public int size() {
        return size;
    }

    //creating a method to check if list is Empty
    public boolean isEmpty() {
        //compare size to zero, if true; return true and vice versa
        return size == 0; 
    }

    //creating a method to retun an element at an index
    public E getIndex(int i) throws IndexOutOfBoundsException {
        checkIndex(i, size) ;
        return data[i];
    }

    //creating a method to replace an index
    public E setIndex(int i, E e) {
    
    //before replacing, check if index is within range
        checkIndex(i, size); 

        E temp = data[i]; 
        data[i] = e;
        return temp;
    }

    //creating a method to check if the list contains a particular element
    public boolean contains(Object item) {
        // use a for loop to pick each element at each index and compare to the lement
        for (int j = 0; j < size - 1; j ++){
               //as we loop, we compare
            if (getIndex(j).equals(item)) {
                return true;
            } 
        }
        return false;
    }

    // Assignments
    // a) create a method that will return the all the indexes of an element
    // b) create a method that will print out the content of the list
    // c) create a method that will clear or delete all content in the list.

    // a) creating a method that will return all the indexes of an element
    public int[] getIndexesOf(E item) {
        int[] indexes = new int[size];
        int count = 0;
        for (int j = 0; j < size; j++) {
            if (data[j].equals(item)) {
                indexes[count++] = j;
            }
        }
        return java.util.Arrays.copyOf(indexes, count);
    }
    
    // b) creating a method that will print out the content of the list
    public void printList() {
        System.out.print("[ ");
        for (int j = 0; j < size; j++) {
            System.out.print(data[j] + " ");
        }
        System.out.println("]");
    }
    
    // c) create a method that will clear or delete all content in the list.
    public void clearList() {
        for (int j = 0; j < size; j++) {
            data[j] = null;
        }
        size = 0;
    }
}

