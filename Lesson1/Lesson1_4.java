package Lesson1;


public class Lesson1_4 {
    public static void main(String[] args){
        short num = 32767;
        byte num2 = 127;
        int num3 = 2147483647;
        long num4 =  9223372036854775807l;
        char num5 = 65535;
        System.out.println("short начальное значение "+num);
        num++;
        System.out.println("инкремент "+num);
        num--;
        System.out.println("декремент "+num);
        System.out.println("byte начальное значение "+num2);
        num2++;
        System.out.println("декремент "+num2);
        num2--;
        System.out.println("Инкремент "+num2);
        System.out.println("int начальное значение "+num3);
        num3++;
        System.out.println("декремент "+num3);
        num3--;
        System.out.println("Инкремент "+num3);
        System.out.println("long начальное значение "+num4);
        num4++;
        System.out.println("инкремент "+num4);
        num4--;
        System.out.println("декремент "+num4);
        System.out.println("char начальное значение "+num5);
        num5++;
        System.out.println("инкремент "+num5);
        num5--;
        System.out.println("декремент "+num5);
    }
}
