package gc;

public class GCdemo {
	

		public static void main(String[] args) {
			
			Object obj1 = new GCdemo();
			Object obj2 = new GCdemo();
			
			obj1 = null;
			obj2 = null;
			
		}
		
		GCdemo() {
			System.out.println(this + " created...");
		}
		
		@Override
		protected void finalize() throws Throwable {
			System.out.println(this + " finalized...");
		}
	}


