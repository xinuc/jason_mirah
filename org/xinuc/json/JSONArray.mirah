package org.xinuc.json

import java.util.ArrayList

class JSONArray
  def self.parse(token:JSONTokenizer):ArrayList
    array = ArrayList.new
    raise token.error("Invalid: Must begin with '['") unless token.nextClean == 91 # '['
    return array if token.nextClean == 93 # ']'
    token.back
    while true
      array.add token.nextValue
      c = token.nextClean
      break if c == 93 # ']'
      raise token.error("Expected a ',' or ']', got #{c}") unless c == 44 # ','
    end
    array
  end
end
