package com.agauchat.android.hackerrank.ui

import androidx.recyclerview.widget.RecyclerView
import androidx.viewbinding.ViewBinding
import com.agauchat.android.hackerrank.databinding.BookCardBinding
import com.agauchat.android.hackerrank.databinding.SectionTitleBinding
import com.agauchat.android.hackerrank.ui.utils.load

sealed class BookRecyclerViewHolder(binding: ViewBinding) : RecyclerView.ViewHolder(binding.root) {

    class SectionTitleViewHolder(private val binding: SectionTitleBinding) : BookRecyclerViewHolder(binding) {
        fun bind(sectionTitle: BookRecyclerViewItem.SectionTitle) {
            binding.sectionTitleName.text = sectionTitle.title
        }
    }

    class BookCardViewHolder(private val binding: BookCardBinding) : BookRecyclerViewHolder(binding) {
        fun bind(bookCard: BookRecyclerViewItem.BookCard) {
            with(binding) {
                bookTitle.text = bookCard.title
                bookAuthor.text = bookCard.author
                bookImage.load(bookCard.img)
            }
        }
    }
}