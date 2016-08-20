package com.intertech.lab1;

import java.util.concurrent.Future;

/**
 * Created by jayson on 8/20/16.
 */
public interface PigLatinService {
    Future<String> translate(String english);
}
