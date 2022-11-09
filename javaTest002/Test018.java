public class Test018{
	public static void  main(String[] args){

		int i = 10;
		//chongxin fuzhi
		i = 20;
		
		byte b =10;
		b = 20;

		int k = 10;
		k += 20;
		System.out.println(k);

		int m = 10;
		m = m + 20;
		System.out.println(m);

		//i +=10 he i = i + 10 buyiyang,
		//zhinengshuo xiangsi 
		byte x = 100;// 100 meiyouchaoguo byte leixingquzhifanwei keyizhijiefuzhi
		System.out.println(x);

		//x zidansheng yilai yongyuan doushi byte
		//qishi x += 1 dengtongyu x = (byte)(x + 1)
		x += 1;
		System.out.println(x);//101

		//chaoqu quzhifanwei
		//sunshi jingdu
		x += 199;
		System.out.println(x);//44

		int c = 100;
		c += 100;
		System.out.println(c);//200

		c -= 100;
		System.out.println(c);//100

		c *= 100;
		System.out.println(c);//10000

		c /= 100;
		System.out.println(c);//100

		c %= 100;
		System.out.println(c);//100

	}
}