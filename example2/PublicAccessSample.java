package example2;
import test_java.Cat;

public class PublicAccessSample {
    public static void main(String[] args){
        Cat tama = new Cat();
        tama.setName("タマ");
        tama.setAge(3);

        tama.eat();
        tama.playToy("ボール");
        tama.introduceMyself();
        tama.printMessage("にゃ");
    }
}
