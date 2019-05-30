package io.zipcoder;


/**
 * @author tariq
 */
public class StringsAndThings {

    /**
     * Given a string, count the number of words ending in 'y' or 'z' -- so the 'y' in "heavy" and the 'z' in "fez" count,
     * but not the 'y' in "yellow" (not case sensitive). We'll say that a y or z is at the end of a word if there is not an alphabetic
     * letter immediately following it. (Note: Character.isLetter(char) tests if a char is an alphabetic letter.)
     * example : countYZ("fez day"); // Should return 2
     *           countYZ("day fez"); // Should return 2
     *           countYZ("day fyyyz"); // Should return 2
     */
    public Integer countYZ(String input) {
        //Need to count number of "WORDS"
        //Check for which words are "ENDING" in either y or z & keep count of them
        // You need to check a collection of words which mean we will need to place them in an "ARRAY" to do so.

        Integer count = 0;

        // You are setting this to tally up all words that end with either y or z

        String[] stringarr = input.split(" ");

        //We're splitting the input String so that it allows us to count for the end of each word or else it would read the entire string as one word.
        // input.split(" ") <-- this is how we tell the program to split anywhere there is a space in the string.

        //1st step create array & use split method to separate each word in the array as its own. Use " " to set the space between each index(words).
        for (int i = 0; i <stringarr.length; i++) {

            String word = stringarr[i];
            // this is used as a place holder for each word in array that is being examined at it's present time. Created array since string was split

            //if(word.substring(word.length()-1).toLowerCase().equals("z") || word.substring(word.length()-1).toLowerCase().equals("y")) {
            if(word.charAt(word.length()-1) == 'z' || word.charAt(word.length()-1) == 'y'){


                // 'word.substring' will search each individual character. 'word.length' tells it to do so for the entire length of the index(word)

            count = count + 1;    // tells method to count up 1 each time condition is met.
            }
        }
        return count;
    }

    /**
     * Given two strings, base and remove, return a version of the base string where all instances of the remove string have
     * been removed (not case sensitive). You may assume that the remove string is length 1 or more.
     * Remove only non-overlapping instances, so with "xxx" removing "xx" leaves "x".
     *
     * example : removeString("Hello there", "llo") // Should return "He there"
     *           removeString("Hello there", "e") //  Should return "Hllo thr"
     *           removeString("Hello there", "x") // Should return "Hello there"
     */
    public String removeString(String base, String remove){

        String store = base.replaceAll(remove,"") ;


        return store;
    }

    /**
     * Given a string, return true if the number of appearances of "is" anywhere in the string is equal
     * to the number of appearances of "not" anywhere in the string (case sensitive)
     *
     * example : containsEqualNumberOfIsAndNot("This is not")  // Should return false
     *           containsEqualNumberOfIsAndNot("This is notnot") // Should return true
     *           containsEqualNumberOfIsAndNot("noisxxnotyynotxisi") // Should return true
     */
    public Boolean containsEqualNumberOfIsAndNot(String input){

        // create a counter
        // need to find how to locate/isolate "is" & "not" then add to counter
        String input1 = input;
        String input2 = input;

        int isindex = input1.indexOf("is");
        int iscounter = 0;
        while(isindex != -1){
            iscounter++;
            input1 = input1.substring(isindex + 1);
            isindex = input1.indexOf("is");

        }

        int isnotindex = input2.indexOf("not");
        int notcounter = 0;
        while(isnotindex != -1){
            notcounter++;
            input2 = input2.substring(isnotindex + 1);
            isnotindex = input2.indexOf("not");

        }

        System.out.println(iscounter);
        System.out.println(notcounter);
        System.out.println(iscounter==notcounter);
        return iscounter==notcounter;
    }

    /**
     * We'll say that a lowercase 'g' in a string is "happy" if there is another 'g' immediately to its left or right.
     * Return true if all the g's in the given string are happy.
     * example : gHappy("xxggxx") // Should return  true
     *           gHappy("xxgxx") // Should return  false
     *           gHappy("xxggyygxx") // Should return  false
     */
    public Boolean gIsHappy(String input){
        //need to search string
        // need to only return true if all the g's in string has another 'g' immediately to its left or right
        //while statement needed

        for(int i = 1;i<input.length()-1;i++){
            if(input.charAt(i)=='g'){
                if(input.charAt(i-1)!='g' &&  input.charAt(i+1)!='g')return false;

            }

        }
        if(input.charAt(0)=='g'&& input.charAt(1)!='g') return false;
        if(input.charAt(input.length()-1)=='g'&& input.charAt(input.length()-2)!='g')return false;



        return true;
    }


    /**
     * We'll say that a "triple" in a string is a char appearing three times in a row.
     * Return the number of triples in the given string. The triples may overlap.
     * example :  countTriple("abcXXXabc") // Should return 1
     *            countTriple("xxxabyyyycd") // Should return 3
     *            countTriple("a") // Should return 0
     */
    public Integer countTriple(String input){
        int counter = 0;// establish a counter

        for(int i = 0; i <input.length() -2; i++){  //-2 denotes that we stop the at the index of the length - 2. We need identify the beginning of each triplet. Also i++ denotes the counter is moving over one.
            if(input.charAt(i)== input.charAt(i+1)&&(input.charAt(i)== input.charAt(i+2)))counter++;


        }
        return counter;
    }
}
