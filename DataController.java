import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/data")
public class DataController {

    @Autowired
    private ApiService apiService;

    @GetMapping
    public List<DataModel> getAllData() {
        return apiService.getAllData();
    }

    @GetMapping("/{id}")
    public DataModel getDataById(@PathVariable Long id) {
        return apiService.getDataById(id);
    }

    @PostMapping
    public DataModel createData(@RequestBody DataModel dataModel) {
        return apiService.createData(dataModel);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Void> updateData(@PathVariable Long id, @RequestBody DataModel dataModel) {
        apiService.updateData(id, dataModel);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteData(@PathVariable Long id) {
        apiService.deleteData(id);
        return ResponseEntity.ok().build();
    }
}
