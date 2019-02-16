import java.util.ArrayList;

public class ArrayListTestDrive {
    public static void main(String[] args) {
        int randomNum = (int) (Math.random() * 5);

        ArrayList<String> locations = new ArrayList<String>();
        for (int i = 0; i < 3; i++) {
            locations.add(""+(randomNum+i));
            System.out.println(locations);
        }
    }
}
