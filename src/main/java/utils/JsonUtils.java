package utils;

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
            // get Oraganisation object as a json string
            String jsonStr = Obj.writeValueAsString(value);
            // Displaying JSON String
            return jsonStr;
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        return "";
    }
}
