// Generated from JSON.mirah
package org.xinuc.json;
public class JSON extends java.lang.Object {
  public static void main(java.lang.String[] argv) {
  public static java.lang.Object parse(java.lang.String str) {
    org.xinuc.json.JSONTokenizer token = null;
    char c = 0;
    token = new org.xinuc.json.JSONTokenizer(str);
    c = token.nextClean();
    if ((c == 123)) {
      org.xinuc.json.JSONTokenizer temp$1 = token;
      temp$1.back();
      return org.xinuc.json.JSONObject.parse(token);
    }
    if ((c == 91)) {
      org.xinuc.json.JSONTokenizer temp$2 = token;
      temp$2.back();
      return org.xinuc.json.JSONArray.parse(token);
    }
    throw token.error("Invalid JSON. It should be begin with a '{' or '['");
  }
}
