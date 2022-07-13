package first_java01;

public class primitivedata {

	public static void main(String[] args) {
        byte minByteValue = Byte.MIN_VALUE;
        byte maxByteValue = Byte.MAX_VALUE;
        System.out.println("Min byte value" + minByteValue);
        System.out.println("Max byte value" + maxByteValue);
        
        int val=5;
        float val2=5.23f;
        double val3=5.23;
        
        val=6;
        val2=6f;
        val3=6d;
        
        System.out.println(val + val2 + val3);
	}

}
