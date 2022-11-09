/*
	zhengshu nengfou zhijie fugei char

	char x = 97;
	zhe ge java yuju shi yunxude ,buqieshuchu jieguoshi 'a'

	dang zhengshufuzhigei char bianliangshi hui zidongzhunhuanchang char zifuxing


*/
public class Test009{
	public static void main(String[] args){
		
		char c1 = 'a';
		System.out.println(c1);

		char c2 = 97;
		System.out.println(c2);//'a'

		char c3 = 65535;
		System.out.println(c3);

		char c4 = (char)65536;
		System.out.println(c4);

	}
}