package lukasy.complexity_01;

public class TimeTool {
    public interface Task {
        void execute();
    }

    /**
     * 测试指定任务的执行时间
     *
     * @param task 需要测试的任务
     */
    public static void test(String title, Task task) {
        if (task == null) return;
        System.out.println(title);
        System.out.println("开始：" + System.currentTimeMillis());
        long begin = System.nanoTime();
        task.execute();
        long end = System.nanoTime();
        System.out.println("结束：" + System.currentTimeMillis());
        double delta = (end - begin) / 1_000_000.0;
        System.out.println("耗时：" + delta + " ms");
        System.out.println("--------------------------------");
    }
}
