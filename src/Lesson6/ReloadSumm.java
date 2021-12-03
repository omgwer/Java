package Lesson6;

public class ReloadSumm
{
    double ch1;
    double ch2;
    double ch3;
    double ch4;

    double returnSumm()
    {
        return this.returnSumm(0.0, 0.0, 0.0, 0.0);
    }

    double returnSumm(double c1)
    {
        return this.returnSumm(c1, 0.0, 0.0, 0.0);
    }

    double returnSumm(double c1, double c2)
    {
        return this.returnSumm(c1, c2, 0.0, 0.0);
    }

    double returnSumm(double c1, double c2, double c3)
    {
        return this.returnSumm(c1, c2, c3, 0.0);
    }

    double returnSumm(double c1, double c2, double c3, double c4)
    {
        return c1 + c2 + c3 + c4;
    }
}

class SumResult
{
    public static void main(String[] args)
    {
        ReloadSumm sm1 = new ReloadSumm();
        System.out.println(sm1.returnSumm(2.33, 3.41, 45,23));
    }
}
