package lessons.lesson10.io;

import lombok.SneakyThrows;

import java.io.*;
import java.util.Arrays;

public class InputStreamExamples {

  @SneakyThrows
  public static void main(String[] args) {

    byte[] bytes = {1, 2, 120, -35};

    ByteArrayInputStream byteArrayInputStream = null;
    try {
      byteArrayInputStream = new ByteArrayInputStream(bytes);

      final byte[] bytes1 = byteArrayInputStream.readAllBytes();

      System.out.println(Arrays.toString(bytes1));

    } finally {
      try {
        byteArrayInputStream.close();
      } catch (IOException e) {
        e.printStackTrace();
      }
    }

    FileInputStream fileInputStream1 = new FileInputStream("ex.txt");
    FileInputStream fileInputStream2 = new FileInputStream("output.txt");

    SequenceInputStream sequenceInputStream = new SequenceInputStream(fileInputStream1,
        fileInputStream2);

    InputStreamReader inputStreamReader = new InputStreamReader(sequenceInputStream);

    while (inputStreamReader.ready())
    {
      System.out.println(inputStreamReader.read());
    }

    SequenceInputStream sequenceInputStream1 = new SequenceInputStream(sequenceInputStream,
        sequenceInputStream);
  }

}
