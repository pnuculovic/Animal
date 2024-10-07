public class Animal {
    public int age;
    public String gender;

    // Method to check if the animal is a mammal
    public void isMammal() {
        System.out.println("This is a public method isMammal() from class Animal.");
    }

    // Method to represent mating behavior
    public void mate() {
        System.out.println("This is a public method mate() from class Animal.");
    }

    // Main method
    public static void main(String[] args) {
        // Creating an Animal object
        Animal myAnimal = new Animal();
        myAnimal.age = 7;
        myAnimal.gender = "Female";
        myAnimal.isMammal();
        myAnimal.mate();

        // Creating a Fish object
        Fish myFish = new Fish();
        myFish.isMammal(); // calling from Animal class
        myFish.mate();     // calling from Animal class

        // Creating a Zebra object
        Zebra myZebra = new Zebra();
        myZebra.isMammal();  // calling from Animal class
        myZebra.mate();      // calling from Animal class
        myZebra.run();       // calling from Zebra class
    }
}
