package homework_1.InMemoryModel;

// Интерфейс смены модели
public interface IModelChanger {
    public void notifyChange(IModelChanger sender);
}
