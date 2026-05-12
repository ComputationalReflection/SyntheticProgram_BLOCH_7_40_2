package es.uniovi.reflection.bloch_7_40_2.compliant;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

public class Iter implements NoIterable, Iterable<Long>, C1 {
    @Override
    public Iterator iterator() {
        return null;
    }

    @Override
    public void forEach(Consumer action) {
        Iterable.super.forEach(action);
    }

    @Override
    public Spliterator spliterator() {
        return Iterable.super.spliterator();
    }

    public void m(Iter i) {
        long total = 0;
        for (Long l : i)
            total += l;
        i.exampleC1_1(0);
    }

    @Override
    public String exampleC1_1(int ab) {
        return "";
    }
}
