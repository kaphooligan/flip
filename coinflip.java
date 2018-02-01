
public class coinflip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int count= 0, heads=0 , tails=0;
		do
		{
			int flip = (int)(Math.random()*2+1);
			if(flip==1)
			{
				heads++;
				System.out.println("Heads");
				
			}
			else
			{
				tails++;
				System.out.println("Tails");
			}
			count++;
		}while(count!=1000000);
		System.out.println("heads "+heads);
		System.out.println("Tails "+tails);
	}

}
