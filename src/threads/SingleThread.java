package threads;

		public class SingleThreadTest
		{

			public static void main(String[] args)
		{
				System.out.println ("parent started");

				Thread t = new MyThread();

				System.out.println ("child created");

				t.start();

				try
		      {
					for (int i = 0; i < 5; i++)
		         {
						System.out.println ("Parent : " + i);
						Thread.sleep(200);
					}
				}
		catch (InterruptedException e)
		{
				System.out.println ("Parent Interrupted");
			         }

				System.out.println ("end of Parent thread");

			}

		}

		
		
		
		
		
		
		
	}

}
