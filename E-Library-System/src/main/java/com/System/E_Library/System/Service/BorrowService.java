package com.System.E_Library.System.Service;

import java.util.List;

import com.System.E_Library.System.Dto.BorrowDto;
import com.System.E_Library.System.Dto.BorrowSaveDto;
import com.System.E_Library.System.Dto.BorrowUpdateDto;

public interface BorrowService {
    String addBorrow(BorrowSaveDto borrowSaveDto);

    List<BorrowDto> getAllBorrow();

    String updateBorrow(BorrowUpdateDto borrowUpdateDto);
}
