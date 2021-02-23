package com.example.demo.model;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Geo {

    private Long idtimezonebyzipcode;
    private String zip;
    private String city;
    private String county;
    private String state;
    private String country;
    private String timezone;
    private Long addressquality;
    private String source;
    private String sourcedate;



    @Override
    public String toString() {
        return "Geo{" +
                "idtimezonebyzipcode=" + idtimezonebyzipcode +
                ", zip='" + zip + '\'' +
                ", city='" + city + '\'' +
                ", county='" + county + '\'' +
                ", state='" + state + '\'' +
                ", country='" + country + '\'' +
                ", timezone='" + timezone + '\'' +
                ", addressquality=" + addressquality +
                ", source='" + source + '\'' +
                ", sourcedate='" + sourcedate + '\'' +
                '}';
    }
}
