package my_package;

import java.util.Scanner;

public class SubstitutionCipher {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the Text to Encrypt:");
        String strToEnc = s.nextLine().toUpperCase();
        String subString = "THEQUICKBROWNFXJMPSVLAZYDG";
        String encStr = EncodeString(strToEnc, subString);
     //   String decStr = DecodeString(encStr, subString);
        System.out.printf("Original String: %s%nEncoded String: %s", strToEnc, encStr);
    }

   public static String EncodeString(String StrToEnc, String subString){

        StringBuilder ES = new StringBuilder();
        for(int i= 0;i<StrToEnc.length();i++)
        {
            int ascii = StrToEnc.charAt(i);
            if(ascii==32)
            {
                ES.append(" ");
            }
            else
            {
                ascii = ascii - 65;
                ES.append(subString.charAt(ascii));
            }
        }
        return ES.toString();
        }
        /*
    public static String DecodeString(String EncStr, String subString)
    {
        StringBuilder DS = new StringBuilder();
        for(int i= 0;i<EncStr.length();i++)
        {
            int ascii = EncStr.charAt(i);
            if(ascii==32)
            {
                DS.append(" ");
            }
            else
            {
                ascii = ascii - 65;
                DS.append(subString.charAt(ascii));
            }
        }
        return DS.toString();

    }
*/
}
