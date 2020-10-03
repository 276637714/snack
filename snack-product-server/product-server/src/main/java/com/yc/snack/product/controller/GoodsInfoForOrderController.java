package com.yc.snack.product.controller;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.yc.snack.product.dto.ProductTypeInfoDTO;

@RestController
@RequestMapping("/product")
public class GoodsInfoForOrderController {
	@PostMapping("/listForGno")
	public List<ProductTypeInfoDTO> listForGno(@RequestParam List<String> gnos){
		return Collections.emptyList();
	}
}
