package string;

public class Scp1JavaTest {
    public static void main(String[] args) {
        String s1="Software Tetingo";
        String s2=new String("software Testingo");
        if (s1==s2) {
            System.out.println("String s1 and s2 both are same");
        }
        else{
            System.out.println("Strings s1 and s2 both are not same")  ;
        }
    }
}
