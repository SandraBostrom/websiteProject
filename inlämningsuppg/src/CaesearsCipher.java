import java.util.InputMismatchException;
import java.util.Scanner;
public class CaesearsCipher {

        public static String encrypt(String readMessage) {
            String result = "";
            char alphabet;
            for (int i = 0; i < readMessage.length(); i++) {
                char ch = (char) readMessage.charAt(i);

                if (Character.isLetter(ch)) {
                    alphabet = (char) (ch + 3);

                    if (ch == 'x') {
                        alphabet = 'a';
                    } else if (ch == 'y') {
                        alphabet = 'b';
                    } else if (ch == 'z') {
                        alphabet = 'c';
                    } else {
                        result += alphabet;
                    }

                } else {
                    alphabet = ch;
                }
            }

            return result.toUpperCase();

        }

        public static String uncode(String codedMessage) {
            String uncodedMessage = "";
            char alphabet;
            for (int i = 0; i < codedMessage.length(); i++) {
                char ch = (char) codedMessage.charAt(i);

                if (Character.isLetter(ch)) {
                    alphabet = (char) (ch - 3);

                    if (ch == 'c') {
                        alphabet = 'z';
                    } else if (ch == 'b') {
                        alphabet = 'y';
                    } else if (ch == 'a') {
                        alphabet = 'w';
                    }
                } else {
                    alphabet = ch;
                }
                uncodedMessage += alphabet;
            }
            return uncodedMessage;

        }

        public static String menu (int choice) {
            try {
                Scanner scan = new Scanner(System.in);
                switch (choice) {
                    case 1:
                        System.out.println("Write your text:");
                        String codedText = "your text with Caesars cipher " + encrypt(scan.nextLine());
                        return codedText;
                    case 2:
                        System.out.println("Write your text");
                        String uncodedText = "Your text uncoded means " + uncode(scan.nextLine());
                        return uncodedText;
                }
            }
            catch (InputMismatchException e) {
                e.toString();
            }
            return null;
        }
        public static void main(String[] args) {
            Scanner scan = new Scanner (System.in);
            System.out.println("Do you want to code or un-code a text? \nPress 1. for code and 2. for un-code");
            System.out.println(	menu(scan.nextInt()));
        }
    }


