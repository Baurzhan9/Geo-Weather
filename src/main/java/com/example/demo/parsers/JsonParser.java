package com.example.demo.parsers;

import org.json.simple.JSONArray;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class JsonParser {
    private static final String filePath = "C:\\Users\\user\\Desktop\\csvjson.json";

    public JSONArray JsonParser(){
        try {
            // считывание файла JSON
            FileReader reader = new FileReader(filePath);
            JSONParser jsonParser = new JSONParser();
            JSONArray jsonArray = (JSONArray) jsonParser.parse(reader);

//            int n = jsonArray.size();
//            Geo geo = new Geo();
//
//            for(int i = 0; i < n; i++){
//
//                JSONObject obj = (JSONObject) jsonArray.get(i);
//                Long id = (Long) obj.get("idtimezonebyzipcode");
//
//                if(id == 58) {
//
//                    geo.setIdtimezonebyzipcode((Long) obj.get("idtimezonebyzipcode"));
//                    geo.setZip((String) obj.get("zip"));
//                    geo.setCity((String) obj.get("city"));
//                    geo.setCountry((String) obj.get("country"));
//                    geo.setState((String) obj.get("state"));
//                    geo.setCountry((String) obj.get("country"));
//                    geo.setTimezone((String) obj.get("timezone"));
//                    geo.setAddressquality((Long) obj.get("addressquality"));
//                    geo.setSource((String) obj.get("source"));
//                    geo.setSourcedate((String) obj.get("sourcedate"));
//                }
//            }
//
//
//            System.out.println(geo.toString());
//

            return jsonArray;
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        } catch (ParseException ex) {
            ex.printStackTrace();
        } catch (NullPointerException ex) {
            ex.printStackTrace();
        }

        return null;
    }
}
