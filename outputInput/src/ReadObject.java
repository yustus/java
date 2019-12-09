import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Arrays;

public class ReadObject {

    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("note.bin");
            ObjectInputStream ois = new ObjectInputStream(fis);

            Person[] people = (Person[]) ois.readObject();
            System.out.println(Arrays.toString(people));
            ois.close();

           /* Person person1 = (Person) ois.readObject();
            Person person2 = (Person) ois.readObject();*/


            /*System.out.println(person1);
            System.out.println(person2);*/


        }
        catch (IOException | ClassNotFoundException e){
            e.printStackTrace();
        }
    }
}
