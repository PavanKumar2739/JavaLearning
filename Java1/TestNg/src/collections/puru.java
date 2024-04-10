package collections;

import java.time.LocalTime;
import java.util.Date;

public class puru {
public String name;
double height;
private int lovers;
protected String asset="100000cr";
//Date d=new Date();
LocalTime time = LocalTime.now();

public puru(){
	System.out.println("constructor");
}
public puru(int a){
	this.lovers=a;
	System.out.println("constructor lovers : ");
}

private puru(double a,String name){
	System.out.println("const 3rd one : "+this.name+" "+this.height);
	this.height =a;
	this.name=name;
	System.out.println("const 3rd one : "+ this.name+" "+this.height);
}

private puru(String n,String a ){
	System.out.println("constructor");
	
}

public puru(String name,int a ){
	System.out.println("parent constructor  : "+a+" "+name);
}


static
{
	puru i =new puru();
	i.name = "puru";
	System.out.println("static block : "+i.add(10, 2));;
}

//{
//	puru i =new puru();
//	name = "pavan";
//	System.out.println("normal block : "+i.add(20, 2));;
//}
public String eating(double evening,double morning) {
	if(time.getHour()<12)
		return "morning : "+morning+"kgs";
	else
		return "evening : "+evening+"kgs";
	 
}

public static  int add(int a,int b) {
	return a+b;
}
public static  double add(double a,int b) {
	return a+b;
}
public  int add(int a,int b,int c) {
	return a+b+c;
}


public int multi(int b) {
	
	return new puru().add(30, 20)*b;
	//System.out.println("sjfhb");
}
public static void name() {
	for(int i=1;i<10;i++) {
		if(i==5) {
			System.out.println("came to break");
			break;
		}
		else if(i==3) {
			System.out.println("came to continue");
			continue;
		}
		else {
			System.out.println(i);
		}
	}
}

public int getLovers() {
	return lovers;
}
public void setLovers(int lovers) {
	this.lovers = lovers;
}
public static void main(String[] args) {
//	String a="puru";
//	String b=new String("pavan");
//	String b1=new String("pavan");
	puru i =new puru();
	puru i1 =new puru();
	System.out.println(" main method : "+i.name);
//	System.out.println(i.time);
	
//	String x=(i.eating(0.5, 1));
//	System.out.println(x);
//	
//	System.out.println(i.add(10, 20));
//	System.out.println(i.multi(10));
	puru.name();
	puru p=new puru(18, "pavan");
}
}
