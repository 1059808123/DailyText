import java.util.Scanner;

/**
 * @program: offer
 * @description: 两个链表的第一个公共节点
 * @author: LiHongyan
 * @create: 2020-07-21 23:18
 **/
public class GetIntersectionNode {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode target = null;
        if(headA == null || headB == null){
            return target;
        }
        ListNode listNodeA = headA;
        ListNode listNodeB = headB;
        while(listNodeA != listNodeB){
            listNodeA = listNodeA != null ? listNodeA.next : headB;
            listNodeB = listNodeB != null ? listNodeB.next : headA;
        }
        return listNodeA;
    }
}
