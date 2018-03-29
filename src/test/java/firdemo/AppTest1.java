package firdemo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.finedo.Application;
import com.finedo.dao.interfaces.UserDao;
import com.finedo.domain.User;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(Application.class)
public class AppTest1 {
	@Autowired
	private UserDao userDao;
	
	@Test
	public void test1() {
		User user = userDao.getUserById("1");
		System.out.println(user.getName());
	}
}
