package circle;

public class Circle {
//	int a=10;
//	public int b=20;
	public static void main(String[] args) {
		for (int a = 0; a < 10; a++) {
			if(a==3){
				continue;//跳过当前条件
			}
			System.out.println("for循环输出："+a);
		}
		//while()条件为true执行
		int b=0;
		while(b<10){
			System.out.println("while循环输出:"+b);
			b++;
		}
		
		//do...while...
		int c=0;
		do{
			System.out.println("do-while循环输出"+c);
			c++;
		}while(c<10);
		
	}
}
