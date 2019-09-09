import java.util.*;
import java.io.*;
import Encrypt;
import Decrypt;

class MorseFile
{
	public static void main(String[] arg)
	{
		
		Encrypt e = new Encrypt();
		e.encrypt("c:/Codes/abc1.txt");
		Decrypt d = new Decrypt();
		d.decrypt("c:/Codes/abc1.txt");
			
	}
}


  