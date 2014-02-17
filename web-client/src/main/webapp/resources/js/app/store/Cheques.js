/**
 * Created by istrakhouski on 2/11/14.
 */
Ext.define('Farm.store.Cheques', {
    extend: 'Ext.data.Store',
    model: 'Farm.model.Cheque',

    autoLoad: true,

    proxy: {
        type: 'ajax',
        api: {
            create: './cheque/add',
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