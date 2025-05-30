package Lesson2;

public class MethodName {
    public static String getCurrentName() {
        return Thread.currentThread().getStackTrace()[2].getMethodName();
    }
}
