package lessons.lesson12;

import java.io.*;

public class TryWithResources {

  public static void main(String[] args) throws IOException {

    BufferedReader bufferedReader = null;
    try {
      FileReader fileReader = new FileReader("output.txt");
      bufferedReader = new BufferedReader(fileReader);
      System.out.println(bufferedReader.readLine());
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    } finally {
      try {
        bufferedReader.close();
      } catch (IOException e) {
        e.printStackTrace();
      }
    }

    if (true) {
      throw new IllegalArgumentException();
    }

    try (BufferedReader br = new BufferedReader(
        new FileReader("output.txt"));
        InputStreamReader inputStreamReader = new InputStreamReader(
        System.in);
        MyClosable myClosable = new MyClosable()) {
      System.out.println(br.readLine());

      throw new ClassCastException();
    } catch (FileNotFoundException fileNotFoundException) {
      fileNotFoundException.printStackTrace();
      throw fileNotFoundException;
    } catch (IOException ioException) {
      ioException.printStackTrace();
      throw new IOException();
    }

  }
}
