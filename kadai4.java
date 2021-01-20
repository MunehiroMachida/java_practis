public class Sample {
    public static void main(String[] args) {
        String[] list = { "hello", "good", "soso", "great" };

        // ここにマイナス1をつけた。エラーの内容は配列の添字がオーバーしてるよ。と。いうエラー。
        // エラーは
        // String str2 = list[i + 1].substring(0,2);
        // で、+1になっているところ。最後までfor文回すと一回多く回してしまう。
        for (int i = 0; i < list.length - 1; i++) {
            String str1 = list[i].substring(0, 2);
            String str2 = list[i + 1].substring(0, 2);
            System.out.println("str1 :" + str1 + " str2 :" + str2);
        }
    }
}
