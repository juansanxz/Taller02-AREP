package edu.escuelaing.arem.ASE.app;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class Generics
{
    public static void main( String[] args )
    {
        List<Integer> intList = new MyLinkedList<Integer>();
        intList.add (0);
        Integer x = (Integer) intList.iterator().next();
        printCollection(intList);
        printCollectionObject(intList);
        String [] arrayStr= {"2", "hola"};
        List<String> listStr = new MyLinkedList<String>();

        fromArrayToCollection(arrayStr, listStr);
        printCollectionObject(listStr);
    }

    static void printCollection(Collection c) {
        Iterator i = c.iterator();
        for (int k = 0; k < c.size(); k++) {
            System.out.println(i.next());
        }
    }

    static void printCollectionObject(Collection<?> c)
    {
        for (Object e : c) {
            System.out.println(e);
        }
    }

    static <T> void fromArrayToCollection(T[] a, Collection<T> c) {
        for (T o : a) {
            c.add(o); // Correct
        }
    }
}
