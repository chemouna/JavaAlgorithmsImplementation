package com.mounacheikhna.algorithms.datastructures.trie;

import java.util.Map;

public class TrieImpl implements Trie {

    @Override
    public String bestMatches(String word) {
        return null;
    }

    @Override
    public int insert(String word) {
        return 0;
    }

    @Override
    public boolean remove(String word) {
        return false;
    }

    @Override
    public int frequency(String word) {
        return 0;
    }

    @Override
    public boolean contains(String word) {
        return false;
    }

    @Override
    public int size() {
        return 0;
    }


    class TrieNode {
        char c;
        int occurrences;
        Map<Character, TrieNode> children;

        public TrieNode(char c) {
            this.c = c;
            this.occurrences = 0;
            children = null;
        }

        int insert(String word, int pos) {

            return 0;
        }

    }

    boolean remove(String s, int pos)

}
