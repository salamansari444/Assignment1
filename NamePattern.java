package in.neuron.main;

public class NamePattern {

	public static void main(String[] args) {
		int l=80;
		for(int i=0; i<l; i++) {
			System.out.print("*");
		}
		System.out.println();
		int  n=10;
		for (int i=0; i<n; i++) {
			
			//i
			for (int j=0; j<n ; j++) {
				if(j==(n-1)/2 && i>=(n-1)/2 ||
					j==(n-1)/2 && i>=n/4 &&i<=n/4	) 
				{
				System.out.print("*");
				}
				else 
				{
					System.out.print(" ");
				}
			}
			System.out.print(" ");
			//N
			for (int j=0; j<n ; j++) {
				if(	j==0 || i==j || j==n-1) 
				{
				System.out.print("*");
				}
				else 
				{
					System.out.print(" ");
				}
			}
			System.out.print(" ");
			//E
			for (int j=0; j<n ; j++) {
				if(j==n/4 || i==0 && j>=n/4|| 
						i==(n-1)/2 && j>=n/4  && j<=(n-1)||
						i==n-1 && j>=n/4) 
				{
				System.out.print("*");
				}
				else 
				{
					System.out.print(" ");
				}
			}
			System.out.print(" ");
			//U
			for (int j=0; j<n ; j++) {
				if(j==n/4 && i<n-1 && i>=0 ||
						i==n-1 && j>n/4 && j<(n-1) ||
						j==n-1 && i<n-1 && i>=0 ) 
				{
				System.out.print("*");
				}
				else 
				{
					System.out.print(" ");
				}
			}
			System.out.print(" ");
			//R
			for (int j=0; j<n ; j++) {
				if((j==0) ||
		                i==0 && j<n-1 ||
		                 j==n-1&& i>=1 && i<n/2 ||
		                i==n/2 &&j!=n-1 ||( i==j && j>=n/2)	) 
				{
				System.out.print("*");
				}
				else 
				{
					System.out.print(" ");
				}
			}
			System.out.print(" ");
			//O
			for (int j=0; j<n ; j++) {
				if( j==n/4 && i<n-1 && i>0 ||
					i==n-1 && j>n/4 && j<(n-1) ||
					j==n-1 && i<n-1 && i>0 ||
					i==0 && j>n/4 && j<n-1
				) 
				{
				System.out.print("*");
				}
				else 
				{
					System.out.print(" ");
				}
			}
			System.out.print(" ");
			System.out.print(" ");
			//N
			for (int j=0; j<n ; j++) {
				if(	j==0 || i==j || j==n-1) 
				{
				System.out.print("*");
				}
				else 
				{
					System.out.print(" ");
				}
			}
			
			
			
			
			System.out.println();
		}
		int m=80;
		for(int i=0; i<m; i++) {
			System.out.print("*");
		}
		
	}

}
