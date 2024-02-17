import java.util.ArrayDeque;
import java.util.Deque;

/**
 * A class that represents a stack which maintains its elements in sorted order.
 */
public class SortedStack {
    private Deque<Integer> stack;

    /**
     * Constructor for SortedStack.
     */
    public SortedStack() {
        this.stack = new ArrayDeque<>();
    }

    /**
     * Pushes an element onto the stack in a way that keeps the stack sorted.
     *
     * @param element The element to be pushed onto the stack.
     */
    public void push(Integer element) {
        Deque<Integer> tempStack = new ArrayDeque<>();
        while (!stack.isEmpty() && stack.peek() > element) {
            tempStack.push(stack.pop());
        }
        stack.push(element);
        while (!tempStack.isEmpty()) {
            stack.push(tempStack.pop());
        }
    }

    /**
     * Removes the top element of the stack and returns it.
     *
     * @return The top element of the stack.
     */
    public Integer pop() {
        return stack.pop();
    }

    /**
     * Returns the top element of the stack without removing it.
     *
     * @return The top element of the stack.
     */
    public Integer peek() {
        return stack.peek();
    }

    /**
     * Checks if the stack is empty.
     *
     * @return true if the stack is empty, false otherwise.
     */
    public boolean isEmpty() {
        return stack.isEmpty();
    }

    /**
     * Returns the size of the stack.
     *
     * @return The size of the stack.
     */
    public int size() {
        return stack.size();
    }
}