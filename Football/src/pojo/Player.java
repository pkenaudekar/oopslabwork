package pojo;

public class Player extends Team{
	private Integer age;
	private String name;
	
	public Player() {
		age=0;
		name="";
		System.out.println("Player(s) created");
	}
	
	public Player(String name, Integer age) {
		this.name=name;
		this.age=age;
	}
	
	public Integer getAge() {
		return age;
	}
	
	public void setAge(Integer age) {
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void kick()
	{
		System.out.println("kick");
	}
	
	
}

