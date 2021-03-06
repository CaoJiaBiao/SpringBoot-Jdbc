package cao.springboot.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import cao.springboot.domain.User;
@Repository
public class UserDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	public void save(User user) {
		jdbcTemplate.update("insert into t_user1(name) values(?)",user.getName());
	}
	public User get(long id) {
		RowMapper<User> rowMapper = new BeanPropertyRowMapper<User>(User.class);
		User user = jdbcTemplate.queryForObject("select * from t_user1 where id=?", rowMapper, id);
		return user;
	}
}
