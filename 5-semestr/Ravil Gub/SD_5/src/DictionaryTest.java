import org.junit.Assert;

/**
 * Created by ravil on 25.05.14.
 */
public class DictionaryTest {

    Dictionary dictionary;
    Legislator legislator;

    @org.junit.Before
    public void setUp() throws Exception {
        dictionary = new Dictionary(100);
        legislator = new Legislator("Jon");

        dictionary.insert(legislator);
    }

    @org.junit.Test
    public void testMember() throws Exception {
        Assert.assertTrue(dictionary.member(legislator) == true);
    }

    @org.junit.Test
    public void testDelete() throws Exception {
        dictionary.delete(legislator);

        Assert.assertTrue(dictionary.member(legislator) == false);
    }
}
