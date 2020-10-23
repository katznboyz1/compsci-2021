// this file should be renamed to main.java to actually run
// it was just renamed to make itself easier to find
// 2014 Compsci AP Exam Question 1 Parts A+B

class Main() {
    public static void main(String[] args) {
        // tests
        System.out.println("---PART A OUTPUT---");
        String[] words = {"TAN", "ABRACADABRA", "WHOA", "AARDVARK", "EGGS", "A"};
        for (int i = 0; i < words.length; i++) {System.out.println(scrambleWord(words[i]));} // testing and printing for part a
        System.out.println("---PART B OUTPUT---");
        java.util.List<String> wordsList = java.util.Arrays.asList(words);
        scrambleOrRemove(wordsList); // testing for part b
        for (int i = 0; i < wordsList.size(); i++) {System.out.println(wordsList.get(i));} // printing for part b
    }

    public static String scrambleWord(String word) {
        for (int i = 0; i < word.length() - 1; i++) {
            if (word.substring(i, i + 1).equals("A") && !word.substring(i + 1, i + 2).equals("A")) {
                word = word.substring(0, i) + word.substring(i + 1, i + 2) + word.substring(i, i + 1) + word.substring(i + 2);
                i++;
            }
        }
        return word;
    }

    public static void scrambleOrRemove(java.util.List<String> wordList) {
        for (int wordListOriginalIndex = 0; wordListOriginalIndex < wordList.size();) {
            if (!scrambleWord(wordList.get(wordListOriginalIndex)).equals(wordList.get(wordListOriginalIndex))) {
                wordList.set(wordListOriginalIndex, scrambleWord(wordList.get(wordListOriginalIndex)));
                wordListOriginalIndex++;
            } else {
                wordList.remove(wordListOriginalIndex);
            }
        }
    }
}