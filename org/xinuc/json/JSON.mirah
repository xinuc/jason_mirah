class JSON
  def self.parse(str:string):Object
    token = JSONTokenizer.new(str)
    c = token.nextClean
    if c == 123 # '['
      token.back
      return JSONObject.parse(token)
    end
    if c == 91 # '['
      token.back
      return JSONArray.parse(token)
    end
    raise "Invalid JSON"
  end
end
