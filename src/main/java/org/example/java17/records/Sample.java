package org.example.java17.records;

class Location{
    private int lat;
    private int lon;
    Location(int lat,int lon){
        this.lat=lat;
        this.lon=lon;
    }
    int getLat(){
        return lat;
    }
    int getLon(){
        return lon;
    }
}
record Location2(int lat,int lon){
    public Location2 {
        if(lat>90) {
            throw new RuntimeException("Oops!!");
        }
    }
}
public class Sample {
    public static void main(String args[]){
        Location location1= new Location(37,-64);
        System.out.println(location1.getLat());

        var location2 = new Location2(68,-27);
        System.out.println(location2.lat());
    }
}
