package test_java;

public class UseCatSample {
    public static void main(String[] args){
        Cat tama = new Cat();
        tama.eat();
        tama.playToy("ひも");
        boolean h = tama.isHungry();
        if(h == true){
            System.out.println("お腹が空いてる");
        }else {
            System.out.println("空いていない");
        }
    }
}
