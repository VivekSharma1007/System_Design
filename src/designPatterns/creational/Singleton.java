package designPatterns.creational;

public class Singleton {
    public static void main(String[] args) {
        JudgeAnalytics judgeAnalytics1 = JudgeAnalytics.getInstance();

        }
}


// eager loading
// This is already thread-safe but may cause potential memory waste if instance is not required
class JudgeAnalytics {
    private static final JudgeAnalytics judgeAnalytics = new JudgeAnalytics();

    private JudgeAnalytics() {

    }

    public static JudgeAnalytics getInstance() {
        return judgeAnalytics;
    }
}

// lazy loading

class JudgeAnalytics2 {
    private static JudgeAnalytics2 judgeAnalytics2;

    private JudgeAnalytics2() {

    }

    // one way -- but this may slow down the system because lock will be acquired even if the instance is created
    public synchronized static JudgeAnalytics2 getInstance() {
        if(judgeAnalytics2 == null) {
            judgeAnalytics2 = new JudgeAnalytics2();
        }
        return judgeAnalytics2;
    }

    // better way - Double check locking system
    // this will only acquire lock after checking if instance is null or not
    public static JudgeAnalytics2 getInstance2() {
        if(judgeAnalytics2 == null) {
            synchronized (JudgeAnalytics2.class) {
                judgeAnalytics2 = new JudgeAnalytics2();
            }
        }
        return judgeAnalytics2;
    }
}

// Bill Pugh Singleton -- best way
// Will only load holder class when referenced, and synchronized overhead is also avoided
class JudgeAnalytics3 {
    private JudgeAnalytics3() {}


    static class Holder {
        private static final JudgeAnalytics3 judgeAnalytics3 = new JudgeAnalytics3();
    }

    public static JudgeAnalytics3 getInstance() {
        return Holder.judgeAnalytics3;
    }
}