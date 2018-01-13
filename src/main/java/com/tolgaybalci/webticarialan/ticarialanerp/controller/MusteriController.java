package com.tolgaybalci.webticarialan.ticarialanerp.controller;

import com.tolgaybalci.webticarialan.ticarialanerp.domain.Musteri;
import com.tolgaybalci.webticarialan.ticarialanerp.repository.MusteriRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/musteriler")
public class MusteriController {

    @Autowired
    private MusteriRepository musteriRepository;

    @GetMapping("")
    public String getMusteriList(Model model){
        model.addAttribute("musteriler", musteriRepository.findAll());
        return "musteriler/musteriList";
    }

    @GetMapping("/new")
    public String getNewMusteri(Model model){
        model.addAttribute("musteri", new Musteri());
        return "musteriler/createMusteri";
    }

    @PostMapping("/new")
    public String postNewMsteri(@ModelAttribute Musteri musteri){
        musteriRepository.save(musteri);
        return "redirect:/musteriler";
    }

    @GetMapping("/{id}")
    public String showMusteriList(@PathVariable Long id, Model model){
        model.addAttribute("musteri", musteriRepository.findById(id).get());
        return "musteriler/showMusteri";
    }

    @GetMapping("/{id}/update")
    public String getUpdateMusteri(@PathVariable Long id, Model model){
        model.addAttribute("musteri", musteriRepository.findById(id).get());
        return "musteriler/updateMusteri";
    }

    @PostMapping("/{id}/update")
    public String postUpdateMusteri(@ModelAttribute Musteri musteri){
        musteriRepository.save(musteri);
        return "redirect:/musteriler";
    }
}