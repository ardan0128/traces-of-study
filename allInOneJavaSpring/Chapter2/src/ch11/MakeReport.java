package ch11;

public class MakeReport {
  StringBuffer buffer = new StringBuffer();

  private String line = "============================================\n";
  private String title = "이름\t 주소\t\t 전화번호\n";

  private void makeHeader() {
    buffer.append(line);
    buffer.append(title);
    buffer.append(line);
  }

  private void generateBody() {
    buffer.append("James\t");
    buffer.append("Seoul Korea\t");
    buffer.append("010-1111-2222\n");

    buffer.append("Tomas\t");
    buffer.append("NewYork US\t");
    buffer.append("010-3333-4444\n");
  }

  private void makeFotter() {
    buffer.append(line);
  }

  // 직접 제공되는 메소드
  public String getReport() {
    makeHeader();
    generateBody();
    makeFotter();
    return buffer.toString();
  }
}
