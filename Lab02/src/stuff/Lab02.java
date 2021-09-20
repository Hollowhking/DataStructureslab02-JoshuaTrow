package stuff;

class Doubler implements UnaryFunction{

	public double exec(double argument) {
		return argument*2;
	}
	
}
public class Lab02 {
	
	public static double[] map(UnaryFunction cum,double[] x) {
		double [] z = new double [x.length];
		for (int i=0;i<x.length;i++) {
			z[i]=cum.exec(x[i]);
		}
		return z;
	}
	
	public static void main(String[] args) {
		double [] y= {1.0,2.0,3.0,4.0,5.0};
		double [] ret = map(new Doubler(), y);
		for(int i=0;i<y.length;i++) {
			System.out.println(ret[i]);
		}
		Song sed = new Song("The Ramones", "I Wanna be Sedated", 148);
		Song one = new Song("Daft Punk", "One More Time", 322);

		Song.collectionName = "Randy's Collection";
		System.out.println("Collection: " + Song.collectionName);

		System.out.println(sed); // this will invoke the toString() function on the Song instance 'sed'
		System.out.println(one);
	}

}