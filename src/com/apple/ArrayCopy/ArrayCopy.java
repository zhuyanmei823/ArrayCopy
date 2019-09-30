public class ArrayCopy{
	public static void main(String[] args){
		int c[]= {1,2,3,4,5},d[];
		d=new int[5];
		System.arraycopy(c, 0, d, 0, 5); 
	for(int n=0;n<d.length;n++){
		System.out.println(d[n]);
	}
	}
}
