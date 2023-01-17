package Java;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.HashMap;

public class ExternalExample implements Externalizable {
    public String name;
    public int age;
    public HashMap<String, String> details;

    @Override
    // Writes into a file.
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeUTF(name);
        out.writeInt(age);
        out.writeObject(details);

        
    }
    @Override
    @SuppressWarnings("unchecked")
    // Reads byte array stored on a file.
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        this.name = in.readUTF();
        this.age = in.readInt();
        this.details = (HashMap<String, String>) in.readObject();
        
    }

    // No args to constructor to help during the reading process.
    public ExternalExample() {}

    public ExternalExample(String name, int age, HashMap<String, String> details) {
        this.name = name;
        this.age = age;
        this.details = details;
    }
    
}
