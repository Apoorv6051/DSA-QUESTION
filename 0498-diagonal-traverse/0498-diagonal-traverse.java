class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;

        Map<Integer, ArrayList<Integer>> mp = new HashMap<>();

        ArrayList<Integer> result = new ArrayList<>();

        // fill the map using [i+j]

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                mp.putIfAbsent(i + j, new ArrayList<>());
                mp.get(i + j).add(mat[i][j]);
            }
        }

        boolean flip = true;

        for (ArrayList<Integer> diagonal : mp.values()) {
            if (flip) {

                // diagonal ko reverse kr do
                Collections.reverse(diagonal);

            }

            for (int num : diagonal) {
                result.add(num);
            }

            flip = !flip;
        }

        // ArrayList ko int[] mein convert karna
        int[] ans = new int[result.size()];

        for (int i = 0; i < result.size(); i++) {
            ans[i] = result.get(i);
        }

        return ans;
        
    }
}