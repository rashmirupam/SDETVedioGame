package override;

public class OverrideTest {
    public static void main(String[] args) {
        A r=new B();
        r.m1();
    }
}

class B extends A{
   /* void m1() {
        System.out.println("B:m1");
    }*/
}

class A {
    void m1() {
        System.out.println("A:m1");
    }
}
