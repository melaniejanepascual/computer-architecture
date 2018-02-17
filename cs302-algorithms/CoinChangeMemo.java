import java.util.Scanner;

public class CoinChangeMemo {

	final static int INF = 10000000;

	static int[] memoDict;

	public static void main(String[] args)
	{
		System.out.println("Enter amount: ");
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();

		//we ignore index 0 of dictionary, so size is n+1
		memoDict = new int[n+1];
		for(int i=0; i<memoDict.length; i++)
			memoDict[i] = -1; //indicates this value not stored in dictionary yet

		int numcoins = getChange(n);

		System.out.println("numcoins to make change for "+n+": "+numcoins);
	}

	//Find min of the three values
		public static int getMin(int n1, int n2, int n3)
		{
			int min = INF;

			if (n1 < min)
				min = n1;
			if (n2 < min)
				min = n2;
			if (n3 < min)
				min = n3;


			return min;
		}




	public static int getChange(int n)
	{

		//Check if the dictionary already contains getChange(n)
		if(n>=0 && memoDict[n]!=-1){
			return memoDict[n];
		}

		int count = 0;

		if(n==0)
			count=0; //not really needed since count is already 0
		else if (n==12 || n==5 || n==1)
			count = 1;
		else if (n<1)
			count = INF;
		else{
			System.out.println("getChange("+n+")");
			count = 1 + getMin( getChange(n-12), getChange(n-5), getChange(n-1));
		}

		//Store getChange(n) in the dictionary
		if(n>=0){
			memoDict[n] = count;
			//System.out.println("memoDict["+n+"]: "+count);
		}


		return count;
	}

}
