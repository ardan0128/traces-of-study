class Solution {
    public int minNumberOfHours(int initialEnergy, int initialExperience, int[] energy, int[] experience) {
        int n = energy.length;
        int result = 0;

        for(int i = 0; i < n; i++){
            if(initialEnergy > energy[i]){
                initialEnergy -= energy[i];
            }else{
                result += (energy[i] - initialEnergy + 1);
                initialEnergy += (energy[i] - initialEnergy + 1);
                initialEnergy -= energy[i];
            }

            if(initialExperience > experience[i]){
                initialExperience += experience[i];
            }else{
                result += (experience[i] - initialExperience) + 1;
                initialExperience += (experience[i] - initialExperience) + 1;
                initialExperience += experience[i];
            }
        }

        return result;
    }
}