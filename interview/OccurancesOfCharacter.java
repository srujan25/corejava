package interview;

import java.util.HashMap;

/**
 * Created by SG0221519 on 2/17/2017.
 */
public class OccurancesOfCharacter {

    public void occurances(String s) {

        HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
        for (int i = 0; i < s.length(); i++) {

            if (hm.get(s.charAt(i)) == null) {
                hm.put(s.charAt(i), 1);
            } else {
                hm.put(s.charAt(i), hm.get(s.charAt(i)) + 1);
            }
        }
        System.out.println(hm.entrySet());

    }

    public void occuranceOfACharacter(String s, Character find) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            Character c = s.charAt(i);
            if (c.equals(find))
                count++;
        }
        System.out.println(count);
    }

    public void occurancesOfAString(String[] array,String str)
    {
        int count = 0;
        for(String eachStr:array)
        {
            if(eachStr.equals(str))
                count++;
        }
        System.out.println("Occurances of a string "+str+"-->"+count);
    }

    public static void main(String[] args) {
        OccurancesOfCharacter ref = new OccurancesOfCharacter();
        //ref.occurances("hheeelllooooo");
        ref.occuranceOfACharacter("srujan", 's');
        String array[] = {"s","r","s","s","u","j","a","n"};
        ref.occurancesOfAString(array,"s");
        ref.occurances("sssr");
    }
}
