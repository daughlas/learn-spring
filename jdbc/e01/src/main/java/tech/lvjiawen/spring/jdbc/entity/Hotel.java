package tech.lvjiawen.spring.jdbc.entity;

import java.util.Date;

public class Hotel {
    private  int orderNo;
    private String city;
    private float price;
    private String hotelname;
    private Date arrivedate;
    private Date leaveedate;

    public Hotel() {
    }

    public int getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(int orderNo) {
        this.orderNo = orderNo;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getHotelname() {
        return hotelname;
    }

    public void setHotelname(String hotelname) {
        this.hotelname = hotelname;
    }

    public Date getArrivedate() {
        return arrivedate;
    }

    public void setArrivedate(Date arrivedate) {
        this.arrivedate = arrivedate;
    }

    public Date getLeaveedate() {
        return leaveedate;
    }

    public void setLeaveedate(Date leaveedate) {
        this.leaveedate = leaveedate;
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "orderNo=" + orderNo +
                ", city='" + city + '\'' +
                ", price=" + price +
                ", hotelname='" + hotelname + '\'' +
                ", arrivedate=" + arrivedate +
                ", leaveedate=" + leaveedate +
                '}';
    }
}
