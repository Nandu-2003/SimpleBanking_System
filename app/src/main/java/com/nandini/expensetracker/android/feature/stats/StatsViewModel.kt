package com.nandini.expensetracker.android.feature.stats

import androidx.lifecycle.ViewModel
import com.nandini.expensetracker.android.base.BaseViewModel
import com.nandini.expensetracker.android.base.UiEvent
import com.nandini.expensetracker.android.utils.Utils
import com.nandini.expensetracker.android.data.dao.ExpenseDao
import com.nandini.expensetracker.android.data.model.ExpenseSummary
import com.github.mikephil.charting.data.Entry
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class StatsViewModel @Inject constructor(val dao: ExpenseDao) : BaseViewModel() {
    val entries = dao.getAllExpenseByDate()
    val topEntries = dao.getTopExpenses()
    fun getEntriesForChart(entries: List<ExpenseSummary>): List<Entry> {
        val list = mutableListOf<Entry>()
        for (entry in entries) {
            val formattedDate = Utils.getMillisFromDate(entry.date)
            list.add(Entry(formattedDate.toFloat(), entry.total_amount.toFloat()))
        }
        return list
    }

    override fun onEvent(event: UiEvent) {
    }
}

