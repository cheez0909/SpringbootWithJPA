package com.exercise.first.ex02.service;


import com.exercise.first.ex02.Item;
import com.exercise.first.ex02.repository.ItemRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class ItemService {
    private final ItemRepository itemRepository;

    @Transactional
    public void save(Item item){
        itemRepository.save(item);
    }

    // Dirty checking
    @Transactional
    public void updateItem(Long id, String name, int price, int stock){
        Item one = itemRepository.findOne(id);
        one.update(name, price, stock);
    }

    public Item findOne(Long id){
        return itemRepository.findOne(id);
    }

    public List<Item> findAll(){
        return itemRepository.findAll();
    }
}
