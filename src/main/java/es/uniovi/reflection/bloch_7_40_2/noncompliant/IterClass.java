package es.uniovi.reflection.bloch_7_40_2.noncompliant;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

public class IterClass implements  IterI{
    @Override
    public Iterator<Long> iterator() {
        return null;
    }

    @Override
    public void forEach(Consumer<? super Long> action) {
        IterI.super.forEach(action);
    }

    @Override
    public Spliterator<Long> spliterator() {
        return IterI.super.spliterator();
    }
}
