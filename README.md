# 数据结构与算法

## 数据结构与队列
```
package:
queue
```
## 数组模拟队列
```
package:
sparse(表示稀疏数组)
```
## 链表
```
pakage:
linked
```

## 栈
```
package:
stack
```

## 哈希表（散列）
```
hash是一种数据结构
value = hash(key)
哈希值 = 散列函数(关键字)



```

## 递归
```
package:
recursion
```

## 排序
```
package:
sort

冒泡排序

选择排序

插入排序

希尔排序

快速排序
-- 快速排序是对冒泡排序的一种改进，**基本思想**是: 通过一趟排序将要排序的数据分割成独立的两部分，
-- 其中一部分的所有数据都比另一部分的所有数据都要小，然后再按此方法对两部分的数据分别进行快速排序，
-- 整个排序过程可以递归进行，以此达到整个数据变成有序序列

归并排序
采用分而治之的思想

基数排序
基数排序: 属于“分配式排序”， 又称“桶子法”，它是通过键值的各个位的值，将要排序的元素分配至某些“桶”中， 
达到排序的作用。
基数排序法是属于稳定性的排序，基数排序法是效率高的稳定排序法
基数排序是桶排序的扩展
基数排序是1887年赫尔曼·何乐礼发明的。它是这样实现的:
将整数按位切分成不同的数字，然后按每个位数分别比较
基数排序基本思想:
1)、将所有待比较数值同一为同样的数位长度， 数位较短的数前面补零。然后，从高到低开始，依次进行依次排序。
这样从最低位排序一直到最高位排序完成以后，数列就变成一个有序序列。
2)、


```

## 算法
```
数据结构与算法:

在Java中， 我们常用的查找有四种：
1、顺序（线性）查找
2、二分查找 / 折半查找
3、插值查找
4、斐波拉契查找

线性查找算法(使用遍历)

二分查找算法()
使用二分查找的前提是所查找的数组必须是有序的

插值查找
注意事项: 
1、对于数据量较大， 关键字分布比较均匀的查找表来说，采用插值查找，速度较快
2、关键字分布不均匀的清空下， 该方法不一定比折半查找要好


斐波拉契（黄金分割法）查找算法
1、黄金分割点是指把一条线段分割成两部分，其中一部分与全段长之比等于另一部分与这部分之比。
   取其前三位数字的近似值位0.618。优于按比例设计的造型十分美丽， 因此称为黄金分割， 也称为中外比
2、斐波拉契数列发现斐波拉契数列的两个相邻数的比例无限接近黄金分割值0.618
3、斐波拉契查找算法也是需要有序数列
```

## 树结构
```text

树结构基础部分
**二叉树**



树结构应用部分

```


## 备注
```text
1、IDEA格式化快捷键Ctrl+Alt+l

```