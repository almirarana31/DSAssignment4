import java.util.*;

public class ListStack<E> implements StackInt<E> {
    public static void main(String[] args) {
        StackInt<Integer> stack = new ListStack<>();

        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println("Top element: " + stack.peek());

        System.out.println("Popping elements: ");
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }

        System.out.println("Pushing elements: ");
        System.out.println(stack.push(4));
        System.out.println(stack.push(5));
        System.out.println(stack.push(6));

        System.out.println("Current stack: ");
        System.out.println(stack.toString());
    }


    private List<E> theData;
    public ListStack() {
        theData = new ArrayList<>();
    }

    public E push(E obj) {
        theData.add(obj);
        return obj;
    }

    @Override
    public E peek() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return theData.get(theData.size() - 1);
    }

    @Override
    public E pop() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return theData.remove(theData.size()-1);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Stack: ");
        for (int i = theData.size() - 1; i >= 0; i--) {
            sb.append(theData.get(i));
            if (i > 0) {
                sb.append(" ");
            }
        }
        return sb.toString();
    }


    public boolean isEmpty() {
        return theData.isEmpty();
    }
}
