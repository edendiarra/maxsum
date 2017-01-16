package test;

public class maxtest {

	public static void main(String[] args) 
	{
		int[]nums={57,5,10,7,63,9};
		sort(nums,1);
		sort(nums,2);

	}
	private static void sort(int[]nums,int check)
	{
		int temp=0;
		if(check==1)
		{
			for(int i=0;i<nums.length;i++)
			{
				for(int j=i+1;j<nums.length;j++)
				{
					if(nums[i]>nums[j])
					{
						temp=nums[j];
						nums[j]=nums[i];
						nums[i]=temp;					
					}
				}
			}
			System.out.print("최대값="+nums[5]);	
			System.out.println("");
		}
		else
		{
			for(int i=0;i<nums.length;i++)
			{
				for(int j=i+1;j<nums.length;j++)
				{
					if(nums[i]<nums[j])
					{
						temp=nums[j];
						nums[j]=nums[i];
						nums[i]=temp;					
					}
				}
			}

			System.out.print("최소값="+nums[5]);

			
		}

	}
}
