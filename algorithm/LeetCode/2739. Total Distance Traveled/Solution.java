class Solution {
    public int distanceTraveled(int mainTank, int additionalTank) {
        int dis = 0;

        if(mainTank < 5){
            dis = mainTank * 10;

            return dis;
        }

        int total = mainTank / 5;

        while(total-- > 0 || mainTank >= 5){
            if(additionalTank <= 0){
                break;
            }

            dis += 5*10;
            mainTank -= 5;
            additionalTank--;
            mainTank++;
        }

        dis += mainTank * 10;
        
        return dis;
    }
}