package cominnova.Bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;
@Data
@NoArgsConstructor
@AllArgsConstructor
class Bean_lombok implements Serializable {
    // nesne değişkenleri(object variable)
    // global değişkenler
    private int studentid;
    private String studentName;
    private String studentSurname;
    private Date createdDate;
}


