class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int minspeed = 1;
        int maxspeed = 0;
        for(int i =0; i<piles.length; i++){
            maxspeed = Math.max(maxspeed , piles[i]);
        }
        while( minspeed < maxspeed){
            int mid = minspeed+( maxspeed - minspeed)/2;
            long totalhours = 0;
            for( int i = 0; i<piles.length;i++){
                totalhours += ( piles[i] + mid -1)/mid;

            }
            if( totalhours <=h){
                maxspeed = mid;

            }else{
                minspeed = mid +1;
            }
        }
        return minspeed;
        
    }
}
