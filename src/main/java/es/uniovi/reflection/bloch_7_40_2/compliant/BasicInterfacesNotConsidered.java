package es.uniovi.reflection.bloch_7_40_2.compliant;

public class BasicInterfacesNotConsidered {

    public void m(Long l){
        l.toString();
    }

    public void m(String s){
        s.hashCode();
        s.equals("FOO");
    }
}
