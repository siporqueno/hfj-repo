import java.util.ArrayList;

public class Game2 {
    public static void main(String[] args)
    {
        int numOfGuesses = 0;
        GameHelper helper = new GameHelper();

        DotCom theDotCom = new DotCom();
        int randomNum = (int) (Math.random() * 5);

        ArrayList<String> locations = new ArrayList<String>();
        for (int i = 0; i < 3; i++) {
            locations.add(""+(randomNum+i));
        }
        theDotCom.setLocationCells(locations);
        boolean isAlive = true;
        while (isAlive == true)
        {
            String guess = helper.getUserInput("enter a number");
            String result = theDotCom.checkYourself(guess);
            numOfGuesses++;
            if (result.equals("kill")) {
                isAlive = false;
                System.out.println("You took " + numOfGuesses + " guesses");
            }
        }
    }
}
