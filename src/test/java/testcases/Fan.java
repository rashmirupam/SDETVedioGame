package testcases;

public class Fan {
    int wings; //jo class ke andar hota wo global hota ye sabi jaagh access hoga inside class
    String brand;
    String color;
    Fan(int wings,String color,String brand){
        this.wings=wings;
        this.brand=brand;
        this.color=color;
    }
    void m1() {
        int x = 10; //jo mehthod ke andar variable declear hota hai wo local hota hai ye sirf m1 me access hoga
        System.out.println("m1x" + x);
    }
    void m2(){
        System.out.println("m2x"+wings);
    }

    public static void main(String[] args) {
        Fan f = new Fan(3, "usha", "red");
        System.out.println(f.wings);
        System.out.println(f.brand);
        System.out.println(f.color);
     f.m1();
     f.m2();

        }
    }


