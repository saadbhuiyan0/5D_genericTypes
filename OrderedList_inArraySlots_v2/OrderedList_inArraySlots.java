/**
  OrderedList_inArraySlots

  A list with the invariant the elements are in order by
  increasing value, implemented using a
  List_inArraySlots
 */

public class OrderedList_inArraySlots
    implements OrderedList {

    private ?? Java-standard ArrayList here ?? list_iAS;

    public OrderedList_inArraySlots() {
        list_iAS = new List_inArraySlots();
    }

    /**
      @return the number of elements in this list
     */
    public int size(){
        return list_iAS.size();
    }

    /**
      @return a string representation of this Orderedlist_iAS
     */
    public String toString() {
        return list_iAS.toString();
    }


    /**
      Put @value where it belongs in the list.
      @pre: the list is in increasing order
     */
     public boolean add( int value) {
         int dest = 0;
         for( ; dest < list_iAS.size() && list_iAS.get( dest) < value
            ; dest++) ;
         // System.out.println( "OL adding " + value
         //                   + " at index " + dest);
         list_iAS.add( dest, value);
         return true;
     }


     /**
      @return element @index from this list
      precondition: @index is within the bounds of the array.
          (Having warned the user about this precondition,
           you should NOT complicate your code to check
           whether the condition was violated.)
     */
    public int get( int index ) {
        return list_iAS.get( index);
    }


    /**
      Remove the element at position @index in this list.

      Shift any subsequent elements to the left (that is,
      decrease the index associated with each).

      @return the value that was removed from the list
     */
    public int remove( int index) {
        return list_iAS.remove( index);
    }
}
