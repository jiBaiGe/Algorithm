package search;


//ʵ�ֶ��������㷨
//try to implement an binarySearch algorithm.
public class Search {
	
	int [] array ;
	
	public Search(int a) {        // �����Ҵ���һ���������Զ��������㷨�����еĹ����������ǰ�һ������������е�ÿһλ�ŵ������У�����
		Integer num = a;           //Ȼ����Ե�����Ĳ��ҷ������ж�������������һ����Ϊ����ϰ��������̣�
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
	

	//���ֲ��ҿ�ʼ
	public void BinarySearch(int key) {
		boolean notfound = true;
		int []a = this.array;
		int left  = 0;
		int right = a.length - 1 ;
		while (left <= right) {
			int mid = left + (right - left)/2;
			//���Ԫ��С���м�ֵ�����ҽ�����м�ֵ-1����֮�������м�ֵ+1��ʵ��ÿ��������Χ��Сһ�롣
			if(a[mid] > key) {
				right = mid - 1;
			}else
			if(a[mid] < key) {
				left = mid + 1;
			}else {
				System.out.println("Ԫ��"+key+"�ڵ�"+(mid+1)+"��λ��");
				notfound = false;
				break;
			}
		}
		if(notfound) {System.out.println("Ԫ�ز�����");;}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Search a = new Search(123456789);
		a.BinarySearch(2);
	}

}



