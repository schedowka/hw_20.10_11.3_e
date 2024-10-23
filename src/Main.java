public class Main {
    public static void main(String[] args) {
        int[] myArray = new int[15];
        for (int i = 0; i < 15; i++) {
            myArray[i] = (int)
                    (Math.random()*10);
        }
        for (int num : myArray) {
            System.out.println(num);
        }
    }

    }
    // int[] myArray = new int[15];
//        Random random = new Random();
//        for (int i = 0; i < 15; i++) {
//            myArray[i] = random.nextInt(10);
//
//        }
//        for (int num : myArray) {
//            System.out.println(num);
//        }