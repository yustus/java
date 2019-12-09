import javax.imageio.IIOException;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObject {

    public static void main(String[] args) {

        /*Person person1 = new Person(1, "Bob");
        Person person2 = new Person(2, "Paul");*/

        Person[] people = {new Person(1,"Mike"),
               new Person(2,"Bob"), new Person(3,"Tom")};


        try {
            FileOutputStream fos = new FileOutputStream("note.bin");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(people);
            fos.close();

         /*   oos.writeObject(person1);
            oos.writeObject(person2);*/
        }
        catch (IOException e){
            e.printStackTrace();
        }



    }
}
