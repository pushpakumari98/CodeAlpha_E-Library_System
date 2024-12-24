package com.System.E_Library.System.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.System.E_Library.System.Dto.BorrowDto;
import com.System.E_Library.System.Dto.BorrowSaveDto;
import com.System.E_Library.System.Dto.BorrowUpdateDto;
import com.System.E_Library.System.Service.BorrowService;

@RestController
@CrossOrigin
@RequestMapping("api/v1/borrow")
public class BorrowController {


    @Autowired
    private BorrowService borrowService;

    @PostMapping(path = "/save")
    public String saveBorrow(@RequestBody BorrowSaveDto borrowSaveDto)
    {
        String borrowBooks = borrowService.addBorrow(borrowSaveDto);
        return  "Borrowed Successfully";
    }

    @GetMapping(path = "/getAllBorrow")
    public List<BorrowDto> getAllBorrow()
    {
        List<BorrowDto> allborrow = borrowService.getAllBorrow();
        return allborrow;
    }

    @PutMapping(path = "/update")
    public String updateBorrow(@RequestBody BorrowUpdateDto borrowUpdateDto)
    {
        String borrow = borrowService.updateBorrow(borrowUpdateDto);
        return  "Updated";
    }

   

}
