package date904;

public class BubbleSort {

    static final int SIZE=10;                //设定数组大小

    public static void bubbleSort(int[]arr){
        // 参数合法性检查
        if (arr == null || arr.length <= 1) {
            return;
        }
        int temp;            //为了交换方便的中间变量
        //算法核心：从小到大排序，有序区在右边
        boolean flag=true;            // 用来标记是否已经经过数据交换，即是否还要排序。数据已经排序过则为false,不用再执行排序了
        for(int i=1;i<arr.length && flag;i++){
            flag=false;                            //初始化为false，默认假设当前序列已经有序，不需要继续排序
            for(int j=0;j<arr.length-i;j++){                //如果小于第一位就会把第一位给移到第二位开始冒泡，第二位则变成第一位。依次循环就会把大的移动了后面，可知小的都在左边了。
                if(arr[j]>arr[j+1]){                        //将相邻两个数进行比较，较大的数往后冒泡
                    //交换相邻两个数
                    temp=arr[j];                             
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    flag=true;                    // 当发生元素调换时，说明该序列尚且无序，还需继续排序
                }
            }

            if(false == flag){                    //提示第几步（循环到的i）就已经排好了
                System.out.print("第"+i+"步"+"就排好了\n");
            }

            System.out.print("第"+i+"步排序结果：");
            for(int k=0;k<arr.length;k++){
                System.out.print(" "+arr[k]);                    //输出每一步排序的结果
            }
            System.out.print("\n");
        }
        }

    public static void main(String[] args){
        int[]shuzu=new int[SIZE];                //声明数组
        int i;
        for(i=0;i<SIZE;i++){
            shuzu[i]=(int)(100+Math.random()*(100+1));                //初始化数组,加载数组数据
        }
        System.out.print("排序前的数组为：\n");                            //循环输出排序前的数组
        for(i=0;i<SIZE;i++){
            System.out.print(shuzu[i]+" ");                            
        }
        System.out.print("\n");
        bubbleSort(shuzu);                                            //排序操作
        System.out.print("排序后的数组为：\n");
        for(i=0;i<SIZE;i++){
            System.out.print(shuzu[i]+" ");                            //输出排序后的数组
        }
        System.out.print("\n");
    }
}
