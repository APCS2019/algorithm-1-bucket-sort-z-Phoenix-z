给一个a的一维数组；
创建一个new arrayList b, 长度为a中的最大值。
在b每找到一次等于a的值的下标，在等值的下标+1
最后输出不为0的值  

int [] a = new int [2,3,4,5,2,7];
int [] b = new int [7+1];               //长度等于a的最大值，看条件写不写找maximum的方法。 最大值要➕1；
int [] temp = new int [];
for (int i = 0; i < a.length ; i ++){
 b [a[i]] ++;
}
for (int i = 0; i < b.length; i ++){
  if (b [i] != 0){
    return i;
  }
 

