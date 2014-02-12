/**
 * Created by istrakhouski on 2/11/14.
 */
Ext.define('Farm.store.Cheques', {
    extend: 'Ext.data.Store',
    //fields: ['name', 'email'],
    model: 'Farm.model.Cheque',

    autoLoad: true,

    proxy: {
        type: 'ajax',
        api: {
            read: './cheque/getAll',
            update: './cheque/update'
        },
        reader: {
            type: 'json',
            root: 'value',
            successProperty: 'success'
        }
    }
});