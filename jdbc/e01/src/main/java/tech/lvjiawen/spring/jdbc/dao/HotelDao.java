package tech.lvjiawen.spring.jdbc.dao;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import tech.lvjiawen.spring.jdbc.entity.Hotel;

import java.util.List;
import java.util.Map;

public class HotelDao {
    private JdbcTemplate jdbcTemplate;

    public void insert(Hotel hotel) {
        String sql = "INSERT INTO hotel(orderno, city, price, hotelname, arrivedate, leavedate) VALUES(?, ?, ?, ?, ?, ?)";
        jdbcTemplate.update(sql, new Object[]{
           hotel.getOrderNo(),
           hotel.getCity(),
           hotel.getPrice(),
           hotel.getHotelname(),
           hotel.getArrivedate(),
           hotel.getLeaveedate()
        });
    }

    public Hotel getHotelById(Integer orderno) {
        String sql = "SELECT * FROM hotel WHERE orderno = ?";
        Hotel hotel = jdbcTemplate.queryForObject(sql, new Object[]{orderno}, new BeanPropertyRowMapper<Hotel>(Hotel.class));
        return hotel;
    }

    public List<Hotel> findByCityName(String cityName) {
        String sql = "SELECT * FROM hotel WHERE city = ?";
        List<Hotel> hotels = jdbcTemplate.query(sql, new Object[]{cityName}, new BeanPropertyRowMapper<Hotel>(Hotel.class));
        return hotels;
    }

    public List<Map<String, Object>> findByCityName2(String cityName) {
        String sql = "SELECT * FROM hotel WHERE city = ?";
        List<Map<String, Object>> maps = jdbcTemplate.queryForList(sql, new Object[]{cityName});
        return maps;
    }

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
}
