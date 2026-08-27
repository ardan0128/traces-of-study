class Solution {
    public String greatestLetter(String s) {
        char lower = 'z';
		char upper = 'Z';
		
        for(int i = 0; i < 26; i++) {
			if(s.contains(Character.toString(lower)) && s.contains(Character.toString(upper))) {
				return Character.toString(upper);
			}
			
            lower--;
            upper--;
		}

		return "";
    }
}