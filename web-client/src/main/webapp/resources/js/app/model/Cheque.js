/**
 * Created by istrakhouski on 2/11/14.
 */
Ext.define('Farm.model.Cheque', {
    extend: 'Ext.data.Model',
    idProperty: 'chequeId',
    fields: [
        {name: 'chequeId', type: 'string'},
        'createDate',
        'closeDate',
        'summ',
        {name: 'cashier', mapping: 'cashier.firstName', persist: false}
    ]
});