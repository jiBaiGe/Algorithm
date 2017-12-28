package minstack;

import java.util.Stack;



/*ʵ��һ��stack�࣬����ջ�����ݽṹ,ʵ��һ���ܹ��õ�ջ����СԪ�ص�getMin�������ڸ�ջ�У�����getMin��push��pop��ʱ�临�Ӷȶ���O(1).
	��Сֵ˼·����һ������ջstack2��סÿ����ջstack1�ĵ�ǰ��Сֵ:
	��stack1��ջʱ����stack2�м��뵱ǰ��Сֵ��stack1Ԫ�س�ջʱ��
	stack2Ҳ��ջһ��Ԫ�ء���Сֵ��stack2�л�ȡ��ջ��Ԫ�ء�O(1)
  
 */
public class MinStack {
	
	
		Stack<Integer> stack = new Stack<Integer>();
		Stack<Integer> stackmin = new Stack<Integer>();
	
	   public void push(int node) {
	       if(stack.isEmpty()) {
	    	   stack.push(node);
	    	   stackmin.push(node);
		       }else {
		    	   if(node < stack.peek()) {
		    		   stack.push(node);
		    		   stackmin.push(node);
		    	   }else {
		    		   stack.push(node);
		    	   }
		       }
	    }
	    
	    public void pop() {
	    	if(stack.peek() == stackmin.peek()) {
	    		stack.pop();
	    		stackmin.pop();
	    	}else {
	    		stack.pop();
	    	}
	    }
	    
	   
	    public int min() {     
	    	return stackmin.peek();
	    }
	    
	   public int top() {
	    	return 0;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MinStack ms = new MinStack();
		ms.push(3);
		ms.push(4);
		ms.push(2);
		ms.push(5);
		
		System.out.println(ms.min());
//		System.out.println(ms.top());
	}

}
