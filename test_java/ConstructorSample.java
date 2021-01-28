package test_java;

public class ConstructorSample {
    public static void main(String[] args){
System.out.println("--- new Cat()でインスタンスを生成する ---");
Cat tama = new Cat("タマ", 3);

System.out.println();
System.out.println("--- インスタンス生成直後、自己紹介させる ---");
tama.introduceMyself();
    }
}
