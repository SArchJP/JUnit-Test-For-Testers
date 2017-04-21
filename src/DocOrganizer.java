import lt.itakademija.DocumentConsumer;
import lt.itakademija.DocumentOrganizer;
import lt.itakademija.DocumentProducer;

public class DocOrganizer implements DocumentOrganizer {
    private long totalCount;
    private long totalLinesCount;

    private DocumentProducer documentProducer;
    private DocumentConsumer documentConsumer;

    @Override
    public long getTotalCount() {
        return 0;
    }

    @Override
    public long getTotalLinesCount() {
        return 0;
    }

    @Override
    public void organize(DocumentProducer documentProducer, DocumentConsumer documentConsumer) {

    }
}
