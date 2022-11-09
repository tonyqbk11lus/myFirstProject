 /*
   javaweb Tomcat server 
   
	1 JVM
	2 classloader  --> morenqingkuangxia dangqianlujingxiazhao .class
	3 class search --> class files  *.class
	4 NO  can't load class
	5 Yes jieshiqi --> 10101010110... 
	6 Os --> yingjian contract

   morenqingkuangxia dangqianmuluxia look for *.class file
	
	in only java 
	(classpath)  guide --> calssloader
	reloader DOS 

	only shidingdelujingxia .class 
	can't search dangqianmuluxia .class

*/

/**
*	javadoc 
*	@version
*  @name
*	javadoc xxx.java -t 
*/

//good 

public class Test001{

	//class 
	//System.out.println("test001"); --> can't run

	//main method 
	public static void main(String[] args){

//guifan read dificult
//classname methodname bianliangName jiekouName changliangName
//leiminghejiekouming shouzimudaxie houmianmeigedancishouzimudaxie
//bianliangminghefangfamingshouzimuxiaoxie houmianmeigedancishouzimudaxie
//changliangming quanbudoudaxie bingqiedancizhijian douyongxiahuaxianliangjie
//guanjianzi qubudouxiaoxie
//@
//
//
		int i=100;

		System.out.println("test001");
		System.out.println("test002");
		System.out.println(100);
		System.out.println("100");
		System.out.println(100 + 200);
		System.out.println(100 - 200);
		System.out.println(100 * 200);
		System.out.println(100 / 200);

		System.out.println(i);
	}
	//method3
	//can't Run
	public static void doSome(){
		
		int k=0;
		int nianling=20;
		
		System.out.println(k);
		System.out.println(nianling);
	}

	//method2
	//can't Run 
	public static void main2(String[] args){

		System.out.println("test001");
		System.out.println("test002");
	}

	//method4
}


class A{
	public static void main(String[] args){
		
	}
}

class a{
	public static void main(String[] args){
		
	}
}






