public class Task2 {

    public static void main(String[] args) {
        int list[];
        list = new int[5];

        list[0] = 1;
        list[1] = 2;
        list[2] = 3;
        list[3] = 4;
        list[4] = 5;

        for (int contents : list) {
            if (contents % 4 == 0) {
                System.out.println("4の倍数です");
            } else if (contents % 5 == 0) {
                System.out.println("5の倍数です");
            }
        }
    }

}
