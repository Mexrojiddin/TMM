package uz.mexboy.TMM.ui.mundarija;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;
;
import uz.mexboy.TMM.MainActivity;
import uz.mexboy.TMM.R;
import uz.mexboy.TMM.adapter.MundarijaAdapter;
import uz.mexboy.TMM.model.MundarijaModel;
import uz.mexboy.TMM.ui.home.HomeFragment;

public class MundarijaFragment extends Fragment implements MundarijaAdapter.ItemClickListener {
    private Context mContext;
    private View root;
    private List<MundarijaModel> data;

    private RecyclerView recyclerView;

    private MundarijaAdapter mundarijaAdapter;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        root = inflater.inflate(R.layout.fragment_mundarija, container, false);

        init();
        return root;
    }

    private void init() {
        data = new ArrayList<>();
        data.add(new MundarijaModel("Bosh sahifa", 0));
        data.add(new MundarijaModel("So’z boshi", 2));
        data.add(new MundarijaModel("Kirish. Tutash muhitlar mehanikasi predmeti. Tutash muhit tushunchasi", 3));
        data.add(new MundarijaModel("Miqdorlarni indeksli belgilash", 7));
        data.add(new MundarijaModel("Tog’ri burchakli Dekart koordinatalar sistemasi", 9));
        data.add(new MundarijaModel("Egri chiziqli koordinatalar sistemasi", 10));
        data.add(new MundarijaModel("Kovariant koordinata bazislari", 11));
        data.add(new MundarijaModel("Kontravariant koordinata bazislari", 14));
        data.add(new MundarijaModel("Indekslarni ko’tarish va tushurish amallari", 16));
        data.add(new MundarijaModel("Koordinata bazisi elementlari ustida amallar", 19));
        data.add(new MundarijaModel("Ortoganal egri chiziqli koordinatalar sistemasi", 20));
        data.add(new MundarijaModel("Silindrik koordinatalar sistemasi", 23));
        data.add(new MundarijaModel("Sferik koordinatalar sistemasi", 24));
        data.add(new MundarijaModel("Koordinatalarni almashtirish", 25));
        data.add(new MundarijaModel("Skalyar va vektor miqdorlar", 26));
        data.add(new MundarijaModel("Masalalar yechish uchun namuna", 28));
        data.add(new MundarijaModel("I bobga doir masalalar", 30));
        data.add(new MundarijaModel("Tenzor", 36));
        data.add(new MundarijaModel("Tenzorlar ustida amallar", 39));
        data.add(new MundarijaModel("Simmetrik va antisimmetrik tenzorlar", 44));
        data.add(new MundarijaModel("Tenzorlarni bo’lish teoremasi", 47));
        data.add(new MundarijaModel("Metrik va diskriminant tenzorlar", 48));
        data.add(new MundarijaModel("Levi-Chivita tenzori", 54));
        data.add(new MundarijaModel("Ikkinchi rang tenzorlar va matritsalar", 55));
        data.add(new MundarijaModel("Shar va deviator tenzori", 58));
        data.add(new MundarijaModel("Ikkinchi rang tenzorning bosh yo’nalishlari. Xarakteristik tenglama", 59));
        data.add(new MundarijaModel("Tenzorning xos vektorlari", 61));
        data.add(new MundarijaModel("Tenzorning bosh qiymatlari va kanonik ko’rinishi", 62));
        data.add(new MundarijaModel("Tenzorning asosiy invariantlari", 63));
        data.add(new MundarijaModel("Bazis vektorni koordinatalar bo’yicha differensiallash. Kristofell belgilari va ularning xossalari", 64));
        data.add(new MundarijaModel("Skalyar, vektor va ikkinchi rang tenzorni koordinatalar bo’yicha differensiallash", 69));
        data.add(new MundarijaModel("Masalalar yechish uchun namuna", 81));
        data.add(new MundarijaModel("II bobga doir masalalar", 84));
        data.add(new MundarijaModel("Tutash muhitlar mehanikasining asosiy farazlari", 89));
        data.add(new MundarijaModel("Hamroh koordinata sistemasi", 92));
        data.add(new MundarijaModel("Muhitning harakat tenglamasi. Tutash muhit harakatini tavsiflashning Lagranj va Eyler sullari", 94));
        data.add(new MundarijaModel("Lagranj va Eyler koordinatalariga o’zaro o’tish", 98));
        data.add(new MundarijaModel("Skalyar va vektor maydonlar va ularning ayrim hossalari", 101));
        data.add(new MundarijaModel("Masalalar yechish uchun namuna", 104));
        data.add(new MundarijaModel("III bobga doir masalalar", 105));
        data.add(new MundarijaModel("Uzayish va siljish", 111));
        data.add(new MundarijaModel("Deformatsiya tenzori, uning bosh o’qlari va bosh qiymatlari", 115));
        data.add(new MundarijaModel("D eformatsiya tenzor sirti. Invariantlar", 117));
        data.add(new MundarijaModel("Deformasiya tenzori komponentalarini ko’chish orqali ifodalash", 121));
        data.add(new MundarijaModel("Grin va Al’mansi tenzorlari", 122));
        data.add(new MundarijaModel("Fazoning yevklidlilik sharti. Riman-Kristofell tenzori. Deformasiya-ning birgalikdagi tenglamalari", 122));
        data.add(new MundarijaModel("Masalalar yechish uchun namuna", 125));
        data.add(new MundarijaModel("IV bobga doir masalalar", 126));
        data.add(new MundarijaModel("Glossariy", 131));
        data.add(new MundarijaModel("Foydalanilgan adabiyotlar", 140));


        recyclerView = root.findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(mContext));

        mundarijaAdapter = new MundarijaAdapter(mContext, data);
        mundarijaAdapter.setClickListener(this);
        recyclerView.setAdapter(mundarijaAdapter);

    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        mContext = context;
    }

    @Override
    public void onItemClick(View view, int position) {
        MainActivity.defaultPage = data.get(position).getPage();

        MainActivity.toolbar.setTitle("Bosh sahifa");
        getActivity().getSupportFragmentManager().beginTransaction().
                replace(R.id.nav_host_fragment,
                        new HomeFragment())

                .commit();

        getActivity().getSupportFragmentManager().popBackStackImmediate();

        MainActivity.navPage = R.id.nav_home;


    }
}