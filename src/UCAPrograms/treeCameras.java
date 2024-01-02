package UCAPrograms;

public class treeCameras {
    public enum CameraStatus{
        I_NEED_THE_CAMERA,
        I_AM_THE_CAMERA,
        I_HAVE_THE_COVERAGE;
    }
    public int minCameraCover(TreeNode root) {
        int[] camerasRequired = new int[1];
        return getCameraStatus(root,camerasRequired) == CameraStatus.I_NEED_THE_CAMERA ? camerasRequired[0] + 1 : camerasRequired[0];
    }
    public CameraStatus getCameraStatus(TreeNode root, int[] camerasRequired){
        if(root == null){
            return CameraStatus.I_HAVE_THE_COVERAGE;
        }
        if(root.left == null && root.right == null){
            return CameraStatus.I_NEED_THE_CAMERA;
        }
        CameraStatus leftStatus = getCameraStatus(root.left,camerasRequired);
        CameraStatus rightStatus = getCameraStatus(root.right,camerasRequired);

        if(leftStatus == CameraStatus.I_NEED_THE_CAMERA || rightStatus == CameraStatus.I_NEED_THE_CAMERA){
            camerasRequired[0]++;
            return CameraStatus.I_AM_THE_CAMERA;
        }
        if(leftStatus == CameraStatus.I_AM_THE_CAMERA || rightStatus == CameraStatus.I_AM_THE_CAMERA){
            return CameraStatus.I_HAVE_THE_COVERAGE;
        }
        return CameraStatus.I_NEED_THE_CAMERA;
    }
}
