package com.ProductService.Enum;

import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;

@Converter(autoApply = true)
public class SizeStatusConverter implements AttributeConverter<SizeStatus, Integer> {

    public Integer convertToDatabaseColumn(SizeStatus enumSize) {
        if (enumSize == null){
            return null;
        }
        return enumSize.getValue();
    }

    public SizeStatus convertToEntityAttribute(Integer value) {
        if (value == null) {
            return null;
        }
        return SizeStatus.fromValue(value);
    }
}
/**
*  Dùng @Converter: Sẽ tự động chuyển đổi
 *
 *  Tức ở trên FE chuyền xuống là type: Interger,
 *      => Lưu vào DB sẽ là Integer
 *
 *  Từ BE: response: sẽ là type String: XLSize, LSize, MSize
* */
