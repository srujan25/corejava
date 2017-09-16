package general;

import java.util.ArrayList;

/**
 * Created by SG0221519 on 7/13/2017.
 */
public class ObjectToByteCopy {
    public static void main(String[] args) {

        ArrayList al = new ArrayList();
        al.add((byte)1);
        al.add((byte)2);

        Object[] objData = al.toArray();
        System.out.println("Length-->" + objData.length);

        byte[] byteData = new byte[objData.length];
        System.out.println("Obj Data");

        for (int i = 0; i < objData.length; i++) {
            byteData[i] = (byte) objData[i];
            System.out.println(objData[i]);
        }

        System.out.println("Byte Data");
        for (int j = 0; j < byteData.length; j++) {
            System.out.println(byteData[j]);
        }
    }
}
