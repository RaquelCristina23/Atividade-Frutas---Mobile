package br.ifsc.edu.listagemfrutas;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class FrutasAdapter extends ArrayAdapter<Fruta> {
    private final Context context;
    private final ArrayList<Fruta> itens;

    public FrutasAdapter(Context context, int activity_list_view, ArrayList<Fruta> itens) {
        super(context, R.layout.activity_fruta, itens);
        this.context = context;
        this.itens = itens;
    }


    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(R.layout.activity_list_view, null, true);

        TextView codigo = (TextView) rowView.findViewById(R.id.txtCodigo);
        TextView nomeFruta = (TextView) rowView.findViewById(R.id.txtNomeDaFruta);
        TextView preco = (TextView) rowView.findViewById(R.id.txtPreco);
        TextView venda = (TextView) rowView.findViewById(R.id.txtPreçoVenda);
        TextView fixo1 = (TextView) rowView.findViewById(R.id.txtPreçoVendaFixo);
        TextView fixo2 = (TextView) rowView.findViewById(R.id.txtPrecoFixo);
        ImageView imgfruta = (ImageView) rowView.findViewById(R.id.imageView);

        codigo.setText(itens.get(position).getCodigo());
        nomeFruta.setText(itens.get(position).getNome());

        preco.setText(itens.get(position).getPreco().toString());
        venda.setText(itens.get(position).getPreco_venda().toString());

        imgfruta.setImageResource(itens.get(position).getImagem());

        fixo1.setText("Preço de venda:");
        fixo2.setText("Preço:");
        return rowView;
    }
}
