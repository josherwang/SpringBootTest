package date904;

public class BubbleSort {

    static final int SIZE=10;                //�趨�����С

    public static void bubbleSort(int[]arr){
        // �����Ϸ��Լ��
        if (arr == null || arr.length <= 1) {
            return;
        }
        int temp;            //Ϊ�˽���������м����
        //�㷨���ģ���С�����������������ұ�
        boolean flag=true;            // ��������Ƿ��Ѿ��������ݽ��������Ƿ�Ҫ���������Ѿ��������Ϊfalse,������ִ��������
        for(int i=1;i<arr.length && flag;i++){
            flag=false;                            //��ʼ��Ϊfalse��Ĭ�ϼ��赱ǰ�����Ѿ����򣬲���Ҫ��������
            for(int j=0;j<arr.length-i;j++){                //���С�ڵ�һλ�ͻ�ѵ�һλ���Ƶ��ڶ�λ��ʼð�ݣ��ڶ�λ���ɵ�һλ������ѭ���ͻ�Ѵ���ƶ��˺��棬��֪С�Ķ�������ˡ�
                if(arr[j]>arr[j+1]){                        //���������������бȽϣ��ϴ��������ð��
                    //��������������
                    temp=arr[j];                             
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    flag=true;                    // ������Ԫ�ص���ʱ��˵���������������򣬻����������
                }
            }

            if(false == flag){                    //��ʾ�ڼ�����ѭ������i�����Ѿ��ź���
                System.out.print("��"+i+"��"+"���ź���\n");
            }

            System.out.print("��"+i+"����������");
            for(int k=0;k<arr.length;k++){
                System.out.print(" "+arr[k]);                    //���ÿһ������Ľ��
            }
            System.out.print("\n");
        }
        }

    public static void main(String[] args){
        int[]shuzu=new int[SIZE];                //��������
        int i;
        for(i=0;i<SIZE;i++){
            shuzu[i]=(int)(100+Math.random()*(100+1));                //��ʼ������,������������
        }
        System.out.print("����ǰ������Ϊ��\n");                            //ѭ���������ǰ������
        for(i=0;i<SIZE;i++){
            System.out.print(shuzu[i]+" ");                            
        }
        System.out.print("\n");
        bubbleSort(shuzu);                                            //�������
        System.out.print("����������Ϊ��\n");
        for(i=0;i<SIZE;i++){
            System.out.print(shuzu[i]+" ");                            //�������������
        }
        System.out.print("\n");
    }
}