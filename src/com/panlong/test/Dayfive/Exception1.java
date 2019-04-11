package com.panlong.test.Dayfive;

/*
* 第一章    异常

1.1 异常概念
异常，就是不正常的意思。在生活中:医生说,你的身体某个部位有异常,该部位和正常相比有点不同,该部位的功能将受影响.在程序中的意思就是：
- 异常 ：指的是程序在执行过程中，出现的非正常的情况，最终会导致JVM的非正常停止。

在Java等面向对象的编程语言中，异常本身是一个类，产生异常就是创建异常对象并抛出了一个异常对象。Java处理异常的方式是中断处理。
异常指的并不是语法错误,语法错了,编译不通过,不会产生字节码文件,根本不能运行.

1.2 异常体系
异常机制其实是帮助我们找到程序中的问题，异常的根类是java.lang.Throwable，其下有两个子类：java.lang.Error与java.lang.Exception，平常所说的异常指java.lang.Exception。



Throwable体系：
- Error:严重错误Error，无法通过处理的错误，只能事先避免，好比绝症。
- Exception:表示异常，异常产生后程序员可以通过代码的方式纠正，使程序继续运行，是必须要处理的。好比感冒、阑尾炎。

出现异常,不要紧张,把异常的简单类名,拷贝到API中去查。



1.3 异常分类

我们平常说的异常就是指Exception，因为这类异常一旦出现，我们就要对代码进行更正，修复程序。
异常(Exception)的分类:根据在编译时期还是运行时期去检查异常?
- 编译时期异常:checked异常。在编译时期,就会检查,如果没有处理异常,则编译失败。(如日期格式化异常)
- 运行时期异常:runtime异常。在运行时期,检查异常.在编译时期,运行异常不会编译器检测(不报错)。(如数学异常)


1.4 异常的产生过程解析
先运行下面的程序，程序会产生一个数组索引越界异常ArrayIndexOfBoundsException。我们通过图解来解析下异常产生的过程。

第二章 异常的处理
Java异常处理的五个关键字：try、catch、finally、throw、throws

2.1 	抛出异常throw
在编写程序时，我们必须要考虑程序出现问题的情况。比如，在定义方法时，方法需要接受参数。那么，当调用方法使用接受到的参数时，首先需要先对参数数据进行合法的判断，数据若不合法，就应该告诉调用者，传递合法的数据进来。这时需要使用抛出异常的方式来告诉调用者。
在java中，提供了一个throw关键字，它用来抛出一个指定的异常对象。那么，抛出一个异常具体如何操作呢？
1. 创建一个异常对象。封装一些提示信息(信息可以自己编写)。
2. 需要将这个异常对象告知给调用者。怎么告知呢？怎么将这个异常对象传递到调用者处呢？通过关键字throw就可以完成。throw 异常对象。
   throw用在方法内，用来抛出一个异常对象，将这个异常对象传递到调用者处，并结束当前方法的执行。

使用格式：
    throw new 异常类名(参数);
 例如：
    throw new NullPointerException("要访问的arr数组不存在");

    throw new ArrayIndexOutOfBoundsException("该索引在数组中不存在，已超出范围");

2.2 Objects非空判断

还记得我们学习过一个类Objects吗，曾经提到过它由一些静态的实用方法组成，这些方法是null-save（空指针安全的）或null-tolerant（容忍空指针的），那么在它的源码中，对对象为null的值进行了抛出异常操作。
- public static <T> T requireNonNull(T obj):查看指定引用对象不是null。
查看源码发现这里对为null的进行了抛出异常操作：

    public static <T> T requireNonNull(T obj) {
        if (obj == null)
          	throw new NullPointerException(); // 如果传进来的obj对象是null,就产生一个空指针异常,并把该异常对象抛给调用者
        return obj;// 如果传进来的obj对象不是null,那么就直接返回该对象
    }

2.3  声明异常throws

声明异常：将问题标识出来，报告给调用者。如果方法内通过throw抛出了编译时异常，而没有捕获处理（稍后讲解该方式），那么必须通过throws进行声明，让调用者去处理。
关键字throws运用于方法声明之上,用于表示当前方法不处理异常,而是提醒该方法的调用者来处理异常(抛出异常).
声明异常格式：
    修饰符 返回值类型 方法名(参数) throws 异常类名1,异常类名2…{   }

2.4  捕获异常try…catch

如果异常出现的话,会立刻终止程序,所以我们得处理异常:

1. 该方法不处理,而是声明抛出,由该方法的调用者来处理(throws)。
2. 在方法中使用try-catch的语句块来处理异常。

try-catch的方式就是捕获异常。

- 捕获异常：Java中对异常有针对性的语句进行捕获，可以对出现的异常进行指定方式的处理。

捕获异常语法如下：

    try{
         编写可能会出现异常的代码
    }catch(异常类型  e){
         处理异常的代码
         //记录日志/打印异常信息/继续抛出异常
    }

try：该代码块中编写可能产生异常的代码。

catch：用来进行某种异常的捕获，实现对捕获到的异常进行处理。

注意:try和catch都不能单独使用,必须连用。


如何获取异常信息：

Throwable类中定义了一些查看方法:

- public String getMessage():获取异常的描述信息,原因(提示给用户的时候,就提示错误原因。

- public String toString():获取异常的类型和异常描述信息(不用)。
- public void printStackTrace():打印异常的跟踪栈信息并输出到控制台。

            包含了异常的类型,异常的原因,还包括异常出现的位置,在开发和调试阶段,都得使用printStackTrace。

在开发中呢也可以在catch将编译期异常转换成运行期异常处理。

多个异常使用捕获又该如何处理呢？

1. 多个异常分别处理。
2. 多个异常一次捕获，多次处理。
3. 多个异常一次捕获一次处理。

一般我们是使用一次捕获多次处理方式，格式如下：

    try{
         编写可能会出现异常的代码
    }catch(异常类型A  e){  当try中出现A类型异常,就用该catch来捕获.
         处理异常的代码
         //记录日志/打印异常信息/继续抛出异常
    }catch(异常类型B  e){  当try中出现B类型异常,就用该catch来捕获.
         处理异常的代码
         //记录日志/打印异常信息/继续抛出异常
    }

注意:这种异常处理方式，要求多个catch中的异常不能相同，并且若catch中的多个异常之间有子父类异常的关系，那么子类异常要求在上面的catch处理，父类异常在下面的catch处理。


2.4 finally 代码块
finally：有一些特定的代码无论异常是否发生，都需要执行。另外，因为异常会引发程序跳转，导致有些语句执行不到。而finally就是解决这个问题的，在finally代码块中存放的代码都是一定会被执行的。
什么时候的代码必须最终执行？
当我们在try语句块中打开了一些物理资源(磁盘文件/网络连接/数据库连接等),我们都得在使用完之后,最终关闭打开的资源。
finally的语法:
 try...catch....finally:自身需要处理异常,最终还得关闭资源。
注意:finally不能单独使用。
比如在我们之后学习的IO流中，当打开了一个关联文件的资源，最后程序不管结果如何，都需要把这个资源关闭掉。

第三章 自定义异常

3.1 概述
为什么需要自定义异常类:
我们说了Java中不同的异常类,分别表示着某一种具体的异常情况,那么在开发中总是有些异常情况是SUN公司没有定义好的,此时我们根据自己业务的异常情况来定义异常类。,例如年龄负数问题,考试成绩负数问题,这些异常很可能在 JDK 中没有定义过,那么能不能自己定义异常呢？
什么是自定义异常类:
在开发中根据自己业务的异常情况来定义异常类.
自定义一个业务逻辑异常: LoginException。一个登陆异常类。
异常类如何定义:
1. 自定义一个编译期异常: 自定义类 并继承于java.lang.Exception。
2. 自定义一个运行时期的异常类:自定义类 并继承于java.lang.RuntimeException。



*/
public class Exception1 {
    public static void main(String[] args) {

    }
}
