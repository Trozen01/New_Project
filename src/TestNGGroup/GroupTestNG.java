package TestNGGroup;

import org.testng.annotations.Test;

@Test(groups = { "AllClassTests" })
public class GroupTestNG {

	@Test(groups = { "sanity" })
	public void Test1() {

		System.out.println("This is test case one");
	}

	@Test(groups = { "sanity", "smoke" })
	public void Test2() {
		System.out.println("This is test case two");
	}

	@Test(groups = { "sanity", "regression" })
	public void test3() {

		System.out.println("This is test case three");
	}

	@Test(groups = "regression")
	public void test4() {

		System.out.println("This is test case four");
	}

	@Test(groups = { "smoke" })
	public void test5() {

		System.out.println("This is test case five");
	}

	@Test(groups = { "windows.regression"})
	public void test6() {

		System.out.println("This test case for windoes base application ");
	}

	@Test(groups = { "linux.regression"})
	public void test7() {

		System.out.println("This test case for linux base application ");
	}

	public void test8() {

		System.out.println("Isolated Method");
	}
}

// GroupTestNG.xml.
// CustomeGroupTestNG.xml.
// RegularExpressionTestNG.xml.

// What is meta group and how to create?
// Ans:- It is custome group, where you can decide what to include in custome
// group and what to exclude.  (we can create customose group)

// How to use regular expression.
// Group at class level.