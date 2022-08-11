public class Main {
    public static void main(String[] args) {
        // Задание № 1
        int number = 1;
        while (number <= 10){
            if (number == 10) {
                System.out.println(number);
                break;
            }
            System.out.print(number + " ");
            number++;
        }
        for (; number >= 1; number--) {
            if (number == 1) {
                System.out.println(number);
                break;
            }
            System.out.print(number + " ");
        }

        // Задание № 2
        int friday = 5;
        for (; friday <= 31; friday = friday + 7) {
            System.out.println(friday);
        }

        // задача №3
        int lastYear = 2022 - 200;
        int nextYear = 2022 + 100;
        for (; lastYear <= nextYear; lastYear++){
            if (lastYear % 79 == 0) {
                System.out.println(lastYear);
            }
        }

        // задача №4
        int sequenceNumber = 1;
        for (; sequenceNumber <= 30; sequenceNumber++) {
            if (sequenceNumber % 3 == 0 && sequenceNumber % 5 ==0) {
                System.out.println(sequenceNumber + ": ping pong");
            } else if (sequenceNumber % 3 == 0) {
                System.out.println(sequenceNumber + ": ping");
            } else if (sequenceNumber % 5 == 0) {
                System.out.println(sequenceNumber + ": pong");
            } else {
                System.out.println(sequenceNumber + ":");
            }
        }

        // задача № 5
        int first = 0;
        int second = 1;
        int third;
        for (int i = 0; i < 9; i++) {
            if (i == 0) {
                System.out.print(first + " " + second + " ");
            } else {
                third = first + second;
                System.out.print(third + " ");
                first = second;
                second = third;
            }
        }

    }
}