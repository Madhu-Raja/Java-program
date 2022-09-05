public class copyArrayDemo {

	public static void main(String[] args) {
		char srcarray[]= {'h','e','l','l','o'};
		char destarray[]= new char[5];
		System.arraycopy(srcarray,0,destarray,0,4);
		System.out.print(String.valueOf(destarray));
		

	}

}
