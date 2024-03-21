import java.util.Objects;

public class ImageConverter {

    // 프린터기 이미지 행렬로 변환
    public String imageToMatrix(String image) {
        if(Objects.equals(image, "이미지1")) {
            return "이미지 1 matrix";
        } else if(Objects.equals(image, "이미지2")) {
            return "이미지 2 matrix";
        } else if(Objects.equals(image, "이미지3")) {
            return "이미지 3 matrix";
        }
        return "해당하는 프린터가 존재하지 않습니다.";
    }
}
