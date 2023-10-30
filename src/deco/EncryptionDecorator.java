package deco;

class EncryptionDecorator implements DataSource {
    private DataSource dataSource;

    public EncryptionDecorator(DataSource dataSource) {
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
