class WordAnalyzer {
    private String word;

    WordAnalyzer() {
        this.word = "banana";
    }

    void findCharacters() {
        int aPosition = this.word.lastIndexOf('a');
        int nPosition = this.word.lastIndexOf('n');

        System.out.println("Last position of a: " + aPosition);
        System.out.println("Last position of n: " + nPosition);
    }

    public static void main(String[] args) {
        WordAnalyzer obj = new WordAnalyzer();
        obj.findCharacters();
    }
}