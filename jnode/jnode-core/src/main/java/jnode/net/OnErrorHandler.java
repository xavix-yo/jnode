/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jnode.net;

/**
 *
 * @author daniele
 */
@FunctionalInterface
public interface OnErrorHandler {
    void onError(Exception e);
}