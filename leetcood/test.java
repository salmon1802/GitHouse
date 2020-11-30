package leetcood;


import java.util.Arrays;

public class test {

    public static void main(String[] args) {
        Solution s = new Solution();
        int []tree = new int[]{-796,-795,-791,-790,-790,-789,-787,-783,-782,-781,-778,-778,-771,-769,-766,-764,-763,-762,-760,-757,-754,-751,-750,-750,-738,-735,-735,-732,-731,-729,-728,-725,-723,-721,-719,-713,-713,-711,-707,-704,-702,-700,-699,-697,-697,-696,-696,-696,-696,-695,-695,-690,-690,-689,-688,-688,-688,-687,-685,-685,-683,-682,-680,-679,-679,-677,-677,-675,-674,-673,-665,-664,-662,-660,-659,-655,-654,-654,-654,-652,-652,-651,-650,-650,-644,-643,-641,-641,-639,-639,-639,-638,-637,-637,-637,-628,-625,-621,-615,-611,-608,-605,-601,-600,-594,-594,-592,-589,-587,-582,-582,-581,-579,-579,-578,-577,-574,-570,-569,-568,-566,-566,-565,-560,-555,-552,-547,-540,-538,-535,-535,-535,-534,-534,-530,-529,-528,-526,-522,-520,-520,-519,-512,-509,-508,-506,-505,-505,-502,-502,-497,-490,-489,-488,-481,-481,-474,-474,-473,-472,-471,-470,-468,-467,-466,-465,-463,-460,-457,-456,-455,-451,-451,-450,-450,-449,-448,-448,-447,-446,-443,-440,-438,-438,-435,-434,-433,-424,-422,-416,-415,-412,-411,-410,-408,-407,-407,-406,-404,-402,-395,-391,-390,-390,-385,-383,-379,-379,-379,-373,-372,-367,-361,-360,-353,-344,-343,-343,-339,-338,-336,-333,-332,-332,-332,-330,-329,-328,-326,-324,-319,-317,-317,-311,-311,-305,-305,-302,-302,-302,-301,-298,-298,-296,-293,-292,-290,-290,-289,-285,-284,-282,-280,-277,-277,-273,-272,-271,-266,-264,-262,-254,-251,-250,-248,-246,-244,-241,-240,-239,-237,-237,-235,-233,-229,-220,-220,-216,-214,-212,-211,-209,-207,-205,-199,-199,-198,-196,-196,-195,-194,-194,-193,-192,-191,-185,-185,-185,-182,-182,-179,-172,-170,-167,-162,-161,-160,-156,-155,-155,-153,-152,-150,-148,-147,-141,-140,-139,-138,-134,-134,-130,-127,-127,-124,-122,-116,-115,-112,-104,-101,-100,-99,-98,-96,-96,-92,-92,-87,-84,-84,-79,-77,-75,-75,-73,-71,-70,-67,-66,-65,-61,-61,-60,-59,-59,-59,-58,-58,-55,-54,-51,-50,-43,-42,-40,-37,-35,-33,-32,-29,-28,-27,-26,-23,-21,-20,-18,-14,-11,-6,-4,-3,-1,2,3,7,8,8,9,9,11,19,21,29,29,31,31,32,33,36,38,43,48,48,50,50,51,52,61,62,66,67,69,70,71,78,79,82,82,83,83,84,89,89,92,92,93,93,96,96,98,98,99,99,103,107,109,112,119,120,121,122,123,125,125,130,147,148,151,153,154,154,156,156,158,160,162,164,166,167,170,175,176,177,177,179,182,184,185,188,190,191,192,194,195,198,198,201,203,204,205,207,208,209,210,216,217,218,219,222,227,227,231,231,232,243,245,248,249,257,257,260,261,263,264,267,270,273,275,282,289,298,299,299,299,300,302,303,303,307,308,309,310,310,311,312,313,313,318,318,319,320,321,327,328,328,329,335,336,339,340,342,342,343,344,346,347,349,352,358,360,361,363,363,366,367,369,369,371,371,372,376,378,378,378,379,379,380,383,384,385,392,394,395,395,397,397,397,400,402,405,411,414,415,415,416,421,424,426,427,428,430,431,435,437,438,440,441,447,448,448,449,449,449,451,453,453,458,459,459,461,466,467,470,477,479,482,483,485,485,486,487,494,498,504,504,508,508,510,510,510,511,512,514,517,518,525,526,527,527,527,528,528,529,531,536,537,539,539,540,545,546,546,547,549,549,551,551,553,554,554,558,560,560,602,773,791,662,789,642,598,643,781,626,666,633,668,715,576,752,632,637,579,626,768,638,677,652,685,626,724,619,578,567,637,766,765,684,563,690,785,747,596,686,653,642,696,639,647,641,698,747,710,617,642,595,730,566,595,582,596,723,775,574,767,750,678,767,598,738,761,715,692,683,651,779,627,726,627,688,639,563,704,636,717,755,783,661,680,748,656,763,683,675,604,637,631,679,598,642,710,723,686,697,781,605,588,771,744,737,608,686,757,687,778,659,753,666,778,578,757,762,745,718,751,579,585,748,589,575,662,598,665,629,794,797};
        for(int i = 661; i > 660 && i < 670 ; i++){
            System.out.print(tree[i]+" ");
        }
        System.out.println(Arrays.toString(s.subSort(tree)));
        int min = tree[665];
        for(int i = 665; i < 795 ; i++){
            min = Math.min(min, tree[i]);
           // if(min == 563) System.out.println(i);
        }
        System.out.println("min:"+min);
        System.out.println(tree[698]);
        System.out.println(tree[699]);
        System.out.println(tree[700]);
        System.out.println("maxIndex794:" + tree[794]);
        System.out.println("minIndex628:" + tree[628]);
        System.out.println("min:" + 629 + "max:" + 797);
    }

}


//class Solution {
//    public int reverse(int x) {
//        int ans = 0;
//        while(x != 0) {
//            int i = x % 10;
//            if (ans > Integer.MAX_VALUE / 10 || (ans == Integer.MAX_VALUE / 10 && i > 7))
//                return 0;
//            if (ans < Integer.MIN_VALUE / 10 || (ans == Integer.MIN_VALUE / 10 && i < -8))
//                return 0;
//
//            ans = ans * 10 + i;
//            x = x / 10;
//        }
//        return ans;
//    }
//}


/*
class Solution {
    public int myAtoi(String s) {
        int n = s.length();
        if(n == 0) return 0;
        char []a = s.toCharArray();


        //去除空格
        int index = 0;
        while( index < n && a[index] == ' '){
            index ++;
        }
        //如果全为空格
        if(index == n){
            return 0;
        }
        //如果有正负号，只记录第一个
        int flag = 1;
        if(a[index] == '+'){
            flag = flag;
            index ++;
        }else if(a[index] == '-'){
            flag = -flag;
            index ++;
        }

        int res =0;
        while (index < n){
            if(a[index] > '9' || a[index] < '0'){
                break;
            }

            if(res > Integer.MAX_VALUE / 10 || (res == Integer.MAX_VALUE / 10 && (a[index] - '0') > Integer.MAX_VALUE % 10)){
                return  Integer.MAX_VALUE ;
            }

            if(res < Integer.MIN_VALUE / 10 || (res == Integer.MIN_VALUE / 10 && (a[index] - '0') > -(Integer.MIN_VALUE % 10))){
                return  Integer.MIN_VALUE ;
            }

            res = res *10 + flag * (a[index] - '0');
            index ++;

        }
        return res;
    }
}*/

//判断是否是回文数
//class Solution {
//    public boolean isPalindrome(int x) {
//        if(x < 0) return false;
//        int reverse = 0;
//        int order   = x;
//        while(order != 0) {
//             reverse = reverse * 10 + order % 10;
//             order = order / 10;
//        }
//        if(reverse == x) return true;
//    }
//}

//盛水最多的容器
//class Solution {
//    public int maxArea(int[] height) {
//        int lo = 0;
//        int hi = height.length;
//        int area = 0;
//        while(lo < hi){
//             area = Math.max(area, (hi - 1 - lo)* Math.min(height[lo],height[hi - 1]));
//            if(height[lo] < height[hi - 1]) lo ++;
//            else hi --;
//        }
//        return area;
//    }

//删除链表的倒数第N个节点


//   class ListNode {
//      int val;
//      ListNode next;
//      ListNode() {}
//      ListNode(int val) { this.val = val; }
//      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
// }
//class Solution {
//    public ListNode removeNthFromEnd(ListNode head, int n) {
//        ListNode pre   = new ListNode();
//        pre.next = head;
//        ListNode start = new ListNode();
//        ListNode end   = new ListNode();
//        start = pre;
//        end   = pre;
//
//        while (n != 0){
//            start = start.next;
//            n --;
//        }
//
//        while (start.next != null){
//            start = start.next;
//            end   = end.next;
//        }
//
//        end.next = end.next.next;
//        return  pre.next;
//
//         }
//    }

//最近的三数之和
//class Solution {
//    public int threeSumClosest(int[] nums, int target) {
//        Arrays.sort(nums);
//        int ans = nums[0] + nums[1] + nums[2];
//        for(int i = 0; i < nums.length ; i++){
//            int start = i + 1;
//            int end   = nums.length - 1;
//            while(start < end){
//                int num = nums[i] + nums[start] + nums[end];
//                if(Math.abs(target - num) < Math.abs(target - ans)){
//                    ans = num;
//                }else if(num < target){
//                    start ++;
//                }else if(num > target){
//                    end --;
//                }else
//                    return ans;
//            }
//        }
//        return ans;
//    }
//}

//环形链表


    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }
//
//    public class Solution {
//        public boolean hasCycle(ListNode head) {
//            ListNode faster = head;
//            ListNode slower = head;
//            if(head == null)
//                return false;
//            while(faster != null && faster.next !=null){
//                faster = faster.next.next;
//                slower = slower.next;
//                if(faster == slower)
//                    return true;
//            }
//            return  false;
//        }
//    }
//}

    //删除排序数组中的重复项
//1.
//    class Solution {
//        public int removeDuplicates(int[] nums) {
//            if(nums == null) return 0;
//            if(nums.length <= 2) return nums.length;
//
//            int n = 1;
//            for (int o = 2; o < nums.length; o++) {
//                if(nums[n - 1] != nums[o]){
//                    n ++;
//                    nums[n] = nums[o];
//                }
//
//            }
//            return n + 1;
//        }
//    }
//}
//2.
//  static class  Solution{
//      public int removeDuplicates(int[] nums) {
//          int slow   = 0;
//          int middle = 1;
//          int fast   = 2;
//
//          while (fast < nums.length){
//              if(nums[slow] == nums[fast]){
//                  fast ++;
//              }
//              if(nums[slow] != nums[fast]){
//                  slow ++;
//                  middle ++;
//                  nums[middle] = nums[fast];
//                  fast ++;
//              }
//          }
//          return middle+1;
//      }
//  }
//    public static void bubbleSort(int[] arr){
//        public static  void sort(Comparable []a){
//        if(a==null||a.length<2){
//            return;
//        }
//            int N = a.length;
//            for(int i = 0 ;i<a.length-1;i++) {
//                for (int j = 0; j < a.length - i - 1; j++) {
//                    if (a[j] > a[j + 1]) {
//                        exch(a, j, j+1);
//                    }
//                }
//            }
//
//        }
//
//    }


// 分隔链表
//class Solution {
//    public ListNode partition(ListNode head, int x) {
//        ListNode less = new ListNode(0);
//        ListNode more = new ListNode(0);
//        ListNode lp   = less;
//        ListNode mp   = more;
//
//        while (head != null){
//            if(he ad.val < x){
//                lp.next = new ListNode(head.val);
//                lp.next = lp.next;
//            }else {
//                mp.next = new ListNode(head.val);
//                mp.next = mp.next;
//            }
//            head = head.next;
//        }
//        lp.next = more.next;
//        return less.next;
//    }
//}

//二维数组中的查找
//class Solution {
////    public boolean findNumberIn2DArray(int[][] matrix, int target) {
////        if(matrix == null || matrix.length == 0 ||matrix[0].length ==0) {
////            return  false;
////        }
////        int row = 0;
////        int col = matrix[0].length - 1;
////        while(row < matrix.length && col >= 0){
////            if(target < matrix[row][col]){
////                col--;
////            }else if(target > matrix[row][col]){
////                row++;
////            }else return true;
////        }
////        return false;
////    }
////}

    // 实现strStr()
//   class Solution {
//        public int strStr(String haystack, String needle) {
//            if (haystack.equals("")) return -1;
//            if (needle.equals("")) return 0;
//            char[] hstr = haystack.toCharArray();
//            char[] nstr = needle.toCharArray();
//            int [] next = getnext(nstr);
//            //匹配
//            int m = 0, n = 0;
//            while (m < hstr.length && n < nstr.length) {
//                if (hstr[m] == nstr[n]) {
//                    //单次匹配成功
//                    m++;
//                    n++;
//                } else if (hstr[m] != nstr[n] && n > 0) {
//                    //单次匹配失败但n不为0
//                    n = next[n - 1];
//                    continue;
//                } else if (hstr[m] != nstr[n] && n == 0) {
//                    //单次匹配失败且n=0
//                    m++;
//                }
//            }
//
//            return n == nstr.length? m - n: -1;
//        }
//
//        public int[] getnext(char[] str){
//                //构建next数组
//                int []next = new int[str.length];
//                int i = 1;
//                int j = 0;
//                next[0] = 0;
//                while (i < str.length) {
//                    if (str[i] == str[j]) {
//                        //i与j相同时
//                        next[i] = j + 1;
//                        i++;
//                        j++;
//                    } else {
//                        //i与j不同时
//                        if (j == 0) {
//                            next[i] = j;
//                            i++;
//                        }
//                        if (j != 0) {
//                            j = next[j - 1];
//                            //再比较j与i
//                            continue;
//                        }
//                    }
//                }
//                return next;
//            }
//
//        }

// 水果成篮
//class Solution {
//    public int totalFruit(int[] tree) {
//        if(tree.equals(null)) {
//            return -1;
//        }
//        if(tree.length == 1){
//            return 1;
//        }
//        if(tree.length == 2){
//            return 2;
//        }
//        int ans = 0;
//        int i   = 2;
//        int j   = 0;
//        int k   = 1;
//        int tmp = 0;
//        while (i < tree.length ){
//                if(tree[i] == tree[k] || tree[i] == tree[j]) {
//                    i++;
//                }else if(tree[k] == tree[j]){
//                    k = i;
//                }else if(tree[k] != tree[j]){
//                    ans = Math.max(ans, i - j );
//                    tmp = i - 1;
//                    while(tree[tmp] == tree[tmp - 1]){
//                        tmp--;
//                    }
//                    j = tmp;
//                    k = i;
//                    i++;
//                }
//
//                if(i > tree.length - 1){
//                ans = Math.max(ans, i - j);
//                break;
//                }
//            }
//        return i == tree.length  ? ans : -1;
//
//        }
//    }

// 部分排序
class Solution {
    public int[] subSort(int[] array) {
        if(array.length < 2){
            return new int[]{-1,-1};
        }
        // 1.往后遍历，保存最大值max。若遍历的值<max则不符合要求
        // 2.记录不符合要求的值的min value，以及最大和最小的下标
        // 3.从最小的下标往前遍历，直到找到比min小的
//        int left   = 0;
//        int middle = 0;
//        int right  = 0;
        int max    = array[0];
        int min    = 0;
        int maxIndex = 0;
        int minIndex = 0;
        boolean flag = true;
        for(int i = 1; i < array.length; i++){
            if(max <= array[i]){
                max = Math.max(max, array[i]);
                continue;
            }else {
                if(flag == true) {
                    minIndex = i;
                    min = array[minIndex];
                    flag = false;
                }
                maxIndex = i;
                min = Math.min(min, array[i]);
            }
        }


            int j = minIndex - 1;
            while (j >= 0 && array[j] > min){
                j--;
            }

        return flag == true ? new int[]{-1,-1} :new int[]{j + 1, maxIndex};
    }
}