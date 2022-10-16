import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Exception {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    FileReader fReader = null;
    try {
      fReader = new FileReader("test.txt");
      fReader.read();
    }

    catch (FileNotFoundException ex) {
      System.out.println("Could not read data");
    }

    catch (IOException ex) {
      System.out.println(ex.getMessage());
    }

    finally {
      if (fReader != null) {
        try {
          fReader.close();
        }

        catch (IOException ex) {
          System.out.println(ex.getMessage());
        }
      }
      sc.close();
    }
  }
}
