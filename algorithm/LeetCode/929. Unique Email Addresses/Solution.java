
class Solution {

    public int numUniqueEmails(String[] emails) {
        Set<String> result = new HashSet<>();

        for (String email : emails) {
            String[] parts = email.split("@");
            String[] local = parts[0].split("\\+");

            result.add(local[0].replace(".", "") + "@" + parts[1]);
        }

        return result.size();
    }
}
