import java.text.NumberFormat;
import java.util.Locale;

public class RunOutMemory {

    public static void main(String[] args) throws InterruptedException {
        NumberFormat format = NumberFormat.getNumberInstance(Locale.US);
        int arraySize = 1;
        while (true) {
            System.out.println("Array Size: " + format.format(arraySize));
            int[] array = new int[arraySize];
            arraySize *= 10;
            Thread.sleep(200);
        }
    }
}
