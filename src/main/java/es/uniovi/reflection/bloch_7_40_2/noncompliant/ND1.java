package es.uniovi.reflection.bloch_7_40_2.noncompliant;

import java.util.ArrayList;
import java.util.HashMap;

public class ND1 {

    public void exampleND1_1(C2 objectC2_1) {
        Object var = objectC2_1;

    }


    public void iterable(IterClass i) {
        long total = 0;
        for (Long l : i)
            total += l;
    }

    public ND1(C2 c2) {
        c2.toString();
        c2.hashCode();
        c2.getClass();
    }

    public void generic(ArrayList<Long> l){
        l.add(0L);
        for(Long n : l)
            l.contains(n);
        l.toString();
    }

    public void genericMap(HashMap<String, Integer> m){
        m.put("a", 100);
    }
}
