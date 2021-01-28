package test_java;

public class Cat {
    private  String name;
    private  int age;
    private  boolean hungry;


    public Cat(){
        System.out.println("コンストラクター:Cat()が呼び出された");
        this.name = "まだない";
        this.age=0;
    }

    public Cat(String name, int age){
        System.out.println("コンストラクター:Cat(String name, int age)が呼び出された");
        this.name = name;
        this.age=age;
    }

    public Cat(String name){
        this(name, 0);
        System.out.println("コンストクター：Cat(String name)が呼び出された");
    }

    private void printMessage(String mesage){
        System.out.println(name+">"+mesage);
    }


    public void eat(){
printMessage("ご飯を食べるよ");
printMessage("お腹がいっぱいになった");
    }

    public void eat(String food){
        printMessage(food+"ご飯を食べるよ");
        printMessage("お腹がいっぱいになった");
        hungry = false;
    }


    public boolean isHungry(){
        return hungry;
    }

    public void  playToy(String toy) {
        printMessage(toy+"で遊ぶよタオ");
        printMessage("遊んでお腹が減った");
        hungry = true;
    }

    public void  playToy() {
        printMessage("で遊ぶよタオ");
        printMessage("遊んでお腹が減った");
        hungry = true;
    }


    public void setName(String catName){
        name = catName;
    }

    public String getName(){
        return name;
    }

    public void setAge(int catAge){
        age = catAge;
    }

    public int getAge(){
        return age;
    }

    public  void introduceMyself(){
     printMessage("名前は"+getName()+"です、"+getAge()+"歳です。");
    }

}
