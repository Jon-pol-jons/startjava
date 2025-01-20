package Lesson1;
/*
проинициализируйте переменные типа char символами (а не их кодами),
найдя их в ASCII-таблице по кодам: 36, 42, 64, 94, 126
выведите в консоль в столбец попарно:
код символа
соответствующий коду символ
код символа берите из переменной

*/
public class Lesson1_6 {
    public static void main(String[] args){
        char symbol36 = '$';
        char symbol42 = '*';
        char symbol64 = '@';
        char sumbol94 = '^';
        char symbol126 = '~';
        System.out.println("Код символа: 36 " + symbol36);
        System.out.println("Код символа: 42 " + symbol42);
        System.out.println("Код символа: 64 " + symbol64);
        System.out.println("Код символа: 94 " + sumbol94);
        System.out.println("Код символа: 126 " + symbol126 );
    }
}
