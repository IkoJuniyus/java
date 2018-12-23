/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;
//polymorphism with abstract method
abstract class textkonsul {
    public void textdata(){}

}
class text extends textkonsul{

    static String textdata = "\nMy House is My Happy";

    @Override
    public void textdata() {
    text.textdata = textdata;
    }
    public String gettextdata(){
    return textdata;
    }
    public static void main(String[] args) {
        text abc = new text();
        abc.textdata();
    }
}
    