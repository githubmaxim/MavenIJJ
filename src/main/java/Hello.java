import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

/**
 * Class for return text message.
 */
public class Hello {
    /**
     * method return "Hello".
     * @return "Hello"
     */
    @org.jetbrains.annotations.NotNull
    public static String helo() {
        System.out.println("kk");
        return "Hello";
    }

    /**
     * method return "Hello "age"".
     * @param age - this is age
     * @return "Hello "age""
     */
    @NotNull
    @Contract(pure = true)
    public static String helloAge(int age) {
        if (age <= 0) {throw new IllegalArgumentException();}
        return "Hello, " + age;
    }

}
