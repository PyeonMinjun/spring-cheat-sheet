package com.example.springcheatsheet.service;


import com.example.springcheatsheet.domain.Memo;
import com.example.springcheatsheet.dto.response.MemoResponseDto;
import org.springframework.stereotype.Service;

@Service
public class MemoServiceImpl implements MemoService{


    @Override
    public MemoResponseDto getMemo() {
        MemoResponseDto memoResponseDto = new MemoResponseDto("1", "오늘의 할일", "사용자1", "오늘", "보통");
        return memoResponseDto;
    }
}
