// Generated from JSON.mirah
public class JSON extends java.lang.Object {
  public static java.lang.Object parse(java.lang.String str) {
    JSONTokenizer token = null;
    char c = 0;
    token = new JSONTokenizer(str);
    c = token.nextClean();
    if ((c == 123)) {
      JSONTokenizer temp$1 = token;
      temp$1.back();
      return JSONObject.parse(token);
    }
    if ((c == 91)) {
      JSONTokenizer temp$2 = token;
      temp$2.back();
      return JSONArray.parse(token);
    }
    throw new java.lang.RuntimeException("Invalid JSON");
  }
}
