/**
 * Created by istrakhouski on 2/11/14.
 */
Ext.define('Farm.model.Cheque', {
    extend: 'Ext.data.Model',
    fields: [
        'chequeId',
        'createDate',
        'closeDate',
        'summ',
        'cashier.firstName'
    ]
});