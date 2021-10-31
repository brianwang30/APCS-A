public boolean endOther(String a, String b) {
    String shortString;
    String longString;
    int dif = Math.abs(a.length()-b.length());
    if (a.length() > b.length()){
      shortString = b.toLowerCase();
      longString = a.toLowerCase();
    }
    else {
      longString = b.toLowerCase();
      shortString = a.toLowerCase();
    }
    return (longString.substring(dif)).equals(shortString);
}
