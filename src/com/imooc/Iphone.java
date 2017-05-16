package com.imooc;

public class Iphone {
	public static void main(String[] args) {
		//无参数构造方法
		Telphone phone1=new Telphone();
		phone1.screen=0.5f;
		phone1.cpu=2.5f;
		phone1.call();
		//无参数的构造方法
		Telphone phone2=new Telphone();
		phone2.sentMessage();
		//有参数的构造方法
		Telphone phone3=new Telphone(0.1f,2.5f);
		phone3.call();
	}
}
