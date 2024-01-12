import java.io.*;
class RW
{

 

    public static void main(String[] args)
    {  
	for(int i=0;i<5;i++){

		File file =new File("demo.txt"+i);
	}
	//File file =new File("demo.txt");
        try(FileWriter fs = new FileWriter(file,true);
        BufferedWriter bs = new BufferedWriter(fs);)
        {
            String s = "hii";
            byte[] arr = s.getBytes();
            bs.write(s);
	    
	
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
	try(FileReader fr=new FileReader("file.txt");
	BufferedReader br = new BufferedReader(fr);)
        {
            String s = "hii";
            //byte[] arr = s.getBytes();
            //bs.write(s);
	    System.out.println(br.readLine());
	
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}