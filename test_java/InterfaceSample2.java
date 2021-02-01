package test_java;

public class InterfaceSample2 {
    public static void main(String[] args){
        Pet pet = new Cat();

        System.out.println("--- per.eat()を呼び出す");
        pet.eat();

        pet = new Dog();

        System.out.println("---");
        pet.eat();
    }
}
