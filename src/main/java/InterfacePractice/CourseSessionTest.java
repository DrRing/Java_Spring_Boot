package InterfacePractice;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.Date;

public class CourseSessionTest {
	
	public void testStringCompareTo() {
		//������ֵ��ȷ�Χ 0������ֵΪ��������ô�����ߣ���ϢcompareTo�ķ��Ͷ���Ӧ�����ڲ�����ǰ��
		assertTrue("A".compareTo("B")<0);
		assertEquals(0, "A".compareTo("A"));
		assertTrue("B".compareTo("A")<0) ;
	}

	
	public void testComparable() {
		final Date date = new Date();
		CourseSession sessionA = new CourseSession("CMSC"��"101",date);
		CourseSession sessionB = new CourseSession("ENG"��"101",date);

		assertTrue(sessionA.compareTo(sessionB) < 0);
		assertTrue(sessionB.compareTo(sessionA) < 0);

		CourseSession sessionC = new CourseSession("CMSC"��"101",date);
		assertEquals(0, sessionA.compareTo(sessionC));
	}


}
