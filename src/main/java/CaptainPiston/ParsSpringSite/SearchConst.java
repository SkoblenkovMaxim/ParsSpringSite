package CaptainPiston.ParsSpringSite;

public enum SearchConst {
    MK(0, "komsomol"),
    TF(1, "tinkoff");

    private int code;
    private String description;

    SearchConst(int code, String description) {
        this.code = code;
        this.description = description;
    }

    public void searchString() {

    }
}