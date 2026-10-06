class Solution {
    public String addBinary(String a, String b) {
        //traversing from the back keeping track of few cases that can be made using binary addition always updating carry.

        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;
        StringBuilder sb = new StringBuilder();//create a string then reverse it.

        while (i >= 0 && j >= 0) {
            int up = Character.getNumericValue(a.charAt(i));
            int dw = Character.getNumericValue(b.charAt(j));

            if (carry == 0) {//case 1 : no carry value.
                if (up == 1 && dw == 1) {
                    sb.append(0);
                    carry = 1;
                } else if (up == 0 && dw == 0)
                    sb.append(0);
                else
                    sb.append(1);
            } else { //case 2: carry 1.
                if (up == 1 && dw == 1) {
                    sb.append(1);
                    carry = 1;
                } else if (up == 0 && dw == 0) {
                    sb.append(1);
                    carry = 0;
                } else {
                    sb.append(0);
                    carry = 1;
                }
            }
            i--;
            j--;
        }

        while (i >= 0) {//if string a binary character are left.
            int up = Character.getNumericValue(a.charAt(i));

            if (carry == 1) {
                if (up == 1) {
                    sb.append(0);
                    carry = 1;
                } else {
                    sb.append(1);
                    carry = 0;
                }
            } else {
                sb.append(up);
            }

            i--;
        }

        while (j >= 0) {//if string b binary character are left.
            int dw = Character.getNumericValue(b.charAt(j));

            if (carry == 1) {
                if (dw == 1) {
                    sb.append(0);
                    carry = 1;
                } else {
                    sb.append(1);
                    carry = 0;
                }
            } else {
                sb.append(dw);
            }

            j--;
        }

        if (carry == 1) {//check for last carry as well.
            sb.append(1);
        }

        sb.reverse();
        return sb.toString();
    }
}

//TC --> O(maxOf(a , b))
//SC --> O(1)