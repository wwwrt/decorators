package deco;

class FileDataSource implements DataSource {
    @Override
    public String read(String filePath) {
		return filePath;
    }

    @Override
    public void write(String filePath, String content) {
    }
}