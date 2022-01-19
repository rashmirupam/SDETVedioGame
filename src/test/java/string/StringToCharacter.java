package string;

public class StringToCharacter {
    public static void main(String[] args) {
        String text = "i am indian";
        System.out.println(text);
        char ch[]=text.toCharArray();
        for (int i=0;i<ch.length;i++) {
            System.out.print(ch[i]);
        }
    }
}
