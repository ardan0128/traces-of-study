
class Solution {

    public boolean judgeCircle(String moves) {
        int UD = 0;
        int LR = 0;

        for (char move : moves.toCharArray()) {
            switch (move) {
                case 'U' ->
                    UD++;
                case 'D' ->
                    UD--;
                case 'L' ->
                    LR++;
                case 'R' ->
                    LR--;
            }
        }

        return (UD == 0 && LR == 0);
    }
}
