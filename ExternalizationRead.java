package Java;

import io.github.pixee.security.ObjectInputFilters;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class ExternalizationRead {
        public static void main(String[] args) {
            try {
            
            FileInputStream in = new FileInputStream("exter.ser");
            ObjectInputStream oin = new ObjectInputStream(in);
            ObjectInputFilters.enableObjectFilterIfUnprotected(oin);

            // Object created to access the functions able to read byte array from file.
            ExternalExample obj = new ExternalExample();

            // Function from object to read from the file.
            obj.readExternal(oin);
            System.out.println(obj.name);
            System.out.println(obj.age);
                
            } catch(Exception e) {

        }   

    }
}
