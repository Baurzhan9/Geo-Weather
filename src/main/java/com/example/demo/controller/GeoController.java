package com.example.demo.controller;


import com.example.demo.model.Geo;
import com.example.demo.parsers.JsonParser;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;
import java.util.List;

@RestController
public class GeoController {

    @GetMapping("/geo")
    public List<Geo> index(){
        List<Geo> jobLists = new ArrayList();
        JsonParser jsonParser = new JsonParser();
        JSONArray jsonArray = jsonParser.JsonParser();
        int n = jsonArray.size();

            for(int i = 0; i < n; i++){
                JSONObject obj = (JSONObject) jsonArray.get(i);
                Geo geo = new Geo();
                geo.setIdtimezonebyzipcode((Long) obj.get("idtimezonebyzipcode"));
                geo.setZip((String) obj.get("zip"));
                geo.setCity((String) obj.get("city"));
                geo.setCountry((String) obj.get("country"));
                geo.setState((String) obj.get("state"));
                geo.setCountry((String) obj.get("country"));
                geo.setTimezone((String) obj.get("timezone"));
                geo.setAddressquality((Long) obj.get("addressquality"));
                geo.setSource((String) obj.get("source"));
                geo.setSourcedate((String) obj.get("sourcedate"));
                jobLists.add(geo);
            }

            return jobLists;
    }

    @GetMapping("/geo-id/{id}")
    public Geo getGeoById(@PathVariable Long id){
        JsonParser jsonParser = new JsonParser();

        JSONArray jsonArray = jsonParser.JsonParser();
        Geo geo = new Geo();
        int n = jsonArray.size();

        for(int i = 0; i < n; i++){
//
            JSONObject obj = (JSONObject) jsonArray.get(i);
            Long idd = (Long) obj.get("idtimezonebyzipcode");

            if(idd == id) {

                geo.setIdtimezonebyzipcode((Long) obj.get("idtimezonebyzipcode"));
                geo.setZip((String) obj.get("zip"));
                geo.setCity((String) obj.get("city"));
                geo.setCountry((String) obj.get("country"));
                geo.setState((String) obj.get("state"));
                geo.setCountry((String) obj.get("country"));
                geo.setTimezone((String) obj.get("timezone"));
                geo.setAddressquality((Long) obj.get("addressquality"));
                geo.setSource((String) obj.get("source"));
                geo.setSourcedate((String) obj.get("sourcedate"));
            }
         }
        return geo;
    }

    @GetMapping("/geo-zip/{zip}")
    public Geo getGeoByZip(@PathVariable String zip){
        JsonParser jsonParser = new JsonParser();

        JSONArray jsonArray = jsonParser.JsonParser();
        Geo geo = new Geo();
        int n = jsonArray.size();
        for(int i = 0; i < n; i++){
            JSONObject obj = (JSONObject) jsonArray.get(i);
            String idd = (String) obj.get("zip");
            if(idd.equals(zip)) {
                geo.setIdtimezonebyzipcode((Long) obj.get("idtimezonebyzipcode"));
                geo.setZip((String) obj.get("zip"));
                geo.setCity((String) obj.get("city"));
                geo.setCountry((String) obj.get("country"));
                geo.setState((String) obj.get("state"));
                geo.setCountry((String) obj.get("country"));
                geo.setTimezone((String) obj.get("timezone"));
                geo.setAddressquality((Long) obj.get("addressquality"));
                geo.setSource((String) obj.get("source"));
                geo.setSourcedate((String) obj.get("sourcedate"));
            }
        }
//        return geo.getTimezone();
        return geo;
    }

}
