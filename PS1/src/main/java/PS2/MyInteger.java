package PS2;

public class MyInteger {

		private int iValue;
		
		public MyInteger(int iValue) {
			this.iValue = iValue;
		}
		
		public boolean isEven() {
			return(isEven(iValue));
		}
		
		public static boolean isEven(int iValue) {
			return (iValue % 2 == 0);
		}
		
		public static boolean isEven(MyInteger MyInt) {
			return(isEven(MyInt.iValue));
		}
		
		public boolean isOdd() {
			return !isEven();
		}
		
		public static boolean isOdd(int iValue) {
			return !isEven(iValue);
		}
		
		public static boolean isOdd(MyInteger MyInt) {
			return !isEven(MyInt);
		}
		
		public boolean isPrime() {
			return(isPrime(iValue));
		}
		
		public static boolean isPrime(int iValue) {
			for(int i = 2; i <= iValue/2; i++) {
				if(iValue % i == 0) {
					return false;
				}
			}
			return true;
		}
		
		public static boolean isPrime(MyInteger MyInt) {
			return(isPrime(MyInt.iValue));
		}
		
		public boolean isEquals(int iValue) {
			return(this.iValue == iValue);
		}
		
		public boolean isEquals(MyInteger MyInt) {
			return(isEquals(MyInt.iValue));
		}

		public int getiValue() {
			return iValue;
		}
}
