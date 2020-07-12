package json;

import com.google.gson.Gson;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        Gson gson = new Gson();
        User ivanov = new User(30864,"Ivanov", 35);
        gson.toJson(ivanov,new FileWriter("src\\json\\test.json"));

    }
}
