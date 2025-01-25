class Bigof3nums{
    int bigOf3(int x, int y, int z) {
        if((x>y) && (x>z))
            return x;
        else if((y>x)&&(y>z))
            return y;
        else
            return z;
    }
}
public class Demo036 {
    public static void main(String[] args) {
        Bigof3nums obj = new Bigof3nums();
        int bigNum = obj.bigOf3(100,200,500);
        System.out.println(bigNum);
        }
}