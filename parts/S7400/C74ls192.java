package parts.S7400;
import parts.*;
public class C74ls192 extends Ic {
  public C74ls192() {
    super();
    name=new String("74LS192");
    pin=new int[41];
    }
  public int numPins() {
    return 16;
    }
  public int pinOut(int pn) {
    if (pn==2 || pn==3 || pn==6 || pn==7 || pn==13 || pn==12)
      return 1; else return 0;
    }
  public int run() {
    byte i;
    int max=9;
    if (pin[14]!=0) 
      {
        pin[20]=0;
     }
    if ((pin[14]==0) && (pin[11]==0)) 
      {
        if (pin[15]!=0)  i=1; else i=0;
        if (pin[1]!=0)  i+=2;
        if (pin[10]!=0)  i+=4;
        if (pin[9]!=0)  i+=8;
        pin[20]=i;
     }
    if ((pin[14]==0) && (pin[11]!=0)) 
      {
        if ((pin[5]!=0) && (pin[21]==0)) 
          {
            pin[13]=1; pin[12]=1;
            pin[20]++;
            if (pin[20]>max) 
              {
                pin[20]=0;
              }
         }
        if ((pin[4]!=0) && (pin[22]==0)) 
          {
            pin[13]=1; pin[12]=1;
            if (pin[20]>0) 
              pin[20]--;
            else
              {
                pin[20]=max;
             }
         }
     }
    pin[21]=pin[5];
    pin[22]=pin[4];
    if ((pin[20] & 8)==8)  pin[7]=1; else pin[7]=0;
    if ((pin[20] & 4)==4)  pin[6]=1; else pin[6]=0;
    if ((pin[20] & 2)==2)  pin[2]=1; else pin[2]=0;
    if ((pin[20] & 1)==1)  pin[3]=1; else pin[3]=0;
    if ((pin[5]!=0) && (pin[20]==max))  pin[12]=0;
    if ((pin[4]!=0) && (pin[20]==0))  pin[13]=0;
    if ((pin[20]!=0) && (pin[13]!=1))  pin[13]=1;
    if ((pin[20]!=max) && (pin[12]!=1))  pin[12]=1;
    if ((pin[20]!=max) && (pin[20]!=0)) 
      {
        pin[13]=1;
        pin[12]=1;
     }
    return 0;
    }
  }

