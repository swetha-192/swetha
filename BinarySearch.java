import java.util.Scanner;
class BinarySearch
{
public static void main(String args[])
{
Scanner scanner=new Scanner(System.in);
System.out.println("enter the  no.of elements into array:");
int n=scanner.nextInt();
int[] arr=new int[n];
System.out.println("enter the elements:");
for(int i=0;i<n;i++)
{
 arr[i]=scanner.nextInt();
}
System.out.println("enter the key:");
int key=scanner.nextInt();
int low=0,high=n-1,result=-1;
while(low<=high)
{
int mid=(low+high)/2;
if(arr[mid]==key)
{
result=mid;
break;
}
else if(arr[mid]<key)
{
low=mid+1;
}
else
{
high=mid-1;
}
}
if(result==-1)
{
System.out.println("element  not found");
}
else
{
System.out.println("element is found at :"+result);
}
}
}





