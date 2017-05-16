package faceToObj;

public class Animal {
	public int age=10;
	public String name;
	private String type;
	
	public Animal(){
		System.out.println("animal 构造方法");
//		final age=20;
	}
	public void eat() {
		System.out.println("动物具有吃东西的能力");
	}
	public void hello(){
		System.out.println("年龄："+age+",名字:"+name+"，类型："+type);
	}
	
}
