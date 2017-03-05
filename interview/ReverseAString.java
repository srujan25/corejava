package interview;

/**
 * Created by SG0221519 on 2/28/2017.
 */
public class ReverseAString {


    //The below code works with StringBuffer and StringBuilder.
    public void reverseWithStringBuffer(StringBuffer str)
    {
        StringBuffer reverse= new StringBuffer("");
        for(int i=str.length()-1;i>=0;i--)
        {
            reverse.append(str.charAt(i));
        }
        System.out.println(reverse);
    }

    public void reverseWithStringBuilder(StringBuilder str)
    {
        StringBuilder reverse= new StringBuilder("");
        for(int i=str.length()-1;i>=0;i--)
        {
            reverse.append(str.charAt(i));
        }
        System.out.println(reverse);
    }

    public void reverseWithString(String str)
    {
        String reverse= new String("");
        for(int i=str.length()-1;i>=0;i--)
        {
            reverse = reverse+str.charAt(i);
        }
        System.out.println(reverse);
    }
    public static void main(String[] args) {
        ReverseAString ref = new ReverseAString();
        ref.reverseWithStringBuffer(new StringBuffer("srujan"));
        ref.reverseWithStringBuilder(new StringBuilder("Srujan"));
        ref.reverseWithString("srujan");
    }
}
