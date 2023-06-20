/**
 *
 * @author Ítalo Nunes
 */
class CalcularSalario {

    Double SalarioBruto(double SalarioBruto) {
        Double fgts= 0.0;
        if(SalarioBruto <=1.500){
            fgts = SalarioBruto /100*8;
        }else if(SalarioBruto > 2.000){
            fgts = SalarioBruto /100*8;
        }else if(SalarioBruto > 800.00){
            fgts = SalarioBruto /100*2;
        }else if (SalarioBruto > 1.000){
           fgts = SalarioBruto /100*2;
        }
         return fgts;
    }

   
 
}
