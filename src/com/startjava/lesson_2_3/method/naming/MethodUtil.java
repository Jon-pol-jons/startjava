package Lesson2;

public class MethodUtil {
    public static String getCurrentName() {
        return Thread.currentThread().getStackTrace()[2].getMethodName();
    }
}
