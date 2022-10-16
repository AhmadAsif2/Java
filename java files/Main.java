import java.io.FileWriter;
import java.io.IOException;

/**
 * Main
 */
public class Main {

  public static void main(String[] args) {

    // Writing to a file
    try {
      FileWriter fWriter = new FileWriter("text.txt");
      fWriter.write("Hello this is Ahmad !! \nI am a software engineer");
      fWriter.append("\nM Ahmad");
      System.out.println("File Written Succesfully! :O");
      fWriter.close();
    }

    catch (IOException e) {
      e.printStackTrace();
    }

  }
}