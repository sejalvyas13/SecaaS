import java.io.*;
import java.util.Random;

public class Del1
{
	

    public static void main(String[] args) 
	{
        
        File f=new File("c:/Codes/abc.txt");
        
        FileInputStream fs = null;
        InputStreamReader in = null;
        BufferedReader br = null;
        
        StringBuffer sb = new StringBuffer();
        StringBuffer rand = new StringBuffer();
		StringBuffer rand4 = new StringBuffer();
		StringBuffer rand7 = new StringBuffer();
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
                sb.append(text);
				
            }
             
			 int len = sb.length();
			 
			 //First round with random byte
			 Random r1 = new Random();
			 int a1=r1.nextInt();
			 String s1 = Integer.toBinaryString(a1);
			 StringBuffer sb1 = new StringBuffer();
			 sb1.append(s1);
			
			 while(sb1.length()<=len)
			 {
				 sb1.append(s1);
				 
			 }
			 String s11 = sb1.toString();
			 sb.replace(0,len,s11);
			 
			 
			 try
			{
                FileWriter fstream = new FileWriter(f);
                BufferedWriter outobj = new BufferedWriter(fstream);
                outobj.write(sb.toString());
                outobj.close();
                
            }
			catch (Exception e)
			{
              System.err.println("Error: " + e.getMessage());
            }
			 
			 
			 
			 
			 
			  //Second round with complement of random byte
			 
			 String s2 = Integer.toBinaryString(~a1);
			 StringBuffer sb2 = new StringBuffer();
			 sb2.append(s2);
			 
			 while(sb2.length()<=len)
			 {
				 sb2.append(s2);
				 
			 }
			 String s22 = sb2.toString();
			 
			 sb.replace(0,len,s22);
			 
			 
			 try
			{
                FileWriter fstream = new FileWriter(f);
                BufferedWriter outobj = new BufferedWriter(fstream);
                outobj.write(sb.toString());
                outobj.close();
                
            }
			catch (Exception e)
			{
              System.err.println("Error: " + e.getMessage());
            }
			 
			 
			 
			 
			 
			 
			 //Third round with random data
			 for(int i=0;i<len;i++)
			 {
				Random r = new Random();
				int j = r.nextInt(26);
				j = j+48;
				 char a = (char)j;
				 rand.append(a);
			 }
			 
			  sb.replace(0,len,rand.toString());
			  
			 
			try
			{
                FileWriter fstream = new FileWriter(f);
                BufferedWriter outobj = new BufferedWriter(fstream);
                outobj.write(sb.toString());
                outobj.close();
                
            }
			catch (Exception e)
			{
              System.err.println("Error: " + e.getMessage());
            }





			 
			  //Fourth round with random data
			 for(int i=0;i<len;i++)
			 {
				Random r = new Random();
				int j = r.nextInt(26);
				j = j+48;
				 char a = (char)j;
				 rand4.append(a);
			 }
			 
			 sb.replace(0,len,rand4.toString());
			 
			 
			 try
			{
                FileWriter fstream = new FileWriter(f);
                BufferedWriter outobj = new BufferedWriter(fstream);
                outobj.write(sb.toString());
                outobj.close();
                
            }
			catch (Exception e)
			{
              System.err.println("Error: " + e.getMessage());
            }
			 
			 
			 
			 
			 
			 
			 //Fifth round with random byte
			 Random r5 = new Random();
			 
			 int a5 = r5.nextInt();
			 String s5 = Integer.toBinaryString(a5);
			 StringBuffer sb5 = new StringBuffer();
			 sb5.append(s5);
			 
			 while(sb5.length()<=len)
			 {
				 sb5.append(s5);
				 
			 }
			 String s55 = sb5.toString();
			 sb.replace(0,len,s55);
             
			 
			 try
			{
                FileWriter fstream = new FileWriter(f);
                BufferedWriter outobj = new BufferedWriter(fstream);
                outobj.write(sb.toString());
                outobj.close();
                
            }
			catch (Exception e)
			{
              System.err.println("Error: " + e.getMessage());
            }
			 
			 
			 
			 
              
			  
			  //Sixth round with complement of random byte
			 
			 String s6 = Integer.toBinaryString(~a5);
			 StringBuffer sb6 = new StringBuffer();
			 sb6.append(s6);
			 
			 while(sb6.length()<=len)
			 {
				 sb6.append(s6);
				 
			 }
			 String s66 = sb6.toString();
			 
			 sb.replace(0,len,s66);
			 
			 
			 try
			{
                FileWriter fstream = new FileWriter(f);
                BufferedWriter outobj = new BufferedWriter(fstream);
                outobj.write(sb.toString());
                outobj.close();
                
            }
			catch (Exception e)
			{
              System.err.println("Error: " + e.getMessage());
            }
			 
			 
			 
			 
			 
			 
			 
			 
			 //Seventh round with random data
			 for(int i=0;i<len;i++)
			 {
				Random r = new Random();
				int j = r.nextInt(26);
				j = j+48;
				 char a = (char)j;
				 rand7.append(a);
			 }
			 
			  sb.replace(0,len,rand7.toString());
			  
			 try
			{
                FileWriter fstream = new FileWriter(f);
                BufferedWriter outobj = new BufferedWriter(fstream);
                outobj.write(sb.toString());
                outobj.close();
                
            }
			catch (Exception e)
			{
              System.err.println("Error: " + e.getMessage());
            }
			 
			 
			 
			 
			 
			  
			  

              fs.close();
              in.close();
              br.close();

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