package collections;

public class PuruChild extends puru {
     String color;
     String faceShape;
     static double weight;
    
    public PuruChild(String color,String faceShape,double weight) {
    	super(1);
		this.color=color;
		this.faceShape=faceShape;
		this.weight=weight;		
	}
    
    public int divide(int c) {
		return add(10, 20)/c;
	}
    
    @Override
    public  int add(int a,int b,int c) {
    	System.out.println(super.add(a, b, c));;
    	return a+c;
    }
    public static void main(String[] args) {
		PuruChild pC=new PuruChild("red", "round", 69);
		System.out.println(pC.height);
		System.out.println(pC.eating(2, 1));
		System.out.println(pC.divide(10));
		puru pC1=new PuruChild("White", "Square", 72);
		puru pC2=new puru();
		System.out.println(PuruChild.weight);
		System.out.println(pC.add(10, 12, 30));
		//System.out.println(pC2.add(10, 12, 30));
		//pC.setLovers(1);
		System.out.println(pC.getLovers());
		System.out.println("assets : "+pC.asset);
		
	}
    
	
}
	