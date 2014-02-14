/**
 * Created by istrakhouski on 2/14/14.
 */

Ext.define('Farm.store.Items', {
    extend: 'Ext.data.Store',
    //fields: ['name', 'email'],
    model: 'Farm.model.Item',

    autoLoad: true,

    proxy: {
        type: 'ajax',
        api: {
            read: './item/getAll',
            update: './items/update'
        },
        reader: {
            type: 'json',
            root: 'value',
            successProperty: 'success'
        }
    }
});