package Java;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.HashMap;

public class ExternalExample implements Externalizable {
    public String name;
    public int age;
   

    @Override
    // Writes into a file.
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeUTF(name);
        out.writeInt(age);
    

        
    }
    @Override
    @SuppressWarnings("unchecked")
    // Reads byte array stored on a file.
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        this.name = in.readUTF();
        this.age = in.readInt();
        
    }

    // No args to constructor to help during the reading process.
    public ExternalExample() {}

    public ExternalExample(String name, int age) {
        this.name = name;
        this.age = age;
      
    }
    
}
