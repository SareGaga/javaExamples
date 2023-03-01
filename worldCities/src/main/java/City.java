
public class City {
    
    private int ID;
    private String name;
    private String countryCode;
    private String District;
    private int population;
    
 public City(int ID, String name, String countryCode, String District, int population) {
        this.ID = ID;
        this.name = name;
        this.countryCode = countryCode;
        this.District = District;
        this.population = population;
    }
 
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getDistrict() {
        return District;
    }

    public void setDistrict(String District) {
        this.District = District;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

   
    
    
}
