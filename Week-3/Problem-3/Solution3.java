public class Solution3 {
    public static boolean approach1(char[][] matrix, String word) {
        int m = matrix.length;
        int n = matrix[0].length;

        for (int i = 0; i < m; i++) {
            StringBuilder row = new StringBuilder();
            for (int j = 0; j < n; j++) {
                row.append(matrix[i][j]);
            }
            if (row.toString().contains(word)) {
                return true;
            }
        }

        for (int j = 0; j < n; j++) {
            StringBuilder col = new StringBuilder();
            for (int i = 0; i < m; i++) {
                col.append(matrix[i][j]);
            }
            if (col.toString().contains(word)) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        char[][] matrix = {
                { 'C', 'A', 'T' },
                { 'X', 'Z', 'T' },
                { 'Y', 'O', 'T' }
        };
        String word = "CAT";

        System.out.println(approach1(matrix, word));
    }
}