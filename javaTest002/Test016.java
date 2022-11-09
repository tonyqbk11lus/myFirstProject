/*

	1.suanshuyunsuanfu
	+ - * / % ++ --

	2.guanxiyunsuanfu
	> >= < <= == !=

	suoyoude guanxiyunsuanfudeyunsuanjieguodoushi buerleixing
	bushi true jiushi false,bukenengshiqitazhi

	3.luojiyunsuanfu

	&   luojiyu
	|   luojihuo
	!   luojifei
	&&  duanluyu
	||  duanluhuo

	luojiyunsuanfu liangbiandoushi buerleixing,bieqieyunsuanjieguo
	yeshi buerleixing,zheshiluojiyunsuanfudetedian

	4.fuzhiyunsuanfu

	baokuo jiben fuzhiyunsuanfu he kuozhanyunsuanfu

	=
	+=
	-=
	*=
	/=
	%=

	zhongjianbunengyou kongge

	5.weiyunsuan xianbujiang

	6.tiaojianyunsuanfu

	sanmuyunsuanfu

	bugebiaodashi ? biaodashi1 : biaodashi2


	7.jifuchuanliangjieyunsuanfu

	+ zuoyong1 qiuhe  zongyong2 zifuchuanpinjie


	8.qitayunsuanfu

*/

public class Test016{
	public static void main(String[] args){
		
			int a = 10;
			int b = 3;

			System.out.println(a + b);//13
			System.out.println(a - b);//7
			System.out.println(a * b);//30
			System.out.println(a / b);//3
			System.out.println(a % b);//1

			int k = 10;
			++k;
			System.out.println(k);

			//++ chuanxianzai qianmian he goumian youshenmo qubie
			int m = 20;
			//xian fuzhi zai zijia 1
			int n = m++;
			System.out.println(n);
			System.out.println(m);

			int x = 30;
			//xian zijia 1 hou fuzhi
			int y = ++x;
         System.out.println(y);
			System.out.println(x);

			int c = 50;
			//xianjia 1 zai shuchu
			//int temp = c;
			//System.out.println(temp);
			System.out.println(c++);//50
			System.out.println(c);//51
	
			int d = 80;
			//xianjia 1 zai shuchu
			//int temp = d + 1;
			//System.out.println(temp);
			System.out.println(++d);//81
			System.out.println(d);//81
			
			//-- yehe ++ xiangtong

	}
}