# MyLaunchMode

1：standard 

   （一直在同一栈中）不管存在实例不存在，都重新创建activity
2：singleTop

  当跳转activity存在栈顶时,不创建实例，直接使用；
  不存在栈顶，创建实例，并跳转
 
3：singletask
  栈中没有，新建
  栈中存在，直接应用此activity，并清空栈中其他activity，使得task1成为栈顶，
  
4：singleinstance
 新建栈，此栈中只有一个activity
 栈1跳转启动模式为singleinstance的activity新建栈，在这个activity中重新跳转栈1（不是singleinstance）的activity，此时singleleinstance的栈变成起始栈，栈1依次回退，回退到singleinstance的栈时，退出。
