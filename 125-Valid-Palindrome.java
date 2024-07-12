class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder newString = new StringBuilder();
        for (char c:s.toCharArray() ){
            if(Character.isLetterOrDigit(c)){
                newString.append(Character.toLowerCase(c));
            }
        }
        String filteredStr = newString.toString();
        String reversedStr = newString.reverse().toString();
        return filteredStr.equals(reversedStr);
    }
}