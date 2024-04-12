import java.util.Objects;

public class ImageConverter {

    // 프린터기 이미지 행렬로 변환
    public String imageToMatrix(String image) {
        if(Objects.equals(image, "이미지1")) {
            return "3029C004AA";
        }
        if(Objects.equals(image, "이미지2")) {
            return "3029C005AA";
        }
        return "해당하는 프린터가 존재하지 않습니다.";
    }
}
