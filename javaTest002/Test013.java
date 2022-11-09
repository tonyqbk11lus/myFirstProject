/*
   float he double doucun de shi jinsizhi
   
	java.math.BigDecimal

	float bi long de rongliang da 

	renyi yigefudianxing doubi zhengshuxing kongjian da

	float rongliang > long rongliang

	xiangrang fudianxing zimianliang bei dangzuo float leixing laichuli
	namo houmian tianjia F/f

*/

public class Test013{
	public static void main(String[] args){
		
		double p1 = 3.1415926;
		System.out.println(p1);

		//houmian tianjia F
		float f = 3.14f;
		System.out.println(f);

		//qiangzhi zhuanhuan
		float f1 = (float)3.14;
		System.out.println(f1);

		//int i = 10.0/5 cuowu bujianrongde leixing
		//bixu qiangzhuan
		int i = (int)10.0/5;
		System.out.println(i);

		//di 2zhong fafang
		int k = (int)(10.0/5);
		System.out.println(k);

	}
}