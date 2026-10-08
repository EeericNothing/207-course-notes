import java.util.Iterator;
import java.util.TreeSet;

class SuperClass {
    String value = "SuperField";
    void show() {
        System.out.println("SuperMethod");
    }
}

class SubClass extends SuperClass {
    String value = "SubField";
    @Override
    void show() {
        System.out.println("SubMethod");
    }
}

public class test {
    public static void main(String[] args) {

        // Declare a TreeSet of Strings, and try to add some elements.
        TreeSet<String> s = new TreeSet<>();
        s.add("hello");
        s.add("silly");
        // We can look at the return value of add to see if the operation
        // succeeded.
        System.out.println(s.add("goodbye!"));
        // We won't be able to add this String a second or third time.
        System.out.println(s.add("silly"));
        System.out.println(s.add("silly"));

        // TreeSet has a toString that prints the set nicely.
        // The elements of the set could come out in any order.
        System.out.println(s);

        // TreeSet implements the Iterable interface, which guarantees that
        // it provides a hasNext and a next method. Here we use it to iterate
        // over our set and assemble a single String with all the words.
        String allWords = "";
        Iterator<String> it = s.iterator();
        while (it.hasNext()) {
            allWords += it.next();
        }
        System.out.println(allWords);

        // Because Treeset implements Iterable, we can instead use an
        // enhanced for-loop.  Much more concise!
        allWords = "";
        for(String word: s) {
            allWords += word;
        }
        System.out.println(allWords);
    }
}