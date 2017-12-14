package sort;

public class QKSort {
	int [] array ;
	
			public QKSort(int a) {        // ��������
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
 * ��������Quicksort���Ƕ�ð�������һ�ָĽ���
            ����������C. A. R. Hoare��1962����������Ļ���˼���ǣ�ͨ��һ������Ҫ��������ݷָ�ɶ����������֣�
            ����һ���ֵ��������ݶ�������һ���ֵ��������ݶ�ҪС��Ȼ���ٰ��˷����������������ݷֱ���п�����������������̿��Եݹ���У�
            �Դ˴ﵽ�������ݱ����������
            
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
	
	//end practice��
	
	// main for test��
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		QKSort arr = new QKSort(143652);
		arr.print();
		arr.Quicksort();
		arr.print();
		
	}

}
