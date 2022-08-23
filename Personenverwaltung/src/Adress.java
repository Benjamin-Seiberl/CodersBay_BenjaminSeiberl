public class Adress {
    private String streetName;
    private int houseNumber;
    private String cityName;
    private int postCode;

    public Adress() {

    }

    public Adress(String streetName, int houseNumber, String cityName, int postCode) {
        this.streetName = streetName;
        this.houseNumber = houseNumber;
        this.cityName = cityName;
        this.postCode = postCode;
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

    public int getPostCode() {
        return postCode;
    }

    @Override
    public String toString() {
        return "Adress{" +
                "streetName='" + streetName + '\'' +
                ", houseNumber=" + houseNumber +
                ", cityName='" + cityName + '\'' +
                ", postCode=" + postCode +
                '}';
    }
}
