package org.xinuc.json

class JSONException < Exception
  def initialize(message:String)
    super message
  end
end
