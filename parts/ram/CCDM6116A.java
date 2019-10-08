package parts.ram;
import parts.*;
public class CCDM6116A extends Ram {
  public CCDM6116A() {
    super();
    name=new String("CDM6116A");
    pin=new int[41];
    memory=new byte[2048];
    }
  public int numPins() {
    return 24;
    }
  public int pinOut(int pn) {
    if ((pin[18]==0) && (pin[21]!=0))
      {
        if ((pn>=9 && pn<=11) || (pn>=13 && pn<=17)) return 129;
          else return 128;
     }
   else
      return 128;
    }
  public int run() {
    int i;
    byte j;
    if ((pin[21]!=0) && (pin[18]!=0))
      {
        pin[9]=2; pin[10]=2; pin[11]=2; pin[13]=2;
        pin[14]=2; pin[15]=2; pin[16]=2; pin[17]=2;
     }
    if ((pin[20]!=0) && (pin[21]!=0))
      {
        pin[9]=2; pin[10]=2; pin[11]=2; pin[13]=2;
        pin[14]=2; pin[15]=2; pin[16]=2; pin[17]=2;
     }
    if ((pin[21]==0) && (pin[18]==0))
      {
        if (pin[8]!=0)  i=1; else i=0;
        if (pin[7]!=0)  i+=2;
        if (pin[6]!=0)  i+=4;
        if (pin[5]!=0)  i+=8;
        if (pin[4]!=0)  i+=16;
        if (pin[3]!=0)  i+=32;
        if (pin[2]!=0)  i+=64;
        if (pin[1]!=0)  i+=128;
        if (pin[23]!=0)  i+=256;
        if (pin[22]!=0)  i+=512;
        if (pin[19]!=0)  i+=1024;
        if (pin[9]!=0)  j=1; else j=0;
        if (pin[10]!=0)  j+=2;
        if (pin[11]!=0)  j+=4;
        if (pin[13]!=0)  j+=8;
        if (pin[14]!=0)  j+=16;
        if (pin[15]!=0)  j+=32;
        if (pin[16]!=0)  j+=64;
        if (pin[17]!=0)  j+=128;
        memory[i]=j;
         }
    if ((pin[21]!=0) && (pin[18]==0) && (pin[20]==0))
      {
        if (pin[20]==0)
          {
            if (pin[8]!=0)  i=1; else i=0;
            if (pin[7]!=0)  i+=2;
            if (pin[6]!=0)  i+=4;
            if (pin[5]!=0)  i+=8;
            if (pin[4]!=0)  i+=16;
            if (pin[3]!=0)  i+=32;
            if (pin[2]!=0)  i+=64;
            if (pin[1]!=0)  i+=128;
            if (pin[23]!=0)  i+=256;
            if (pin[22]!=0)  i+=512;
            if (pin[19]!=0)  i+=1024;
            j=memory[i];
            if ((j & 1)==1)  pin[9]=1; else pin[9]=0;
            if ((j & 2)==2)  pin[10]=1; else pin[10]=0;
            if ((j & 4)==4)  pin[11]=1; else pin[11]=0;
            if ((j & 8)==8)  pin[13]=1; else pin[13]=0;
            if ((j & 16)==16)  pin[14]=1; else pin[14]=0;
            if ((j & 32)==32)  pin[15]=1; else pin[15]=0;
            if ((j & 64)==64)  pin[16]=1; else pin[16]=0;
            if ((j & 128)==128)  pin[17]=1; else pin[17]=0;
         }
     }
    return 0;
    }
  }

