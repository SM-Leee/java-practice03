package prob4;

public class ArrayUtils {
	
	// int 배열을 double 배열로 변환
	public static double [] intToDouble( int[] source ) {
		double[] ds = new double[source.length];
		for(int i=0;i<source.length;i++) {
			ds[i] = source[i];
		}
		return ds;
	}
	
	// double 배열을 int 배열로 변환
	public static int [] doubleToInt( double[] source ) {
		int[] is = new int[source.length];
		for(int i=0;i<source.length;i++) {
			is[i] = (int) source[i];
		}
		return is;
	}
	
	// int 배열 두 개를 연결한 새로운 배열 리턴
	public static int [] concat( int[] s1, int[] s2 ) {
		int[] s3 = new int[s1.length+s2.length];
		
		System.arraycopy(s1, 0, s3, 0, s1.length);
		System.arraycopy(s2, 0, s3, s1.length, s2.length);
		
		return s3;
	}

}
