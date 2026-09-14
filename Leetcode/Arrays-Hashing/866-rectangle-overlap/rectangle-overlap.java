class Solution {
    public boolean isRectangleOverlap(int[] rec1, int[] rec2) {
        int x1 = rec1[0], y1 = rec1[1], x2 = rec1[2], y2 = rec1[3];
        int nx1 = rec2[0], ny1 = rec2[1], nx2 = rec2[2], ny2 = rec2[3];

        if (nx1 >= x2 || nx2 <= x1 || ny1 >= y2 || ny2 <= y1) return false;
        return true;

    }
}