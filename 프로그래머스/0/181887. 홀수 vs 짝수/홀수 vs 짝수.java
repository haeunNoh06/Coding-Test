class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int odd = 0, even = 0;
        for ( int i = 0; i < num_list.length; i++ ) {
            if ( (i+1) % 2 == 0 ) {
                even += num_list[i];
            } else if ( (i+1) % 2 != 0 ) {
                odd += num_list[i];
            }
        }
        if ( odd > even ) return odd;
        else return even;
    }
}