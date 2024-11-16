package com.varc.brewnetapp.domain.purchase.query.mapper;

import com.varc.brewnetapp.domain.purchase.common.SearchPurchaseCriteria;
import com.varc.brewnetapp.domain.purchase.query.dto.LetterOfPurchaseDTO;
import com.varc.brewnetapp.domain.purchase.query.dto.LetterOfPurchaseDetailDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PurchaseMapper {

    List<LetterOfPurchaseDTO> searchLettersOfPurchase(SearchPurchaseCriteria criteria);

    int getTotalPurchaseCount(SearchPurchaseCriteria criteria);

    LetterOfPurchaseDetailDTO selectLetterOfPurchaseByPurchaseCode(int letterOfPurchaseCode);
}
