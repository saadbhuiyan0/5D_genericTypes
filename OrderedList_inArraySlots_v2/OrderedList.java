public interface OrderedList{

    // based on most recent List_inArraySlots

    /**
      @return the number of elements in this list
     */
    public int size();


    /**
       @return a string representation of this list,
       in [a,b,c,] format
      */
    public String toString();

    /**
      Appends @value to the end of this list.

      @return true, in keeping with add() in
                    Java's Collection interface
     */
     public boolean add( int value);


     /**
      @return element @index from this list
      precondition: @index is within the bounds of the array.
          (Having warned the user about this precondition,
           you should NOT complicate your code to check
           whether user violated the condition.)
     */
    public int get( int index );


    /**
      Remove the element at position @index in this list.

      Shift any subsequent elements to the left (that is,
      decrease the index associated with each).

      @return the value that was removed from the list
     */
    public int remove( int index);
}
