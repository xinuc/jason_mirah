Jason Mirah is an attempt to create a strict and standard compliant JSON parser library for mobile application.
It has a very simple API:
    JSON.parse("{\"a\": 5}") // return a java.util.Hashtable object

    JSON.parse("[1,2,3,4,5]") // return a java.util.Vector object

[rfc4627](http://www.ietf.org/rfc/rfc4627.txt)

The mapping between JSON objects and Java Objects:
    string => java.lang.String
    number => java.lang.Integer / java.lang.Double
    boolean => java.lang.Boolean
    null => org.xinuc.jason.JSONNull

    object => java.util.Hashtable
    array => java.util.Vector

It should parse valid JSON strings correctly. Please report if you find any bug.

Contributors:
    Nugroho Herucahyono
    Stephan Leroux
