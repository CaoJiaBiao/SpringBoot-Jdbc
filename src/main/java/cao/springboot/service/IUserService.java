package cao.springboot.service;

import cao.springboot.domain.User;

public interface IUserService {
	public void save(User user);
	public User get(long id);
}
