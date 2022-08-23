public class Adress {
    private String streetName;
    private int houseNumber;
    private String cityName;
    private String country;

    public Adress(String streetName, int houseNumber, String cityName, String country) {
        this.streetName = streetName;
        this.houseNumber = houseNumber;
        this.cityName = cityName;
        this.country = country;
    }

    public String getStreetName() {
        return streetName;
    }

    public int getHouseNumber() {
        return houseNumber;
    }

    public String getCityName() {
        return cityName;
    }

    public String getCountry() {
        return country;
    }
}
