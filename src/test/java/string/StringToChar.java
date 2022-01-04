package string;

public class StringToChar {
    public static void main(String[] args) {
        String str = "i am indian";
    //    System.out.println(str.length());//agar sara letter pucta hai
        int count=0;
        char ch[] = str.toCharArray();
        for(int i =0;i<ch.length;i++) {
         //   System.out.println(ch[i]);
            if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u') { //only vowel
                count=count+1;
            }
            }
        System.out.println("vowel count  "+count);
        }

    }

