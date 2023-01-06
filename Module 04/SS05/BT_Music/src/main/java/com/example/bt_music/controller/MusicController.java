package com.example.bt_music.controller;

import com.example.bt_music.model.Music;
import com.example.bt_music.repository.IMusicRepository;
import com.example.bt_music.service.IMusicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MusicController {
    @Autowired
    private IMusicService musicService;

    @GetMapping("/music")
    public String getList(Model model){
        model.addAttribute("musics", musicService.findAll());
        return "/music";
    }

    @GetMapping("/create")
    public String showCreateForm(Model model){
        model.addAttribute("music", new Music());
        return "/create";
    }

    @PostMapping("/save")
    public String saveNew(Music music){
        musicService.save(music);
        return "redirect:/music";
    }

    @GetMapping("/{id}/edit")
    public String showEditForm(@PathVariable Integer id, Model model){
        Music find = musicService.findById(id);
        model.addAttribute("music", find);
        return "/edit";
    }

    @PostMapping("/update")
    public String update(Music music){
        musicService.update(music);
        return "redirect:/music";
    }

    @GetMapping("/{id}/delete")
    public String delete(@PathVariable Integer id){
        musicService.delete(id);
        return "redirect:/music";
    }
}
