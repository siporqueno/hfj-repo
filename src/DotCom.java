// Page 169
import java.util.ArrayList;

public class DotCom {
    ArrayList<String> locationCells;

    public void setLocationCells(ArrayList<String> locs) {
        locationCells = locs;
    }

    public String checkYourself(String userInput) {
        String result = "miss";

        int index = locationCells.indexOf(userInput);
        if (index >= 0) {
            locationCells.remove(index);
            if (locationCells.isEmpty()) {
                result = "kill";
            } else {
                result = "hit";
            }// ����� if

        } // ����� �������� if
        System.out.println(result);
        return result;
    } // ����� ������ checkYourself
} // ����� ������ DotCom