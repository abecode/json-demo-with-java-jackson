package com.abe.demo1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
/**
 * Demo example of reading unstructured json (no schema)
 * c.f. https://www.youtube.com/watch?v=hn1Rgf2mEZ8 
 * and https://stackoverflow.com/questions/35837604/serialize-json-into-generic-structure-without-schema-using-java-and-jackson
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        // get the first input argument
        String fname = args[0];
        System.out.println(fname);

        // read in json as text
        String jsonRawText = "";
        try {
            jsonRawText = new String(
               Files.readAllBytes(Paths.get(fname))
            );
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        // use Jackson to convert txt -> Map
        ObjectMapper mapper = new ObjectMapper();
        Map<String, Object> dict = new HashMap<>();
        try {
            dict  = mapper.readValue(jsonRawText, new TypeReference<Map<String, Object>>(){});
        } catch (JsonProcessingException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        // print input and output:
        System.out.println("input: ");
        System.out.println(jsonRawText);
        System.out.println("output:");
        for (Map.Entry<String, Object> entry : dict.entrySet()) {
            System.out.println("key: " + entry.getKey());
            System.out.println("value type: " + entry.getValue().getClass());
            System.out.println("value: " + entry.getValue().toString());
        }

        System.out.println(((Map)((ArrayList)(dict.get("list"))).get(7)).get("a"));

    }
}