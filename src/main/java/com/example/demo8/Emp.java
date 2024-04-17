package com.example.demo8;

public class Emp {
    private Address address;

    public void setAddress(Address address) {
        this.address = address;
    }

    public Emp() {
    }

    public Emp(Address address) {
        System.out.println("Inside constructor");
        this.address = address;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "address=" + address +
                '}';
    }
}
