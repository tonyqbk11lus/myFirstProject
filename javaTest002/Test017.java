/*
		cun zai ji he li
		da duoshu qingkuangxia jianyi yong duanluyu &&
		teshuqingkuangxia caishiyong &++


*/

public class Test017{
	public static void main(String[] args){

	//duiyu luojiyu liangbian doushi true caishi true
	//
	//
		System.out.println(true & true);//true
		System.out.println(true & false);//false
		System.out.println(false & false);//false

		System.out.println(100 > 90 & 100 > 101);//false
		System.out.println((100 > 90) & (100 > 101));//false

		int a = 100;
		int b = 101;
		int c = 90;
		System.out.println(a < b & a > c);//true

		System.out.println(a < b | c > b);//true
		System.out.println(true | false);//true

		System.out.println(!true);//false
      System.out.println(!false);//true

		//zheli xuyao yige xiaokuohao
		System.out.println(!(a > b));//true

      System.out.println(true & true);//true
		System.out.println(true & false);//false
		System.out.println(true & false);//false
		
      System.out.println(true && true);//true
		System.out.println(true &&false);//false
		System.out.println(true &&false);//false

		int x = 10;
		int y = 11;
		//
      System.out.println(x > y & x > y++);//false

		//youbiande budengshi yijingzhixingle
		//buguan diyige biaodashi jieguoruhe youbianye zhaoyangzhixing
      System.out.println(y);//12

		int m = 10;
		int n = 11;
      System.out.println(m > n && m > n++);//false

		//youbiande budengshi buzhixing
		//xiaolv gaoyixie 
      System.out.println(n);//11

		}

}