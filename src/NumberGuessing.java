import javax.swing.*;

public class NumberGuessing {
    public static void main(String[] args) {
        int computerNumber = (int)(Math.random()*100 +1);//100 e kadar olan sayıları ve sayıların da 1 den baslamasını sağlar
                                                         //eğer 100 ünde dahil olmasını istiyorsak (100)+1 şeklinde ifade edebilirz
        /*random sayı üretmek için javada Math metodu kullanılır.
        değer belirtmeden rastgele üretmesi için ise
        Random rastgele = new Random();
        int rastgeleSayi = rastgele.nextInt(100);//0-99 arasındaki sayiları çekecektir
        .nextInt() yerine .nextDouble() da kullanılabilinir.


        */
        int userAnswer= 0;
        System.out.println("the correct guess would be" +computerNumber);
        int count = 1;

        while (userAnswer != computerNumber){
            String response = JOptionPane.showInputDialog(null,"enter a guess number between 1-100","Guessing Game",3);
            /*JOptionPane kullanıcından bilgi almak veya kullanıcıya bilgi vermek için
            bir pencere açar.
            */
            userAnswer = Integer.parseInt(response);
            /*Integer.parseInt() ve Integer.valueOf() Bir string değeri interger değere çevirir.

            */
            JOptionPane.showInputDialog(null,""+determineGuess(userAnswer,computerNumber,count));
        count++;
        }
    }
    public static String determineGuess(int userAnswer,int computerNumber,int count){
        if(userAnswer <=0 || userAnswer>100){
            return "Your guess is invalid";
        }
        else if(userAnswer == computerNumber){
            return "Correct!\nTotal Guesses" +count;
        }
        else if(userAnswer > computerNumber){
            return "Your guess is too high,try again.\nTry Number" +count;
        }

        else if(userAnswer < computerNumber){
            return "Your guess is too low ,try again.\nTry Number" +count;
        }

        else{
            return "Your guess is incorrect.\nTry Number" +count;
        }


    }
}
