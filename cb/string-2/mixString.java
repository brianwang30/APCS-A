public String mixString(String a, String b) {
  String result = "";
  int counter = 0;
  while (a.length() > 0 && b.length() > 0){
   result += a.substring(counter, counter + 1) + b.substring(counter, counter + 1);
   a = a.substring(counter + 1);
   b = b.substring(counter + 1);
  }
  return result + a + b;
}
