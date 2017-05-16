package faceToObj;
import demo1.*;
//新建类名
class FreshJuice {
	   enum FreshJuiceSize{ SMALL, MEDIUM , LARGE }
	   enum Color{red,green,yellow,blue}
	   FreshJuiceSize size;
	   Color color;
	}

//public（访问控制符）
public class Enumeration {
	private int num;
	
	//自动生成get、set方法
	public void setNum(int num) {
		this.num = num;
	}
	public int getNum() {
		return num;
	}
	//无参构造方法
	public Enumeration(){
		System.out.println("Enumeration构造方法");
	}
	
	//主方法入口
	public static void main(String []args){
	//java因强制要求类名与文件名统一，因此在引用其他类时无需显式声明，编译时，自动寻找同名文件
	AboutThis hello=new AboutThis();
	FreshJuice juice = new FreshJuice();
	juice.size = FreshJuice.FreshJuiceSize.MEDIUM  ;
	juice.color= FreshJuice.Color.red;
	System.out.println(juice.size+","+juice.color);
   }
}
