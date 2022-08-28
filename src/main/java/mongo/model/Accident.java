/**
 * Este paquete contiene las clases que representan las entidades del dominio.
 */
package mongo.model;

import org.springframework.data.annotation.Id;

/**
 * Clase que representa a la entidad del accidente.
 *
 */
public class Accident {


    /**
     *
     * Es el identificador de cada instancia.
     *
     * @Id
     *     private String id;
     */


    private String ID;
    private String Source;
    private String TMC;
    private String Severity;
    private String Start_Time;
    private String End_Time;
    private String Start_Lat;
    private String Start_Lng;
    private String End_Lat;
    private String End_Lng;
    private String Distance;
    private String Description;
    private String Number;
    private String Street;
    private String Side;
    private String City;
    private String County;
    private String State;
    private String Zipcode;
    private String Country;
    private String Timezone;
    private String Airport_Code;
    private String Weather_Timestamp;
    private String Temperature;
    private String Wind_Chill;
    private String Humidity;
    private String Pressure;
    private String Visibility;
    private String Wind_Direction;
    private String Wind_Speed;
    private String Precipitation;
    private String Weather_Condition;
    private String Amenity;
    private String Bump;
    private String Crossing;
    private String Give_Way;
    private String Junction;
    private String No_Exit;
    private String Railway;
    private String Roundabout;
    private String Station;
    private String Stop;
    private String Traffic_Calming;
    private String Traffic_Signal;
    private String Turning_Loop;
    private String Sunrise_Sunset;
    private String Civil_Twilight;
    private String Nautical_Twilight;
    private String Astronomical_Twilight;

    public int version;

    /**
     * Constructor. No utilizar.
     */
    public Accident() {

    }


    /**
     * Constructor.
     */

    public Accident(String ID, String source, String TMC, String severity, String start_Time, String end_Time, String start_Lat, String start_Lng, String end_Lat, String end_Lng, String distance, String description, String number, String street, String side, String city, String county, String state, String zipcode, String country, String timezone, String airport_Code, String weather_Timestamp, String temperature, String wind_Chill, String humidity, String pressure, String visibility, String wind_Direction, String wind_Speed, String precipitation, String weather_Condition, String amenity, String bump, String crossing, String give_Way, String junction, String no_Exit, String railway, String roundabout, String station, String stop, String traffic_Calming, String traffic_Signal, String turning_Loop, String sunrise_Sunset, String civil_Twilight, String nautical_Twilight, String astronomical_Twilight) {
        this.ID = ID;
        this.Source = source;
        this.TMC = TMC;
        this.Severity = severity;
        this.Start_Time = start_Time;
        this.End_Time = end_Time;
        this.Start_Lat = start_Lat;
        this.Start_Lng = start_Lng;
        this.End_Lat = end_Lat;
        this.End_Lng = end_Lng;
        this.Distance = distance;
        this.Description = description;
        this.Number = number;
        this.Street = street;
        this.Side = side;
        this.City = city;
        this.County = county;
        this.State = state;
        this.Zipcode = zipcode;
        this.Country = country;
        this.Timezone = timezone;
        this.Airport_Code = airport_Code;
        this.Weather_Timestamp = weather_Timestamp;
        this.Temperature = temperature;
        this.Wind_Chill = wind_Chill;
        this.Humidity = humidity;
        this.Pressure = pressure;
        this.Visibility = visibility;
        this.Wind_Direction = wind_Direction;
        this.Wind_Speed = wind_Speed;
        this.Precipitation = precipitation;
        this.Weather_Condition = weather_Condition;
        this.Amenity = amenity;
        this.Bump = bump;
        this.Crossing = crossing;
        this.Give_Way = give_Way;
        this.Junction = junction;
        this.No_Exit = no_Exit;
        this.Railway = railway;
        this.Roundabout = roundabout;
        this.Station = station;
        this.Stop = stop;
        this.Traffic_Calming = traffic_Calming;
        this.Traffic_Signal = traffic_Signal;
        this.Turning_Loop = turning_Loop;
        this.Sunrise_Sunset = sunrise_Sunset;
        this.Civil_Twilight = civil_Twilight;
        this.Nautical_Twilight = nautical_Twilight;
        this.Astronomical_Twilight = astronomical_Twilight;
    }

    public int getVersion() {
        return this.version;
    }

    /**
     * Setter.
     *
     * @param version es la versión del usuario.
     */
    public void setVersion(int version) {
        this.version = version;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getSource() {
        return Source;
    }

    public void setSource(String source) {
        Source = source;
    }

    public String getTMC() {
        return TMC;
    }

    public void setTMC(String TMC) {
        this.TMC = TMC;
    }

    public String getSeverity() {
        return Severity;
    }

    public void setSeverity(String severity) {
        Severity = severity;
    }

    public String getStart_Time() {
        return Start_Time;
    }

    public void setStart_Time(String start_Time) {
        Start_Time = start_Time;
    }

    public String getEnd_Time() {
        return End_Time;
    }

    public void setEnd_Time(String end_Time) {
        End_Time = end_Time;
    }

    public String getStart_Lat() {
        return Start_Lat;
    }

    public void setStart_Lat(String start_Lat) {
        Start_Lat = start_Lat;
    }

    public String getStart_Lng() {
        return Start_Lng;
    }

    public void setStart_Lng(String start_Lng) {
        Start_Lng = start_Lng;
    }

    public String getEnd_Lat() {
        return End_Lat;
    }

    public void setEnd_Lat(String end_Lat) {
        End_Lat = end_Lat;
    }

    public String getEnd_Lng() {
        return End_Lng;
    }

    public void setEnd_Lng(String end_Lng) {
        End_Lng = end_Lng;
    }

    public String getDistance() {
        return Distance;
    }

    public void setDistance(String distance) {
        Distance = distance;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public String getNumber() {
        return Number;
    }

    public void setNumber(String number) {
        Number = number;
    }

    public String getStreet() {
        return Street;
    }

    public void setStreet(String street) {
        Street = street;
    }

    public String getSide() {
        return Side;
    }

    public void setSide(String side) {
        Side = side;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    public String getCounty() {
        return County;
    }

    public void setCounty(String county) {
        County = county;
    }

    public String getState() {
        return State;
    }

    public void setState(String state) {
        State = state;
    }

    public String getZipcode() {
        return Zipcode;
    }

    public void setZipcode(String zipcode) {
        Zipcode = zipcode;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String country) {
        Country = country;
    }

    public String getTimezone() {
        return Timezone;
    }

    public void setTimezone(String timezone) {
        Timezone = timezone;
    }

    public String getAirport_Code() {
        return Airport_Code;
    }

    public void setAirport_Code(String airport_Code) {
        Airport_Code = airport_Code;
    }

    public String getWeather_Timestamp() {
        return Weather_Timestamp;
    }

    public void setWeather_Timestamp(String weather_Timestamp) {
        Weather_Timestamp = weather_Timestamp;
    }

    public String getTemperature() {
        return Temperature;
    }

    public void setTemperature(String temperature) {
        Temperature = temperature;
    }

    public String getWind_Chill() {
        return Wind_Chill;
    }

    public void setWind_Chill(String wind_Chill) {
        Wind_Chill = wind_Chill;
    }

    public String getHumidity() {
        return Humidity;
    }

    public void setHumidity(String humidity) {
        Humidity = humidity;
    }

    public String getPressure() {
        return Pressure;
    }

    public void setPressure(String pressure) {
        Pressure = pressure;
    }

    public String getVisibility() {
        return Visibility;
    }

    public void setVisibility(String visibility) {
        Visibility = visibility;
    }

    public String getWind_Direction() {
        return Wind_Direction;
    }

    public void setWind_Direction(String wind_Direction) {
        Wind_Direction = wind_Direction;
    }

    public String getWind_Speed() {
        return Wind_Speed;
    }

    public void setWind_Speed(String wind_Speed) {
        Wind_Speed = wind_Speed;
    }

    public String getPrecipitation() {
        return Precipitation;
    }

    public void setPrecipitation(String precipitation) {
        Precipitation = precipitation;
    }

    public String getWeather_Condition() {
        return Weather_Condition;
    }

    public void setWeather_Condition(String weather_Condition) {
        Weather_Condition = weather_Condition;
    }

    public String getAmenity() {
        return Amenity;
    }

    public void setAmenity(String amenity) {
        Amenity = amenity;
    }

    public String getBump() {
        return Bump;
    }

    public void setBump(String bump) {
        Bump = bump;
    }

    public String getCrossing() {
        return Crossing;
    }

    public void setCrossing(String crossing) {
        Crossing = crossing;
    }

    public String getGive_Way() {
        return Give_Way;
    }

    public void setGive_Way(String give_Way) {
        Give_Way = give_Way;
    }

    public String getJunction() {
        return Junction;
    }

    public void setJunction(String junction) {
        Junction = junction;
    }

    public String getNo_Exit() {
        return No_Exit;
    }

    public void setNo_Exit(String no_Exit) {
        No_Exit = no_Exit;
    }

    public String getRailway() {
        return Railway;
    }

    public void setRailway(String railway) {
        Railway = railway;
    }

    public String getRoundabout() {
        return Roundabout;
    }

    public void setRoundabout(String roundabout) {
        Roundabout = roundabout;
    }

    public String getStation() {
        return Station;
    }

    public void setStation(String station) {
        Station = station;
    }

    public String getStop() {
        return Stop;
    }

    public void setStop(String stop) {
        Stop = stop;
    }

    public String getTraffic_Calming() {
        return Traffic_Calming;
    }

    public void setTraffic_Calming(String traffic_Calming) {
        Traffic_Calming = traffic_Calming;
    }

    public String getTraffic_Signal() {
        return Traffic_Signal;
    }

    public void setTraffic_Signal(String traffic_Signal) {
        Traffic_Signal = traffic_Signal;
    }

    public String getTurning_Loop() {
        return Turning_Loop;
    }

    public void setTurning_Loop(String turning_Loop) {
        Turning_Loop = turning_Loop;
    }

    public String getSunrise_Sunset() {
        return Sunrise_Sunset;
    }

    public void setSunrise_Sunset(String sunrise_Sunset) {
        Sunrise_Sunset = sunrise_Sunset;
    }

    public String getCivil_Twilight() {
        return Civil_Twilight;
    }

    public void setCivil_Twilight(String civil_Twilight) {
        Civil_Twilight = civil_Twilight;
    }

    public String getNautical_Twilight() {
        return Nautical_Twilight;
    }

    public void setNautical_Twilight(String nautical_Twilight) {
        Nautical_Twilight = nautical_Twilight;
    }

    public String getAstronomical_Twilight() {
        return Astronomical_Twilight;
    }

    public void setAstronomical_Twilight(String astronomical_Twilight) {
        Astronomical_Twilight = astronomical_Twilight;
    }
}
