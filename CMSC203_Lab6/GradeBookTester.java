import junit.framework.TestCase;

public class GradeBookTester extends TestCase {

	private GradeBook gradeBook1;
	private GradeBook gradeBook2;

	protected void setUp() throws Exception {
		super.setUp();
		gradeBook1 = new GradeBook(5);
		gradeBook2 = new GradeBook(5);
		gradeBook1.addScore(80.0);
		gradeBook1.addScore(78.0);
		gradeBook2.addScore(90.0);
		gradeBook2.addScore(89.0);
	}

	protected void tearDown() throws Exception {
		super.tearDown();
		gradeBook1 = null;
		gradeBook2 = null;
	}

	public void testAddScore() {
//		fail("Not yet implemented");
		assertTrue(gradeBook1.toString().equals("80.0 78.0 "));
		assertTrue(gradeBook2.toString().equals("90.0 89.0 "));
	}

	public void testSum() {
//		fail("Not yet implemented");
		assertEquals(158.0, gradeBook1.sum(), 0.00001);
		assertEquals(179.0, gradeBook2.sum(), 0.00001);
	}

	public void testMinimum() {
//		fail("Not yet implemented");
		assertEquals(78.0, gradeBook1.minimum(), 0.00001);
		assertEquals(89.0, gradeBook2.minimum(), 0.00001);
	}

	public void testFinalScore() {
//		fail("Not yet implemented");
		assertEquals(80.0, gradeBook1.finalScore(), 0.00001);
		assertEquals(90.0, gradeBook2.finalScore(), 0.00001);
		
	}

	public void testGetScoreSize() {
//		fail("Not yet implemented");
		assertEquals(2, gradeBook1.getScoreSize());
		assertEquals(2, gradeBook2.getScoreSize());
	}

//	public void testToString() {
//		fail("Not yet implemented");
//	}

}
