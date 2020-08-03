package reverselinkedlist;

import linkedlist.linkedlist;

public class reverseLL extends linkedlist {

    public void reverseDI() throws Exception {

        int left = 0, right = this.size() - 1;
        while (left <= right) {
            Node ln = this.getNodeAt(left);
            Node rn = this.getNodeAt(right);
            int temp = ln.data;
            ln.data = rn.data;
            rn.data = temp;
            left++;
            right--;
        }

    }

}