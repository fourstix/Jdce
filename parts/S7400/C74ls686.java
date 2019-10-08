package parts.S7400;
import parts.*;
public class C74ls686 extends Ic {
  public C74ls686() {
    super();
    name=new String("74LS686");
    pin=new int[41];
    }
  public int numPins() {
    return 24;
    }
  public int pinOut(int pn) {
    if (pn==1 || pn==22) return 1; else return 0;
    }
  public int run() {
    int p,q;
    if (pin[3]!=0)  p=1; else p=0;
    if (pin[5]!=0)  p+=2;
    if (pin[8]!=0)  p+=4;
    if (pin[10]!=0)  p+=8;
    if (pin[13]!=0)  p+=16;
    if (pin[15]!=0)  p+=32;
    if (pin[17]!=0)  p+=64;
    if (pin[20]!=0)  p+=128;
    if (pin[4]!=0)  q=1; else q=0;
    if (pin[6]!=0)  q+=2;
    if (pin[9]!=0)  q+=4;
    if (pin[11]!=0)  q+=8;
    if (pin[14]!=0)  q+=16;
    if (pin[16]!=0)  q+=32;
    if (pin[18]!=0)  q+=64;
    if (pin[21]!=0)  q+=128;
    if (p==q)  pin[22]=0; else pin[22]=1;
    if (p>q)  pin[1]=0; else pin[1]=1;
    if (pin[2]!=0)  pin[22]=1;
    if (pin[23]!=0)  pin[1]=1;
    return 0;
    }
  }

