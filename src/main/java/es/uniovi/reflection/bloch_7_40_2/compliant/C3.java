package es.uniovi.reflection.bloch_7_40_2.compliant;

public class C3{

    public void exampleC3_1(C1 objectC2_1)
    {
        int a = objectC2_1.num1;
        C1 var = objectC2_1;

    }

    public void enumNotConsidered(EnumWithI e){
        e.exampleA1_1();
        e.exampleA1_2(2);
    }

    public void overriddenMethod(EnumWithI e){
        e.exampleA1_1();
        e.exampleA1_2(2);
    }
}
