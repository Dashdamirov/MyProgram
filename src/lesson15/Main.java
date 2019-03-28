package lesson15;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        HashSet<String> strings = new HashSet<>();
        strings.add("qwerty");
        strings.add("ttttt");
        strings.add("hhhhh");
        strings.add("sdsd");
        strings.add("body");

        for (String s:strings) {
        System.out.println(s);
        }
        for (Iterator<String> iter = strings.iterator();iter.hasNext();){
            System.out.println(iter.next());
        }
    }


}
