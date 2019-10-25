public class InList{
	int first;
	InList next;
	public InList(int f, InList r){
		this.first = f;
		this.next = r;
	}

	public int size(){
		//Base Case 
		if(next==null) return 1;
		return 1 + this.next.size();
	}


	public int sizeIterative(){
		InList p = this;
		int size = 0;
		while(p!=null){
			p=p.next;
			size=size+1;
		}
		return size;
	}
	public static void main(String[] args) {
		InList L = new InList(5, null);
		L = new InList(10, L);
		L   = new InList(15, L);
		System.out.println("Size Recursive "+L.size());
		System.out.println("Size Iterative "+L.sizeIterative());
	}
}