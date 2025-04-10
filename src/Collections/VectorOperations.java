package Collections;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class VectorOperations {
    public static void main(String[] args) {
        Vector<Integer> vector = new Vector<>();
        vector.add(10);
        vector.add(20);
        vector.add(30);
        vector.add(40);
        vector.add(50);

        System.out.println("---------Using Enumeration-------------");
        Enumeration<Integer> en = vector.elements();
        while (en.hasMoreElements())
        {
            System.out.println(en.nextElement());
        }

        System.out.println("---------------Using Iterator---------------");
        Iterator<Integer> it = vector.iterator();
        while (it.hasNext())
        {
            System.out.println(it.next());
        }

        System.out.println("-------------Using Normal Loop------------------");
        for(int i=0; i<vector.size(); i++)
        {
            System.out.println(vector.get(i));
        }

        System.out.println("---------------Using ListIterator----------------");
        ListIterator<Integer> listIt = vector.listIterator();
        while (listIt.hasNext())
        {
            System.out.println(listIt.next());
        }


    }
}
