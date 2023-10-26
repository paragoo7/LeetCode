class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String[] d = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};
        HashSet<String> s = new HashSet<>();
        for (String str : words) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < str.length(); ++i)
                sb.append(d[str.charAt(i) - 'a']);
            s.add(sb.toString());
        }
        return s.size();
    }
}





