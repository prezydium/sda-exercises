package pl.sda.krzysztof.secondday.stack;

public class AppStack {

    public static void main(String[] args) {
        String first = "Hi, I'm first";
        String second = "Hi, I'm second";
        String third = "Hi, I'm third";
        StackImpl stack = new StackImpl();

        stack.push(first);
        stack.push(second);
        stack.push(third);

        Object peekResult = stack.peek();
        System.out.println((String) peekResult);

        Object popResult = stack.pop();
        Object popResultTwo = stack.pop();

        System.out.println((String) popResult);
        System.out.println((String) popResultTwo);
    }

}
