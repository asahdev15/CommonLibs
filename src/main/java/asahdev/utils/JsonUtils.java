package asahdev.utils;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class JsonUtils {

    public static int getMessageSizeInBytes(Object message) throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(convertToJson(message));
        oos.close();
        return baos.size();
    }

    public static String convertToJson(Object value){
        ObjectMapper Obj = new ObjectMapper();
        try {
            return Obj.writeValueAsString(value);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        return "";
    }
}
