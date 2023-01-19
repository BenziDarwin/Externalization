package Java;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;

public class ExternalizationWrite {
    public static void main(String[] args) {
    

        try {
            ExternalExample obj = new ExternalExample("Benjamin", 21);
            // Opens the file going to be stored.
            FileOutputStream fin = new FileOutputStream("exter.ser");
            // Preparing to write an object to a file.
            ObjectOutputStream rd = new ObjectOutputStream(fin);
            obj.writeExternal(rd); 
            System.out.println("Finished!");
            rd.flush();
            rd.close();
            fin.close();
        } catch(Exception e) {
            System.out.println(e);
        }
    }
}
