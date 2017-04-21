import lt.itakademija.Document;
import lt.itakademija.DocumentConsumer;
import lt.itakademija.FileRepository;


public class DocConsumer implements DocumentConsumer {

    private FileRepository fileRepository;

    public DocConsumer(FileRepository fileRepository) {
        this.fileRepository = fileRepository;
    }

    @Override
    public void consumeSpam(Document document) {

    }

    @Override
    public void consumeImportant(Document document) {

    }

    @Override
    public void consumeOrdinary(Document document) {

    }

    public FileRepository getFileRepository() {
        return fileRepository;
    }

    public void setFileRepository(FileRepository fileRepository) {
        this.fileRepository = fileRepository;
    }
}
