package pl.krzysztof.pizza.remote.rest.dto.request;

public class PersonOrderDto {

    private String name;
    private String phone;
    private String address;
    private String floor;

    public PersonOrderDto() {}

    public PersonOrderDto(String name, String phone, String address, String floor) {
        this.name = name;
        this.phone = phone;
        this.address = address;
        this.floor = floor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getFloor() {
        return floor;
    }

    public void setFloor(String floor) {
        this.floor = floor;
    }
}
