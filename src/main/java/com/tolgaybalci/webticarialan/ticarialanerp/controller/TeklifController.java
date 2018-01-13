package com.tolgaybalci.webticarialan.ticarialanerp.controller;

import com.tolgaybalci.webticarialan.ticarialanerp.domain.Musteri;
import com.tolgaybalci.webticarialan.ticarialanerp.domain.Teklifler;
import com.tolgaybalci.webticarialan.ticarialanerp.repository.MusteriRepository;
import com.tolgaybalci.webticarialan.ticarialanerp.repository.TekliflerRepository;
import org.springframework.stereotype.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Controller
@RequestMapping("/teklifler")
public class TeklifController {

    @Valid
    @Autowired
    private TekliflerRepository teklifRepository;

    @GetMapping("")
    public String getTekliflerList(Model model){
        model.addAttribute("teklifler", teklifRepository.findAll());
        return "teklifler/tekliflerList";
    }

    @GetMapping("/new")
    public String getNewTeklifler(Model model){
        model.addAttribute("teklif", new Teklifler());
        return "teklifler/createTeklifler";
    }

    @PostMapping("/new")
    public String postNewMsteri(@ModelAttribute Teklifler teklifler, BindingResult bindingResult){
        teklifRepository.save(teklifler);
        return "redirect:/teklifler";
    }

    @GetMapping("/{id}")
    public String showTeklifList(@PathVariable Long id, Model model){
        model.addAttribute("teklif", teklifRepository.findById(id).get());
        return "teklifler/showTeklifler";
    }

    @GetMapping("/{id}/update")
    public String getUpdateTeklif(@PathVariable Long id, Model model){
        model.addAttribute("teklif", teklifRepository.findById(id).get());
        return "teklifler/updateTeklifler";
    }

    @PostMapping("/{id}/update")
    public String postUpdateMusteri(@ModelAttribute Teklifler teklif){
        teklifRepository.save(teklif);
        return "redirect:/teklifler";
    }
}
