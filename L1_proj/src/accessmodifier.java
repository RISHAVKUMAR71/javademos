
// default access modifier
class default_access{
void display() {
	System.out.println("default access modifer");
	
}

}

public class accessmodifier{
	public static void main(String[] args) {
		System.out.println("default access modifer");
		default_access def=new default_access();
		
		def.display();
		
	}
}