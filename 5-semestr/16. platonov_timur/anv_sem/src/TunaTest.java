import org.junit.Assert;

public class TunaTest {
    Tuna tuna = new Tuna();

    @org.junit.Test
    public void testFavour() throws Exception {
        tuna.unfavour("tom");
        tuna.favour("tom");
        Assert.assertTrue(tuna.reportGood("tom"));
        Assert.assertTrue(!tuna.reportBad("tom"));
        Assert.assertTrue(!tuna.reportNoInform("tom"));
    }

    @org.junit.Test
    public void testUnfavour() throws Exception {
        tuna.favour("kris");
        tuna.unfavour("kris");
        Assert.assertTrue(tuna.reportBad("kris"));
        Assert.assertTrue(!tuna.reportGood("kris"));
        Assert.assertTrue(!tuna.reportNoInform("kris"));
    }

    @org.junit.Test
    public void testReportGood() throws Exception {
        tuna.favour("joe");
        tuna.favour("joes");
        tuna.unfavour("joes");
        Assert.assertTrue(tuna.reportGood("joe"));
    }

    @org.junit.Test
    public void testReportBad() throws Exception {
        tuna.favour("joe");
        tuna.favour("joes");
        tuna.unfavour("joes");
        Assert.assertTrue(tuna.reportBad("joes"));
    }

    @org.junit.Test
    public void testReportNoInform() throws Exception {
        tuna.favour("joe");
        tuna.favour("joes");
        tuna.unfavour("joes");
        Assert.assertTrue(tuna.reportNoInform("jo"));
    }
}