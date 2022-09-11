import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
  final private Solution sol = new Solution();
  @Test
  void invertTreeExample1() {
    assertTrue(
        sol.isSampleTree(
            sol.invertTree(sol.createBinaryTree(new String[]{"4", "2", "7", "1", "3", "6", "9"})),
            sol.createBinaryTree(new String[]{"4", "7", "2", "9", "6", "3", "1"})
        )
    );
  }
  @Test
  void invertTreeExample2() {
    assertTrue(
        sol.isSampleTree(
            sol.invertTree(sol.createBinaryTree(new String[]{"2", "1", "3"})),
            sol.createBinaryTree(new String[]{"2", "3", "1"})
        )
    );
  }
  @Test
  void invertTreeExample3() {
    assertTrue(
        sol.isSampleTree(
            sol.invertTree(null),
            null
        )
    );
  }
}