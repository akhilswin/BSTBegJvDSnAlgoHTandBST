package yaksha;

import static org.mockito.Mockito.mock;
import static yaksha.TestUtils.businessTestFile;
import static yaksha.TestUtils.currentTest;
import static yaksha.TestUtils.yakshaAssert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import yaksha.BST;
import yaksha.BSTNode;

public class TestMainClass {

	@Test
	public void testExceptionConditon() throws Exception {

		TestUtils.yakshaAssert(TestUtils.currentTest(), true, TestUtils.boundaryTestFile);
	}

	@Test
	public void testBoundaryCondition() throws Exception {

		TestUtils.yakshaAssert(TestUtils.currentTest(), true, TestUtils.exceptionTestFile);
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	public void testCountNodes() throws Exception {
		int expectedResult = 7;
		BSTNode bSTNode = new BSTNode();
		// Input : 8 5 3 7 10 15 2
		BST bst = mock(BST.class);
		bst.insert(8);
		bst.insert(5);
		bst.insert(3);
		bst.insert(7);
		bst.insert(10);
		bst.insert(15);
		bst.insert(2);
		Mockito.when(bst.countNodes()).thenReturn(expectedResult);
		int result = bst.countNodes();
		yakshaAssert(currentTest(), (result == 7 ? true : false), businessTestFile);
	}

	@Test
	public void testSearch() throws Exception {

		boolean expectedResult = true;
		BSTNode bSTNode = new BSTNode();
		// Input : 8 5 3 7 10 15 2
		BST bst = mock(BST.class);
		bst.insert(8);
		bst.insert(5);
		bst.insert(3);
		bst.insert(7);
		bst.insert(10);
		bst.insert(15);
		bst.insert(2);
		Mockito.when(bst.search(7)).thenReturn(expectedResult);
		boolean result = bst.search(7);
		yakshaAssert(currentTest(), (result == true ? true : false), businessTestFile);
	}
}