package space.codejun.hedwigapp.ui.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;
import space.codejun.hedwigapp.data.TestData;
import space.codejun.hedwigapp.databinding.ItemWordListBinding;

public class MessageAdapter extends RecyclerView.Adapter<MessageViewHolder> {

    Context context;
    List<TestData> list;

    public MessageAdapter(Context context, List<TestData> list) {
        this.context = context;
        this.list = list;
    }

    public void removeItem(int position) {
        list.remove(position);
        notifyItemChanged(position);
        notifyItemRangeChanged(position, list.size());
    }

    @NonNull
    @Override
    public MessageViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        ItemWordListBinding binding = ItemWordListBinding.inflate(layoutInflater, parent, false);
        return new MessageViewHolder(binding.getRoot());
    }

    @Override
    public void onBindViewHolder(@NonNull MessageViewHolder holder, int position) {
        TestData model = list.get(position);
        //
        holder.binding.title.setText(model.getTestString());
    }

    @Override
    public int getItemCount() {
        return this.list.size();
    }
}

class MessageViewHolder extends RecyclerView.ViewHolder {
    public ItemWordListBinding binding;

    public MessageViewHolder(View itemView) {
        super(itemView);
        binding = DataBindingUtil.bind(itemView);
    }
}
