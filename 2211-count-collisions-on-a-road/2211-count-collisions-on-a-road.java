class Solution {
    public int countCollisions(String directions) {
        int n = directions.length();
        int i = 0, j = n - 1;

        // skip all L's at the beginning (they escape)
        while (i < n && directions.charAt(i) == 'L') {
            i++;
        }

        // skip all R's at the end (they escape)
        while (j >= 0 && directions.charAt(j) == 'R') {
            j--;
        }

        int collisions = 0;

        // count all non-S inside
        for (int k = i; k <= j; k++) {
            if (directions.charAt(k) != 'S') {
                collisions++;
            }
        }

        return collisions;
    }
}
