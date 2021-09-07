package lessons.lesson11;

import java.io.*;

public class FileStreams {

  public static void main(String[] args) throws IOException {

    FileOutputStream outputStream = new FileOutputStream("fileOutput.txt");

    PrintWriter printWriter = new PrintWriter(
        new BufferedWriter(new OutputStreamWriter(outputStream)));

    printWriter.write("output string");
//    PrintWriter printWriter1 = new PrintWriter("");
    printWriter.flush();
    printWriter.close();

    FileReader fileReader = new FileReader("fileOutput.txt");
    BufferedReader bufferedReader = new BufferedReader(fileReader);
    while (bufferedReader.ready()){
      System.out.println(bufferedReader.readLine());
    }


  }
}
