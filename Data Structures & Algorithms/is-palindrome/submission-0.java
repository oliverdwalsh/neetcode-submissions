class Solution {
    public boolean isPalindrome(String s) {
        char[] chars = s.toCharArray();
        int ittL = 0;
        int ittR = chars.length -1;

        

        while(ittL < ittR){


            char l = s.charAt(ittL);
            char r = s.charAt(ittR);

            while(!Character.isLetterOrDigit(l) && (ittL < ittR)){
                ittL += 1;
                l = Character.toLowerCase(s.charAt(ittL));
                if(Character.isLetterOrDigit(l)){
                    break;
                }
            } 

            while(!Character.isLetterOrDigit(r) && (ittL < ittR)){
                ittR -= 1;
                r = Character.toLowerCase(s.charAt(ittR));
                if(Character.isLetterOrDigit(r)){
                    break;
                }
            } 

            if(Character.toLowerCase(l) == Character.toLowerCase(r)){
                ittL += 1;
                ittR -= 1;
            }else{
                return false;
            }
        }
        return true;
    }
}
