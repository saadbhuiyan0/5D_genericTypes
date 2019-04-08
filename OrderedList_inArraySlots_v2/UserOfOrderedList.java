/**
  test OrderedList_inArraySlots
 */

public class UserOfOrderedList {
    public static OrderedList_inArraySlots orderedList =
      new OrderedList_inArraySlots();

    public static void main(String[] commandLine) {
        System.out.println( orderedList);
        System.out.println( System.lineSeparator());

        addOne( "populate an empty list"
               , 0
               ,"[0,]"
               );

        addOne( "add an element that belongs at the front"
               , -11
               ,"[-11,0,]"
               );

        addOne( "add an element that belongs at the back"
               , 5
               ,"[-11,0,5,]"
               );

        addOne( "add an element that belongs somewhere in the middle"
               , 2
               ,"[-11,0,2,5,]"
               );

        addOne( "add an element that is the same as another element"
               , 0
               ,"[-11,0,0,2,5,]"
               );

        // test removing an element
        axOne( orderedList.size()-1, "[-11,0,0,2,]");
        axOne( 0, "[0,0,2,]");
        axOne( 1, "[0,2,]");
    }


    /**
      add an element to the list
     */
    private static void addOne( String description
                              , int value
                              , String expect
                              ) {
        System.out.println( description);
        orderedList.add( value);
        report( expect);
     }


    /**
      remove an element from the list
     */
    private static void axOne( int index
                             , String expect
                             ) {
        System.out.println(
            "removed element " + index
          + " with value " + orderedList.remove( index)
          + ", leaving"
          );
        report( expect);
     }


     /**
       show the results of an operation
      */
    private static void report( String expect) {
        System.out.println(
            orderedList.size() + " elements: "
          + orderedList
          + " ...expecting "
          + expect
          );

        // show some elements
        if( orderedList.size() > 0)
            System.out.println(
                "  first: " + orderedList.get( 0)
              + ", last: "  + orderedList.get( orderedList.size() -1)
              + ", mid: "   + orderedList.get( orderedList.size() /2)
              );

        System.out.println();
    }
}
