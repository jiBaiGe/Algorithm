package minstack;

import java.util.Stack;



/*实现一个stack类，定义栈的数据结构,实现一个能够得到栈的最小元素的getMin函数。在该栈中，调用getMin、push及pop的时间复杂度都是O(1).
	最小值思路：用一个辅助栈stack2记住每次入栈stack1的当前最小值:
	在stack1入栈时，往stack2中加入当前最小值；stack1元素出栈时，
	stack2也出栈一个元素。最小值从stack2中获取及栈顶元素。O(1)
  
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
