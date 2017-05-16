package com.imooc;

public class StaticChunk {
	int  num1;
	int num2;
	static int num3;
	public StaticChunk() {
		// TODO Auto-generated constructor stub
		System.out.println("构造方法初始化");
		System.out.println(num1);
		num1=1;
	}
	{//普通块初始化
		System.out.println("块初始化");
		num2=2;
		System.out.println(num2);
	}
	static {
		System.out.println("static初始化");
		num3=3;
		System.out.println(num3);
	}
	public static void main(String[] args) {
		StaticChunk hello=new StaticChunk();
		//类加载时，静态加载块最先执行，然后是普通块，最后是构造方法
		StaticChunk hello2=new StaticChunk();//静态初始化块只在类加载时执行一次，之后不执行
		
	}
}
