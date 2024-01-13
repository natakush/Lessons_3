package hw7;

public class Users implements Comparable<Users> {
    public Users(String name, String city, String country, int age) {
        this.name = name;
        this.city = city;
        this.country = country;
        this.age = age;
    }
    private String name;
    private String city;
    private String country;
    private int age;
    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public String getCountry() {
        return country;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(Users u) {
        return Integer.compare(this.age, u.age);
    }
    @Override
    public String toString() {
        return "Country is: " + this.country + ", City is: " + this.city + ", Name is: " + this.name +", age is: " + this.age;
    }
}
