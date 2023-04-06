class Solution {
    public int mySqrt(int x) {
    double t;
    double squareroot = (double)x / 2;
    if(x == 0){
        return 0;
    }
    do 
    {
    t = squareroot;
    squareroot = (t + ((double)x / t)) / 2;
    }
    while ((t - squareroot) != 0);
    return (int)squareroot;
    }
    }
