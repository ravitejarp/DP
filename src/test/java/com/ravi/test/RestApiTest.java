package com.ravi.test;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import org.junit.Test;

import java.io.*;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;

public class RestApiTest {

    @Test
    public void testAPI() throws  IOException {
        File f = new File("./src/test/resources/Resp.json");
        JsonParser jsonParser = new JsonParser();
        JsonElement parse = jsonParser.parse(new FileReader(f));
        System.out.println(parse);
        List<String> list = new ArrayList<>();
        List<String> listFromDb = new ArrayList<>();
        JsonArray alerts = parse.getAsJsonObject().get("Alerts").getAsJsonArray();
        alerts.forEach(alert -> {
            JsonElement id = alert.getAsJsonObject().get("id");
            if (id != null) {
                list.add(id.getAsString());
            }
        });

        f = new File("./src/test/resources/DBVal.txt");
        BufferedReader br = new BufferedReader(new FileReader(f));
        String line1="";
        while((line1 = br.readLine())!=null){
            listFromDb.add(line1);
        }
//        listFromDb.forEach(System.out::println);
        listFromDb.removeAll(list);
        listFromDb.forEach(System.out::println);

    }
}
