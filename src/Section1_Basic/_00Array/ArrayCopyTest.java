package Section1_Basic._00Array;

public class ArrayCopyTest {
	public static void main(String[] args) {
		int[] arr1 = {1,2,3,4};
		int[] arr2 = arr1;
		
		System.out.println(arr2[2]);
		arr2[2]=2;
		System.out.println(arr1[2]);
		System.out.println(arr2[2]);
		System.out.println(arr1==arr2);
	}
}
