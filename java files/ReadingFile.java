import java.io.FileReader;
import java.io.IOException;
import java.nio.file.FileSystemNotFoundException;

public class ReadingFile {
  public static void main(String[] args) {

    FileReader fReader;
    try {
      fReader = new FileReader("art.txt");
      int data = fReader.read();
      while (data != -1) {
        System.out.print((char) data);
        data = fReader.read();
      }
    }

    catch (IOException e) {
      e.printStackTrace();
    }

    catch (FileSystemNotFoundException e) {
      e.printStackTrace();
    }
  }
}
