package captainpiston.parsing;

public enum SearchConst {
    MK("0", "komsomol"),
    TF("1", "tinkoff");

    private String code;
    private String description;

    SearchConst(String code, String description) {
        this.code = code;
        this.description = description;
    }

    public String searchCodeConst() {
        return code;
    }

    public static SearchConst searchStringConst(String code) {
        for(SearchConst searchConst: values()) {
            if(searchConst.searchCodeConst().equals(code)) {
                return searchConst;
            }
        }
        throw new IllegalArgumentException("Элемент не найден");
    }
}
