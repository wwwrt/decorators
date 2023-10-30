package deco;

class CompressionDecorator implements DataSource {
    private DataSource dataSource;

    public CompressionDecorator(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public String read(String filePath) {
		return filePath;
    }

    @Override
    public void write(String filePath, String content) {
    }
}
