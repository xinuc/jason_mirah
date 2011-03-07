import org.xinuc.jason.JSON;
import org.xinuc.jason.JSONException;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.nio.MappedByteBuffer;
import java.io.IOException;
import java.io.FileInputStream;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.File;

public class Test {
  public static void main(String[] argv) throws IOException, JSONException {
    if(argv.length < 1 ){
      System.out.println("Usage: java Test <json filename>"); return;
    }
    // Test for string parsing
    testStringParse(argv[0]);
    // Test for stream parsing
    testStreamParse(argv[0]);
  }

  private static void testStringParse(String path) throws IOException, JSONException {
    String str = readFile(path);
    Object json = JSON.parse(str);
    System.out.println(json);
  }

  private static void testStreamParse(String path) throws IOException, JSONException {
    String text = readFile(path);
    InputStream is = new ByteArrayInputStream(text.getBytes("UTF-8"));
    Object json = JSON.parse(is);
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
