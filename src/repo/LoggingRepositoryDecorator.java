package repo;

class LoggingRepositoryDecorator<T> implements Repository<T> {
    private Repository<T> repository;

    public LoggingRepositoryDecorator(Repository<T> repository) {
        this.repository = repository;
    }

    @Override
    public void add(T item) {
        repository.add(item);
    }

    @Override
    public T get(int id) {
        T item = repository.get(id);
        return item;
    }

    @Override
    public void update(T item) {
        repository.update(item);
    }

    @Override
    public void delete(int id) {
        repository.delete(id);
    }
}

