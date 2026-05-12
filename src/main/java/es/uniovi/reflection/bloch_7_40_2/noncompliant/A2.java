package es.uniovi.reflection.bloch_7_40_2.noncompliant;

public class A2 implements A1{

    @Override
    public void exampleA1_1() {
        System.out.println("Hello world");
    }

    @Override
    public String exampleA1_2(int ab) {
        return "Hello "+ab;
    }
}
