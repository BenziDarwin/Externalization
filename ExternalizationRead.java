package Java;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.Iterator;

public class ExternalizationRead {
        public static void main(String[] args) {
            try {
            
            FileInputStream in = new FileInputStream("exter.ser");
            ObjectInputStream oin = new ObjectInputStream(in);
            
            // Object created to access the functions able to read byte array from file.
            ExternalExample obj = new ExternalExample();

            // Function from object to read from the file.
            obj.readExternal(oin);
            System.out.println(obj.name);
            System.out.println(obj.age);
            Iterator<String> iter  = obj.details.keySet().iterator();
            while(iter.hasNext()) {
                String key = iter.next();
                String value = obj.details.get(key);
                System.out.println(key+" : "+value);
            }
                
            } catch(Exception e) {

        }   

    }
}
