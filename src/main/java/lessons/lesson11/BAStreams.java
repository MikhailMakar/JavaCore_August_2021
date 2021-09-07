package lessons.lesson11;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class BAStreams {

  public static void main(String[] args) throws IOException {
    byte[] bytes = new byte[256];

    int k = 0;
    for (int i = -128; i <= 127; i++) {
      bytes[k] = (byte) i;
      k++;
    }

    ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    outputStream.write(bytes);
    outputStream.close();

    ByteArrayInputStream inputStream = new ByteArrayInputStream(outputStream.toByteArray());

    int i = 0;
    int e;

    byte[] buffer = new byte[100];
    while (inputStream.available() > 0) {
//    while ((e = inputStream.read()) != -1){
      System.out.println(bytes[i] + " -> " + inputStream.read());

      if (i == 5) {
        inputStream.mark(100);
      }
      if (i == 10) {
        inputStream.reset();
      }
//      inputStream.read(buffer);
//      System.out.println(Arrays.toString(buffer));
      i++;
    }
    inputStream.close();
  }
}
