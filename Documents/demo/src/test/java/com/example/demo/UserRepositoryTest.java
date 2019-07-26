package com.example.demo;

import com.example.demo.domain.DAO.UserDAO;
import com.example.demo.domain.Repository.UserRepository;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.text.DateFormat;
import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserRepositoryTest {

    @Autowired
    private UserRepository userRepository;

    @Test
    public void test() throws Exception {
        Date date = new Date();
        DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG);
        String formattedDate = dateFormat.format(date);

        userRepository.save(new UserDAO("aa1", "aa@126.com", "aa", "aa123456",formattedDate));
        userRepository.save(new UserDAO("bb2", "bb@126.com", "bb", "bb123456",formattedDate));
        userRepository.save(new UserDAO("cc3", "cc@126.com", "cc", "cc123456",formattedDate));

        Assert.assertEquals(3, userRepository.findAll().size());
        Assert.assertEquals("bb2", userRepository.findByUserNameOrEmail("bb", "bb@126.com").getNickName());
        userRepository.delete(userRepository.findByUserName("aa"));
    }

}