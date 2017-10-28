public class hello{
	
	public staitc void main(String[] args){
		System.out.println("hello everybodys");
		int a=10;
		int i=20;
		int[] attr = new int[10];
		for(int i=0;i<attr.length-1;i++){
			for(int j=0;j<attr.length-1-i;j++){
				if(attr[j]>attr[j+1]){
					int temp=attr[j];
					attr[j]=attr[j+1];
					attr[j+1]=temp;
					System.out.println("hello world");
				}
			}
		}
	}
}