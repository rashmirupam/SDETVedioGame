package factorial;

public class FactorialTest {
    public static void main(String[] args) {
        int n=5;
        int product=n;
        for(int i=n;i>1;i--){
            product=(product)*(i-1);
        }
        System.out.println(product);
    }


}
