package sort;

public class QKSort {
	int [] array ;
	
			public QKSort(int a) {        // 娱乐娱乐
				Integer num = a;
				String s = num.toString();
				Character c;
				int []arr = new int[s.length()];;
				for(int i = 0;i < s.length();i++) {
					c = s.charAt(i); 
					arr[i] = Integer.parseInt(c.toString() ) ;
				}
				this.array =arr ;
			}			
			public void print() {
				int []a = array;
				for(int i = 0 ; i < a.length ; i++) {
					System.out.print(a[i]);
					if(i != a.length -1) {
					System.out.print("-");
					}else System.out.println();;
				}
			}
	
/*  @ye
 * 快速排序（Quicksort）是对冒泡排序的一种改进。
            快速排序由C. A. R. Hoare在1962年提出。它的基本思想是：通过一趟排序将要排序的数据分割成独立的两部分，
            其中一部分的所有数据都比另外一部分的所有数据都要小，然后再按此方法对这两部分数据分别进行快速排序，整个排序过程可以递归进行，
            以此达到整个数据变成有序序列
            
 */
	public void quicksort(int []a,int left, int right) {
		
		int i ,j,t,temp;
		if(left > right) {return;}
		temp = a[left];
		i = left;
		j = right;
		while (i != j) {
			
			while(a[j] >= temp && i < j) {
				j--;
			}
			while(a[i] <= temp && i < j) {
				i++;
			}
			if(i < j) {
				t = a[i];
				a[i] = a[j];
				a[j] = t;
			  }
			}
			a[left] = a[i];
			a[i] = temp;
		
		quicksort(a, left, i-1);
		quicksort(a, i+1, right);
	}
	
	public void Quicksort() {
		int []a = this.array;
		quicksort(a, 0, a.length-1);
	}
	
	//end practice。
	
	// main for test。
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		QKSort arr = new QKSort(143652);
		arr.print();
		arr.Quicksort();
		arr.print();
		
	}

}
