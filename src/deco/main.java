package deco;

public class main {
    public static void main(String[] args) {
        DataSource dataSource = new FileDataSource();
        dataSource = new EncryptionDecorator(dataSource);
        dataSource = new CompressionDecorator(dataSource);

        String content = "This is some sensitive data";
        String filePath = "data.txt";

        dataSource.write(filePath, content);
        String readContent = dataSource.read(filePath);
    }
}

