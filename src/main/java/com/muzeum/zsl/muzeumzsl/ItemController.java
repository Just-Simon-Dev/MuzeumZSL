package com.muzeum.zsl.muzeumzsl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;

@Controller
@CrossOrigin("http://localhost:4200/")
public class ItemController {
    @Autowired private ItemRespository itemRespository;
    @Autowired private GetItemService getItemService;
    @GetMapping("/getItems/{name}")
    public @ResponseBody
    List<List<ItemEntity>> getItems(@PathVariable String name){
        return Collections.singletonList(getItemService.getItem(name));
    }
}
