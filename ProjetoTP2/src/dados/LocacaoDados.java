/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dados;


import classes.Locacao;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author maria
 */
public class LocacaoDados {
    public static List<Locacao> lstLocacao = new ArrayList();
    
    public static Locacao buscarLocacaoExata(String busca, List<Locacao> lstLocacao){
        
        for (Locacao loc : lstLocacao){
            if(loc.getCodigo()==(Integer.parseInt(busca))){
                return loc;
            }
        }
        return null;
    }
    
    public static List<Locacao> buscarLocacaoParcial(String busca, List<Locacao> lstLocacao, boolean caseSensitive){
        List<Locacao> locsTemp = new ArrayList();

        busca = busca.replace(".", "").replace("-", "").replace("/", "").replace(" ", "");
        
        for(Locacao loc : lstLocacao){
            
            String l = loc.getCliente().getCPFcnpj().replace(".", "").replace("-", "").replace("/", "").replace(" ", "");
            String c = loc.getCarro().getPlaca().replace("-", "").replace(" ", "");
            
            if(caseSensitive){
                
                if(l.contains(busca) || c.contains(busca)){
                    
                    locsTemp.add(loc);
                }
            } else{
                               
                if(l.toLowerCase().contains(busca.toLowerCase()) || c.toLowerCase().contains(busca.toLowerCase())){
                    
                    locsTemp.add(loc); 
                }
            }
        }   
        return locsTemp;
    }
    
    public static List<Locacao> buscarLocacaoData(String inicio, String fim, List<Locacao> lstLocacao) throws ParseException{
        List<Locacao> datas = new ArrayList();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        int iniAno = (sdf.parse(inicio).getYear()) * 365;
        int iniMes = (sdf.parse(inicio).getMonth()) * 30;
        int iniDia = (sdf.parse(inicio).getDate());
        
        int diasIni = iniAno + iniMes + iniDia;
        
        int endAno = (sdf.parse(fim).getYear()) * 365;
        int endMes = (sdf.parse(fim).getMonth()) * 30;
        int endDia = (sdf.parse(fim).getDate());
        
        int diasEnd = endAno + endMes + endDia;
        
        for(Locacao loc : lstLocacao){
            
            int dataAno = (loc.getDtLocacao().getYear()) * 365;
            int dataMes = (loc.getDtLocacao().getMonth()) * 30;
            int dataDia = (loc.getDtLocacao().getDate());
            
            int diasData = dataAno + dataMes + dataDia;
           
            if(diasIni <= diasData && diasData <= diasEnd){
                datas.add(loc);
            }
        }
        return datas;
    }
}
