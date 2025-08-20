package java_advanced_01.boardProjV2;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Board {
    private int bno;
    private String title;
    private String content;
    private String writer;
    private Date date;
}
