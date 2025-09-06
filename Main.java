import java.util.*;
public class Main
{
    public static void num(int n,int arr[],int k){
        int count=0;
        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=i;j<n;j++){
                sum=sum+arr[j];
                if(sum==k){
                    count++;
                }
            }
        }
        System.out.print("the subarray count is : "+count);
        
    }
	public static void main(String[] args) {
	    Scanner in= new Scanner(System.in);
	    System.out.print("Size : ");
	    int n=in.nextInt();
	    System.out.print("enter values : ");
	    int arr[]=new int[n];
	    for(int i=0;i<n;i++){
	        arr[i]=in.nextInt();
	    }
	    System.out.print("to find : ");
	    int k=in.nextInt();
	    
	    num(n,arr,k);
		
	}
}
