package parts.S7400;
import parts.*;
public class C74ls169 extends Ic {
  public C74ls169() {
    super();
    name=new String("74LS169");
    pin=new int[41];
    }
  public int numPins() {
    return 16;
    }
  public int pinOut(int pn) {
    if (pn>=11 && pn<=15) return 1; else return 0;
    }
  public int run() {
    if ((pin[9]==0) && (pin[2]!=0) && (pin[21]==0))
      {
        if (pin[3]!=0)  pin[20]=1; else pin[20]=0;
        if (pin[4]!=0)  pin[20]+=2;
        if (pin[5]!=0)  pin[20]+=4;
        if (pin[6]!=0)  pin[20]+=8;
     }
    if ((pin[2]!=0) && (pin[21]==0) && (pin[9]!=0) && (pin[1]!=0) &&
       (pin[10]==0) && (pin[7]==0))
      {
        pin[20]++;
        if (pin[20]==16)  pin[20]=0;
     }
    if ((pin[2]!=0) && (pin[21]==0) && (pin[9]!=0) && (pin[1]==0) &&
       (pin[10]==0) && (pin[7]==0))
      {
        if (pin[20]>0)  pin[20]--; else pin[20]=15;
     }
    if ((pin[20] & 1)==1)  pin[14]=1; else pin[14]=0;
    if ((pin[20] & 2)==2)  pin[13]=1; else pin[13]=0;
    if ((pin[20] & 4)==4)  pin[12]=1; else pin[12]=0;
    if ((pin[20] & 8)==8)  pin[11]=1; else pin[11]=0;
    pin[15]=1;
    if ((pin[10]==0) && (pin[1]!=0) && (pin[20]==15))
      pin[15]=0;
    if ((pin[10]==0) && (pin[1]==0) && (pin[20]==0))
      pin[15]=0;
    pin[21]=pin[2];
    return 0;
    }
  }

