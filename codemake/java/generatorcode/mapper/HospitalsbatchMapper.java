package generatorcode.mapper;

import generatorcode.pojo.Hospitalsbatch;
import java.util.List;

public interface HospitalsbatchMapper {
    int insert(Hospitalsbatch record);

    List<Hospitalsbatch> selectAll();
}