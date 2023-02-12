package miscelleneous;

public class jenkin{
    public static void main(String[] args) {
        int Char=0;
        for (int i = 0; i< 256; i++, Char++){
            System.out.print((char)i+((Char%10==0)?"\n":"\t"));
        }
    }
}
