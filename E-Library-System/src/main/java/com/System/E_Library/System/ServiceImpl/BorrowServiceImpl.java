package com.System.E_Library.System.ServiceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.System.E_Library.System.Dto.BorrowDto;
import com.System.E_Library.System.Dto.BorrowSaveDto;
import com.System.E_Library.System.Dto.BorrowUpdateDto;
import com.System.E_Library.System.Entity.Borrow;
import com.System.E_Library.System.Repo.BookRepo;
import com.System.E_Library.System.Repo.BorrowRepo;
import com.System.E_Library.System.Repo.UserRepo;
import com.System.E_Library.System.Service.BorrowService;

@Service
public class BorrowServiceImpl implements BorrowService {


    @Autowired
    private BookRepo bookRepo;

    @Autowired
    private UserRepo userRepo;

    @Autowired
    private BorrowRepo borrowRepo;


    @Override
    public String addBorrow(BorrowSaveDto borrowSaveDto) {

        Borrow borrow = new Borrow(

                bookRepo.getById(borrowSaveDto.getBookId()),
                userRepo.getById(borrowSaveDto.getUserId()),
                borrowSaveDto.getBorrowDate(),
                borrowSaveDto.getReturnDate()

        );
        borrowRepo.save(borrow);

        return null;
    }

    @Override
    public List<BorrowDto> getAllBorrow() {

        List<Borrow> getBorrow = borrowRepo.findAll();
        List<BorrowDto> borrowDtoList = new ArrayList<>();

        for(Borrow borrow : getBorrow)
        {
            BorrowDto borrowDto = new BorrowDto(
                    borrow.getId(),
                    borrow.getBook(),
                    borrow.getUser(),
                    borrow.getBorrowDate(),
                    borrow.getReturnDate()

            );
            borrowDtoList.add(borrowDto);

        }
        return borrowDtoList;


    }

    @Override
    public String updateBorrow(BorrowUpdateDto borrowUpdateDto) {

        try {


        if(borrowRepo.existsById(borrowUpdateDto.getId())) {
            Borrow borrow = borrowRepo.getById(borrowUpdateDto.getId());
            borrow.setBook(bookRepo.getById(borrowUpdateDto.getBookId()));
            borrow.setUser(userRepo.getById(borrowUpdateDto.getUserId()));
            borrow.setBorrowDate(borrowUpdateDto.getBorrowDate());
            borrow.setReturnDate(borrowUpdateDto.getReturnDate());

            borrowRepo.save(borrow);

            return "Borrow updated successfully.";

        }
        else
        {
            System.out.println("Borrow ID Not Found");
        }

        }
        catch (Exception ex)
        {
            System.out.println(ex);
        }
        return null;


    }
}
