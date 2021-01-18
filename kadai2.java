package example;

public class list {

    public static void main(String[] args) {
        int number[];
        number = new int[5];

        number[0] = 1;
        number[1] = 2;
        number[2] = 3;
        number[3] = 4;
        number[4] = 5;

        // System.out.println(number[4] % 5);
        for (int count = 0; count < number.length; ++count) {
            if (number[count] % 4 == 0) {
                System.out.println("4の倍数です");
            } else if (number[count] % 5 == 0) {
                System.out.println("5の倍数です");
            }
        }
    }

}
