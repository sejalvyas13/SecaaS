import java.util.*;
import java.io.*;
class Decrypt
{
	void decrypt(String abc)
	{
		
		File f=new File(abc);
        
        FileInputStream fs = null;
        InputStreamReader in = null;
        BufferedReader br = null;
        
        StringBuffer ct = new StringBuffer();
        String text;
        
        try {
             fs = new FileInputStream(f);
             in = new InputStreamReader(fs);
             br = new BufferedReader(in);
            
            while(true)
            {
                text=br.readLine();
                if(text==null)
                    break;
                ct.append(text);
				
            }
		
		String[] keyd = {"...", "..-", "..x", ".-.", ".--",
			".-x", ".x.", ".x-", ".xx", "-..",
			"-.-", "-.x", "--.", "---","--x",
			"-x.", "-x-", "-xx", "x..", "x.-",
			"x.x", "x-.", "x--", "x-x", "xx.", "xx-"};
			
			String[] key = {"r", "o", "u", "n", "d",
			"t", "a", "b", "l", "e",
			"c", "f", "g", "h", "i", 
			"j", "k", "m", "p", "q",
			"s", "v", "w", "x", "y", "z"};
			
			String[] alpha = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j",
            "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v",
            "w", "x", "y", "z", "1", "2", "3", "4", "5", "6", "7", "8",
            "9", "0", " ", ".", ",", ":", "!", "?", "@", "-", ";", "(", ")", "=" };
			
		String[] dot = { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.",
            "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.",
            "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-",
            "-.--", "--..", ".----", "..---", "...--", "....-", ".....",
            "-....", "--...", "---..", "----.", "-----", "", ".-.-.-", 
			"--..--", "---...", "-.-.--", "..--..", ".--.-.", "-....-", "-.-.-.", "-.--.", "-.--.-", "-...-" };
		
		
		
		
		
		
		StringBuffer cm1 = new StringBuffer();

			for(int i =0;i<ct.length();i++)
			{
				for(int p=0;p<26;p++)
				{
					if(ct.charAt(i) == key[p].charAt(0))
					{
						cm1.append(keyd[p]);
					}
				}	
				
			}
			
			//System.out.println("Decrypted Morse code : "+cm1);
			
			StringBuffer tempc2 = new StringBuffer();
			StringBuffer dm = new StringBuffer();
			
			for(int i=0;i<cm1.length()-1;i++)
			{
				if(cm1.charAt(i) == 'x')
				{
					if(cm1.charAt(i+1) == 'x')
					{
						for(int p=0;p<48;p++)
						if((tempc2.toString()).equals(dot[p]))
						dm.append(alpha[p]);
						dm.append(" ");
						i = i+1;  						//CHECK THIS
					}
					else
					{
						for(int p=0;p<48;p++)
						{
							//System.out.println("inner for loop ");
							if((tempc2.toString()).equals(dot[p]))
							{
								dm.append(alpha[p]);
								//System.out.println("decrypted message "+dm);
							}
						}
					}
					tempc2.delete(0,tempc2.length());
				}
				else
				{
					tempc2.append(cm1.charAt(i)); 					//WITH THIS
					if((i+1) == cm1.length()-1)
						for(int p=0;p<48;p++)
							if((tempc2.toString()).equals(dot[p]))
								dm.append(alpha[p]);

				}
				//System.out.println("tempc2 "+tempc2);
			}
			
			System.out.println("decrypted message : "+dm);
			
			 try
			{
                FileWriter fstream = new FileWriter(f);
                BufferedWriter outobj = new BufferedWriter(fstream);
                outobj.write(dm.toString());
                outobj.close();
                
            }
			catch (Exception e)
			{
              System.err.println("Error: " + e.getMessage());
            }
		}
		
		 catch (FileNotFoundException e) 
			{
              e.printStackTrace();
            }
			catch (IOException e) 
			{
              e.printStackTrace();
            }
		
		

			
	}		
}
