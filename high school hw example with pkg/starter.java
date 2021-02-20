import pkg.*;
public class starter /*implements InputControl, InputKeyControl*/
{
		//Palindrome warmup Nilesh Gupta p2
        public static void main(String args[])
        {
			// String m = "This Thought That This Tristan";
			// String[] splat = m.split("T");
			
			 // for(String a : splat)
			// {
				// System.out.println(a);
			// }
			
			
			 String[] vv = split("rhe rifile fired the enforced","r");
			
			// System.out.println();
			// System.out.println(vv.length);
			
			// for(int i = 0; i < vv.length ; i++)
			// {
				// System.out.println(vv[i]+"HERE");
			// }	
			

		}
		
		public static String[] split(String p, String m)
		{			int i = 0;
			int mc = 0;
			int cc = 0;
			
			
			
			String[] s = new String[p.length()];
			int[] temp = new int[p.length()];
			
			for(i = 0; i < p.length(); i++)
			{
				s[i] = p.substring(i,i+1);
				System.out.print(s[i]);

				//stores location of m including endpostions if applicaple
				if(s[i].equals(m) /* && (i > 1) && (i<p.length()-1)*/)
				{
					temp[cc] = i;
 					System.out.print(i);
					cc++;
				}		
				
				//counts number of mid markers
				if(s[i].equals(m) && (i > 1) && (i<p.length()-1))
				{
					mc++;
				}
			}
			
			
			
			System.out.println();
			System.out.println();
			for(i = 0; i < cc; i++)
			{
				System.out.println(temp[i]);
			}
			
			System.out.println();
			
			System.out.print(mc);
			
			System.out.println();

			
			String[] fin = new String[mc+2];

			// fin[0] = p.substring(0,temp[0]);
			// fin[1] = p.substring(6,12);
			// fin[2] = p.substring(12,p.length());

			
			// System.out.print(p.substring(0,temp[1]));
		
			String[] stringtemp = new String[mc+2];
			
			for(i = 0; i < mc+1; i++)
			{
				stringtemp[i] = p.substring(temp[i],temp[i+1]);
				fin[i] = stringtemp[i].substring(1,stringtemp[i].length());
				System.out.println(fin[i]);
			}
			
			// for(i = 0; i < mc+1; i++)
			// {
				// fin[i] = stringtemp.substring
				// System.out.println(fin[i]);
			// }
			
			//int pos =
			

			return fin;
		}
		
}