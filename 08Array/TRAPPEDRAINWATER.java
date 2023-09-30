public class TRAPPEDRAINWATER {

    public static int TRAPPEDRAINWATER(int height[]){
        //calculate left max boundary - array
        int n = height.length;
        int LeftMax[] = new int[height.length];
        LeftMax[0] = height[0];
        for(int i=1; i<height.length; i++){
            LeftMax[i] = Math.max(height[i], LeftMax[i-1]);
        }
        // calculate right max boundary - array
        int RightMax[] = new int[height.length];
        RightMax[height.length-1] = height[height.length-1];
        for(int i=n-2; i>=0; i--){
            RightMax[i] = Math.max(height[i], RightMax[i+1]);
        }

        int TRAPPEDRAINWATER = 0;
        //loop
        for(int i=0; i<n; i++){
            //waterLevel=min(leftmax boun - rightmax boun)
            int waterLevel = Math.min(LeftMax[i], RightMax[i]);
            //trapped water = waterLevel - height[i]
            TRAPPEDRAINWATER += waterLevel - height[i];
        }
        
        
            return TRAPPEDRAINWATER;
    }

    public static void main(String args[]){
        int height[] = {4,2,0,6,3,2,5};
        System.out.println(TRAPPEDRAINWATER(height));
    }
}
