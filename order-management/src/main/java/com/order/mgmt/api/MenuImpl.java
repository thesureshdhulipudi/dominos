package com.order.mgmt.api;

import com.order.mgmt.api.model.ResponseDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MenuImpl implements MenuApi{

    @Override
    public ResponseEntity<ResponseDto> getMenu() {
        return null;
    }

    @Override
    public ResponseEntity<ResponseDto> getMenu1(Integer menuId) {
        return null;
    }
}
