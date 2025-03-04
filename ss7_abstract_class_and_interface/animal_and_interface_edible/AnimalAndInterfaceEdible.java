package ss7_abstract_class_and_interface.animal_and_interface_edible;

import ss7_abstract_class_and_interface.animal_and_interface_edible.animal.Animal;
import ss7_abstract_class_and_interface.animal_and_interface_edible.animal.Chicken;
import ss7_abstract_class_and_interface.animal_and_interface_edible.animal.Tiger;
import ss7_abstract_class_and_interface.animal_and_interface_edible.edible.Edible;

import ss7_abstract_class_and_interface.animal_and_interface_edible.fruit.Apple;
import ss7_abstract_class_and_interface.animal_and_interface_edible.fruit.Fruit;
import ss7_abstract_class_and_interface.animal_and_interface_edible.fruit.Orange;

/*
    Animal giúp dễ dàng gọi makeSound() trên bất kỳ động vật nào.
    Edible giúp dễ dàng gọi howToEat() trên bất kỳ đối tượng nào có thể ăn được.
    Kết hợp kế thừa (abstract class) và giao diện (interface) giúp thiết kế linh hoạt và mở rộng dễ dàng.
 */
public class AnimalAndInterfaceEdible {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Tiger();
        animals[1] = new Chicken();
        for (Animal animal : animals) {
            System.out.println(animal.makeSound());

            //Kiểm tra xem animal có phải là một thể hiện của Chicken không.
            if (animal instanceof Chicken) {
                //Vì Chicken triển khai Edible, nên có thể ép kiểu Chicken về Edible.
                Edible edibler = (Chicken) animal;
                System.out.println(edibler.howToEat());
            }
        }

        Fruit[] fruits = new Fruit[2];
        fruits[0] = new Orange();
        fruits[1] = new Apple();
        for (Fruit fruit : fruits) {
            System.out.println(fruit.howToEat());
        }
    }
}
