package bootCamp;

import java.io.*;

public class B20_FileReadAndWrite {
    public static void main(String[] args) throws IOException {

        FileWriter writer = new FileWriter("C:\\Users\\User\\Desktop\\Target.txt");
        BufferedWriter bufferedWriter =new BufferedWriter(writer);
        bufferedWriter.write("selam arkadaslar");
        bufferedWriter.newLine();
        bufferedWriter.write("nasilsiniz");
        bufferedWriter.newLine();
        bufferedWriter.write("iyiyim ya sen");
        bufferedWriter.close();

        // masa üstündeki bir belgeye yazdırma. Target.txt dosyanın yarı geri kalanı dosyanın yeri.





        //  burası masaüstündeki bulunan dosyadakileri alıp intellij e yazdırma
        BufferedReader bufferedReader= new BufferedReader(new FileReader("C:\\Users\\User\\Desktop\\Target.txt"));
        System.out.println(bufferedReader.readLine());  // selam arkadaslar
        System.out.println(bufferedReader.readLine());  // nasilsiniz
        System.out.println(bufferedReader.readLine());



    }

}
