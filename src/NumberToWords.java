// each method of this program works ok, the part that did not work was reversing a number with leading zeros.
public class NumberToWords {

    public static void numberToWords(int number){
        int lastDigit;
        if (number < 0 ){
            System.out.println("Invalid Value");
        }else{
            int reversedNumber = reverse(number);

            while(reversedNumber>0) {

                lastDigit = reversedNumber % 10;

                switch (lastDigit) {
                    case 0:
                        System.out.println("Zero");
                        break;
                    case 1:
                        System.out.println("One");
                        break;
                    case 2:
                        System.out.println("Two");
                        break;
                    case 3:
                        System.out.println("Three");
                        break;
                    case 4:
                        System.out.println("Four");
                        break;
                    case 5:
                        System.out.println("Five");
                        break;
                    case 6:
                        System.out.println("Six");
                        break;
                    case 7:
                        System.out.println("Seven");
                        break;
                    case 8:
                        System.out.println("Eight");
                        break;
                    case 9:
                        System.out.println("Nine");
                        break;
                    default:
                        System.out.println("Invalid Value");
                        break;

                }

                reversedNumber/= 10;
            }
            }



    }

    public static int reverse( int reverseNumber){
        int reverse=0;

        while(reverseNumber!=0) {

            int lastDigit = reverseNumber % 10;

            reverse=reverse*10;
            reverse=reverse+lastDigit;
//            System.out.println(reverse);
            reverseNumber=reverseNumber/10;


        }


        return  reverse;
    }

    public static int getDigitCount(int number) {

        if (number < 0) {
            return -1;
        }
        if (number == 0){
            return 1;
        }
        int count = 0;


        while (number >0){
            count ++;
           System.out.println(count);

            number = number / 10;
            System.out.println(number);

        }
        return count;
    }


}
