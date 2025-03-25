public class TestList {
    public static void main(String[] args) {
        FixedSizeList<String> stdNames = new FixedSizeList<String>();
        stdNames.addIndex("John");
        System.out.println(stdNames.size());

        stdNames.addIndex("Mitch");
        System.out.println(stdNames.size());


        stdNames.addIndex(1,"Dan");
        System.out.println(stdNames.size());

    }
}
