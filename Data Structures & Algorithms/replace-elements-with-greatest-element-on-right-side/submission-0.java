class Solution {
    public int[] replaceElements(int[] arr) {
        int len = arr.length;
        int max = -1;
        for(int i=len-1; i>=0; i--){
            int currentVal = arr[i];
            arr[i] = max;
            max = Math.max(max, currentVal);

        }
        return arr;
    }
}