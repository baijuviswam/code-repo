class TOH{
	public static void main(String[] args) {
		TOH toh = new TOH();
		int numberOfDiscs = 4;
		char source = 'A';
		char destination = 'C';
		char intermediate = 'B';
		toh.move(numberOfDiscs,source, destination, intermediate);
	}
	public void move(int numberOfDiscs, char source, char destination, char intermediate){
		if(numberOfDiscs==1){
			System.out.println("Moved "+numberOfDiscs+" from "+source+" to "+destination);
		}else{
			move(numberOfDiscs-1, source, intermediate, destination);
			System.out.println("Moved "+numberOfDiscs+" from "+source+" to "+destination);
			move(numberOfDiscs-1, intermediate, destination, source);
		}
	}
}