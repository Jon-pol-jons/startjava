package src.com.startjava.lesson_2_3.method.naming;
public class MethodUtil {
    public static String getCurrentName() {
        return Thread.currentThread().getStackTrace()[2].getMethodName();
    }
}
