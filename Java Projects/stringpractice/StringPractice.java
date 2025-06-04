public class StringPractice {
  /* returns true if c is a punctuation mark or false otherwise
   * 
   * Punctuation mark is defined as:
   * apostrophe '
   * comma ,
   * period .
   * semicolon ;
   * colon :
   * exclamation point !
   * question mark ? 
   * 
   * (You don't have to worry about any others)
   */
  public static boolean isPunct(char c) {
    if (c == '\'' || c == ',' || c == '.' || c == ';' || c == ':' || c == '!' || c == '!' || c == '?'){
      return true;
    }else{
      return false;
    }
  }

  /*
   * returns the number of punctuation marks
   * found in s.
   *
   * call your isPunct( ) method. Do not compy and paste
   * the same logic into this function */
  public static int numPunct(String s) {
    int isP = 0;
    for (int i=0; i<s.length(); i++){
      if (isPunct(s.charAt(i)) == true){
        isP++;
      }
    }
    return isP;
  }
  
  /*
   * returns the number of punctuation marks
   * found in s starting at the given index.
   *
   * call your isPunct( ) method. Do not compy and paste
   * the same logic into this function */
  public static int numPunct(String s, int startIndex) {
    int isP = 0;
    for (int i=startIndex; i<s.length(); i++){
      if (isPunct(s.charAt(i)) == true){
        isP++;
      }
    }
    return isP;
  }


  /*
   * returns the index of the first punctuation mark in s or
   * -1 if s contains no punctuation marks
   */
  public static int indexOfFirstPunct(String s) {
    int firstP = -1;
    for (int i=0; i<s.length(); i++){
      if (firstP == -1){
        if (isPunct(s.charAt(i)) == true){
          firstP = i;
        }
      }
    }
    return firstP;
  }

  /*
   * returns the index of the last occurrence of a punctuation
   * mark in s or -1 if s contains no punctuation
   * 
   * When implementing this function, call your isPunct( ) method.
   * Do not simply copy and paste the body of isPunct( ) into this method.
   */
  public static int indexOfLastPunct(String s) {
    int firstP = -1;
    for (int i=0; i<s.length(); i++){
      if (firstP == -1){
        if (isPunct(s.charAt(s.length()-i-1)) == true){
          firstP = s.length()-i-1;
        }
      }
    }
    return firstP;
  }

  /*
   * returns a new String which is the same as s but with
   * each instance of oldChar replaced with newChar
   */
  public static String substitute(String s, char oldChar, char newChar) {
    String newS = "";
    for(int i=0; i<s.length(); i++){
      if(s.charAt(i) == oldChar){
        newS = newS + newChar;
      }else{
        newS = newS + s.charAt(i);
      }
    }
    return newS;
  }

  /*
   * returns a new String which is the same as s, but
   * with each instance of a punctuation mark replaced
   * with a single space character
   *
   * Use at least one of your other functions in your
   * solution to this.
   *
   */
  public static String substitutePunct(String s) {
    String newS = "";
    for(int i=0; i<s.length(); i++){
      if(isPunct(s.charAt(i)) == true){
        newS = newS + " ";
      }else{
        newS = newS + s.charAt(i);
      }
    }
    return newS;
  }
  
  /*
   * returns a new String which is the same as s,
   * but with all of the punctuation
   * marks removed.
   *
   * Use at least one of your other functions
   * in your solution to this one.
   * 
   */
  public static String withoutPunct(String s) {
    String newS = "";
    for(int i=0; i<s.length(); i++){
      if(isPunct(s.charAt(i)) == false){
        newS = newS + s.charAt(i);
      }
    }
    return newS;
  }

  /* returns true if c is found in s or false otherwise */
  public static boolean foundIn(String s, char c) {
    boolean found = false;
    for(int i=0; i< s.length(); i++){
      if (s.charAt(i) == c){
        found = true;
      }
    }
    return found;
  }

  /*
   * returns the number of times that a punctuation mark
   * immediately follows a character that's not a
   * punctuation mark
   */
  public static int numPunctAfterNonPunct(String s) {
    int found = 0;
      for(int i=0; i<s.length(); i++){
        if (isPunct(s.charAt(i)) == false){
          if (i+1 < s.length()){
            if (isPunct(s.charAt(i+1)) == true){
              found++;
            }
          }
        }
      }
    return found;
  }
  
  /*
   * Returns true of s is comprised of only punctuation or
   * false otherwise
   *
   * Use at least one of your other
   * functions in this one.
   */
  public static boolean onlyPunct(String s) {
    boolean onlyP = true;
    for(int i=0; i<s.length(); i++){
      if(isPunct(s.charAt(i)) == false){
        onlyP = false;
      }
    }
    return onlyP;
  }

  /*
   * Returns true of s contains no punctuation or
   * false otherwise
   *
   * Use at least one of your other
   * functions in this one.
   */
  public static boolean noPunct(String s) {
    boolean onlyP = true;
    for(int i=0; i<s.length(); i++){
      if(isPunct(s.charAt(i)) == true){
        onlyP = false;
      }
    }
    return onlyP;
  }

  /*
   * returns true if s has two punctuation marks
   * right next to each other or false otherwise
   *
   * use at least one of your other methods
   * in your solution to this method
   */
  public static boolean consecutivePuncts(String s) {
    boolean found = false;
      for(int i=0; i<s.length(); i++){
        if (isPunct(s.charAt(i)) == true){
          if (i+1 < s.length()){
            if (isPunct(s.charAt(i+1)) == true){
              found = true;
            }
          }
        }
      }
    return found;
  }
}
