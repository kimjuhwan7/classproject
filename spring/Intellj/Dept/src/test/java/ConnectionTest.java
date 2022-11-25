import com.app.manager.domain.DeptDTO;
import com.app.manager.domain.DeptSerachOption;
import com.app.manager.mapper.DeptMapper;
import com.app.manager.mapper.TimeMapper;
import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Log4j2
@ExtendWith(SpringExtension.class)
@ContextConfiguration(locations = "file:src/main/webapp/WEB-INF/spring/root-context.xml")
public class ConnectionTest {

    @Autowired
    private DataSource dataSource;

    @Autowired(required = false)
    private TimeMapper timeMapper;

    @Test
    public void getTimeTest() {
        log.info(timeMapper.getTime());
    }

    @Autowired(required = false)
    private DeptMapper deptMapper;

    @Test
    public void getDeptListTest() {
        log.info("List >>>>>>" + deptMapper.selectAll());
    }

    @Test
    public void getDeptByTest() {
        log.info("부분검색 DEPT >>>>>>" + deptMapper.selectBydeptno(10));
    }


    @Test
    public void getDeptinsetTest() {
        DeptDTO deptDTO = new DeptDTO(30, "te1st", "NEW");
        log.info("입력 DEPT >>>>>>" + deptMapper.insertDept(deptDTO));
    }

    @Test
    public void getDeptupdateTest() {
        DeptDTO deptDTO = new DeptDTO(50, "DEv", "testLoc");
        log.info("수정 DEPT >>>>>>" + deptMapper.updateDept(deptDTO));
    }

    @Test
    public void getDeptdeleteTest() {
//        DeptDTO deptDTO = new DeptDTO();
        log.info("삭제 DEPT >>>>>>" + deptMapper.deleteByDeptno(50));
    }


    @Test
    public void connectionTest() throws SQLException {
        Connection connection = dataSource.getConnection();

        log.info(connection);

        Assertions.assertNotNull(connection);

        connection.close();

    }


    @Test
    public void deptSelectByDeptnosTest() {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(30);
        list.add(50);
        log.info(">>>>>>>>>>> In  연산 테스트" + deptMapper.selectByDeptnos(list));
    }

    @Test
    public void deptSelectByOptionTest() {
        log.info(deptMapper.selectByOption(DeptSerachOption.builder()
                .searchType("loc").keyword("NEW")
                .build()));
    }

}