class PerfectNum{
	public void search(int temp[]) {
		for(int i=1;i<1000;i++) {
			int k=0;
			for(int j=1;j<i;j++) {
				if(i%j==0) {
					temp[k]=j;
					k++;
				}
			}
			int sum=0;
			for(int m=0;m<k;m++) {
				sum+=temp[m];
			}
			if(i==sum) {
				System.out.print(i+" ");
			}
		}
	}
}
public class Item{
	public static void main(String args[]) {
		PerfectNum p=new PerfectNum();
		int temp[]=new int[100];
		System.out.print("1000以内的完数为：");
		p.search(temp);
	}
}
