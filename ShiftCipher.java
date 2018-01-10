package my_package;

import java.util.Scanner;

public class ShiftCipher {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the Text to Encrypt:");
        String StrToEnc = s.nextLine().toUpperCase();
        System.out.println("Enter the shift value:");
        int shift;
        shift=0;
        boolean flag = true;

        while(flag) {
            try {
                shift = s.nextInt();
                shift = shift % 26;
                flag = false;
            } catch (Exception e) {
                flag = true;
                System.out.println("Invalid input, Please enter an integer value:");
                s.next();
            }
        }

        EncodeString(StrToEnc,shift);
    }

    public static void EncodeString(String StrToEnc, int shift){
        String EncodedString = "";
        StringBuilder ES = new StringBuilder();
        for(int i= 0;i<StrToEnc.length();i++)
        {
            int ascii = StrToEnc.charAt(i);
            if(ascii==32)
            {
                EncodedString +=  " ";
                ES.append(" ");
            }
                else
            {
                ascii = ascii + shift;
                if(ascii>90)
                {
                    ascii=ascii-26;
                }
                EncodedString +=  (char) ascii;
                ES.append((char) ascii);
            }
        }
        System.out.println(EncodedString);
        System.out.println(ES.toString());
    }
}
