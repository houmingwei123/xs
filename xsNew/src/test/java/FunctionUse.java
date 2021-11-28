import java.math.BigDecimal;

public class FunctionUse {

    public static void main(String[] args) {
        Test1 test1 = new Test1();
        FunctionImpl function = new FunctionImpl();
        test1.function1(function);

    }

    /**
     * 业务类型
     */
    private Integer businessType;

    /**
     * 交易对信息
     */
    private String symbolCode;

    /**
     * 如果有的话，对应的老系统symbol
     */
    private String oldSymbolCode;

    /**
     * 如果有的话，对应的老系统exchangeTypeId
     */
    private Integer exchangeTypeId;

    /**
     * 最新成交价 价格
     */
    private BigDecimal price;

    /**
     * 涨跌幅
     */
    private BigDecimal change;

    /**
     * 最高价 价格
     */
    private BigDecimal high;

    /**
     * 最低价 价格
     */
    private BigDecimal low;
    /**
     *   价格
     */
    private BigDecimal kai;


    /**
     * 折合左币的成交量 数量
     */
    private BigDecimal baseVolume;

    /**
     * 折合右币的成交量 数量
     */
    private BigDecimal quoteVolume;

    /**
     * 折合usdt的成交量
     */
    private BigDecimal usdtVolume;


    /**
     * 系统时间
     */
    private Long systemTime;

    /**
     * 计价币种符号，如usdt
     */
    private String pricedSymbol;

    /**
     * 基础币种符号，如btc
     */
    private String baseSymbol;


    private Long dealPens;

    /**
     * 排序 sort越小排在前面
     */
    private Integer sortId;
    /**
     * 买一价  quotePrecision
     */
    private BigDecimal buyOne;
    /**
     * 卖一价 quotePrecision
     */
    private BigDecimal sellOne;
    // 不管
    private BigDecimal toCNY;

    private int status;
    private boolean betaShow;
    // 价格
    private BigDecimal openPrice;
    private boolean showCountDown;
    private long openTime;

    /**
     * 版本号
     */
    private long version;

}
