package string;

public class  ScpTest {
    public static void main(String[] args) {
        String str1="Hello";
        //String str2="Hello";
        String str2=new String("Hello");
        System.out.println(str1==str2);//chcek the object memory
        System.out.println(str1.equals(str2));//check the object content
    }
}
