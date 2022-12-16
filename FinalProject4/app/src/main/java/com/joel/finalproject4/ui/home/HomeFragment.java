package com.joel.finalproject4.ui.home;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.google.android.material.textfield.TextInputEditText;
import com.joel.finalproject4.BusDetailActivity;
import com.joel.finalproject4.MainActivity;
import com.joel.finalproject4.R;
import com.joel.finalproject4.RegistrationActivity;
import com.joel.finalproject4.ScheduleListRenew;
import com.joel.finalproject4.databinding.FragmentHomeBinding;

import java.util.Calendar;

public class HomeFragment extends Fragment {

    private FragmentHomeBinding binding;
    ArrayAdapter<String> arrayAdapter;
    String[] items={"1 Orang", "2 Orang", "3 Orang", "4 Orang"};

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        HomeViewModel homeViewModel =
                new ViewModelProvider(this).get(HomeViewModel.class);

        binding = FragmentHomeBinding.inflate(inflater, container, false);
        View root = binding.getRoot();
        Button buttonSearch = (Button) root.findViewById(R.id.btnSearch);
        AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) root.findViewById(R.id.dropdown_passanger);
        TextInputEditText editText = (TextInputEditText) root.findViewById(R.id.editDate);
        final Calendar calendar = Calendar.getInstance();
        final int year = calendar.get(Calendar.YEAR);
        final int month = calendar.get(Calendar.MONTH);
        final int day = calendar.get(Calendar.DAY_OF_MONTH);
        buttonSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getContext(), ScheduleListRenew.class));
            }
        });
        editText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DatePickerDialog dialog = new DatePickerDialog(getActivity(), new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                        month=month+1;
                        String date = day+"/"+month+"/"+year;
                        editText.setText(date);
                    }
                },year,month,day);
                dialog.show();
            }
        });

        arrayAdapter=new ArrayAdapter<String>(getContext(), R.layout.list_items,items);
        autoCompleteTextView.setAdapter(arrayAdapter);
        autoCompleteTextView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                String item= adapterView.getItemAtPosition(position).toString();
                Toast.makeText(getContext(), "Item: "+item,Toast.LENGTH_SHORT).show();

            }
        });
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}