// Page 112
public class TestDriveGoodDog {
    public static void main(String[] args) {
        GoodDog one = new GoodDog();
        one.setSize(70);
        GoodDog two = new GoodDog();
        two.setSize(8);
        System.out.println("Первая собака: " + one.getSize());
        one.bark();
        System.out.println("Вторая собака: " + two.getSize());
        two.bark();
    }
}
