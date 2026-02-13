class Solution {
    public int addDigits(int num) {
        while (num >= 10) {
            int sum = 0;
            String s = String.valueOf(num);

            for (char c : s.toCharArray()) {
                sum += Integer.parseInt(String.valueOf(c));
            }

            num = sum;
        }
        return num;
    }
}
