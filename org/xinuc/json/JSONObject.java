// Generated from JSONObject.mirah
public class JSONObject extends java.lang.Object {
  public static void main(java.lang.String[] argv) {
  public static java.util.HashMap parse(JSONTokenizer token) {
    java.util.HashMap hash = null;
    char c = 0;
    java.lang.String key = null;
    hash = new java.util.HashMap();
    if ((token.nextClean() == 123)) {
    }
    else {
      throw new java.lang.RuntimeException("Invalid: Must begin with '{'");
    }
    label1:
    while (true) {
      label2:
       {
        c = token.nextClean();
        if ((c == 0)) {
          throw new java.lang.RuntimeException("Invalid: Must end with '}'");
        }
        if ((c == 125)) {
          break label1;
        }
        JSONTokenizer temp$3 = token;
        temp$3.back();
        key = token.nextValue().toString();
        c = token.nextClean();
        if ((c == 58)) {
        }
        else {
          throw new java.lang.RuntimeException("Invalid: ':' expected after key '" + key + "'");
        }
        hash.put(key, token.nextValue());
        c = token.nextClean();
        if ((c == 125)) {
          break label1;
        }
        if ((c == 44)) {
        }
        else {
          throw new java.lang.RuntimeException("Expected a ',' or '}', got " + c);
        }
      }
    }
    return hash;
  }
  public static java.lang.String stringfy(java.util.HashMap hash) {
    return "";
  }
}
