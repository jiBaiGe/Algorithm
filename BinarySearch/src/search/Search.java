package search;


//实现二分搜索算法
//try to implement an binarySearch algorithm.
public class Search {
	
	int [] array ;
	
	public Search(int a) {        // 这里我创建一个类来测试二分搜索算法，类中的构造器功能是把一个输入的整型中的每一位放到数组中（有序）
		Integer num = a;           //然后可以调用类的查找方法进行二分搜索。（这一步是为了练习面向对象编程）
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
	

	//二分查找开始
	public void BinarySearch(int key) {
		boolean notfound = true;
		int []a = this.array;
		int left  = 0;
		int right = a.length - 1 ;
		while (left <= right) {
			int mid = left + (right - left)/2;
			//如果元素小于中间值，则右界等于中间值-1，反之左界等于中间值+1；实现每次搜索范围减小一半。
			if(a[mid] > key) {
				right = mid - 1;
			}else
			if(a[mid] < key) {
				left = mid + 1;
			}else {
				System.out.println("元素"+key+"在第"+(mid+1)+"个位置");
				notfound = false;
				break;
			}
		}
		if(notfound) {System.out.println("元素不存在");;}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Search a = new Search(123456789);
		a.BinarySearch(2);
	}

}



