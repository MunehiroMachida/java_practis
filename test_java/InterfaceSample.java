package test_java;

public class InterfaceSample {
    public static void main(String[] args){
        Cat cat = new Cat();

        System.out.println("--- cat.eat()を呼び出す ---");
        cat.eat();

        System.out.println();
        System.out.println("--- cat.eat(\"贅沢なキャトフーど\")を呼び出す ---");

        cat.eat("贅沢なキャットフード");

        System.out.println();
        System.out.println("--- cat.playToy()を呼び出す");

        cat.playToy("猫じゃらし");
    }


}
