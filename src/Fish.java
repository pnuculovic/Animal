public class Fish extends Animal {
    private int sizeInFeet;

    // Private method to represent fish eating behavior
    private void canEat() {
        System.out.println("This is a private method canEat() from class Fish.");
    }

    // You can call this method inside Fish class if needed
    public void demoCanEat() {
        canEat();
    }
}
