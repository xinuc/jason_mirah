import org.xinuc.jason.JSON;
import org.xinuc.jason.JSONException;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.nio.MappedByteBuffer;
import java.io.IOException;
import java.io.FileInputStream;
import java.io.File;

public class Test{
  public static void main(String[] argv) throws IOException, JSONException {
    String str = readFile("Test.json");
    Object json = JSON.parse(str);
    System.out.println(json);
  }

  private static String readFile(String path) throws IOException {
    FileInputStream stream = new FileInputStream(new File(path));
    try {
      FileChannel fc = stream.getChannel();
      MappedByteBuffer bb = fc.map(FileChannel.MapMode.READ_ONLY, 0, fc.size());
      return Charset.defaultCharset().decode(bb).toString();
    }
    finally {
      stream.close();
    }
  }
}
