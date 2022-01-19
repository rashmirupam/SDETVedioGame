package string;

public class StringImmutable {
    public static void main(String[] args) {
        String a="123";
        System.out.println(a.hashCode());
        System.out.println(a);
        a="abc"+a;
        System.out.println("after");
        System.out.println(a.hashCode());
        System.out.println(a);
    }
}
