
public class NestedIterator implements Iterator<Integer> {

    private Stack<NestedInteger> stack;

    public NestedIterator(List<NestedInteger> nestedList) {
        stack = new Stack<>();

        // Push elements in reverse order
        for (int i = nestedList.size() - 1; i >= 0; i--) {
            stack.push(nestedList.get(i));
        }
    }

    @Override
    public Integer next() {
        // Ensure the top element is an integer
        if (hasNext()) {
            return stack.pop().getInteger();
        }

        return null;
    }

    @Override
    public boolean hasNext() {

        while (!stack.isEmpty()) {

            NestedInteger top = stack.peek();

            if (top.isInteger()) {
                return true;
            }

            // Remove the nested list
            stack.pop();

            // Push its elements in reverse order
            List<NestedInteger> list = top.getList();

            for (int i = list.size() - 1; i >= 0; i--) {
                stack.push(list.get(i));
            }
        }

        return false;
    }
}
