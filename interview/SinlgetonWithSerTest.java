package interview;

import java.io.*;

/**
 * Created by SG0221519 on 3/15/2017.
 */
public class SinlgetonWithSerTest {
    public static void main(String[] args) {
        SinlgetonWithSer instanceOne = SinlgetonWithSer.getInstance();

        try {
            FileOutputStream fos = new FileOutputStream("ser.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(instanceOne);
            oos.close();

        }catch(FileNotFoundException e)
        {
            System.out.println(e);
        } catch (IOException e) {
            e.printStackTrace();
        }

         try{
             FileInputStream fis = new FileInputStream("ser.txt");
             ObjectInputStream ois = new ObjectInputStream(fis);
             SinlgetonWithSer instanceTwo = (SinlgetonWithSer)ois.readObject();
             ois.close();
              System.out.println(instanceTwo.hashCode());
             System.out.println(instanceOne.hashCode());
         } catch (FileNotFoundException e) {
             e.printStackTrace();
         } catch (IOException e) {
             e.printStackTrace();
         } catch (ClassNotFoundException e) {
             e.printStackTrace();
         }
    }
}
