package test_java;
import java.util.Scanner;

public class PolymorphismSmple {
    public static void main(String[] args){
        Pet pet;

        System.out.println("触れたいペットを選んでください");
        System.out.println(" 1: 猫。2:犬(1か2を選んで)");

        Scanner keyInput = new Scanner(System.in);
        String inputStr = keyInput.nextLine();

        if(inputStr.equals("1")){
            pet = new Cat();
            System.out.println("猫が洗濯");
        }else if(inputStr.equals("2")){
            pet = new Dog();
            System.out.println("犬が洗濯");
        }else {
            pet = new Cat();
            System.out.println("デフォルと");
        }


        System.out.println();
        System.out.println("---　選択されたペットにご飯");
        pet.eat();

        System.out.println();
        System.out.println("--- 選択されたペットにおもちゃ");
        pet.playToy();

        System.out.println();
        System.out.println("--- 選択されたペットにフード");

        pet.eat("大好きなフード");

        System.out.println();
        System.out.println(" ---　選択されたペットにボール");
        pet.playToy("ボール");
    }
}
