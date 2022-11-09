public class Test020{
	public static void main(String[] args){
		
		//dingyi yige de bianliang
		int nianling = 35;

		//zifuchuande pinjiecaozuo
		System.out.println("nianling =" + nianling);

		int a = 100;
		int b = 200;
		int c = a + b;
		System.out.println(c);//300

		//yigebiaodashizhong you duoge + shi
		//congzuodaoyou de shunxuyicizhixing
		//300110
		System.out.println(a + b + "110");

		//xiansuanxiaokuohaolide 
		//100200110
		System.out.println(a + (b + "110"));

		//kongzhitaishang shuchu 100+200=300
		System.out.println(a + "+" + b + "=" + c);

		//kongzhitaishang shuchu 100+200=300
		System.out.println(a + "+" + b + "=" + (a + b));

		//zai java zenmo dingyi zifuchuan ne
		//Sring shi yiyongshujuleixing
		//String name = 100 <--- leixingbu jianrong
		String name = "Jack";

		//jiayigeshuoyinhao ranhouzhijianjia liangge + ranhouzhongjian jia bianliang
		System.out.println("Deng Lu Cheng Gong HuanYing " + name + " HuiLai");

	}
}