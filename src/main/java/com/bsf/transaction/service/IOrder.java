package com.bsf.transaction.service;

import com.bsf.transaction.exception.CheckedExceptionForTest;

public interface IOrder {
    void add() throws CheckedExceptionForTest;
}
