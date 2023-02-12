package miscelleneous;

public class jenkin{
    public static void main(String[] args) {
        int Char=0;
		int s = 10;
        for (int i = 0; i< 200; i++, Char++){
            System.out.print((char)i+((Char%10==0)?"\n":"\t"));
		System.out.print((s)i+((s%10==0)?"\n":"\t"));

        }
    }
}
