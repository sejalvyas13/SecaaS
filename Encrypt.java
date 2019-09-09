import java.util.*;
import java.io.*;

class Encrypt
{
	void encrypt(String abc)
	{
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
			
			
		File f=new File(abc);
        
        FileInputStream fs = null;
        InputStreamReader in = null;
        BufferedReader br = null;
        
        StringBuffer sb = new StringBuffer();
        String text;
        
        try {
             fs = new FileInputStream(f);
             in = new InputStreamReader(fs);
             br = new BufferedReader(in);
            
            while(true)
            {
				text=br.readLine();
				sb.append(text);
                if(text==null)
                    break;
               
