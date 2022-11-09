/*
	jibenshujuleixing
	
	byte,1. -128--127
	short,2,-32768--32767
	int,4,-2147483648-2147483647
	long,8
	float,4
	double,8
	boolean,1,true,false,zai c++ zhong biao shi 1 he 0
	char,2,0--65535,biaoshideshiwenzi,wenzimeiyouzhengfuzhifen
	zifubianma renweide dingyi de zhuanhuanbiao
	ASCII 1byte cunchu biaoshi 256 zhong qingkuang'a
	'a'=97 'A' = 65 '0' = 48

   gb2312<GBK<GB18030
	BIG5
	unicode tongyile quanqiu de wenzi

	yinyongshujuleixing

	String

*/

public class Test004{
	public static void main(String[] args){

		//char keyi cunchu yi ge hanzi.
		//char zhanyong 2byte,zhenghao

		char c1 ='a';
		System.out.println(c1);

		//bu shi shuzi 1,shi wenzi 1
		char c2 ='1';
      System.out.println(c2);

		char c3 = 't';
		System.out.println(c3);

		//xiamiande biaoshi 1 ge zifu
		//qizhonng '\t' biaoshi zhibiaofu tab.
		char c4 = '\t';
		
		//\dechuxianbiaoshi
		System.out.println("abcdef");
		System.out.println("abctdef");
		System.out.println("abc\tdef");

		System.out.print("abc");
		//System.out.print(c4);
		System.out.println("def");	

		
		//kongzhitanshang shuchu '
		//jia yige \ biaoshi yige putong de '
		System.out.println('\'');

		//kongzhitanshang shuchu \
		//lingge \ biaoshi yi ge putong de \
		System.out.println('\\');

		//kongzhitanshang shuchu "test"
		System.out.println("\"test\"");

		System.out.println("'");

		System.out.println("'test'");

		//xiamian biaoshi hanzi zhege huanjiang bu zhichi 
		//char x = '\4e2d';
		//System.out.println(x); -->hanzi zhong


	}
}