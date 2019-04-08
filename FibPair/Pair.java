/**
 Represent a pair of values of an arbitrary type,
 for which the compiler helpfully imposes the requirement
 that they be the SAME arbitrary type.

 based on _Core Java_ v10, by Cay Horstmann
 */
public class Pair<T> 
{
    private T first;
    private T second;

    public Pair( T first, T second) { 
        this.first =  first;
        this.second = second; 
        }

    public T getFirst()  { return first; }
    public T getSecond() { return second; }
}
