class Bigof2nums{
    int bigOf2(int x, int y) {
        if(x>y)
            return x;
        return y;
    }
}
public class Demo035 {
    public static void main(String[] args) {
        Bigof2nums obj = new Bigof2nums();
        int bigNum = obj.bigOf2(100,20);
        System.out.println(bigNum);
        }
}