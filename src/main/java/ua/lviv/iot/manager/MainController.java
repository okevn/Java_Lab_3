package ua.lviv.iot.manager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ua.lviv.iot.models.Chainsaw;
import ua.lviv.iot.models.Tools;

@RestController
@RequestMapping(path = "/root")
public class MainController {
    @Autowired
    private ChainsawRepository chainsawRepository;

    @GetMapping("/tools")
    public Iterable<Chainsaw> find() {
        return chainsawRepository.findAll();
    }

    @GetMapping("/tools/{id}")
    public Tools findById(@PathVariable Integer id) {
        return chainsawRepository.findById(id).orElseThrow();
    }

    @PostMapping("/tools")
    public Chainsaw add(@RequestBody Chainsaw newChainsaw) {
        return chainsawRepository.save(newChainsaw);
    }

    @PutMapping("/tools/{id}")
    public Chainsaw edit(@RequestBody Chainsaw newChainsaw, @PathVariable Integer id) {

        return chainsawRepository.findById(id).map(chainsaw -> {
            chainsaw.setTankVolume(newChainsaw.getTankVolume());
            chainsaw.setChainSpeed(newChainsaw.getChainSpeed());
            chainsaw.setEngineCapacity(newChainsaw.getEngineCapacity());
            chainsaw.setId(id);
            return chainsawRepository.save(chainsaw);
        }).orElseThrow();
    }

    @DeleteMapping("/tools/{id}")
    public String delete(@PathVariable Integer id) {
        chainsawRepository.deleteById(id);
        return "Delete";
    }
}
