
class Main {
   public static void main(String[] args) {
       String one = "longest";
       String two = "stone";
       lcs(one, two);
       one = "BANANA";
       two = "ATANA";
       lcs(one, two);
   }
   public static void lcs(String stringOne, String stringTwo) {
       if (stringOne.length() < stringTwo.length()) {
           String temp = stringOne;
           stringOne = stringTwo;
           stringTwo = temp;
       }
       int lengthS1 = stringOne.length();
       int lengthS2 = stringTwo.length();
       int[][] array;
       if (lengthS1 >= lengthS2) {
           ;
       } else {
           System.out.println("ERROR");
       }
       array = new int[lengthS2 + 1][lengthS1 + 1];
       for (int i = 1; i < lengthS2 + 1; i++) {
           for (int j = 1; j < lengthS1 + 1; j++) {
               if (stringOne.charAt(j - 1) == stringTwo.charAt(i - 1)) {
                   array[i][j] = array[i - 1][j - 1] + 1;
               } else if (array[i - 1][j] > array[i][j - 1]) {
                   array[i][j] = array[i - 1][j];
               } else {
                   array[i][j] = array[i][j - 1];
               }
           }
       }
       String match = "";
       int lengthOfSubString = array[lengthS2][lengthS1];
       FOUND:
       for (int i = lengthS2; i > 1; i--) {
           for (int j = lengthS1; j > 1; j--) {
               if (array[i][j - 1] == array[i - 1][j] && array[i - 1][j] == array[i - 1][j - 1] && array[i - 1][j - 1] != array[i][j]) {
                   match += stringOne.charAt(j - 1);
                   if (array[i - 1][j - 1] == 0) {
                       break FOUND;
                   }
                   break;
               }
           }
       }
       System.out.println("");
       for (int x = 0; x < lengthS2 + 1; x++) {
           for (int y = 0; y < lengthS1 + 1; y++) {
               System.out.print(array[x][y]);
           }
           System.out.println("");
       }
       StringBuilder LCSFound = new StringBuilder();
       for (int i = 0; i < match.length(); i++) {
           LCSFound.insert(0, match.charAt(i));
       }
       System.out.println("Words Used:  " + stringOne + " and "+ stringTwo);
       System.out.println("Longest Common Subsequence found: " + LCSFound);
   }
}
