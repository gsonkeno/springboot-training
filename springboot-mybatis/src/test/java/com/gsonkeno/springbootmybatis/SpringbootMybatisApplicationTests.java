package com.gsonkeno.springbootmybatis;

import com.gsonkeno.springbootmybatis.domain.City;
import com.gsonkeno.springbootmybatis.service.CityService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootMybatisApplicationTests {

    @Autowired
    private CityService cityService;

    @Test
    public void contextLoads() {
        City xinyang = cityService.findCityByName("xinyang");
        System.out.println(xinyang);
    }

}
