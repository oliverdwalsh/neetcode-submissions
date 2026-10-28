class Solution {
    public boolean isAnagram(String s, String t) {
        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();

        Arrays.sort(sArray);
        Arrays.sort(tArray);

        String s1 = new String(sArray);
        String s2 = new String(tArray);
        return s1.equals(s2);
    }
}
