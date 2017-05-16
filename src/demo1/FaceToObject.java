package demo1;
import com.imooc.Telphone;
public class FaceToObject {
	private  float screen;
	private  float mem;
	private  float cpu;
	//定义方法
	public float getScreen(){
		System.out.println("get方法执行");
		return screen;
	}
	public void setScreen(float newScreen){
		screen=newScreen;
		System.out.println("set方法执行");
	}
	public static void main(String[] args) {
		FaceToObject hello=new FaceToObject();
		hello.setScreen(5.0f);
		hello.getScreen();
//		System.out.println(localVar);
	}
}
