package string;

public class EqualMethodTest {
    public static void main(String[] args) {
        StringBuffer sb=new StringBuffer("abc");
        StringBuffer sb1=new StringBuffer("abc");
        System.out.println(sb==sb1);
        System.out.println(sb.equals(sb1));
        System.out.println("string ke liye");
        String s="abc";
        String s2=new String("abc");
        System.out.println(s==s2);
        System.out.println(s.equals(s2));
    }
}

