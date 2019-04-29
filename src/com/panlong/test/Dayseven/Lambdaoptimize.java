package com.panlong.test.Dayseven;

public class Lambdaoptimize {
    public static void main(String[] args) {
        new Thread(()->{
            System.out.println("线程启动"+Thread.currentThread().getName());
        }).start();
    }
    /*
    * 这段代码和刚才的执行效果是完全一样的，可以在1.8或更高的编译级别下通过。从代码的语义中可以看出：我们启动了一个线程，而线程任务的内容以一种更加简洁的形式被指定。

不再有“不得不创建接口对象”的束缚，不再有“抽象方法覆盖重写”的负担，就是这么简单！
为了理解Lambda的语义，我们需要从传统的代码起步。

使用实现类

要启动一个线程，需要创建一个Thread类的对象并调用start方法。而为了指定线程执行的内容，需要调用Thread类的构造方法：

- public Thread(Runnable target)

为了获取Runnable接口的实现对象，可以为该接口定义一个实现类RunnableImpl：

    public class RunnableImpl implements Runnable {
    	@Override
    	public void run() {
    		System.out.println("多线程任务执行！");
    	}
    }

然后创建该实现类的对象作为Thread类的构造参数：

    public class Demo03ThreadInitParam {
    	public static void main(String[] args) {
    		Runnable task = new RunnableImpl();
    		new Thread(task).start();
    	}
    }

使用匿名内部类

这个RunnableImpl类只是为了实现Runnable接口而存在的，而且仅被使用了唯一一次，所以使用匿名内部类的语法即可省去该类的单独定义，即匿名内部类：

    public class Demo04ThreadNameless {
    	public static void main(String[] args) {
    		new Thread(new Runnable() {
    			@Override
    			public void run() {
    				System.out.println("多线程任务执行！");
    			}
    		}).start();
    	}
    }

匿名内部类的好处与弊端

一方面，匿名内部类可以帮我们省去实现类的定义；另一方面，匿名内部类的语法——确实太复杂了！

语义分析

仔细分析该代码中的语义，Runnable接口只有一个run方法的定义：

- public abstract void run();

即制定了一种做事情的方案（其实就是一个函数）：

- 无参数：不需要任何条件即可执行该方案。
- 无返回值：该方案不产生任何结果。
- 代码块（方法体）：该方案的具体执行步骤。

同样的语义体现在Lambda语法中，要更加简单：

    () -> System.out.println("多线程任务执行！")

- 前面的一对小括号即run方法的参数（无），代表不需要任何条件；
- 中间的一个箭头代表将前面的参数传递给后面的代码；
- 后面的输出语句即业务逻辑代码。


*/
}
