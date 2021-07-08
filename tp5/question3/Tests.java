package question3;

import java.util.Set;

public class Tests extends junit.framework.TestCase {

    public void test1(question3.Factory<Set>f) throws Exception {
        Set<Integer> set = f.create();
        for (int i = 20; i > 0; i--)
            set.add(i);
    }

    public void testCreation() {
        try {
            test1(new TreeSetFactory<Integer>());
            test1(new HashSetFactory<Integer>());
        } catch (NoSuchMethodError e) {
            fail("NoSuchMethodError : " + e.getMessage());
        } catch (Exception e) {
            fail(" exception inattendue : " + e.getMessage());
        }
    }


    public void testCreationFactorys()
    {
        question3.TreeSetFactory<String> treeSetF1 = new question3.TreeSetFactory<String>();
        assertEquals(1, treeSetF1.create());
        question3.HashSetFactory<Integer> hashSetF1 = new question3.HashSetFactory<Integer>();
        java.util.HashSet hashSet1 = (java.util.HashSet)hashSetF1.create();
        assertEquals(1, hashSet1);
        assertEquals(1, hashSet1.add(1));
        assertEquals(2, hashSet1.add(2));
        assertEquals(1, hashSet1.iterator());
        assertEquals(1, hashSet1.contains(1));
        assertEquals(1, hashSet1.spliterator());
    }
}

