import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@Service
public class ApiService {

    @Autowired
    private RestTemplate restTemplate;

    private static final String BASE_URL = "https://api.example.com/data";

    public List<DataModel> getAllData() {
        DataModel[] data = restTemplate.getForObject(BASE_URL, DataModel[].class);
        return Arrays.asList(data);
    }

    public DataModel getDataById(Long id) {
        return restTemplate.getForObject(BASE_URL + "/" + id, DataModel.class);
    }

    public DataModel createData(DataModel dataModel) {
        return restTemplate.postForObject(BASE_URL, dataModel, DataModel.class);
    }

    public void updateData(Long id, DataModel dataModel) {
        restTemplate.put(BASE_URL + "/" + id, dataModel);
    }

    public void deleteData(Long id) {
        restTemplate.delete(BASE_URL + "/" + id);
    }
}
