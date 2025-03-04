package ss7_abstract_class_and_interface.animal_and_interface_edible.fruit;


//Cả hai đều kế thừa từ Fruit, nghĩa là chúng có thể có cách ăn riêng.
public class Orange extends Fruit {
    @Override
    public String howToEat() {
        return "Orange could be juiced";
    }
}