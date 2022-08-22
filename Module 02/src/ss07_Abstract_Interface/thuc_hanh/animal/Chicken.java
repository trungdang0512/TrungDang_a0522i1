package ss07_Abstract_Interface.thuc_hanh.animal;

public class Chicken extends Animal implements Edible{
    @Override
    public String makeSound() {
        return "Chicken: cluck-cluck!!";
    }

    @Override
    public String howToEat() {
        return "could be fried";
    }
}
