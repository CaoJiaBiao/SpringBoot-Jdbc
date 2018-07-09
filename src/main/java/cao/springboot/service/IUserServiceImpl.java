package cao.springboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cao.springboot.dao.UserDao;
import cao.springboot.domain.User;

@Service
public class IUserServiceImpl implements IUserService {

	@Autowired
	private UserDao userDao;
	@Override
	public void save(User user) {
		// TODO 自动生成的方法存根
		userDao.save(user);
	}

	@Override
	public User get(long id) {
		// TODO 自动生成的方法存根
		return userDao.get(id);
	}

}
