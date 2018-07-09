package cao.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cao.springboot.domain.User;
import cao.springboot.service.IUserService;

@RestController
public class UserController {
	@Autowired
	private IUserService userService;
	@RequestMapping("/user/save")
	public String save(String name) {
		User user = new User(name);
		userService.save(user);
		return "save successfully";
	}
	@RequestMapping("/user/get")
	public User get(Long id) {
		User user = userService.get(id);
		return user;
	}
}
