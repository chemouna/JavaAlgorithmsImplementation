package com.mounacheikhna.algorithms.datastructures.trie;

/**
 * Also can be called radix tree or prefix tree (as they can be searched by prefixes), is a kind of search tree:
 * an ordered tree data structure that is used to store a dynamic set or associative array where the keys are usually
 * strings.
 *
 *  https://en.wikipedia.org/wiki/Trie
 */
public interface Trie {

    /**
     * Find the best match to 'word' in this trie; uses edit distance and word frequency.
     * @param word The word to approximate.
     * @return The best match to the word that exists in this trie.
     */
    String bestMatches(String word);

    /**
     * Inserts a word in the trie.
     * @param word
     * @return the number of occurrence of the word in the trie after inserting.
     */
    int insert(String word);

    /**
     *
     * @param word
     * @return true if the word was removed from the trie, false if it wasn't
     * (means that it wasn't on the trie)
     */
    boolean remove(String word);

    /**
     * Get the number of occurrences of word in a trie.
     *
     * @param word the word to check
     * @return the number of occurrences of the word in the trie.
     */
    int frequency(String word);

    /**
     * Check if it contains a word.
     * @return true if it does contains word, false otherwise.
     */
    boolean contains(String word);

    /**
     * Returns the number of unique words in the trie.
     * @return the number of unique words.
     */
    int size();

}
