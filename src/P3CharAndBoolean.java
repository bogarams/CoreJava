/**
 * Created by - on 18/3/2017.
 */
public class P3CharAndBoolean {
    public static void main(String[] args) {
        System.out.println("********************************");
        //A char type occupies 16 bit and can take any character value or an unicode
        char myChar='A';
        //Check "https://unicode-table.com/en/" for getting unicode characters representation
        //Unicode is a 16-bit system which can support many more characters than ASCII.
        //The first 128 characters are the same as the ASCII system making it compatible.
        char myUniChar='\u0041';
        System.out.println("myChar="+myChar);
        System.out.println("myUniChar="+myUniChar);
        System.out.println("********************************");
        boolean myBool = false;
        boolean yourBool =  true;
        System.out.println(myBool);
        System.out.println(yourBool);
    }
}
