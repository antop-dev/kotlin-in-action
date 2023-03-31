package org.antop.kotlin.chapter7

import java.beans.PropertyChangeSupport
import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

class ObservableProperty(private var propValue: Int, private val changeSupport: PropertyChangeSupport) :
    ReadWriteProperty<Person, Int> {
    override fun getValue(thisRef: Person, property: KProperty<*>): Int {
        return propValue
    }

    override fun setValue(thisRef: Person, property: KProperty<*>, value: Int) {
        val oldValue = propValue
        propValue = value
        changeSupport.firePropertyChange(property.name, oldValue, value)
    }
}
