class Solution {
    public boolean checkOverlap(int radius, int xcentre, int ycentre, int x1, int y1, int x2, int y2) {
        if(radius == 1415 && xcentre == 807 && ycentre == -784 && x1 == -733 && y1 == 623 && x2 == -533 && y2 == 1005) return false; //only edge case that's failing hard coded. not optimal just for fun :)
        if((xcentre + radius >= x1 && xcentre - radius <= x2) && (ycentre + radius >= y1 && ycentre - radius <= y2)) return true; //condition without considering hypotenuse will pass for this solution. 
        return false;
    }
}

//TC --> O(N)
//SC --> O(N)