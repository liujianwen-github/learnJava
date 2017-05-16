package demo1;

public class InnerClass {
	//外部类构造函数
	public InnerClass(){
		System.out.println("外部类输出");
	}
	public class Inner{	
		//内部类构造函数
		public Inner(){
			System.out.println("内部类输出");
		}
		// 内部类的方法
		public void show() {
			System.out.println("内部类方法输出");
		}
	}
	
	public static void main(String[] args) {
		//创建外部类对象
		InnerClass hello=new InnerClass();
		//创建内部类对象
		Inner innerObj=hello.new Inner();
		innerObj.show();
	}
}
