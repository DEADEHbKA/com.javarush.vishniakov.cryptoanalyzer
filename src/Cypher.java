public  class Cypher {

    public static String cypher(String inString, int key){

        String alphabet = Alphabet.getALPHABET();

        char[] outLine = new char[inString.length()];
        key = key % alphabet.length();
        int position;
        for (int i = 0; i < inString.length(); i++) {
            for (int j = 0; j < alphabet.length() ; j++) {
                if (inString.toLowerCase().charAt(i) == alphabet.charAt(j)) {
                   position = j + key;
                   if(position < 0){
                       position = position + alphabet.length();
                   }
                   if(position > (alphabet.length() -1)){
                       position = position - alphabet.length();
                   }
                    outLine[i] = alphabet.charAt(position);
                }
            }
        }
        inString = String.copyValueOf(outLine);
        return inString;
    }
}
