package com.lizi.year2022.month2.day0225;

import java.util.Objects;

/**
 * @author lizi
 * @description TODO
 * @date 2022/2/25 09:09
 **/
public class OneTopic0225 {
    public static void main(String[] args) {
        complexNumberMultiply("-19+-54i", "-87+9i");
    }
    public static String complexNumberMultiply(String num1, String num2) {
        int a = 0, b = 0, c = 0, d = 0;
        num1 = num1.replace("+-","-");
        num2 = num2.replace("+-","-");
        if(num1.contains("-")){
            String[] split1 = num1.split("-");
            if(split1.length > 2){
                a = (-1) * Integer.parseInt(split1[1]);
                b = (-1) * Integer.parseInt(split1[2].replace("i", ""));
            }else{
                if(Objects.equals(split1[0], "")){
                    String[] split2 = split1[1].split("\\+");
                    a = (-1) * Integer.parseInt(split2[0]);
                    b = Integer.parseInt(split2[1].replace("i", ""));
                }else{
                    a = Integer.parseInt(split1[0]);
                    b = (-1) * Integer.parseInt(split1[1].replace("i", ""));
                }
            }
        }else{
            String[] split1 = num1.split("\\+");
            a = Integer.parseInt(split1[0]);
            b = Integer.parseInt(split1[1].replace("i", ""));
        }

        if(num2.contains("-")){
            String[] split1 = num2.split("-");
            if(split1.length > 2){
                c = (-1) * Integer.parseInt(split1[1]);
                d = (-1) * Integer.parseInt(split1[2].replace("i", ""));
            }else{
                if(Objects.equals(split1[0], "")){
                    String[] split2 = split1[1].split("\\+");
                    c = (-1) * Integer.parseInt(split2[0]);
                    d = Integer.parseInt(split2[1].replace("i", ""));
                }else{
                    c = Integer.parseInt(split1[0]);
                    d = (-1) * Integer.parseInt(split1[1].replace("i", ""));
                }
            }
        }else{
            String[] split1 = num2.split("\\+");
            c = Integer.parseInt(split1[0]);
            d = Integer.parseInt(split1[1].replace("i", ""));
        }

        return (a*c - b*d) + "+" + (b*c + a*d) + "i";
    }
}
