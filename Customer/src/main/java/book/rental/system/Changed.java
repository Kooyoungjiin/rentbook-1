package book.rental.system;

public class Changed extends AbstractEvent {

    private Long id;
    private Boolean isHuman;

    public Changed(){
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public Boolean getIsHuman() {
        return isHuman;
    }

    public void setIsHuman(Boolean isHuman) {
        this.isHuman = isHuman;
    }
}