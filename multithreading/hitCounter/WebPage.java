import java.util.concurrent.atomic.AtomicInteger;

class Webpage {
    private int id;
    private AtomicInteger visitCount;

    public Webpage(int id) {
        this.id = id;
        this.visitCount = new AtomicInteger(0);
    }

    public int getId() {
        return id;
    }

    public AtomicInteger getHitCount() {
        return visitCount;
    }

    public void incrementVisitCount() {
        visitCount.incrementAndGet();
    }                   
}