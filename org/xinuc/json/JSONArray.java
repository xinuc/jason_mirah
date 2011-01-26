// Generated from JSONArray.mirah
package org.xinuc.json;
public class JSONArray extends java.lang.Object {
  public static void main(java.lang.String[] argv) {
  public static java.util.ArrayList parse(org.xinuc.json.JSONTokenizer token) {
    java.util.ArrayList array = null;
    char c = 0;
    array = new java.util.ArrayList();
    if ((token.nextClean() == 91)) {
    }
    else {
      throw token.error("Invalid: Must begin with '['");
    }
    if ((token.nextClean() == 93)) {
      return array;
    }
    org.xinuc.json.JSONTokenizer temp$1 = token;
    temp$1.back();
    label2:
    while (true) {
      label3:
       {
        array.add(token.nextValue());
        c = token.nextClean();
        if ((c == 93)) {
          break label2;
        }
        if ((c == 44)) {
        }
        else {
          throw token.error("Expected a ',' or ']', got " + c);
        }
      }
    }
    return array;
  }
}
