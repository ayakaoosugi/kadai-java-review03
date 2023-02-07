
public class Review02 {

    public static void main(String[] args) {
        // iの値が1から100より小さい間、処理を繰り返す
        for (int i = 1; i < 100; i++) {
            // ３でも５でも割れる数
            if (i % 3 == 0 && i % 5 == 0) {
                // iの値を表示する
                System.out.println("FizzBuzz");

                // iの値が３で割り切れる時
            } else if (i % 3 == 0) {
                // iの値を表示する
                System.out.println("Fizz");

                // iが５で割り切れる時
            } else if (i % 5 == 0) {

                // iの値を表示する
                System.out.println("Buzz");

            } else {
                System.out.println(i);

            }

        }

    }
}
