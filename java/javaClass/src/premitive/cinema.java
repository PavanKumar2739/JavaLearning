package premitive;

public class cinema {
	String name;
	String show;
	int price;
	
	cinema(String name, String show,int price)
	{
		this.name=name;
		this.show=show;
		this.price=price;
	}
	
	
	public static void main(String[] args) {
		cinema c1=new cinema("evil","10:30 show",100);
		cinema c2=new cinema("alive","11:30 show",100);
		cinema c3=new cinema("RRR","09:30 show",100);
		cinema c4=new cinema("ega","01:30 show",100);
		cinema c5=new cinema("avengers","10:00 show",100);
		
		cinema c[]=new cinema[5];
		for(int i=0;i<c.length;i++)
		{
			System.out.println(c[i].name+ " "+c[i].show+ " "+c[i].price );
		}
	}

}
