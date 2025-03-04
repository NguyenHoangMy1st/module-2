package ss7_abstract_class_and_interface.animal_and_interface_edible.fruit;

//Cả hai đều kế thừa từ Fruit, nghĩa là chúng có thể có cách ăn riêng.
public class Apple extends Fruit {
    @Override
    public String howToEat() {
        return "Apple could be slided";
    }
}