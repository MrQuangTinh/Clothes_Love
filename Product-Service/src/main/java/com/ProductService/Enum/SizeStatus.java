package com.ProductService.Enum;

public enum SizeStatus {
    /** Size Xl */
    XLSize(1),

    /** Size L */
    LSize(2),

    /** Size M */
    MSize(3),

    /** Size S */
    SSize(4);

    private int value;

    private SizeStatus(int value) {
        this.value = value;
    }

    public Integer getValue() {
        return value;
    }

    public static SizeStatus fromValue(int value) {
        for (var status : SizeStatus.values()) {
            if (status.getValue() == value) {
                return status;
            }
        }
        throw new UnsupportedOperationException("The code " + value + " is not supported!");
    }
}
