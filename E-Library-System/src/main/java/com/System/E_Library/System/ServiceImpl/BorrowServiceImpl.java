package com.System.E_Library.System.ServiceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.System.E_Library.System.Dto.BorrowDto;
import com.System.E_Library.System.Dto.BorrowSaveDto;
import com.System.E_Library.System.Dto.BorrowUpdateDto;
import com.System.E_Library.System.Entity.Borrow;
import com.System.E_Library.System.Repo.BookRepository;
import com.System.E_Library.System.Repo.BorrowRepo;
import com.System.E_Library.System.Repo.UserRepo;
import com.System.E_Library.System.Service.BorrowService;

@Service
public class BorrowServiceImpl implements BorrowService {

    @Autowired
    private BookRepository bRepo;

    @Autowired
    private UserRepo userRepo;

    @Autowired
    private BorrowRepo borrowRepo;

    @Override
    public String addBorrow(BorrowSaveDto borrowSaveDto) {

        Borrow borrow = new Borrow(
                borrowSaveDto.getBookId(),
                borrowSaveDto.getBookTitle(),
                borrowSaveDto.getAuthorName(),
                borrowSaveDto.getPublisherName(),
                borrowSaveDto.getBorrowerName(),
                borrowSaveDto.getBorrowDate(),
                borrowSaveDto.getReturnDate(),
                borrowSaveDto.getFine()
        );
        borrowRepo.save(borrow);

        return "Borrow record added successfully.";
    }

    @Override
    public List<BorrowDto> getAllBorrow() {
        List<Borrow> getBorrow = borrowRepo.findAll();
        List<BorrowDto> borrowDtoList = new ArrayList<>();

        for (Borrow borrow : getBorrow) {
            BorrowDto borrowDto = new BorrowDto(
                    borrow.getBookId(),
                    borrow.getBookTitle(),
                    borrow.getAuthorName(),
                    borrow.getPublisherName(),
                    borrow.getBorrowerName(),
                    borrow.getBorrowDate(),
                    borrow.getReturnDate(),
                    borrow.getFine()
            );
            borrowDtoList.add(borrowDto);
        }
        return borrowDtoList;
    }
    @Override
    public String updateBorrow(BorrowUpdateDto borrowUpdateDto) {
        try {
            // Using findById() which returns an Optional
            Optional<Borrow> optionalBorrow = borrowRepo.findById(borrowUpdateDto.getBookId());

            if (optionalBorrow.isPresent()) {
                Borrow borrow = optionalBorrow.get();

                if (borrowUpdateDto.getBookTitle() != null) {
                    borrow.setBookTitle(borrowUpdateDto.getBookTitle());
                }
                if (borrowUpdateDto.getAuthorName() != null) {
                    borrow.setAuthorName(borrowUpdateDto.getAuthorName());
                }
                if (borrowUpdateDto.getPublisherName() != null) {
                    borrow.setPublisherName(borrowUpdateDto.getPublisherName());
                }
                if (borrowUpdateDto.getBorrowerName() != null) {
                    borrow.setBorrowerName(borrowUpdateDto.getBorrowerName());
                }
                if (borrowUpdateDto.getBorrowDate() != null) {
                    borrow.setBorrowDate(borrowUpdateDto.getBorrowDate());
                }
                if (borrowUpdateDto.getReturnDate() != null) {
                    borrow.setReturnDate(borrowUpdateDto.getReturnDate());
                }
                if (borrowUpdateDto.getFine() != 0) {
                    borrow.setFine(borrowUpdateDto.getFine());
                }

                borrowRepo.save(borrow);
                return "Borrow record updated successfully.";
            } else {
                return "Borrow record not found.";
            }
        } catch (Exception ex) {
            return "Error while updating borrow record: " + ex.getMessage();
        }
    }



}
