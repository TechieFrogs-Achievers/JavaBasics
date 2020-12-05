package Strings;

public class ReplaceString {
    public static void main(String[] args) {
        String s = new String("Ramya kondapalli is daughter of suri babu");

        String str = s.replace('a','s'); //replacing with character
        System.out.println(str);  //Rsmys kondspslli is dsughter of suri bsbu

        String str1 = s.replace(' ','_'); //replacing space with someother character
        System.out.println(str1); //Ramya_kondapalli_is_daughter_of_suri_babu

        String sc = new String ("ausf au bh uaua");
        String str2 = sc.replaceAll("au", "oj");  //replacing string with another string
        System.out.println(str2);  //ojsf oj bh uoja

        String space = s.replaceAll(" ", "");
        System.out.println(space);  //Ramyakondapalliisdaughterofsuribabu

        
    }
}
