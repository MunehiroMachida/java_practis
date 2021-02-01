package test_java;
public class Dog implements Pet{
    @Override
    public void eat(){
        eat("ご飯");
    }
@Override
    public void eat(String food){
        System.out.println(food + "を食べるよ美味しい");
        System.out.println("お腹いっぱい");

}
@Override
    public void playToy(){
        playToy("オモチャ");
}

@Override
    public void playToy(String toy){
        System.out.println(toy+"で遊ぶよ");
        System.out.println("遊んで");
}
}
