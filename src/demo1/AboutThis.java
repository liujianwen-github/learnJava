package demo1;

public class AboutThis {
	float screen;
	float cpu;
	int var;
	public AboutThis(){
		System.out.println("AboutThis构造函数");
	}
	public void sentMessage(){
		System.out.println("sentmessage");
	}
	public float getScreen() {
		return screen;
	}
	public void setScreen(float screen) {
		this.screen = screen;
		this.sentMessage();
	}
	public float getCpu() {
		return cpu;
	}
	public void setCpu(float cpu) {
		this.cpu = cpu;
	}
	public int getVar() {
		return var;
	}
	public void setVar(int var) {
		this.var = var;
	}
	public static void main(String[] args) {
		AboutThis hello=new AboutThis();
		hello.setScreen(1.2f);
	}
	
}
