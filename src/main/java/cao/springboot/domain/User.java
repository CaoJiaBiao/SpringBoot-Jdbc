package cao.springboot.domain;

public class User {
	private long id;
	private String name;
	public long getId() {
		return id;
	}
	
	public User() {
		super();
		// TODO 自动生成的构造函数存根
	}

	public User(String name) {
		super();
		this.name = name;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
