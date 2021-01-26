package test_java;

public class Cat {
    String name;
    int age;
    boolean hungry;

    private void printMessage(String mesage){
        System.out.println(name+">"+mesage);
    }


    public void eat(){
printMessage("ご飯を食べるよ");
printMessage("お腹がいっぱいになった");
    }

    public boolean isHungry(){
        return hungry;
    }

    public void  playToy(String toy) {
        printMessage(toy+"で遊ぶよタオ");
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
     printMessage("名前は"*getName()+"です、"+getAge()+"歳です。");
    }

}
