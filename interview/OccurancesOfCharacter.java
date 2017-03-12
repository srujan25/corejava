package interview;

import java.util.*;

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

    public void occurancesOfAString(String[] array, String str) {
        int count = 0;
        for (String eachStr : array) {
            if (eachStr.equals(str))
                count++;
        }
        System.out.println("Occurances of a string " + str + "-->" + count);
    }

    public void occurancesWithIndexes(String s) {
        HashMap<Character, Set<String>> hm = new HashMap();

        for (int i = 0; i < s.length(); i++) {

            if (hm.get(s.charAt(i)) == null) {
                Set<String> set = new HashSet<>();
                String s1 = String.valueOf(i);
                set.add(s1);
                hm.put(s.charAt(i), set);
            } else {
                Set<String> set = new HashSet<>();
                Set<String> strings = hm.get(s.charAt(i));
                Iterator it = strings.iterator();
                String s1 = it.next() + "," + String.valueOf(i);
                hm.remove(s.charAt(i));
                set.add(s1);
                hm.put(s.charAt(i), set);
            }
        }
        System.out.println(hm.entrySet());
        Set mapSet = hm.entrySet();
        Iterator it1 = mapSet.iterator();
        String output="[";
        Character quote='"';
        while(it1.hasNext())
        {
            Map.Entry me = (Map.Entry)it1.next();
            Character key = (Character) me.getKey();
            Set value = (Set) me.getValue();
            output=output+quote+key+quote+","+value+",";

        }
        System.out.println(output.substring(0,output.length()-1)+"]");
    }

    public static void main(String[] args) {
        OccurancesOfCharacter ref = new OccurancesOfCharacter();
        //ref.occurances("hheeelllooooo");
        //  ref.occuranceOfACharacter("srujan", 's');
        // String array[] = {"s","r","s","s","u","j","a","n"};
        //ref.occurancesOfAString(array,"s");
        //ref.occurances("sssr");
        ref.occurancesWithIndexes("ssrujannksr");
    }
}
