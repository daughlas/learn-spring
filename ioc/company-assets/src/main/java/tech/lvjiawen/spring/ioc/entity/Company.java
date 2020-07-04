package tech.lvjiawen.spring.ioc.entity;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Company {
    private Set<String> rooms;
    private Map<String, Computer> computers;
    private Properties info;

    public Company() {
    }

    public Company(Set<String> rooms, Map<String, Computer> computers, Properties info) {
        this.rooms = rooms;
        this.computers = computers;
        this.info = info;
    }

    public Set<String> getRooms() {
        return rooms;
    }

    public void setRooms(Set<String> rooms) {
        this.rooms = rooms;
    }

    public Map<String, Computer> getComputers() {
        return computers;
    }

    public void setComputers(Map<String, Computer> computers) {
        this.computers = computers;
    }

    public Properties getInfo() {
        return info;
    }

    public void setInfo(Properties info) {
        this.info = info;
    }

    @Override
    public String toString() {
        return "Company{" +
                "rooms=" + rooms +
                ", computes=" + computers +
                ", info=" + info +
                '}';
    }
}
