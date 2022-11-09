/*
	1.jisuanjizairenheqingkuangxiadouzhinengshibie 2 jinzhi
	2.jisuanjizai cunchu de shihou 2jinzhide bumaxingshi
	  bumaxingshi xiaolvzuigao
	3.2jinzhiyou yuanma fanma buma
	4.duiyuyigezhengzhengzhulaishuo 2jinzhiyuanma fanma buma shitongyige wanquanxiangtong
		int i = 1;
		2jinzhi yuanma;00000000 00000000 000000000 00000001
	   2jinzhi fanma; 00000000 00000000 000000000 00000001
	   2jinzhi buma;  00000000 00000000 000000000 00000001

		duiyuyige fushulaishuo 
		byte i = -1;
		yuanma 10000001
		fanma  11111110
		buma(fanma +1) 11111111


		jisuanji yongyuancundedoushi 2jinzhishi bumaxingshi
		ni keyi caiqu nituidao de fangshi 
*/
public class Test010{
	public static void main(String[] args){
		
		//00000000 00000000 00000000 10010110
		//-1 10010101
		//qufan 11101010
		byte b = (byte)150;

		System.out.println(b);


	}
}