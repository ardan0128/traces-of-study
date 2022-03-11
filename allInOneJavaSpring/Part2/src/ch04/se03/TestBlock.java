package ch04.se03;

public class TestBlock {
  public static void main(String[] args) {
    /**
     * The Java feature 'Text Blocks' is only available with source level 15 and
     * above
     * 현재 설치된 Java 버전과 달라서 사용할 수 없어 코드만 저장해 두었다.
     */
    String textBlocks = """
        Hello,
        hi,
        how r u
        """;

    System.out.println(textBlocks);
    System.out.println(getBlockOfHtml());
  }

  public static String getBlockOfHtml() {
    return """
        <html>
          <body>
            <span>example text</span>
          </body>
        <html>
        """;
  }
}
