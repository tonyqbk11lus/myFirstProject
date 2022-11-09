/*
  byte,char,short zuohunheyunsuan de shihou,xianzhuanhuancheng int leixing



*/

public class Test011{
	public static void main(String[] args){
		
		char c1 = 'a';
		byte b = 1;

		System.out.println(c1 + b);
		
		//cuowu bu jianrong deleixing; cong int -> short kenengyousunshi
		//short s = c1 + b;//bianyiqi buzhidao zhege jiafazuihoude jieguo shishenmo
		short s = (short)(c1 + b);
	}
}