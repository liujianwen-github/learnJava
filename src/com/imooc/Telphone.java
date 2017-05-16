package com.imooc;

public class Telphone {
//	声明属性(可能有小数)
	float screen;
	float cpu;
	int var;
	int localVar=1;
//	声明方法
	void call(){
		int localVar=0;
		System.out.println("localVar:"+localVar);
		System.out.println(screen+"屏幕尺寸");
		System.out.println("cpu:"+cpu);
		System.out.println("打电话");
	}
	void sentMessage(){
		System.out.println("发短信");
	}
	
	//类中没有声明构造方法时，会自动生成一个无参数的构造方法，新声明的构造方法会覆盖默认
	public Telphone(){
		//方法重载
		System.out.println("无参数的构造方法，screen："+screen);
	}
	public Telphone(float newScreen,float newCpu) {
		//声明有参数的构造方法
		if (newScreen<3.5) {
			screen=3.5f;
			System.out.println("尺寸参数不合理");
		} else {
			screen=newScreen;
			System.out.println("合理参数");
		}
//		screen=newScreen;
		cpu=newCpu;
		System.out.println("有参数的构造方法");
		System.out.println(newScreen);
	}
} 
