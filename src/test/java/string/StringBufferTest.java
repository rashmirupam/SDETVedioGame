package string;

public class StringBufferTest{
    public static void main(String[] args) {
        StringBuffer sb=new StringBuffer("abc");
        System.out.println(sb.hashCode());
        System.out.println(sb);

        System.out.println("after");
        sb.append("123");
        System.out.println(sb.hashCode());
        System.out.println(sb);
    }
}
