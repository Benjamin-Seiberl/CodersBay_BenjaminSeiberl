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
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Adress{");
        stringBuilder.append("streetname='");
        stringBuilder.append(streetName);
        stringBuilder.append("' ");
        stringBuilder.append("houseNumber='");
        stringBuilder.append(houseNumber);
        stringBuilder.append("' ");
        stringBuilder.append("cityName='");
        stringBuilder.append(cityName);
        stringBuilder.append("' ");
        stringBuilder.append("postCode='");
        stringBuilder.append(postCode);
        stringBuilder.append("'}");

        return stringBuilder.toString();
    }
}
