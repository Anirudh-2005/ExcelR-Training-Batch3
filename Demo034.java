class EvenOdd{
    String evenOdd(int num){
        if(num % 2 == 0){
            return "even";
        }
        else 
            return "odd";
    }
}
public class Demo034 {
    public static void main(String[] args) {
        EvenOdd obj = new EvenOdd();
        int num = 23;
        String res = obj.evenOdd(num);
        System.out.println(num+" is "+res);
        }
}