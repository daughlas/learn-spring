import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import tech.lvjiawen.spring.jdbc.dao.HotelDao;
import tech.lvjiawen.spring.jdbc.entity.Hotel;

import javax.annotation.Resource;
import java.util.Date;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class JdbcTemplateTestor {
    @Resource
    private HotelDao hotelDao;

    @Test
    public void testInsert() {
        Hotel hotel = new Hotel();
        hotel.setOrderNo(10004);
        hotel.setCity("上海");
        hotel.setPrice(699f);
        hotel.setHotelname("酒店4");
        hotel.setArrivedate(new Date());
        hotel.setLeaveedate(new Date());
        hotelDao.insert(hotel);
    }

    @Test
    public void findById() {
        Hotel hotel = hotelDao.getHotelById(10001);
        System.out.println(hotel);
    }

    @Test
    public void findByCityName() {
        System.out.println(hotelDao.findByCityName("上海"));
        System.out.println(hotelDao.findByCityName2("上海"));
    }
}
