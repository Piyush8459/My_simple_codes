import java.net.*;
import java.io.*;

class clientsocket
{
	public static void main(String ar[])
	{
		try
		{
		byte arr[] = {(byte)192, (byte)168, (byte)43, (byte)222};
		InetAddress inet = InetAddress.getByAddress(arr);
		System.out.println("Connected at : " + inet.toString());

		Socket soc = new Socket(inet, 100);

		DataInputStream dis = new DataInputStream(soc.getInputStream());
		DataOutputStream dos = new DataOutputStream(soc.getOutputStream());		

		dos.writeUTF("Hello Amey");

		String ans = dis.readUTF();

		System.out.println("Server Returned : " + ans);

		soc.close();
		}catch(Exception ex)
		{
			System.out.println(ex.toString());
		}
	}
}
